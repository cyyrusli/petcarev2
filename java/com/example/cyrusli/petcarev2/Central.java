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


public class Central extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listfragment, container, false);

        String [] centralsource = {"Mount Pleasant After Hours Emergency Clinic", "Animal Ark Veterinary Group (Animal Ark Binjai)", "Animal Ark Veterinary Group (Animal Ark Greendale)", "Animal Infirmary", "Animal Medical Centre (VET@RV) Pte Ltd", "Care Veterinary Clinic Pte Ltd",
                "Companion Animal Surgery Pte Ltd", "James Tan Veterinary Centre Pte Ltd", "Jireh Veterinary Clinic Pte Ltd", "Landon Veterinary Specialist", "Maranatha Veterinary Clinic", "Monster Pet Vet", "Mount Pleasant Animal Medical Centre(Fareer) Pte Ltd", "Mount Pleasant Central Veterinary Clinic(Whitley)",
                "Mount Pleasant Veterinary Centre(Gelenggang)", "Nam Sang Veterinary Clinic Pte Ltd", "Namly Animal Clinic Pte Ltd", "P.A.W (People Animal Wellness) Veterinary Centre Pte Ltd", "Pets Avenue Veterinary Clinic (Farrer Road)", "Point Veterinary Surgery (Telok Blangah)", "SPCA Clinic *Community Animals Only",
                "The Animal Doctors (Tiong Bahru) Pte Ltd", "The Pet Doctors Veterinary Clinic Pte Ltd", "The Veterinary Clinic Pte Ltd (Holland Village)","The Visiting Vets Clinic", "Toa Payoh Vets (Toa Payoh Veterinary Surgery)", "Town Vets Animal Clinic Pte Ltd",
                "Vet Central Pte Ltd(ToaPayoh)", "Vet Practice Pte Ltd(Holland)"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem, centralsource);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.textitem);
        Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_LONG).show();

        switch (position) {

            case 0: //  Mount Pleasant After Hours Emergency Clinic
                AlertDialog.Builder case0 = new AlertDialog.Builder(getContext());
                case0.setMessage("232 Whitley Road\n" +
                        "Singapore 297824\n" +
                        "Tel: 62508333 | Fax: 6251 6394");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.325606, 103.82715"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert0 = case0.create();
                alert0.show();
                break;

            case 1: //  Animal Ark Binjai
                AlertDialog.Builder case1 = new AlertDialog.Builder(getContext());
                case1.setMessage("11 Binjai Park\n" +
                        "Singapore 589823\n" +
                        "Tel: 6100 6000 | Fax: 64623319 ");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.335987, 103.786958"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert1 = case1.create();
                alert1.show();
                break;

            case 2: // Animal Ark Greendale
                AlertDialog.Builder case2 = new AlertDialog.Builder(getContext());
                case2.setMessage("3 Greendale Avenue\n" +
                        "Singapore 289498\n" +
                        "Tel: 64637100 | Fax: 64637144 ");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.331780, 103.807229"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert2 = case2.create();
                alert2.show();
                break;

            case 3: // Animal Infirmary
                AlertDialog.Builder case3 = new AlertDialog.Builder(getContext());
                case3.setMessage("74 Thomson Road\n" +
                        "Singapore 307590\n" +
                        "Tel: 63582663 | Fax: 63582629");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.316017, 103.845116"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert3 = case3.create();
                alert3.show();
                break;

            case 4: // Vet@RV
                AlertDialog.Builder case4 = new AlertDialog.Builder(getContext());
                case4.setMessage("78 Indus Road #01-487, Indus Garden\n" +
                        "Singapore 161078\n" +
                        "Tel: 62710665 | Fax: 62710171");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.291160, 103.827555"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert4 = case4.create();
                alert4.show();
                break;

            case 5: // Care Vet
                AlertDialog.Builder case5 = new AlertDialog.Builder(getContext());
                case5.setMessage("Blk 124 Toa Payoh Lorong 1 #01-473\n" +
                        "Singapore 310124\n" +
                        "Tel: 62500 535 | Fax: 62500 626");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.338651, 103.844604"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert5 = case5.create();
                alert5.show();
                break;

            case 6: // Companion animal surgery
                AlertDialog.Builder case6 = new AlertDialog.Builder(getContext());
                case6.setMessage("#01-04/05 Shaw Corner, 12 Boon Teck Rd (Balestier Rd)\n" +
                        "Singapore 329586\n" +
                        "Tel: 6255 7950 | Fax: 6251 1910");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.326338, 103.849712"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert6 = case6.create();
                alert6.show();
                break;

            case 7: // James Tan Vet
                AlertDialog.Builder case7 = new AlertDialog.Builder(getContext());
                case7.setMessage("230 Whitley Road\n" +
                        "Singapore 297823\n" +
                        "Tel: 62531122 | Fax: 62507168");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.325976, 103.827327"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert7 = case7.create();
                alert7.show();
                break;

            case 8: // Jireh Vet
                AlertDialog.Builder case8 = new AlertDialog.Builder(getContext());
                case8.setMessage("15 Venus Road Windsor Park Estate\n" +
                        "Singapore 574302\n" +
                        "Tel: 65560268 | Fax: 65560269");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.358851, 103.828147"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert8 = case8.create();
                alert8.show();
                break;

            case 9: // Landon Vet
                AlertDialog.Builder case9 = new AlertDialog.Builder(getContext());
                case9.setMessage("41 Eng Kong Terrace\n" +
                        "Singapore 599013\n" +
                        "Tel: 64637228 | Fax: 64683501");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.336094, 103.769054"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert9 = case9.create();
                alert9.show();
                break;

            case 10: // Maranatha Vet
                AlertDialog.Builder case10 = new AlertDialog.Builder(getContext());
                case10.setMessage("77 Telok Blangah Drive #01-234100077\n" +
                        "Tel: 6273 0100 | Fax: 6273 0906");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.273948, 103.808851"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert10 = case10.create();
                alert10.show();
                break;

            case 11: // Monster Pet Vet
                AlertDialog.Builder case11 = new AlertDialog.Builder(getContext());
                case11.setMessage("6 Everton Park #01-14/16\n" +
                        "Singapore 080006\n" +
                        "Tel: 63279148 | Fax: 63279147");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.276725, 103.838876"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert11 = case11.create();
                alert11.show();
                break;

            case 12: // Mount Pleasant Farrer
                AlertDialog.Builder case12 = new AlertDialog.Builder(getContext());
                case12.setMessage("Block 3, Queens Road, #02-141\n" +
                        "Singapore 260003\n" +
                        "Tel: 62711132 | Fax: 6475 3127");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.319048, 103.808658"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert12 = case12.create();
                alert12.show();
                break;

            case 13: // Mount Pleasant Whitley
                AlertDialog.Builder case13 = new AlertDialog.Builder(getContext());
                case13.setMessage("232 Whitley Road\n" +
                        "Singapore 297824\n" +
                        "Tel: 62508333 | Fax: 6256 1745");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.325606, 103.82715"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert13 = case13.create();
                alert13.show();
                break;

            case 14: // Mount Pleasant Gelenggang
                AlertDialog.Builder case14 = new AlertDialog.Builder(getContext());
                case14.setMessage("2 Jalan Gelenggang\n" +
                        "Singapore 578187\n" +
                        "Tel: 62517666 | Fax: 6256 5338");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.373133, 103.829832"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert14 = case14.create();
                alert14.show();
                break;

            case 15: // Nam Sang Vet
                AlertDialog.Builder case15 = new AlertDialog.Builder(getContext());
                case15.setMessage("2 Balestier Road, #01-697 Balestier Shopping Center\n" +
                        "Singapore 320002\n" +
                        "Tel: 62548138");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.325893, 103.842931"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert15 = case15.create();
                alert15.show();
                break;

            case 16: // Namly Animal clinic
                AlertDialog.Builder case16 = new AlertDialog.Builder(getContext());
                case16.setMessage("74 Namly Place\n" +
                        "Singapore 267223\n" +
                        "Tel: 64694744 | Fax: 64694844 ");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.324246, 103.796637"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert16 = case16.create();
                alert16.show();
                break;

            case 17: // P.A.W
                AlertDialog.Builder case17 = new AlertDialog.Builder(getContext());
                case17.setMessage("Blk 112, Bukit Purmei Road, #01-207\n" +
                        "Singapore 090112\n" +
                        "Tel: 62737573 | Fax: 62787576 ");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.274475, 103.826117"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert17 = case17.create();
                alert17.show();
                break;

            case 18: // Pet ave vet
                AlertDialog.Builder case18 = new AlertDialog.Builder(getContext());
                case18.setMessage("8 Empress Road #01-11\n" +
                        "Singapore 260008\n" +
                        "Tel: 6471 0111 After-hours emergency: 8121 6080 | Fax: 6471 0154");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.316503, 103.805424"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert18 = case18.create();
                alert18.show();
                break;

            case 19: // Point vet
                AlertDialog.Builder case19 = new AlertDialog.Builder(getContext());
                case19.setMessage("38 Telok Blangah Rise #01-339\n" +
                        "Singapore 090038\n" +
                        "Tel: 62741677 | Fax: 62742177");
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
                                        Uri.parse("http://maps.google.com/maps?daddr=1.272318, 103.822225"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert19 = case19.create();
                alert19.show();
                break;

            case 20: // spca clinic
                AlertDialog.Builder case20 = new AlertDialog.Builder(getContext());
                case20.setMessage("31 Mount Vernon Road\n" +
                        "Singapore 368054\n" +
                        "Tel: 62875355 | Fax: 63824162");
                case20.setCancelable(false);
                case20.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case20.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.341621, 103.880917"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert20 = case20.create();
                alert20.show();
                break;

            case 21: // animal doctors tiong bahru
                AlertDialog.Builder case21 = new AlertDialog.Builder(getContext());
                case21.setMessage("11A Boon Tiong Road (Next to Tiong Bahru Plaza) #02-07/08\n" +
                        "Singapore 161011\n" +
                        "Tel: 6253 3023");
                case21.setCancelable(false);
                case21.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case21.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.286330, 103.829163"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert21 = case21.create();
                alert21.show();
                break;

            case 22: // pet doctors vet
                AlertDialog.Builder case22 = new AlertDialog.Builder(getContext());
                case22.setMessage("3 Pandan Valley, #01-311 Pandan Valley Condominium\n" +
                        "Singapore 597627\n" +
                        "Tel: 64387779");
                case22.setCancelable(false);
                case22.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case22.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.319938, 103.779565"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert22 = case22.create();
                alert22.show();
                break;

            case 23: // vet clinic holland v
                AlertDialog.Builder case23 = new AlertDialog.Builder(getContext());
                case23.setMessage("31A & 33A Lorong Liput\n" +
                        "Singapore 277742\n" +
                        "Tel: 64686312 | Fax: 64686257");
                case23.setCancelable(false);
                case23.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case23.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.310238, 103.794809"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert23 = case23.create();
                alert23.show();
                break;

            case 24: // the visiting vet clinic
                AlertDialog.Builder case24 = new AlertDialog.Builder(getContext());
                case24.setMessage("9 Taman serasi #01-09\n" +
                        "Singapore 257720\n" +
                        "Tel: 64753405");
                case24.setCancelable(false);
                case24.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case24.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.308289, 103.819271"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert24 = case24.create();
                alert24.show();
                break;

            case 25: // tpy vet
                AlertDialog.Builder case25 = new AlertDialog.Builder(getContext());
                case25.setMessage("1002 Toa Payoh Lorong 8 #01-1477\n" +
                        "Singapore 319074\n" +
                        "Tel: 62543326 | Fax: 62560501");
                case25.setCancelable(false);
                case25.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case25.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.334948, 103.860624"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert25 = case25.create();
                alert25.show();
                break;

            case 26: // town vets
                AlertDialog.Builder case26 = new AlertDialog.Builder(getContext());
                case26.setMessage("22 Havelock Road #01 - 687\n" +
                        "Singapore 160022\n" +
                        "Tel: 62767026 | Fax: 67250654");
                case26.setCancelable(false);
                case26.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case26.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.334948, 103.860624"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert26 = case26.create();
                alert26.show();
                break;

            case 27: // vet central
                AlertDialog.Builder case27 = new AlertDialog.Builder(getContext());
                case27.setMessage("Blk 69, Lorong 4 Toa Payoh, #01-357Singapore 310069\n" +
                        "Tel: 66358646 | Fax: 66358645");
                case27.setCancelable(false);
                case27.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case27.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.334191, 103.852724"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert27 = case27.create();
                alert27.show();
                break;

            case 28: // vet practice
                AlertDialog.Builder case28 = new AlertDialog.Builder(getContext());
                case28.setMessage("31 Holland Close #01-219\n" +
                        "Singapore 270031\n" +
                        "Tel: 67785285 | Fax: 64685548");
                case28.setCancelable(false);
                case28.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }
                );
                case28.setNegativeButton(
                        "Directions",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                                        Uri.parse("http://maps.google.com/maps?daddr=1.307077, 103.797092"));
                                startActivity(intent);
                            }
                        }
                );
                AlertDialog alert28 = case28.create();
                alert28.show();
                break;
        }


    }
}
