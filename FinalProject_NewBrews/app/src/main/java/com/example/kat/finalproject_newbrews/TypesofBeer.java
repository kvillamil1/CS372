package com.example.kat.finalproject_newbrews;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class TypesofBeer extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_beer);

        LinearLayout l = (LinearLayout) this.findViewById(R.id.tbLayout);

        try {
            for (int i = 0; i < 9; i++) {
                Button b = new Button(this);
                b.setText(String.format("Button %d", i));
                b.setTextColor(Color.WHITE);
                b.setBackground(getResources().getDrawable(R.drawable.listbutton));
                LinearLayout.LayoutParams lp =
                        new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                lp.setMargins(0, 0, 0, 0);
                b.setLayoutParams(lp);

                b.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        buttonOnClick(v);
                    }
                });

                l.addView(b);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void buttonOnClick(View v) {
        Button b = (Button) v;
        startActivity(new Intent(getApplicationContext(), BeersOfType.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_latest_releases, menu);
        return true;
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
