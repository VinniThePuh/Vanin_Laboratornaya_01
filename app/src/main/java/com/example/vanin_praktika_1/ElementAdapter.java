package com.example.vanin_praktika_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ElementAdapter extends ArrayAdapter<Element> {
    private LayoutInflater inflater;
    private int layout;
    private List<Element> states;
    public ElementAdapter(Context context, int resource, List<Element> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);
        ImageView flagView = (ImageView) view.findViewById(R.id.flag);
        TextView nameView = (TextView) view.findViewById(R.id.name);

        Element state = states.get(position);
        flagView.setImageResource(state.getFlagResource());
        nameView.setText(state.getName());
        (view.findViewById(R.id.bg)).setBackgroundColor(state.getColor());
        return view;
    }
}

