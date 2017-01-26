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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AlertDialog;
import android.preference.DialogPreference;
import android.content.DialogInterface;
import android.content.Intent;
import java.lang.reflect.Array;


public class westcoast extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listfragment, container, false);

        String[] westsource = {"Gentle Oak Veterinary Clinic", "Island Veterinary Clinic", "Mount Pleasant Animal Medical Centre (Clementi)",
                "My Family Vet Clinic and Surgery Pte Ltd", "Point Veterinary Surgery", "Singapore Veterinary Animal Clinic (Jurong East)",
                "The Animal Clinic Pte Ltd (Clementi Branch)", "The Joyous Vet", "The Joyous Vet Pte Ltd",
                "Vets For Pets", "West Coast Vetcare Pte Ltd"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem, westsource);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.textitem);
        Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_LONG).show();

        switch (position) {

            case 0: //  Gentle Oak Veterinary Clinic
                AlertDialog.Builder case0 = new AlertDialog.Builder(getContext());
                case0.setMessage("21 Ghim Moh Road, #01-225\n" +
                        "Singapore 270021\n" +
                        "Tel: 62508001 | Fax: 62508003");
                case0.setCancelable(false);
                case0.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case0.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.310409, 103.789004"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert0 = case0.create();
                alert0.show();
                break;

            case 1: //  Island Veterinary Clinic
                AlertDialog.Builder case1 = new AlertDialog.Builder(getContext());
                case1.setMessage("Jurong East Ville, 114 Jurong East St 13, #01-404\n" +
                        "Singapore 600114\n" +
                        "Tel: 65605991 | Fax: 65605619");
                case1.setCancelable(false);
                case1.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case1.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.339072, 103.734585"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert1 = case1.create();
                alert1.show();
                break;

            case 2: //  Mount Pleasant Animal Medical Centre (Clementi)
                AlertDialog.Builder case2 = new AlertDialog.Builder(getContext());
                case2.setMessage("105 Clementi Street 12 #01-18/20\n" +
                        "Singapore 120105\n" +
                        "Tel: 67768858 | Fax: 67761678");
                case2.setCancelable(false);
                case2.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case2.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.322620, 103.770007"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert2 = case2.create();
                alert2.show();
                break;

            case 3: //  My Family Vet Clinic and Surgery Pte Ltd
                AlertDialog.Builder case3 = new AlertDialog.Builder(getContext());
                case3.setMessage("265 Bukit Batok East Avenue 4, #01-403\n" +
                        "Singapore 650265\n" +
                        "Tel: 65660448");
                case3.setCancelable(false);
                case3.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case3.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.350083, 103.759827"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert3 = case3.create();
                alert3.show();
                break;

            case 4: //  Point Veterinary Surgery
                AlertDialog.Builder case4 = new AlertDialog.Builder(getContext());
                case4.setMessage("541 Jurong West Avenue 1 #01-1044\n" +
                        "Singapore 640541\n" +
                        "Tel: 64256772 | Fax: 64256773");
                case4.setCancelable(false);
                case4.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case4.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.351024, 103.715858"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert4 = case4.create();
                alert4.show();
                break;

            case 5: //  Singapore Veterinary Animal Clinic (Jurong East)
                AlertDialog.Builder case5 = new AlertDialog.Builder(getContext());
                case5.setMessage("353 Jurong East Street 31, #01-105\n" +
                        "Singapore 600353\n" +
                        "Tel: 68970180 | Fax: 68975180");
                case5.setCancelable(false);
                case5.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case5.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.344420, 103.730585"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert5 = case5.create();
                alert5.show();
                break;

            case 6: //  The Animal Clinic Pte Ltd (Clementi Branch)
                AlertDialog.Builder case6 = new AlertDialog.Builder(getContext());
                case6.setMessage("109 Clementi Street 11 #01-31\n" +
                        "Singapore 120109\n" +
                        "Tel: 67770273 | Fax: 67746950");
                case6.setCancelable(false);
                case6.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case6.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.322295, 103.770595"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert6 = case6.create();
                alert6.show();
                break;

            case 7: //   The Joyous Vet
                AlertDialog.Builder case7 = new AlertDialog.Builder(getContext());
                case7.setMessage("Blk 475 Choa Chu Kang Ave 3 #01-30A\n" +
                        "Singapore 680475\n" +
                        "Tel: 67690304 | Fax: 67697353");
                case7.setCancelable(false);
                case7.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case7.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.377805, 103.739207"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert7 = case7.create();
                alert7.show();
                break;

            case 8: //   The Joyous Vet Pte Ltd
                AlertDialog.Builder case8 = new AlertDialog.Builder(getContext());
                case8.setMessage("1 Yuan Ching Road #03-03\n" +
                        "Singapore 618640\n" +
                        "Tel: 62674137 / 62674138 | Fax: 62674139");
                case8.setCancelable(false);
                case8.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case8.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.325460, 103.725240"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert8 = case8.create();
                alert8.show();
                break;

            case 9: //   Vets For Pets
                AlertDialog.Builder case9 = new AlertDialog.Builder(getContext());
                case9.setMessage("Blk 519 Jurong West Street 52, #01-157\n" +
                        "Singapore 640519\n" +
                        "Tel: 65691627 | Fax: 65673971");
                case9.setCancelable(false);
                case9.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case9.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.345589, 103.717605"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert9 = case9.create();
                alert9.show();
                break;

            case 10: //   West Coast Vetcare Pte Ltd
                AlertDialog.Builder case10 = new AlertDialog.Builder(getContext());
                case10.setMessage("612 Clementi West Street 1, #01-300\n" +
                        "Singapore 120612\n" +
                        "Tel: 67777423 | Fax: 677770654");
                case10.setCancelable(false);
                case10.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case10.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.303443, 103.768402"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert10 = case10.create();
                alert10.show();
                break;


            // insert a case for each clinic, case number has to be corresponding to the array values inserted above
        }
    }
}