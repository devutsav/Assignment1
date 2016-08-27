package com.example.lenovo.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        txt=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=txt.getText().toString();
                if(name ==""||name.trim().length()==0||name == null)
                {
                    Toast.makeText(getApplicationContext(),"Please enter your name",Toast.LENGTH_SHORT).show();
                }
                else{
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("name", name);
                        String pack=getPackageName()+".Main2Activity";
                        Class cls=Class.forName(pack);
                        Intent i = new Intent(MainActivity.this,cls);
                        i.putExtras(bundle);
                        startActivity(i);

                    }
                    catch(ClassNotFoundException e)
                    {
                        e.printStackTrace();
                    }

                }

            }
        });

