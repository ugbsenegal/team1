package com.beniapp.ugbfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class restaurants_prives extends AppCompatActivity{

    private DrawerLayout mDrawerlayout2;
    private ActionBarDrawerToggle mToggle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_prives);
        CardView card3 = findViewById(R.id.bankcardId3);
        CardView card4 = findViewById(R.id.bankcardId4);
        CardView card5 = findViewById(R.id.bankcardId5);
        CardView card6 = findViewById(R.id.bankcardId6);
        CardView card7 = findViewById(R.id.bankcardId7);
        CardView card8 = findViewById(R.id.bankcardId8);

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                openActivitymenu3();

            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                openActivitymenu4();

            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                openActivitymenu5();

            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                openActivitymenu6();

            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                openActivitymenu7();

            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                openActivitymenu8();

            }
        });
    }

    public void openActivitymenu3() {
        Intent intent3 = new Intent(this, menu.class);
        startActivity(intent3);
    }

    public void openActivitymenu4() {
        Intent intent4 = new Intent(this, menu.class);
        startActivity(intent4);
    }

    public void openActivitymenu5() {
        Intent intent5 = new Intent(this, menu.class);
        startActivity(intent5);
    }

    public void openActivitymenu6() {
        Intent intent6 = new Intent(this, menu.class);
        startActivity(intent6);
    }

    public void openActivitymenu7() {
        Intent intent7 = new Intent(this, menu.class);
        startActivity(intent7);
    }

    public void openActivitymenu8() {
        Intent intent8 = new Intent(this, menu.class);
        startActivity(intent8);
    }
}