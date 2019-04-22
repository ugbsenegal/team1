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

public class Home_activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawer );
        mToggle = new ActionBarDrawerToggle(this,mDrawerlayout,R.string.open,R.string.close);
        mDrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        CardView card3 = findViewById(R.id.clk_resto_public);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_connect();

            }
        });
        CardView card2 = findViewById(R.id.clk_resto_prive);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_connect2();

            }
        });
        CardView card1 = findViewById(R.id.clk_se_connecter);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_connect3();

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void openActivity_connect3() {
        Intent intent = new Intent(this , connect.class);
        startActivity(intent);
    }

    private void openActivity_connect2() {
        Intent intent = new Intent(this , restaurants_prives.class);
        startActivity(intent);
    }

    public void openActivity_connect() {
        Intent intent = new Intent(this , restaurants_publics.class);
        startActivity(intent);
    }

    /*public void openActivity_connect4() {
        Intent intent = new Intent(this , inscription.class);
        startActivity(intent);
    }*/

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.db_accueil:
                Intent intent = new Intent(Home_activity.this,Home_activity.class);
                startActivity(intent);
                break;
            case R.id.db_menu:
                Intent intent2 = new Intent(Home_activity.this,restaurants_prives.class);
                startActivity(intent2);
                break;
            case R.id.db_menu_pub:
                Intent intent3 = new Intent(Home_activity.this,restaurants_publics.class);
                startActivity(intent3);
                break;
            case R.id.db_connection:
                Intent intent4 = new Intent(Home_activity.this,connect.class);
                startActivity(intent4);
                break;
        }
        mDrawerlayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
