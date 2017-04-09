package com.example.android.tourguideapp;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Dell on 2/21/2017.
 */

public class WordAdapter extends ArrayAdapter<word> {

    private int mColour;

    public WordAdapter(Context context, ArrayList<word> words, int Colour) {

        super(context, 0, words);
        mColour = Colour;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_view);

        nameTextView.setText(currentWord.getmNames());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImages()){
            imageView.setImageResource(currentWord.getmImages());

            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.parent);

        int colour = ContextCompat.getColor(getContext(),mColour);

        textContainer.setBackgroundColor(colour);

        return listItemView;
    }
}
