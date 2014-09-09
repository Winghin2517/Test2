package com.example.simon.test2;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import net.simonvt.menudrawer.MenuDrawer;
import net.simonvt.menudrawer.Position;


public class MyActivity extends Activity {
    MenuDrawer mMenuDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mMenuDrawer = attachMenuDrawer();
        mMenuDrawer.setContentView(R.layout.activity_my);
       // ActionBar actionBar = getActionBar();
       // if (actionBar != null) {
       //     actionBar.setDisplayHomeAsUpEnabled(true);
       // }
        TextView textbox = (TextView) findViewById(R.id.textbox);
        textbox.setTypeface(Typeface.create(Typeface.DEFAULT,Typeface.BOLD));
        textbox.setText(getClass().getName());
    }

    private MenuDrawer attachMenuDrawer() {
        final MenuDrawer menuDrawer;
        ActionBar actionBar = getActionBar();


        menuDrawer = MenuDrawer.attach(this, MenuDrawer.Type.OVERLAY);
        if (actionBar != null) {
             actionBar.setDisplayHomeAsUpEnabled(true);
          }
        menuDrawer.setDrawerIndicatorEnabled(true);

       // int shadowSizeInPixels = getResources().getDimensionPixelSize(R.dimen.menu_shadow_width);
       // menuDrawer.setDropShadowSize(shadowSizeInPixels);
       //menuDrawer.setDropShadowColor(getResources().getColor(R.color.md__shadowColor));
       // menuDrawer.setSlideDrawable(R.drawable.ic_drawer);

        return menuDrawer;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
