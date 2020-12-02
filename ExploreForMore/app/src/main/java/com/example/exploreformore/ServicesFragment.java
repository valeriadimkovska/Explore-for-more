package com.example.exploreformore;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

public class ServicesFragment extends Fragment {
    DatabaseHelper db;
    ListView listView;
    PlacesAdapter placesAdapter;
    ArrayList<Places> arrayList;
    SQLiteDatabase sqLiteDatabase;

    public ServicesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_services, container, false);
        setHasOptionsMenu(true);
        listView = view.findViewById(R.id.services_LV);
        listView.setAdapter(placesAdapter);
        arrayList = new ArrayList<>();
        db = new DatabaseHelper(getContext());
        sqLiteDatabase = db.getReadableDatabase();
        loadDataInListView();
        placesAdapter.notifyDataSetChanged();
        return view;
    }
        private void loadDataInListView() {
        arrayList = db.getServices();
        placesAdapter = new PlacesAdapter(getActivity(), arrayList);
        listView.setAdapter(placesAdapter);
        placesAdapter.notifyDataSetChanged();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_add) {
            Intent intent = new Intent(getActivity(), AddNewItem.class);
                    startActivity(intent);
        }
        return (true);
    }


}

