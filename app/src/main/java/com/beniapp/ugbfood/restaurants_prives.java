package com.beniapp.ugbfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

public class restaurants_prives extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerlayout2;
    private ActionBarDrawerToggle mToggle2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_prives);

/*        mDrawerlayout2 = (DrawerLayout) findViewById(R.id.drawerptive);
        mToggle2 = new ActionBarDrawerToggle(this, mDrawerlayout2, R.string.open, R.string.close);
        mDrawerlayout2.addDrawerListener(mToggle2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToggle2.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
*/
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.db_accueil:
                Intent intent = new Intent(this,Home_activity.class);
                startActivity(intent);
                break;
            case R.id.db_menu:
                Intent intent2 = new Intent(this,restaurants_prives.class);
                startActivity(intent2);
                break;
            case R.id.db_menu_pub:
                Intent intent3 = new Intent(this,restaurants_publics.class);
                startActivity(intent3);
                break;
            case R.id.db_connection:
                Intent intent4 = new Intent(this,connect.class);
                startActivity(intent4);
                break;
        }
        mDrawerlayout2.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle2.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
