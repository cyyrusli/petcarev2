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
import android.content.DialogInterface;
import android.content.Intent;


public class eastcoast extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listfragment, container, false);

        String[] eastsource = {"Amber Veterinary Practice Pte Ltd", "Animal Ark Veterinary Group (Animal Ark Tampines)", "Animal Ark Veterinary Group (Animal Ark TCM)", "Clinic For Pets", 
        		 "Frankel Veterinary Centre", "Heart2Heart Veterinary Centre", "Island Veterinary Clinic (Bedok)", "Light of Life Veterinary Clinic and Services",
        		 "Mount Pleasant Animal Clinic (East)", "Mount Pleasant Animal Medical Centre (Bedok) Pte Ltd", "Mount Pleasant Veterinary Centre (Changi) Pte Ltd",
        		 "Pet Care Centre & Clinic Pte Ltd", "The Animal Clinic Pte Ltd (Katong Branch)", "The Veterinary Clinic @ Tampines Pte Ltd", "Vets for Life Animal Clinic Pte Ltd"}; // insert the names in this array *spacing is important
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.healthrowlayout, R.id.textitem, eastsource);
        setListAdapter(adapter);
        setRetainInstance(true);

        return v;
    }

    public void onListItemClick(ListView l, View view, int position, long id) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView txt = (TextView) viewGroup.findViewById(R.id.textitem);
        Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_LONG).show();

        switch (position) {
            // insert a case for each clinic, case number has to be corresponding to the array values inserted above
        
        case 0: //  Amber veterinary
            AlertDialog.Builder case0 = new AlertDialog.Builder(getContext());
            case0.setMessage("50 Burnfoot Terrace, Frankel Estate\n" +
                    "Singapore 459837\n" +
                    "Tel: 62455543 | Fax: 62452334");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.312759, 103.922823"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert0 = case0.create();
            alert0.show();
            break;
        
        case 1: //  Animal Ark Veterinary Group (Animal Ark Tampines)
            AlertDialog.Builder case1 = new AlertDialog.Builder(getContext());
            case1.setMessage("139 Tampines Street 11 #01-42\n" +
                    "Singapore 521139\n" +
                    "Tel: 6587 1797 / 6587 1798 | Fax: 67864506");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.346560, 103.943943"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert1 = case1.create();
            alert1.show();
            break;
        
        case 2: //  Animal Ark Veterinary Group (Animal Ark TCM)
            AlertDialog.Builder case2 = new AlertDialog.Builder(getContext());
            case2.setMessage("139 Tampines Street 11 #01-62\n" +
                    "Singapore 521139\n" +
                    "Tel: 6789 3578 | Fax: 6782 0416");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.346563, 103.943952"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert2 = case2.create();
            alert2.show();
            break;
        case 3: //  Clinic For Pets
            AlertDialog.Builder case3 = new AlertDialog.Builder(getContext());
            case3.setMessage("1015 Geylang East Avenue 3 #01-141\n" +
                    "Singapore 389730\n" +
                    "Tel: 67451337 | Fax: 67457383");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.319417, 103.891267"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert3 = case3.create();
            alert3.show();
            break;
        case 4: //  Frankel Veterinary Centre
            AlertDialog.Builder case4 = new AlertDialog.Builder(getContext());
            case4.setMessage("101 Frankel Avenue\n" +
                    "Singapore 458224\n" +
                    "Tel: 68761212 | Fax: 68761219");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.314613, 103.919400"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert4 = case4.create();
            alert4.show();
            break;
        case 5: //  Heart2Heart Veterinary Centre
            AlertDialog.Builder case5 = new AlertDialog.Builder(getContext());
            case5.setMessage("53 Jalan Tua Kong\n" +
                    "Singapore 457251\n" +
                    "Tel: 65551334");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.315851, 103.925474"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert5 = case5.create();
            alert5.show();
            break;
        case 6: //  Island Veterinary Clinic (Bedok)
            AlertDialog.Builder case6 = new AlertDialog.Builder(getContext());
            case6.setMessage("Blk 123 Bedok North Street 2 #01-154\n" +
                    "Singapore 460123\n" +
                    "Tel: 6449 4491 | Fax: 6448 4082");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.329065, 103.937278"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert6 = case6.create();
            alert6.show();
            break;
        case 7: //  Light of Life Veterinary Clinic and Services
            AlertDialog.Builder case7 = new AlertDialog.Builder(getContext());
            case7.setMessage("Blk 703 Bedok Reservoir Road #01-3508\n" +
                    "Singapore 470703\n" +
                    "Tel: 62433282 | Fax: 64487268");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.337241, 103.919580"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert7 = case7.create();
            alert7.show();
            break;
        case 8: //  Mount Pleasant Animal Clinic (East)
            AlertDialog.Builder case8 = new AlertDialog.Builder(getContext());
            case8.setMessage("152 East Coast Road\n" +
                    "Singapore 428855\n" +
                    "Tel: 63486110 | Fax: 63487161");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.306324, 103.905863"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert8 = case8.create();
            alert8.show();
            break;
        case 9: //  Mount Pleasant Animal Clinic (East)
            AlertDialog.Builder case9 = new AlertDialog.Builder(getContext());
            case9.setMessage("158 Bedok South Avenue 3 #01-577\n" +
                    "Singapore 460158\n" +
                    "Tel: 64443561 | Fax: 64442787");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.318892, 103.945031"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert9 = case9.create();
            alert9.show();
            break;
        case 10: //  Mount Pleasant Veterinary Centre (Changi) Pte Ltd
            AlertDialog.Builder case10 = new AlertDialog.Builder(getContext());
            case10.setMessage("969A Upper Changi Road North\n" +
                    "Singapore 507667\n" +
                    "Tel: 65460166 | Fax: 65465881");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.360328, 103.970376"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert10 = case10.create();
            alert10.show();
            break;
        case 11: //  Pet Care Centre & Clinic Pte Ltd
            AlertDialog.Builder case11 = new AlertDialog.Builder(getContext());
            case11.setMessage("4 Waringin Park Sin Chuan Garden\n" +
                    "Singapore 416318\n" +
                    "Tel: 64485835 | Fax: 64444735");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.322130, 103.918070"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert11 = case11.create();
            alert11.show();
            break;
        case 12: //  The Animal Clinic Pte Ltd (Katong Branch)
            AlertDialog.Builder case12 = new AlertDialog.Builder(getContext());
            case12.setMessage("55 Lorong L, Telok Kurau #01-63\n" +
                    "Singapore 425500\n" +
                    "Tel: 64404767 | Fax: 64401812");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.311732, 103.910553"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert12 = case12.create();
            alert12.show();
            break;
        case 13: //  The Veterinary Clinic @ Tampines Pte Ltd
            AlertDialog.Builder case13 = new AlertDialog.Builder(getContext());
            case13.setMessage("476 Tampines Street 44 #01-201\n" +
                    "Singapore 520476\n" +
                    "Tel: 67842048 | Fax: 67832648");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.360976, 103.953688"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert13 = case13.create();
            alert13.show();
            break;
        case 14: //  Vets for Life Animal Clinic Pte Ltd
            AlertDialog.Builder case14 = new AlertDialog.Builder(getContext());
            case14.setMessage("330B Tanjong Katong Road\n" +
                    "Singapore 437106\n" +
                    "Tel: 63488346 | Fax: 63488643");
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
                                    Uri.parse("http://maps.google.com/maps?daddr=1.304147, 103.896400"));
                            startActivity(intent);
                        }
                    }
            );
            AlertDialog alert14 = case14.create();
            alert14.show();
            break;
        }
    }
}