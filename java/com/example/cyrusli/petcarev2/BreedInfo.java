package com.example.cyrusli.petcarev2;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


public class BreedInfo extends Fragment {

    private ImageButton dog;
    private ImageButton cat;
    private ImageButton pcare;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_breed_info,container,false);

        dog = (ImageButton)v.findViewById(R.id.dogwiki);
        dog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                DogWiki fragment = new DogWiki();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank, fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();
            }
        });

        cat = (ImageButton)v.findViewById(R.id.catwiki);
        cat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CatWiki fragment = new CatWiki();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank, fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();

                Toast.makeText(getActivity(), "Cat Wiki", Toast.LENGTH_LONG).show();
            }

        });

        pcare = (ImageButton)v.findViewById(R.id.pcare);
        pcare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                PCare fragment = new PCare();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank, fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();
                Toast.makeText(getActivity(), "Prevention Care", Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }

}
