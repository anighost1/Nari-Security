package com.lazyproduction.narisecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.URI;

public class developers extends AppCompatActivity {
    ImageView ad,ct,pso,at;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
        ad=(ImageView)findViewById(R.id.ad);
        ct=(ImageView)findViewById(R.id.ct);
        pso=(ImageView)findViewById(R.id.pso);
        at=(ImageView)findViewById(R.id.at);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/animesh_5145/");
                Intent u = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(u);
            }
        });
        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/charanjeetigga/");
                Intent u = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(u);
            }
        });
        pso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/prem.o9/");
                Intent u = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(u);
            }
        });
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/ani_ghost/");
                Intent u = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(u);
            }
        });
    }
}
