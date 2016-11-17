package com.olegsmirnov.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuCreator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.activity1_menu_item :
                intent = new Intent(getApplicationContext(), Activity1.class);
                startActivity(intent);
                return true;
            case R.id.activity2_menu_item :
                intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);
                return true;
            case R.id.activity3_menu_item :
                intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
