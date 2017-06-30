package com.example.sergei.vaperaw;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Drawer result = null;

    ImageView view3;
    ImageView view4;
    ImageView view5;
    ImageView view6;
    ImageView view7;

    Button button2;
    Button button;
    Button button3;
    Button button4;
    Button button33;
    Button button44;
    Button button334;
    Button button474;
    Button hh;

    TextView textView3333;
    TextView textView333;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Главная");

        view3 = (ImageView) findViewById(R.id.imageView3);
        view4 = (ImageView) findViewById(R.id.imageView4);
        view5 = (ImageView) findViewById(R.id.imageView5);
        view6 = (ImageView) findViewById(R.id.imageView6);
        view7 = (ImageView) findViewById(R.id.imageView7);

        button2 = (Button) findViewById(R.id.button2);
        button = (Button) findViewById( R.id.button);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button33 = (Button) findViewById(R.id.button33);
        button44 = (Button) findViewById(R.id.button44);
        button334 = (Button) findViewById(R.id.button334);
        button474 = (Button) findViewById(R.id.button474);
        hh = (Button) findViewById(R.id.hh);

        textView333 = (TextView) findViewById(R.id.textView333);
        textView3333 = (TextView) findViewById(R.id.textView3333);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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

                       if (drawerItem.getIdentifier() == 3) {

                           //Открыть козрину
                           Intent intent = new Intent(MainActivity.this, BucketActivity.class);
                           startActivity(intent);
                       }

                       if (drawerItem.getIdentifier() == 4){

                           Intent intent = new Intent(MainActivity.this, Contacts.class);
                           startActivity(intent);
                       }

                        if (drawerItem.getIdentifier() == 5){

                            //Показать информацию
                            Intent intent = new Intent(MainActivity.this, Info.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 6) {

                            Intent intent = new Intent(MainActivity.this, Help.class);
                            startActivity(intent);
                        }
                       return false;
                   }
               })
                .build();

        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button334.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        button474.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        textView333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        textView3333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Loading.class);
                startActivity(intent);
            }
        });

        hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Contacts.class);
                startActivity(intent);
            }
        });
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

                Intent intent = new Intent(MainActivity.this, Search.class);
                startActivity(intent);
                return true;

            case R.id.basket:

                Intent intent1 = new Intent(MainActivity.this, BucketActivity.class);
                startActivity(intent1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
