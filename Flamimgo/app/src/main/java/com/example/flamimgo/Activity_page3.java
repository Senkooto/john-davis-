package com.example.flamimgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_page3 extends AppCompatActivity {
    private Button home;
    private Button store;
    private Button download;

    private Button help;

    private TextView logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);


        home=findViewById(R.id.home);
        store=findViewById(R.id.store);
        download=findViewById(R.id.download);
        help=findViewById(R.id.help3);




        logout=findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent store=new Intent(Activity_page3.this,MainActivity.class);
                startActivity(store);

            }
        });



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent store=new Intent(Activity_page3.this,MainActivity.class);
                startActivity(store);

            }
        });



        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent store=new Intent(Activity_page3.this,Activity_page2.class);
                startActivity(store);

            }
        });


        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent download=new Intent(Activity_page3.this,Activity_page3.class);
                startActivity(download);

            }
        });


        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpPage=new Intent(Activity_page3.this,Activity_page4.class);
                startActivity(helpPage);

            }
        });



    }
}