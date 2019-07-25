package com.example.basiclistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieArrayAdapter extends ArrayAdapter<Movie> {

    Context mContext;
    ArrayList<Movie> movieArrayList;

    public MovieArrayAdapter( Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        Movie currentMovie = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title);
        TextView dateTextView = listItemView.findViewById(R.id.date);
        TextView descrTextView = listItemView.findViewById(R.id.description);


        titleTextView.setText(currentMovie.title);
        dateTextView.setText(currentMovie.releaseYear);
        descrTextView.setText(currentMovie.description);

        return listItemView;







    }
}
