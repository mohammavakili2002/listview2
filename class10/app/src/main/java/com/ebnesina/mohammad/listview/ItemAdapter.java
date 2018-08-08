package com.ebnesina.mohammad.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mohammad on 8/8/2018.
 */

class ItemAdapter extends ArrayAdapter<String> {
    public ItemAdapter(@NonNull Context context, @NonNull List<String> data) {
        super(context, 0, data);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.numberlistview, parent, false);
        }

        String item = getItem(position);

        TextView textView = convertView.findViewById(R.id.tv_text);
        textView.setText(item);

        ImageView imageView = convertView.findViewById(R.id.image);

        if (item.equals(getContext().getString(R.string.one))) {
            imageView.setImageResource(R.drawable.one);
        } else if (item.equals(getContext().getString(R.string.two))) {
            imageView.setImageResource(R.drawable.two);
        } else if (item.equals(getContext().getString(R.string.three))) {
            imageView.setImageResource(R.drawable.three);
        } else if (item.equals(getContext().getString(R.string.four))) {
            imageView.setImageResource(R.drawable.four);
        } else if (item.equals(getContext().getString(R.string.five))) {
            imageView.setImageResource(R.drawable.five);
        } else if (item.equals(getContext().getString(R.string.six))) {
            imageView.setImageResource(R.drawable.six);
        } else if (item.equals(getContext().getString(R.string.seven))) {
            imageView.setImageResource(R.drawable.seven);
        }  else if (item.equals(getContext().getString(R.string.eight))) {
            imageView.setImageResource(R.drawable.eight);
        }

            else if (item.equals("9")){
            imageView.setImageResource(R.drawable.nine);
             }
             else if (item.equals("10")){
            imageView.setImageResource(R.drawable.ten);
        }
        else if (item.equals("11")){
            imageView.setImageResource(R.drawable.eleven);
        }
        else if (item.equals("12")){
            imageView.setImageResource(R.drawable.towelve);
        }
        else if (item.equals("13")){
            imageView.setImageResource(R.drawable.thrteen);
        }
        else if (item.equals("14")){
            imageView.setImageResource(R.drawable.fourteen);
        }
        else if (item.equals("15")){
            imageView.setImageResource(R.drawable.fifteen);
        }
        else if (item.equals("16")){
            imageView.setImageResource(R.drawable.sixteen);
        }
        else if (item.equals("17")){
            imageView.setImageResource(R.drawable.seventeen);
        }
        else if (item.equals("18")){
            imageView.setImageResource(R.drawable.eighteen);
        }
        else if (item.equals("19")){
            imageView.setImageResource(R.drawable.ninteen);
        }
        else if (item.equals("20")){
            imageView.setImageResource(R.drawable.toweny);
        }

         else  if (item.equals("father")) {
            imageView.setImageResource(R.drawable.father);
        }   else  if (item.equals("mother")) {
            imageView.setImageResource(R.drawable.mother);
        }    else  if (item.equals("sister")) {
            imageView.setImageResource(R.drawable.sister);
        }     else  if (item.equals("brother")) {
            imageView.setImageResource(R.drawable.brother);
        }       else  if (item.equals("boy")) {
            imageView.setImageResource(R.drawable.boy);
        }      else  if (item.equals("uncle")) {
            imageView.setImageResource(R.drawable.uncle);
        }         else  if (item.equals("aunt")) {
            imageView.setImageResource(R.drawable.aunt);
        }      else  if (item.equals("girl")) {
            imageView.setImageResource(R.drawable.girl);
        }      else  if (item.equals("grandmother")) {
            imageView.setImageResource(R.drawable.grandmother);
        }       else  if (item.equals("grandfather")) {
            imageView.setImageResource(R.drawable.grandfather);
        }         else  if (item.equals("wife")) {
            imageView.setImageResource(R.drawable.wife);
        }        else  if (item.equals("ghazanfar")) {
            imageView.setImageResource(R.drawable.ghazanfar);
        }    else  if (item.equals("parent")) {
            imageView.setImageResource(R.drawable.parent);
        }    else  if (item.equals("child")) {
            imageView.setImageResource(R.drawable.childd);
        }     else  if (item.equals("boysister")) {
            imageView.setImageResource(R.drawable.boy);
        }       else  if (item.equals("boybroter")) {
            imageView.setImageResource(R.drawable.boy);
        }     else  if (item.equals("boyuncle")) {
            imageView.setImageResource(R.drawable.boy);
        }     else  if (item.equals("boyaunt")) {
            imageView.setImageResource(R.drawable.parent);
        }      else  if (item.equals("girlaunt")) {
            imageView.setImageResource(R.drawable.girl);
        }      else  if (item.equals("girluncle")) {
            imageView.setImageResource(R.drawable.girl);
        }         else  if (item.equals("girlsister")) {
            imageView.setImageResource(R.drawable.girl);
        }     else  if (item.equals("girlbrother")) {
            imageView.setImageResource(R.drawable.girl);
        }         else  if (item.equals("white")) {
            imageView.setImageResource(R.drawable.white);
        }        else  if (item.equals("brown")) {
            imageView.setImageResource(R.drawable.brown);
        }         else  if (item.equals("black")) {
            imageView.setImageResource(R.drawable.black);
        }           else  if (item.equals("pink")) {
            imageView.setImageResource(R.drawable.pink);
        }           else  if (item.equals("red")) {
            imageView.setImageResource(R.drawable.red);
        }             else  if (item.equals("gray")) {
            imageView.setImageResource(R.drawable.gray);
        }            else  if (item.equals("blue")) {
            imageView.setImageResource(R.drawable.blue);
        }       else  if (item.equals("yellow")) {
            imageView.setImageResource(R.drawable.yellow);
        }         else  if (item.equals("orange")) {
            imageView.setImageResource(R.drawable.orange);
        }       else  if (item.equals("green")) {
            imageView.setImageResource(R.drawable.green);
        }



        return convertView;
    }
}
