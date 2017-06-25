package com.example.sergei.vaperaw;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Drawer result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Главная");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_home).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_free_play),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_custom).withIdentifier(2),

                        new SectionDrawerItem().withName(R.string.drawer_item_settings),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_help),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_contact).withIdentifier(1),
                        new PrimaryDrawerItem().withName("Информация").withIdentifier(3)
                )

               .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                   @Override
                   public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                       Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_SHORT).show();
                       return false;
                   }
               })
                .build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
}
