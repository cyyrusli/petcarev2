package com.example.cyrusli.petcarev2;


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


public class Adopt extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_adopt,container,false);

        String[] datasource4 = new String[] {"Society for the Prevention of Cruelty to Animals, Singapore (SPCA) Dogs", "Society for the Prevention of Cruelty to Animals, Singapore (SPCA) Cats","Causes for Animals Singapore (Dogs and Cats)","AdoptADog","SoSD","Action for Singapore Dogs", "Purely Adoptions", "PetsforLife","Adopt a Cat Singapore", "CatWelfare"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem,datasource4);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }
    public void onListItemClick(ListView l, View view, int position, long id) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView)viewGroup.findViewById(R.id.textitem);
        Toast.makeText(getActivity(),txt.getText().toString(),Toast.LENGTH_LONG).show();

        switch(position) {

            case 0:   AdoptSites fragment = new AdoptSites(); // SPCA (DOG)
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank, fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();
                break;
            case 1:   AdoptSites2 fragment5 = new AdoptSites2(); // SPCA (CAT)
                android.support.v4.app.FragmentTransaction fragmentTransaction5 = getFragmentManager().beginTransaction();
                fragmentTransaction5.replace(R.id.fragment_blank, fragment5);
                fragmentTransaction5.addToBackStack("back");
                fragmentTransaction5.commit();
                break;
            case 2:   AdoptSites3 fragment2 = new AdoptSites3(); // Causes for Animals
                android.support.v4.app.FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragment_blank, fragment2);
                fragmentTransaction2.addToBackStack("back");
                fragmentTransaction2.commit();
                break;
            case 3:   AdoptSites4 fragment3 = new AdoptSites4(); // AdoptADog
                android.support.v4.app.FragmentTransaction fragmentTransaction3 = getFragmentManager().beginTransaction();
                fragmentTransaction3.replace(R.id.fragment_blank, fragment3);
                fragmentTransaction3.addToBackStack("back");
                fragmentTransaction3.commit();
                break;
            case 4:   AdoptSites5 fragment4 = new AdoptSites5(); // SoSD
                android.support.v4.app.FragmentTransaction fragmentTransaction4 = getFragmentManager().beginTransaction();
                fragmentTransaction4.replace(R.id.fragment_blank, fragment4);
                fragmentTransaction4.addToBackStack("back");
                fragmentTransaction4.commit();
                break;
            case 5:   AdoptSites6 fragment6 = new AdoptSites6(); // ASD Singapore
                android.support.v4.app.FragmentTransaction fragmentTransaction6 = getFragmentManager().beginTransaction();
                fragmentTransaction6.replace(R.id.fragment_blank, fragment6);
                fragmentTransaction6.addToBackStack("back");
                fragmentTransaction6.commit();
                break;
            case 6:   AdoptSites7 fragment7 = new AdoptSites7(); // Purely Adoption
                android.support.v4.app.FragmentTransaction fragmentTransaction7 = getFragmentManager().beginTransaction();
                fragmentTransaction7.replace(R.id.fragment_blank, fragment7);
                fragmentTransaction7.addToBackStack("back");
                fragmentTransaction7.commit();
                break;
            case 7:   AdoptSites8 fragment8 = new AdoptSites8(); // PetsforLife
                android.support.v4.app.FragmentTransaction fragmentTransaction8 = getFragmentManager().beginTransaction();
                fragmentTransaction8.replace(R.id.fragment_blank, fragment8);
                fragmentTransaction8.addToBackStack("back");
                fragmentTransaction8.commit();
                break;
            case 8:   AdoptSites9 fragment9 = new AdoptSites9(); // Adopt a Cat Singapore
                android.support.v4.app.FragmentTransaction fragmentTransaction9 = getFragmentManager().beginTransaction();
                fragmentTransaction9.replace(R.id.fragment_blank, fragment9);
                fragmentTransaction9.addToBackStack("back");
                fragmentTransaction9.commit();
                break;
            case 9:   AdoptSites10 fragment10 = new AdoptSites10(); // Catwelfare
                android.support.v4.app.FragmentTransaction fragmentTransaction10 = getFragmentManager().beginTransaction();
                fragmentTransaction10.replace(R.id.fragment_blank, fragment10);
                fragmentTransaction10.addToBackStack("back");
                fragmentTransaction10.commit();
                break;
        }
    }



}
