package com.example.flamimgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button store;
    private Button download;

    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        store=findViewById(R.id.store);
        download=findViewById(R.id.download);
        help=findViewById(R.id.help);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent store=new Intent(MainActivity.this,Activity_page2.class);
                startActivity(store);

            }
        });


        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent download=new Intent(MainActivity.this,Activity_page3.class);
                startActivity(download);

            }
        });


        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent download=new Intent(MainActivity.this,Activity_page4.class);
                startActivity(download);

            }
        });



    }
}