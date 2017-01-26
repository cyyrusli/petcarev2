package com.example.cyrusli.petcarev2;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class AdoptUpload extends AppCompatActivity implements View.OnClickListener {

    public static final String UPLOAD_URL = "http://ec2-52-221-243-249.ap-southeast-1.compute.amazonaws.com/PhotoUpload/upload.php";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_TEXT_DESC = "description";
    public static final String KEY_TEXT_NAME = "name";
    public static final String KEY_TEXT_CONTACT = "contact";

    private int PICK_IMAGE_REQUEST = 1;

    private Button buttonUpload;

    private ImageView imageView;

    private Bitmap bitmap;

    private Uri filePath;

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private EditText desc;
    private EditText contact;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt_upload);

        // display custom action bar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbarupload);

        buttonUpload = (Button) findViewById(R.id.buttonUpload);

        imageView = (ImageView) findViewById(R.id.imageView);

        desc = (EditText) findViewById(R.id.description);
        contact = (EditText) findViewById(R.id.contact);
        name = (EditText) findViewById(R.id.name);

        buttonUpload.setOnClickListener(this);

        ImageButton button = (ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                AlertDialog.Builder choose = new AlertDialog.Builder(AdoptUpload.this);
                choose.setCancelable(true);
                choose.setPositiveButton(
                        "Take a new photo",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                    useCamera();
                            }
                        }
                );
                choose.setNegativeButton(
                        "Choose from gallery",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                showFileChooser();

                            }
                        }
                );
                AlertDialog alert = choose.create();
                alert.show();
                alert.getWindow().setLayout(1000, 550); //Controlling width and height.


            }
        });

    }

    // get image from camera
    private void useCamera() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, PICK_IMAGE_REQUEST);
        }
    }

    // get image from gallery
    private void showFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }
    // encodes image taken from gallery/camera into bitmap for uploading
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {

            filePath = data.getData();
            try {
                System.out.println("made it here");
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    // encode image
    public String getStringImage(Bitmap bmp){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] imageBytes = baos.toByteArray();
        String encodedImage = Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return encodedImage;
    }


    // function to upload image onto database
    public void uploadImage(){
        final String description = desc.getText().toString().trim();
        final String contactStr = contact.getText().toString().trim();
        final String nameStr = name.getText().toString().trim();
        final String image = getStringImage(bitmap);
        class UploadImage extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(AdoptUpload.this,"Please wait...","uploading",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(AdoptUpload.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                HashMap<String,String> param = new HashMap<String,String>();
                param.put(KEY_TEXT_DESC,description);
                param.put(KEY_TEXT_CONTACT,contactStr);
                param.put(KEY_TEXT_NAME,nameStr);
                param.put(KEY_IMAGE,image);
                String result = rh.sendPostRequest(UPLOAD_URL, param);
                return result;
            }
        }
        UploadImage u = new UploadImage();
        u.execute();
    }


    @Override
    public void onClick(View v) {
        if(v == buttonUpload){
            AlertDialog.Builder confirm = new AlertDialog.Builder(AdoptUpload.this);
            confirm.setMessage("Have you checked through your listing description?");
            confirm.setCancelable(true);
            confirm.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            String inputname = name.getText().toString();
                            String inputcontact = contact.getText().toString();
                            String inputdesc = desc.getText().toString();

                            if (inputname.isEmpty()) {
                                Toast.makeText(AdoptUpload.this, "Please enter your name", Toast.LENGTH_LONG).show();
                                name.requestFocus();
                            } else if (inputcontact.isEmpty()) {
                                Toast.makeText(AdoptUpload.this, "Please enter your contact details", Toast.LENGTH_LONG).show();
                                contact.requestFocus();
                            } else if (inputdesc.isEmpty()) {
                                Toast.makeText(AdoptUpload.this, "Please enter a description", Toast.LENGTH_LONG).show();
                                desc.requestFocus();
                            } else {
                                uploadImage();
                            }
                            }
                        }
            );

            AlertDialog alert = confirm.create();
            alert.show();

        }

    }

    /**
     * Hides the soft keyboard
     */
    public void hideSoftKeyboard() {
        if(getCurrentFocus()!=null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    /**
     * Shows the soft keyboard
     */
    public void showSoftKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0);
    }


}