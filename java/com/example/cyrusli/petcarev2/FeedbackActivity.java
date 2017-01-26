package com.example.cyrusli.petcarev2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by cyrusli on 16/1/17.
 */
public class FeedbackActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_feedback);

        // Display activity name at the center of action bar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.feedback_abs);


        Button clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                Intent chooser;

                EditText nameet = (EditText) findViewById(R.id.name);
                EditText contactet = (EditText) findViewById(R.id.contact);
                EditText feedbacket = (EditText) findViewById(R.id.feedback);

                String name = nameet.getText().toString();
                String contact = contactet.getText().toString();
                String feedback = feedbacket.getText().toString();

                if (name.isEmpty() ) {
                    Toast.makeText(FeedbackActivity.this, "Please enter your name", Toast.LENGTH_LONG).show();
                    nameet.requestFocus();

                } else if (contact.isEmpty() ) {
                    Toast.makeText(FeedbackActivity.this, "Please enter your contact", Toast.LENGTH_LONG).show();
                    contactet.requestFocus();

                } else if (feedback.isEmpty()) {
                    Toast.makeText(FeedbackActivity.this, "Please enter your feedback", Toast.LENGTH_LONG).show();
                    feedbacket.requestFocus();

                } else {
                    Toast.makeText(FeedbackActivity.this, "Submitting feedback...", Toast.LENGTH_LONG).show();
                    intent = new Intent(Intent.ACTION_SEND);
                    intent.setData(Uri.parse("mailto:"));
                    String[] to = {"", "pigcowturtle@gmail.com"};
                    intent.putExtra(Intent.EXTRA_EMAIL, to);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from PetCare app");
                    intent.putExtra(Intent.EXTRA_TEXT, "Name: " + nameet.getText().toString() + " \n" + "Contact: " + contactet.getText().toString() + " \n" + "Feedback: " + feedbacket.getText().toString());

                    intent.setType("message/rfc822");
                    chooser = Intent.createChooser(intent, "Send Email");
                    startActivity(chooser);

                }


            }
        });


        Button disclaimer = (Button)findViewById(R.id.disclaimer);
        disclaimer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(FeedbackActivity.this, DisclaimerActivity.class));
            }
        });


    }
}
