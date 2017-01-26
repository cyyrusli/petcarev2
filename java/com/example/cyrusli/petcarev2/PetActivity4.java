package com.example.cyrusli.petcarev2;

import android.os.StrictMode;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import java.util.HashMap;



public class PetActivity4 extends AppCompatActivity {

    TextView tv;

    public static final String UPLOAD_URL = "http://ec2-52-221-243-249.ap-southeast-1.compute.amazonaws.com/info/adoption/4/info.php";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);

        // Display activity name at the center of action bar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.petactivityabs);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        loadText();



    }

    private void loadText(){
        RHInfo rh = new RHInfo();
        HashMap<String,String> data = new HashMap<>();

        data.put("", "");

        String result = rh.sendPostRequest(UPLOAD_URL);
        String linesep = System.getProperty("line.separator");
        result = result.replaceAll("<br />", linesep);
        System.out.println(result);

        tv = (TextView) findViewById(R.id.info);

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(result);
    }


}
