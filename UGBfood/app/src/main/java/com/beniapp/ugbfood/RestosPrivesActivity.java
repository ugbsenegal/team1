
package com.example.dell.projet_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RestosPrivesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restos_prives);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnKhairati = (Button) findViewById(R.id.btnKhairati);

        btnKhairati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // A completer
            }
        });

        Button btnMoSafle = (Button) findViewById(R.id.btnMoSafle);

        btnMoSafle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // A completer
            }
        });


        Button btnKhoule = (Button) findViewById(R.id.btnKhoule);

        btnKhoule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // A remplir
            }
        });


        Button btnKBD = (Button) findViewById(R.id.btnKBD);

        btnKBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // A remplir
            }
        });

        Button btnPrincesse = (Button) findViewById(R.id.btnPrincesse);

        btnPrincesse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // A remplir
            }
        });

        Button btnDarou = (Button) findViewById(R.id.btnDarou);

        btnDarou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // A remplir
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
