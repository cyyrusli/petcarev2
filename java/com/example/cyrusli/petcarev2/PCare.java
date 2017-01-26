package com.example.cyrusli.petcarev2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class PCare extends ListFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pcare, container, false);

       String[] pcaretypes = {"Grooming:","1. Eye Care (Dogs)", "2. Ear Care (Dogs)","3. Dental Care (Dogs)", "4. Eye Care (Cats)", "5. Ear Care (Cats)", "6. Dental Care (Cats)",
               "Fleas, Ticks and HeartWorm:","1. Fleas", "2. Heartworms","3. Intestinal Worms", "4. Ticks",
               "Vaccinations:","1. Feline Core", "2. Canine Core", "3. Kennel Cough", "4. Rabies"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem,pcaretypes);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {

        switch (position) {
            // skip case 0
            case 1:
                Toast.makeText(getActivity(),"Eye Care for Dogs",Toast.LENGTH_LONG).show();
                eyecaredog fragment = new eyecaredog();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank,fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();
                break;
            case 2:
                Toast.makeText(getActivity(),"Ear Care for Dogs",Toast.LENGTH_LONG).show();
                earcaredog fragment1 = new earcaredog();
                android.support.v4.app.FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_blank,fragment1);
                fragmentTransaction1.addToBackStack("back");
                fragmentTransaction1.commit();
                break;
            case 3:
                Toast.makeText(getActivity(),"Dog Dental Care",Toast.LENGTH_LONG).show();
                dentalcaredog fragment2 = new dentalcaredog();
                android.support.v4.app.FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragment_blank,fragment2);
                fragmentTransaction2.addToBackStack("back");
                fragmentTransaction2.commit();
                break;
            case 4:
                Toast.makeText(getActivity(),"Eye Care for Cats",Toast.LENGTH_LONG).show();
                eyecarecat fragment3 = new eyecarecat();
                android.support.v4.app.FragmentTransaction fragmentTransaction3 = getFragmentManager().beginTransaction();
                fragmentTransaction3.replace(R.id.fragment_blank,fragment3);
                fragmentTransaction3.addToBackStack("back");
                fragmentTransaction3.commit();
                break;
            case 5:
                Toast.makeText(getActivity(),"Ear Care for Cats",Toast.LENGTH_LONG).show();
                earcarecat fragment4 = new earcarecat();
                android.support.v4.app.FragmentTransaction fragmentTransaction4 = getFragmentManager().beginTransaction();
                fragmentTransaction4.replace(R.id.fragment_blank,fragment4);
                fragmentTransaction4.addToBackStack("back");
                fragmentTransaction4.commit();
                break;
            case 6:
                Toast.makeText(getActivity(),"Dental Care for Cats",Toast.LENGTH_LONG).show();
                dentalcarecat fragment5 = new dentalcarecat();
                android.support.v4.app.FragmentTransaction fragmentTransaction5 = getFragmentManager().beginTransaction();
                fragmentTransaction5.replace(R.id.fragment_blank,fragment5);
                fragmentTransaction5.addToBackStack("back");
                fragmentTransaction5.commit();
                break;

            // Skip case 7
            case 8:
                Toast.makeText(getActivity(),"Fleas prevention",Toast.LENGTH_LONG).show();
                fleas fragment6 = new fleas();
                android.support.v4.app.FragmentTransaction fragmentTransaction6 = getFragmentManager().beginTransaction();
                fragmentTransaction6.replace(R.id.fragment_blank,fragment6);
                fragmentTransaction6.addToBackStack("back");
                fragmentTransaction6.commit();
                break;
            case 9:
                Toast.makeText(getActivity(),"Heartworms prevention",Toast.LENGTH_LONG).show();
                heartworm fragment7 = new heartworm();
                android.support.v4.app.FragmentTransaction fragmentTransaction7 = getFragmentManager().beginTransaction();
                fragmentTransaction7.replace(R.id.fragment_blank,fragment7);
                fragmentTransaction7.addToBackStack("back");
                fragmentTransaction7.commit();
                break;
            case 10:
                Toast.makeText(getActivity(),"Intestinal Worms prevention",Toast.LENGTH_LONG).show();
                iworm fragment8 = new iworm();
                android.support.v4.app.FragmentTransaction fragmentTransaction8 = getFragmentManager().beginTransaction();
                fragmentTransaction8.replace(R.id.fragment_blank,fragment8);
                fragmentTransaction8.addToBackStack("back");
                fragmentTransaction8.commit();
                break;
            case 11:
                Toast.makeText(getActivity(),"Ticks prevention",Toast.LENGTH_LONG).show();
                ticks fragment9 = new ticks();
                android.support.v4.app.FragmentTransaction fragmentTransaction9 = getFragmentManager().beginTransaction();
                fragmentTransaction9.replace(R.id.fragment_blank,fragment9);
                fragmentTransaction9.addToBackStack("back");
                fragmentTransaction9.commit();
                break;

            // skip case 12
            case 13:
                Toast.makeText(getActivity(),"Feline Core",Toast.LENGTH_LONG).show();
                felinecore fragment10 = new felinecore();
                android.support.v4.app.FragmentTransaction fragmentTransaction10 = getFragmentManager().beginTransaction();
                fragmentTransaction10.replace(R.id.fragment_blank,fragment10);
                fragmentTransaction10.addToBackStack("back");
                fragmentTransaction10.commit();
                break;
            case 14:
                Toast.makeText(getActivity(),"Canine Core",Toast.LENGTH_LONG).show();
                caninecore fragment11 = new caninecore();
                android.support.v4.app.FragmentTransaction fragmentTransaction11 = getFragmentManager().beginTransaction();
                fragmentTransaction11.replace(R.id.fragment_blank,fragment11);
                fragmentTransaction11.addToBackStack("back");
                fragmentTransaction11.commit();
                break;
            case 15:
                Toast.makeText(getActivity(),"Kennel Cough",Toast.LENGTH_LONG).show();
                kennelcough fragment12 = new kennelcough();
                android.support.v4.app.FragmentTransaction fragmentTransaction12 = getFragmentManager().beginTransaction();
                fragmentTransaction12.replace(R.id.fragment_blank,fragment12);
                fragmentTransaction12.addToBackStack("back");
                fragmentTransaction12.commit();
                break;
            case 16:
                Toast.makeText(getActivity(),"Rabies",Toast.LENGTH_LONG).show();
                rabies fragment16 = new rabies();
                android.support.v4.app.FragmentTransaction fragmentTransaction16 = getFragmentManager().beginTransaction();
                fragmentTransaction16.replace(R.id.fragment_blank,fragment16);
                fragmentTransaction16.addToBackStack("back");
                fragmentTransaction16.commit();
                break;
        }
    }


}
