package com.example.kat.finalproject_newbrews;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Functions for Latest Releases page
 */
public class LatestReleases extends ActionBarActivity {

    /**
     * onCreation relative information is taken from database, parsed, and assigned to buttons that are
     * dynamically created on page. Button designs, layout params and onClickListener are specified
     * within loop.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_releases);

            Runnable r = new Runnable() {
                @Override
                public void run() {
                    try {

                        URL url = new URL("http://cs1.whitworth.edu/nbrews/NBrewerys.php?Linfo=0");

                        SAXParserFactory factory = SAXParserFactory.newInstance();
                        SAXParser parser = factory.newSAXParser();
                        final BeerEntryHandler handler = new BeerEntryHandler();
                        parser.parse(url.openStream(), handler);


                        final Handler h = new Handler(Looper.getMainLooper()) {
                            @Override
                            public void handleMessage(Message m) {
                                LinearLayout l = (LinearLayout) LatestReleases.this.findViewById(R.id.lrLayout);
                                for (int i = 0; i < handler.get_entries().size(); i++) {
                                    Button b = new Button(LatestReleases.this);
                                    String n = handler.get_entries().get(i).get_Craft_Beer_Name();
                                    b.setText(n);
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
                        };
                        h.obtainMessage().sendToTarget();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            new Thread(r).start();
        }

    /**
     * OnClick function for buttons (opens corresponding Beer Info page)
     * @param v
     */
    public void buttonOnClick(View v) {
        Button b = (Button) v;
        startActivity(new Intent(getApplicationContext(), BeerInfo.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_latest_releases, menu);
        return true;
    }

    /**
     * OnClick function for home button on page (pulls up home screen)
     * @param v
     */
    public void latesthomeOnClick(View v) {
        Button b = (Button) v;
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    /**
     * OnClick function for back button on page (pulls up previous screen)
     * @param v
     */
    public void latestbackOnClick(View v) {
        Button b = (Button) v;
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
