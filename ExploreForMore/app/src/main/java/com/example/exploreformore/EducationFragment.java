package com.example.exploreformore;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EducationFragment extends Fragment {
    DatabaseHelper db;
    ListView listView;
    PlacesAdapter placesAdapter;
    ArrayList<Places> arrayList;
    public EducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_education, container, false);
        setHasOptionsMenu(true);
        listView = view.findViewById(R.id.education_LV);
        db = new DatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase = db.getReadableDatabase();
        arrayList = new ArrayList<>();
        loadDataInListView();
        placesAdapter.notifyDataSetChanged();

        return view;
    }

    private void loadDataInListView() {
        arrayList = db.getEducation();
        placesAdapter = new PlacesAdapter(getActivity(), arrayList);
        listView.setAdapter(placesAdapter);
        placesAdapter.notifyDataSetChanged();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            Intent intent = new Intent(getActivity(), AddNewItem.class);
            startActivity(intent);
        }
        return true;
    }
    }
