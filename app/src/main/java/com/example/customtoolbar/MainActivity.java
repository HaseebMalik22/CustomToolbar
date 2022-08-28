package com.example.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =findViewById(R.id.toolbar);

        //step 1
        setSupportActionBar(toolbar);

        //step2 (adding back button)
        if (getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My ToolBar");

        }

        //step3 (set subtitle)

        toolbar.setSubtitle("subtitle");

    }

    //setting up custom menu design on toolbar

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //setting up click on items

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        
        if (itemId==R.id.opt_new){
            Toast.makeText(this, "created new file", Toast.LENGTH_SHORT).show();
        }else if (itemId==R.id.opt_open){
            Toast.makeText(this, "File Open", Toast.LENGTH_SHORT).show();
        }else if (itemId==R.id.opt_save){
            Toast.makeText(this, "file saved", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "go back ", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}