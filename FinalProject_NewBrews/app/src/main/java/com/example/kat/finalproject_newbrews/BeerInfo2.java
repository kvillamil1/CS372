package com.example.kat.finalproject_newbrews;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Functions for Beer Info page (that is pulled from Beers of Type)
 */
public class BeerInfo2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_info2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_beer_info2, menu);
        return true;
    }

    /**
     * OnClick function for home button on page (pulls up home screen)
     * @param v
     */
    public void beerinfo2homeOnClick(View v) {
        Button b = (Button) v;
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    /**
     * OnClick function for back button on page (pulls up previous screen)
     * @param v
     */
    public void beerinfo2backOnClick(View v) {
        Button b = (Button) v;
        startActivity(new Intent(getApplicationContext(), BeersOfType.class));
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
