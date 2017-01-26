package com.example.cyrusli.petcarev2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;

import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Display app name at the center of action bar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs);

        if(LoginActivity.getUserName(MainActivity.this).length() == 0)
        {
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);// call Login Activity
        }
        else
        {
            // Stay at the current activity.
        }

        // Show this page on start
        Home fragment = new Home();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_blank, fragment);
        ft.commit();

        // Home Fragment
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Home fragment = new Home();
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_blank, fragment);
                ft.addToBackStack("back");
                ft.commit();
            }
        });

        // Breed Fragment
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BreedInfo fragment = new BreedInfo();
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_blank, fragment);
                ft.addToBackStack("back");
                ft.commit();
            }
        });

        // AdoptUpload Activity
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adoptUpload();
            }

        });

        // Clinic Fragment
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clinics fragment = new Clinics();
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_blank, fragment);
                ft.addToBackStack("back");
                ft.commit();
            }
        });

        // Adopt Fragment
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Adopt fragment = new Adopt();
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_blank, fragment);
                ft.addToBackStack("back");
                ft.commit();
            }
        });
    }



    public void back(View v){
        getFragmentManager().popBackStack("addb", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    // create an action bar button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {
            new AlertDialog.Builder(MainActivity.this)
                    .setCancelable(true)
                    .setTitle("PetCareV2")
                    .setMessage("Developed by students from Singapore Polytechnic")
                    .setNegativeButton("Feedback", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(MainActivity.this, FeedbackActivity.class));

                        }
                    })
                    .setPositiveButton("Help Us!", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Coming Soon!", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(MainActivity.this, DonationActivity.class));

                        }
                    })
                    .setIcon(R.drawable.ic_pets_black_24dp)
                    .show();
        } else if (id==R.id.profile) {
            Toast.makeText(MainActivity.this, "Not Available at this moment", Toast.LENGTH_LONG).show();
            // startActivity(new Intent(MainActivity.this, ProfileActivity.class));

        }
        return super.onOptionsItemSelected(item);
    }

    private void adoptUpload() {
        startActivity(new Intent(MainActivity.this, AdoptUpload.class));
    }



}
