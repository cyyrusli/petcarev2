package com.example.cyrusli.petcarev2;


import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class Clinics extends ListFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_clinics, container, false);
        Button clickButton = (Button) v.findViewById(R.id.petmemo);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long startMillis = System.currentTimeMillis();
                Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
                builder.appendPath("time");
                ContentUris.appendId(builder, startMillis);
                Intent intent = new Intent(Intent.ACTION_VIEW)
                        .setData(builder.build());
                startActivity(intent);
            }
        });

        String [] datasource = {"Central", "East Coast", "West Coast", "North"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem, datasource);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {

        switch (position) {
            case 0: //  Central
                Toast.makeText(getActivity(),"Central",Toast.LENGTH_LONG).show();
                Central fragment = new Central();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank,fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();
                break;

            case 1: //  East Coast
                Toast.makeText(getActivity(),"East Coast",Toast.LENGTH_LONG).show();
                eastcoast fragment1 = new eastcoast();
                android.support.v4.app.FragmentTransaction ft1 = getFragmentManager().beginTransaction();
                ft1.replace(R.id.fragment_blank,fragment1);
                ft1.addToBackStack("back");
                ft1.commit();
                break;

            case 2: //  West Coast
                Toast.makeText(getActivity(),"West Coast",Toast.LENGTH_LONG).show();
                westcoast fragment2 = new westcoast();
                android.support.v4.app.FragmentTransaction ft2 = getFragmentManager().beginTransaction();
                ft2.replace(R.id.fragment_blank,fragment2);
                ft2.addToBackStack("back");
                ft2.commit();
                break;

            case 3: //  North
                Toast.makeText(getActivity(),"North",Toast.LENGTH_LONG).show();
                north fragment3 = new north();
                android.support.v4.app.FragmentTransaction ft3 = getFragmentManager().beginTransaction();
                ft3.replace(R.id.fragment_blank,fragment3);
                ft3.addToBackStack("back");
                ft3.commit();
                break;

        }

    }
}