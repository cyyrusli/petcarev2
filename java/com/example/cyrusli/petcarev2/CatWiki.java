package com.example.cyrusli.petcarev2;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class CatWiki extends ListFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dog_wiki, container, false);

        String[] datasource3 = new String[]{"Abyssinian", "American Bobtail","American Curl", "American Shorthair", "American Wirehair", "Balinese", "Bengal Cats", "Birman", "Bombay", "British Shorthair", "Burmese", "Burmilla", "Chartreux", "Chinese Li Hua", "Colorpoint Shorthair"/* "Cornish Rex", "Cymric", "Devon Rex", "Egyptian Mau", "European Burmese", "Exotic", "Havana Brown", "Himalayan", "Japanese Bobtail", "Javanese", "Korat", "LaPerm", "Maine Coon", "Manx", "Nebelung", "Norwegian Forest", "Ocicat", "Oriental", "Persian", "Ragamuffin", "Ragdoll Cats", "Russian Blue", "Savannah", "Scottish Fold", "Selkirk Rex", "Siamese Cat", "Siberian", "Singapura", "Snowshoe", "Somali", "Sphynx", "Tonkinese", "Turkish Angora", "Turkish Van*/};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem, datasource3);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.textitem);
        Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_LONG).show();

        switch (position) {

            case 0:
                Abyssinian fragment = new Abyssinian();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank, fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();
                break;
            case 1:
                AmericanBobtail fragment1 = new AmericanBobtail();
                android.support.v4.app.FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_blank, fragment1);
                fragmentTransaction1.addToBackStack("back");
                fragmentTransaction1.commit();
                break;
            case 2:
                AmericanCurl fragment2 = new AmericanCurl();
                android.support.v4.app.FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragment_blank, fragment2);
                fragmentTransaction2.addToBackStack("back");
                fragmentTransaction2.commit();
                break;
            case 3:
                AmericanShorthair fragment3 = new AmericanShorthair();
                android.support.v4.app.FragmentTransaction fragmentTransaction3 = getFragmentManager().beginTransaction();
                fragmentTransaction3.replace(R.id.fragment_blank, fragment3);
                fragmentTransaction3.addToBackStack("back");
                fragmentTransaction3.commit();
                break;
            case 4:
                AmericanWirehair fragment4 = new AmericanWirehair();
                android.support.v4.app.FragmentTransaction fragmentTransaction4 = getFragmentManager().beginTransaction();
                fragmentTransaction4.replace(R.id.fragment_blank, fragment4);
                fragmentTransaction4.addToBackStack("back");
                fragmentTransaction4.commit();
                break;
            case 5:
                Balinese fragment5 = new Balinese();
                android.support.v4.app.FragmentTransaction fragmentTransaction5 = getFragmentManager().beginTransaction();
                fragmentTransaction5.replace(R.id.fragment_blank, fragment5);
                fragmentTransaction5.addToBackStack("back");
                fragmentTransaction5.commit();
                break;
            case 6:
                BengalCats fragment6 = new BengalCats();
                android.support.v4.app.FragmentTransaction fragmentTransaction6 = getFragmentManager().beginTransaction();
                fragmentTransaction6.replace(R.id.fragment_blank, fragment6);
                fragmentTransaction6.addToBackStack("back");
                fragmentTransaction6.commit();
                break;
            case 7:
                Birman fragment7 = new Birman();
                android.support.v4.app.FragmentTransaction fragmentTransaction7 = getFragmentManager().beginTransaction();
                fragmentTransaction7.replace(R.id.fragment_blank, fragment7);
                fragmentTransaction7.addToBackStack("back");
                fragmentTransaction7.commit();
                break;
            case 8:
                Bombay fragment8 = new Bombay();
                android.support.v4.app.FragmentTransaction fragmentTransaction8 = getFragmentManager().beginTransaction();
                fragmentTransaction8.replace(R.id.fragment_blank, fragment8);
                fragmentTransaction8.addToBackStack("back");
                fragmentTransaction8.commit();
                break;
            case 9:
                BritishShorthair fragment9 = new BritishShorthair();
                android.support.v4.app.FragmentTransaction fragmentTransaction9 = getFragmentManager().beginTransaction();
                fragmentTransaction9.replace(R.id.fragment_blank, fragment9);
                fragmentTransaction9.addToBackStack("back");
                fragmentTransaction9.commit();
                break;
            case 10:
                Burmese fragment10 = new Burmese();
                android.support.v4.app.FragmentTransaction fragmentTransaction10 = getFragmentManager().beginTransaction();
                fragmentTransaction10.replace(R.id.fragment_blank, fragment10);
                fragmentTransaction10.addToBackStack("back");
                fragmentTransaction10.commit();
                break;
            case 11:
                Burmilla fragment11 = new Burmilla();
                android.support.v4.app.FragmentTransaction fragmentTransaction11 = getFragmentManager().beginTransaction();
                fragmentTransaction11.replace(R.id.fragment_blank, fragment11);
                fragmentTransaction11.addToBackStack("back");
                fragmentTransaction11.commit();
                break;
            case 12:
                Chartreux fragment12 = new Chartreux();
                android.support.v4.app.FragmentTransaction fragmentTransaction12 = getFragmentManager().beginTransaction();
                fragmentTransaction12.replace(R.id.fragment_blank, fragment12);
                fragmentTransaction12.addToBackStack("back");
                fragmentTransaction12.commit();
                break;
            case 13:
                ChineseLiHua fragment13 = new ChineseLiHua();
                android.support.v4.app.FragmentTransaction fragmentTransaction13 = getFragmentManager().beginTransaction();
                fragmentTransaction13.replace(R.id.fragment_blank, fragment13);
                fragmentTransaction13.addToBackStack("back");
                fragmentTransaction13.commit();
                break;
            case 14:
                ColorpointShorthair fragment14 = new ColorpointShorthair();
                android.support.v4.app.FragmentTransaction fragmentTransaction14 = getFragmentManager().beginTransaction();
                fragmentTransaction14.replace(R.id.fragment_blank, fragment14);
                fragmentTransaction14.addToBackStack("back");
                fragmentTransaction14.commit();
                break;
        }
    }

}
