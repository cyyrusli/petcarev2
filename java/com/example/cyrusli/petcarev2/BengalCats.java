package com.example.cyrusli.petcarev2;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by cyrusli on 13/1/17.
 */
public class BengalCats extends Fragment {

    public static final String UPLOAD_URL = "http://ec2-52-221-243-249.ap-southeast-1.compute.amazonaws.com/info/cats/BengalCats/info.php";


    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle svedInstanceState) {
        View v = inflater.inflate(R.layout.doginfo, container, false);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        tv = (TextView) v.findViewById(R.id.info);
        loadText();

        return v;
    }

    private void loadText(){
        RHInfo rh = new RHInfo();
        HashMap<String,String> data = new HashMap<>();

        data.put("", "");

        String result = rh.sendPostRequest(UPLOAD_URL);
        String linesep = System.getProperty("line.separator");
        result = result.replaceAll("<br />", linesep);
        System.out.println(result);


        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(result);
    }
}