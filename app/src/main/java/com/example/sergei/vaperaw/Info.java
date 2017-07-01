package com.example.sergei.vaperaw;

import android.content.DialogInterface;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import org.w3c.dom.Text;

public class Info extends AppCompatActivity {

    private Drawer result = null;

    TextView t;
    TextView t2;
    TextView t3;
    TextView t20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setTitle("Информация");

        t = (TextView) findViewById(R.id.t);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t20 = (TextView) findViewById(R.id.t20);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar9);
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

                            Intent intent = new Intent(Info.this, MainActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 3) {

                            //Открыть козрину
                            Intent intent = new Intent(Info.this, BucketActivity.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 4){

                            Intent intent = new Intent(Info.this, Contacts.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 5){

                            //Показать информацию
                        }

                        if (drawerItem.getIdentifier() == 6) {

                            Intent intent = new Intent(Info.this, Help.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 7) {

                            Intent intent = new Intent(Info.this, Cataolg.class);
                            startActivity(intent);
                        }

                        if (drawerItem.getIdentifier() == 8) {

                            finishAffinity();
                        }
                        return false;
                    }
                })
                .build();

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Info.this);
                builder.setTitle("VAPERAW")
                        .setMessage("Версия: 2.4.1")
                        .setCancelable(true);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Info.this, "Соединение прервано", Toast.LENGTH_LONG).show();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Info.this);
                builder.setTitle("Гарантия")
                        .setMessage("Гарантия и сервисное обслуживание\n" +
                                "На какие товары предоставляется гарантия?\n" +
                                "\n" +
                                "На товары в нашем магазине предоставляется гарантия, подтверждающая обязательства по отсутствию в товаре заводских дефектов. Гарантия предоставляется на срок от 2-х недель до 99 месяцев в зависимости от сервисной политики производителя. Срок гарантии указан в описании каждого товара на нашем сайте. Подтверждением гарантийных обязательств служит гарантийный талон производителя.\n" +
                                "\n" +
                                "Пожалуйста, проверьте комплектность и отсутствие дефектов в товаре при его получении (комплектность определяется описанием изделия или руководством по его эксплуатации).")
                        .setCancelable(true);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Info.this);
                builder.setTitle("Доставка и оплата")
                        .setMessage("\n" +
                                "Наличный расчет с курьером при получении заказа.\n" +
                                "На карту Приватбанка: сумма заказа + комиссия, которая обычно составляет 1% от общей суммы.\n" +
                                "Оплата наложенного платежа при доставке Новой Почтой\n" +
                                " \n" +
                                " \n" +

                                "Курьерская служба доставит ваш заказ в течении 1-2 дней после его подтверждения.\n" +
                                "В рабочие дни с 10:00 до 20:00.\n" +
                                "Доставка заказов осуществляется через транспортную компанию «Новая Почта».\n" +
                                "\u200B\n" +
                                "Стоимость доставки в пределах г. Киева:\n" +
                                "заказ до 299 грн — 35 грн;\n" +
                                "заказ от 300 грн — бесплатно.")
                        .setCancelable(true);
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

    }
}
