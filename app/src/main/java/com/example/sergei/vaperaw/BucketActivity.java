package com.example.sergei.vaperaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class BucketActivity extends AppCompatActivity {

    private Drawer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket);

        setTitle("Корзина");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_home).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_custom).withIdentifier(3),

                        new SectionDrawerItem().withName(R.string.drawer_item_settings),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_help).withIdentifier(6),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_contact).withIdentifier(4),
                        new PrimaryDrawerItem().withName("Информация").withIdentifier(5)
                )

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        if (drawerItem.getIdentifier() == 1) {

                            Intent intent = new Intent(BucketActivity.this, MainActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 4){

                           Intent intent = new Intent(BucketActivity.this, Contacts.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 5){

                            //Показать информацию
                            Intent intent = new Intent(BucketActivity.this, Info.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 6) {

                            Intent intet = new Intent(BucketActivity.this, Help.class);
                            startActivity(intet);
                        }
                        return false;
                    }
                })
                .build();
    }
}
