package com.lazyproduction.narisecurity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.setting, menu);
        return true;
    }
    Button btn;
    public void fsetting(){
        Toast.makeText(getApplicationContext(), "Setting", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(MainActivity.this, setting.class);
        startActivity(i);
    }
    public void fabout(){
        Toast.makeText(getApplicationContext(), "About", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(MainActivity.this, about.class);
        startActivity(i);
    }
    public void fdev(){
        Toast.makeText(getApplicationContext(), "Developers", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(MainActivity.this, developers.class);
        startActivity(i);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
               fsetting();
                return true;
            case R.id.developer:
                fdev();
                return true;
            case R.id.about:
                fabout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
