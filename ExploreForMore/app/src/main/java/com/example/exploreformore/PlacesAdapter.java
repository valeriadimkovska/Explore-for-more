package com.example.exploreformore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class PlacesAdapter extends BaseAdapter {

    Context context;
    ArrayList<Places> arrayList;
    LayoutInflater inflater;

    PlacesAdapter(Context context, ArrayList<Places> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return this.arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listview_item, null);
        TextView name = convertView.findViewById(R.id.name);
        TextView address = convertView.findViewById(R.id.address);
        TextView email = convertView.findViewById(R.id.email);
        TextView tel = convertView.findViewById(R.id.tel);
        TextView web = convertView.findViewById(R.id.web);
        Places places = arrayList.get(position);

        name.setText(places.getName());
        address.setText(places.getAddress());
        email.setText(places.getEmail());
        tel.setText(places.getTel());
        web.setText(places.getWeb());
        return convertView;
    }

    public void add(Places places) {
    }
}
