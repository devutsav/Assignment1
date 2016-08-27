package com.example.lenovo.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        Bundle extra = i.getExtras();

        String name = extra.getString("name");
        String msg = "Welcome" + name;
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(msg);
    }

}
