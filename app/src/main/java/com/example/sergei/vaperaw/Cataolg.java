package com.example.sergei.vaperaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Cataolg extends AppCompatActivity {

    private Drawer result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataolg);

        setTitle("Каталог");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar12);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHasStableIds(true)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_home).withIcon(FontAwesome.Icon.faw_home).withIdentifier(1),
                        new PrimaryDrawerItem().withName("Каталог").withIcon(FontAwesome.Icon.faw_archive).withIdentifier(7),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_custom).withIcon(FontAwesome.Icon.faw_bitbucket).withIdentifier(3),

                        new SectionDrawerItem().withName(R.string.drawer_item_settings),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_help).withIcon(FontAwesome.Icon.faw_question).withIdentifier(6),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_contact).withIcon(FontAwesome.Icon.faw_phone).withIdentifier(4),
                        new PrimaryDrawerItem().withName("Информация").withIcon(FontAwesome.Icon.faw_info).withIdentifier(5),
                        new PrimaryDrawerItem().withName("Выход").withIcon(FontAwesome.Icon.faw_sign_out).withIdentifier(8)
                )

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        if (drawerItem.getIdentifier() == 1) {

                            Intent intent = new Intent(Cataolg.this, MainActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 3) {

                            //Открыть козрину
                            Intent intent = new Intent(Cataolg.this, BucketActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 4){

                            Intent intent = new Intent(Cataolg.this, Contacts.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 5){

                            //Показать информацию
                            Intent intent = new Intent(Cataolg.this, Info.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 6) {

                            Intent intent = new Intent(Cataolg.this, Help.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 8) {

                            finishAffinity();
                        }
                        return false;
                    }
                })
                .build();
    }

    public void toLoading(View view) {

        Intent intent = new Intent(Cataolg.this, Loading.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.search2:

                Intent intent = new Intent(Cataolg.this, Loading.class);
                startActivity(intent);
                return true;

            case R.id.basket:

                Intent intent1 = new Intent(Cataolg.this, BucketActivity.class);
                startActivity(intent1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
