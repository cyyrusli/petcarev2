package com.example.cyrusli.petcarev2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class DogWiki extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dog_wiki, container, false);

        String[] datasource2 = new String[]{"German Shepard", "Japanese Spitz", "Pembroke Welsh Corgi", "Pomerarian Husky (PomSky)", "Golden Retriever", "Maltese", "Pug", "Poodle (Miniature/Toy/Standard)", "Maltipoo", "Pomeranian", "ChowChow", "Affenpinscher", "Australian Silky Terrier", "Havanese", "Bichon Frise", "Cesky Terrier", "Bolognese", "Border Terrier", "Boston Terrier", "Brussels Griffon", "Cairn Terrier", "Cavaliar King Charles Spaniel", "Chihuahua", "Chinese Crested Dog",  "Coton de tulear", "Dachshund", "Dandie Dinmont Terrier", "English Toy Spaniel",   "Italian Greyhound", "Jack Russell Terrier", "Japanese Chin/Spaniel", "Lakeland Terrier", "Lhasa Apso", "Lowchen", "Manchester Terrier", "Miniature Pinscher", "Miniature Schnauzer", "Norfolk Terrier", "Norweigian Lundehund", "Norwich Terrier", "Papillon", "Pekingese", "Schipperke", "Scottish Terrier", "Sealyham Terrier", "Shetland Sheepdog", "Shih Tzu", "Silky Terrier", "Fox Terrier", "Tibetian Spaniel", "Toy Fox Terrier", "Welsh Terrier", "West Highland Terrier", "Yorkshire Terrier", "Samoyed", "Alaskan Malamute", "Siberian Husky"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem, datasource2);
        setListAdapter(adapter);
        setRetainInstance(true);

        try {
            Glide.with(this).load(R.drawable.backdrop).into((ImageView)v.findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.textitem);
        Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_LONG).show();

        switch (position) {

            case 0: germanshepard fragment = new germanshepard();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_blank, fragment);
                fragmentTransaction.addToBackStack("back");
                fragmentTransaction.commit();
                break;
            case 1: japanesespitz fragment1 = new japanesespitz();
                android.support.v4.app.FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_blank, fragment1);
                fragmentTransaction1.addToBackStack("back");
                fragmentTransaction1.commit();
                break;
            case 2: corgi fragment2 = new corgi();
                android.support.v4.app.FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragment_blank, fragment2);
                fragmentTransaction2.addToBackStack("back");
                fragmentTransaction2.commit();
                break;
            case 3: pomsky fragment3 = new pomsky();
                android.support.v4.app.FragmentTransaction fragmentTransaction3 = getFragmentManager().beginTransaction();
                fragmentTransaction3.replace(R.id.fragment_blank, fragment3);
                fragmentTransaction3.addToBackStack("back");
                fragmentTransaction3.commit();
                break;
            case 4: goldenretriever fragment4 = new goldenretriever();
                android.support.v4.app.FragmentTransaction fragmentTransaction4 = getFragmentManager().beginTransaction();
                fragmentTransaction4.replace(R.id.fragment_blank, fragment4);
                fragmentTransaction4.addToBackStack("back");
                fragmentTransaction4.commit();
                break;
            case 5: maltese fragment5 = new maltese();
                android.support.v4.app.FragmentTransaction fragmentTransaction5 = getFragmentManager().beginTransaction();
                fragmentTransaction5.replace(R.id.fragment_blank, fragment5);
                fragmentTransaction5.addToBackStack("back");
                fragmentTransaction5.commit();
                break;
            case 6: pug fragment6 = new pug();
                android.support.v4.app.FragmentTransaction fragmentTransaction6 = getFragmentManager().beginTransaction();
                fragmentTransaction6.replace(R.id.fragment_blank, fragment6);
                fragmentTransaction6.addToBackStack("back");
                fragmentTransaction6.commit();
                break;
            case 7: poodle fragment7 = new poodle();
                android.support.v4.app.FragmentTransaction fragmentTransaction7 = getFragmentManager().beginTransaction();
                fragmentTransaction7.replace(R.id.fragment_blank, fragment7);
                fragmentTransaction7.addToBackStack("back");
                fragmentTransaction7.commit();
                break;
            case 8: maltipoo fragment8 = new maltipoo();
                android.support.v4.app.FragmentTransaction fragmentTransaction8 = getFragmentManager().beginTransaction();
                fragmentTransaction8.replace(R.id.fragment_blank, fragment8);
                fragmentTransaction8.addToBackStack("back");
                fragmentTransaction8.commit();
                break;
            case 9: pomeranian fragment9 = new pomeranian();
                android.support.v4.app.FragmentTransaction fragmentTransaction9 = getFragmentManager().beginTransaction();
                fragmentTransaction9.replace(R.id.fragment_blank, fragment9);
                fragmentTransaction9.addToBackStack("back");
                fragmentTransaction9.commit();
                break;
            case 10: chowchow fragment10 = new chowchow();
                android.support.v4.app.FragmentTransaction fragmentTransaction10 = getFragmentManager().beginTransaction();
                fragmentTransaction10.replace(R.id.fragment_blank, fragment10);
                fragmentTransaction10.addToBackStack("back");
                fragmentTransaction10.commit();
                break;
            case 11:
                Affenpinscher fragment11 = new Affenpinscher();
                android.support.v4.app.FragmentTransaction fragmentTransaction11 = getFragmentManager().beginTransaction();
                fragmentTransaction11.replace(R.id.fragment_blank, fragment11);
                fragmentTransaction11.addToBackStack("back");
                fragmentTransaction11.commit();
                break;







// "Norfolk Terrier", "Norweigian Lundehund", "Norwich Terrier", "Papillon", "Pekingese", "Schipperke", "Scottish Terrier", "Sealyham Terrier", "Shetland Sheepdog", "Shih Tzu",
        }

// "
    }
}
