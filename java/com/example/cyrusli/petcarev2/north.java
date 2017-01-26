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


public class north extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listfragment, container, false);

        String[] northsource = {"Stars Veterinary Night Clinic (Emergency-24 hrs)", "AAVC- Animal and Avian Veterinary Clinic", "Acacia Veterinary Clinic",
        		 "Allpets & Aqualife Clinic", "Animal Practice Pte Ltd", "Animal Recovery Veterinary Referral Centre Pte Ltd",
        		 "Animal World Veterinary Clinic Pte Ltd", "Brighton Vet Care Pte Ltd", "Defu Veterinary Clinic",
        		 "Edmond Tan Veterinary Surgery", "Heart2Heart Veterinary Centre", "Mount Pleasant Animal Clinic (North Branch)",
        		 "Mount Pleasant Veterinary Centre (Mandai)", "Passion Veterinary Clinic Pte Ltd", "Pet Clinic Pte Ltd",
        		 "Singapore Veterinary Animal Clinic", "Spring Veterinary Care", "STARS Veterinary Clinic",
        		 "The Animal Doctors Pte Ltd", "United Veterinary Clinic"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem, northsource);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.textitem);
        Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_LONG).show();

        switch (position) {
        
        case 0: //  Stars Veterinary Night Clinic (Emergency-24 hrs)
            AlertDialog.Builder case0 = new AlertDialog.Builder(getContext());
            case0.setMessage("211 Hougang Street 21 #01-301\n" +
                    "Singapore 530211\n" +
                    "Tel: 62809880 | Fax: 62800680");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.359684, 103.887657"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert0 = case0.create();
            alert0.show();
            break;
            
        case 1: //  AAVC- Animal and Avian Veterinary Clinic
            AlertDialog.Builder case1 = new AlertDialog.Builder(getContext());
            case1.setMessage("716 Yishun Street 71 #01-254\n" +
                    "Singapore 760716\n" +
                    "Tel: 68539397");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.426161, 103.827475"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert1 = case1.create();
            alert1.show();
            break;
            
        case 2: //  Acacia Veterinary Clinic
            AlertDialog.Builder case2 = new AlertDialog.Builder(getContext());
            case2.setMessage("338 Ang Mo Kio Avenue 1 #01-1671\n" +
                    "Singapore 560338\n" +
                    "Tel: 64816889");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.363930, 103.849047"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert2 = case2.create();
            alert2.show();
            break;
            
        case 3: //  Allpets & Aqualife Clinic
            AlertDialog.Builder case3 = new AlertDialog.Builder(getContext());
            case3.setMessage("24 Jalan Kelulut, Seletar Hills Estate\n" +
                    "Singapore 809041\n" +
                    "Tel: 64813700 | Fax: 64816990");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.383371, 103.875692"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert3 = case3.create();
            alert3.show();
            break;
            
        case 4: //  Animal Practice Pte Ltd
            AlertDialog.Builder case4= new AlertDialog.Builder(getContext());
            case4.setMessage("1015 Upper Serangoon Road #01-00\n" +
                    "Singapore 534753\n" +
                    "Tel: 62883929 | Fax: 62881823");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.362788, 103.887555"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert4 = case4.create();
            alert4.show();
            break;
            
        case 5: //  Animal Recovery Veterinary Referral Centre Pte Ltd
            AlertDialog.Builder case5 = new AlertDialog.Builder(getContext());
            case5.setMessage("466 Serangoon Road\n" +
                    "Singapore 218225\n" +
                    "Tel: 62522623 | Fax: 62522836");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.313432, 103.856846"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert5 = case5.create();
            alert5.show();
            break;
            
        case 6: //  Animal World Veterinary Clinic Pte Ltd
            AlertDialog.Builder case6 = new AlertDialog.Builder(getContext());
            case6.setMessage("16 Yio Chu Kang Road\n" +
                    "Singapore 545527\n" +
                    "Tel: 62860929 | Fax: 62860959");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.354750, 103.877404"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert6 = case6.create();
            alert6.show();
            break;
            
        case 7: //  Brighton Vet Care Pte Ltd
            AlertDialog.Builder case7 = new AlertDialog.Builder(getContext());
            case7.setMessage("74 Serangoon Garden Way\n" +
                    "Singapore 555970\n" +
                    "Tel: 62822484 | Fax: 62822434");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.364053, 103.865063"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert7 = case7.create();
            alert7.show();
            break;
            
        case 8: //  Defu Veterinary Clinic
            AlertDialog.Builder case8 = new AlertDialog.Builder(getContext());
            case8.setMessage("37 Defu Lane 10 #01-79\n" +
                    "Singapore 539214\n" +
                    "Tel: 62848411 | Fax: 62848412");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.352858, 103.891224"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert8 = case8.create();
            alert8.show();
            break;
            
        case 9: //  Edmond Tan Veterinary Surgery
            AlertDialog.Builder case9 = new AlertDialog.Builder(getContext());
            case9.setMessage("151 Serangoon North Avenue 2 #01-65\n" +
                    "Singapore 550151\n" +
                    "Tel: 62821581 | Fax: 62848601");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.369405, 103.874002"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert9 = case9.create();
            alert9.show();
            break;
            
        case 10: //  Heart2Heart Veterinary Centre
            AlertDialog.Builder case10 = new AlertDialog.Builder(getContext());
            case10.setMessage("58 Yio Chu Kang Road\n" +
                    "Singapore 545564\n" +
                    "Tel: 68585885 | Fax: 68585884");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.357139, 103.875801"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert10 = case10.create();
            alert10.show();
            break;
            
        case 11: //  Mount Pleasant Animal Clinic (North Branch)
            AlertDialog.Builder case11 = new AlertDialog.Builder(getContext());
            case11.setMessage("151 Serangoon North Avenue 2 #01-59\n" +
                    "Singapore 550151\n" +
                    "Tel: 62871190 | Fax: 64874106");
            case11.setCancelable(false);
            case11.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case11.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.369236, 103.874395"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert11 = case11.create();
            alert11.show();
            break;
            
        case 12: //  Mount Pleasant Veterinary Centre (Mandai)
            AlertDialog.Builder case12 = new AlertDialog.Builder(getContext());
            case12.setMessage("5 Mandai Road\n" +
                    "Singapore 779391\n" +
                    "Tel: 64515242 | Fax: 64514001");
            case12.setCancelable(false);
            case12.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case12.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.402281, 103.816718"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert12 = case12.create();
            alert12.show();
            break;
            
        case 13: //  Passion Veterinary Clinic Pte Ltd
            AlertDialog.Builder case13 = new AlertDialog.Builder(getContext());
            case13.setMessage("Blk 111 Woodlands Street 13 #01-86\n" +
                    "Singapore 730111\n" +
                    "Tel: 66358725 | Fax: 66358726");
            case13.setCancelable(false);
            case13.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case13.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.437853, 103.782061"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert13 = case13.create();
            alert13.show();
            break;
            
        case 14: //  Pet Clinic Pte Ltd
            AlertDialog.Builder case14 = new AlertDialog.Builder(getContext());
            case14.setMessage("211 Serangoon Avenue 4 #01-12\n" +
                    "Singapore 550211\n" +
                    "Tel: 62885565 | Fax: 62807717");
            case14.setCancelable(false);
            case14.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case14.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.356478, 103.873542"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert14 = case14.create();
            alert14.show();
            break;
            
        case 15: //  Singapore Veterinary Animal Clinic
            AlertDialog.Builder case15 = new AlertDialog.Builder(getContext());
            case15.setMessage("768 Woodlands Avenue 6 #01-11\n" +
                    "Singapore 730768\n" +
                    "Tel: 63650308 | Fax: 63620602");
            case15.setCancelable(false);
            case15.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case15.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.445962, 103.798160"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert15 = case15.create();
            alert15.show();
            break;
            
        case 16: //  Spring Veterinary Care
            AlertDialog.Builder case16 = new AlertDialog.Builder(getContext());
            case16.setMessage("Blk 123, Hougang Ave 1, #01-1412\n" +
                    "Singapore 530123\n" +
                    "Tel: 62863313 | Fax: 62800160");
            case16.setCancelable(false);
            case16.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case16.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.353604, 103.886359"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert16 = case16.create();
            alert16.show();
            break;
            
        case 17: //  STARS Veterinary Clinic
            AlertDialog.Builder case17 = new AlertDialog.Builder(getContext());
            case17.setMessage("211 Hougang Street 21 #01-301\n" +
                    "Singapore 530211\n" +
                    "Tel: 62809880 | Fax: 62800680");
            case17.setCancelable(false);
            case17.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case17.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.359683, 103.887658"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert17 = case17.create();
            alert17.show();
            break;
            
        case 18: //  The Animal Doctors Pte Ltd
            AlertDialog.Builder case18 = new AlertDialog.Builder(getContext());
            case18.setMessage("Blk 108 Ang Mo Kio Ave. 4 #01-94/96\n" +
                    "Singapore 560108\n" +
                    "Tel: 64514531 | Fax: 64517531");
            case18.setCancelable(false);
            case18.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case18.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.371081, 103.838496"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert18 = case18.create();
            alert18.show();
            break;
            
        case 19: //  United Veterinary Clinic
            AlertDialog.Builder case19 = new AlertDialog.Builder(getContext());
            case19.setMessage("Blk 107 Ang Mo Kio Ave 4, #01-148\n" +
                    "Singapore 560107\n" +
                    "Tel: 64556880 | Fax: 64550886");
            case19.setCancelable(false);
            case19.setPositiveButton(
                    "Close",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }
            );
            case19.setNegativeButton(
                    "Directions",
                    new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog,int id){
                            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                    Uri.parse("http://maps.google.com/maps?daddr=1.371436, 103.837252"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert19 = case19.create();
            alert19.show();
            break;
            
             // insert a case for each clinic, case number has to be corresponding to the array values inserted above
        }
    }
}