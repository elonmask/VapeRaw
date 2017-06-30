package com.example.sergei.vaperaw;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Contacts extends AppCompatActivity {

    private Drawer result = null;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        setTitle("Наши контакты");

        button5 = (Button) findViewById(R.id.button5);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar7);
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

                            Intent intent = new Intent(Contacts.this, MainActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 3) {

                            //Открыть козрину
                            Intent intent = new Intent(Contacts.this, BucketActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 4){

                            //Открыть контакты
                        }

                        if (drawerItem.getIdentifier() == 5){

                            //Показать информацию
                            Intent intent = new Intent(Contacts.this, Info.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 6) {

                            Intent intent = new Intent(Contacts.this, Help.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 7) {

                            Intent intent = new Intent(Contacts.this, Cataolg.class);
                            startActivity(intent);
                        }
                        return false;
                    }
                })
                .build();

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(044) 537-03-55"));
                startActivity(intent);
            }
        });
    }
}
