package com.example.kat.finalproject_newbrews;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void latestOnClick(View v) {
        Button typeButton = (Button) v;
        startActivity(new Intent(getApplicationContext(),LatestReleases.class));
    }

    public void typeOnClick(View v) {
        Button typeButton = (Button) v;
        startActivity(new Intent(getApplicationContext(),TypesofBeer.class));
    }

    public void barOnClick(View v) {
        Button barButton = (Button) v;
        startActivity(new Intent(getApplicationContext(), BarsRestaurants.class));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
