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

public class Help extends AppCompatActivity {

    private Drawer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_home).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_free_play).withIdentifier(2),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_custom).withIdentifier(3),

                        new SectionDrawerItem().withName(R.string.drawer_item_settings),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_help),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_contact).withIdentifier(4),
                        new PrimaryDrawerItem().withName("Информация").withIdentifier(5)
                )

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        if (drawerItem.getIdentifier() == 1) {

                            Intent intent = new Intent(Help.this, MainActivity.class);
                            startActivity(intent);

                        }

                        if (drawerItem.getIdentifier() == 2 ){

                            // Открыть каталог товаров
                            Intent intent = new Intent(Help.this, catalog.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 3) {

                            //Открыть козрину
                            Intent intent = new Intent(Help.this, BucketActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 4){

                            //Открыть контакты
                        }

                        if (drawerItem.getIdentifier() == 5){

                            //Показать информацию
                        }
                        return false;
                    }
                })
                .build();
    }
}
