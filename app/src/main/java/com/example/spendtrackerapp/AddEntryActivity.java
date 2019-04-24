package com.example.spendtrackerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddEntryActivity extends AppCompatActivity {
    EditText title;
    EditText category;
    EditText date;
    EditText amount;
    String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/(19|20)[0-9]{2}$"; // allows 1900-2099
    Pattern p = Pattern.compile(regex);
    Matcher m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);
        title = (EditText) findViewById(R.id.titleEntry);
        category = (EditText) findViewById(R.id.categoryEntry);
        date = (EditText) findViewById(R.id.dateEntry);
        amount = (EditText) findViewById(R.id.amountEntry);

        Button cancel = (Button) findViewById(R.id.cancelButton);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button save = (Button) findViewById(R.id.saveButton);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = p.matcher(date.getText().toString().trim());
                if (title.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "nice pecs bro", Toast.LENGTH_SHORT).show();
                } else if (amount.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "something's wrong bro", Toast.LENGTH_SHORT).show();
                } else if (!(m.matches())) {
                    Toast.makeText(getApplicationContext(), "what's the time bro", Toast.LENGTH_SHORT).show();
                } else {
                    // if all fields have been filled appropriately
                    Toast.makeText(getApplicationContext(), "pass", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
