package com.madden_abbott.shoppinglist;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class ListsActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] values = new String[]{
                "Hello", "Goodbye"
        };
        ListAdapter adapter = new ArrayAdapter<>(this, R.layout.simple_list_item, values);
        ListView listView = new ListView(this);
        listView.setAdapter(adapter);
        setContentView(listView);
    }
}