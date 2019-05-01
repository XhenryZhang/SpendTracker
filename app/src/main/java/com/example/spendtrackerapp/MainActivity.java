package com.example.spendtrackerapp;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton addButton = (FloatingActionButton) findViewById(R.id.newEntryButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddEntryActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    // Menu is different from the class we defined
    public boolean onCreateOptionsMenu(Menu menu) { // adds the custom menu to the existing menu
        getMenuInflater().inflate(R.menu.title_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*
    @Override // on click listener for menu
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_bar) {
            // do something idk
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.fuck, , "adsf");
                ft.addToBackStack(null);
                ft.commit();
            }
        }
        return super.onOptionsItemSelected(item);
    }*/
}
