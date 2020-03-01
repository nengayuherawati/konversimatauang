package org.sandec.konversimatauangasing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button usd, euro, gbp, myr, jpy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usd = findViewById(R.id.button_usd);
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openusd();
            }
        });

        euro = findViewById(R.id.button_euro);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openeuro();
            }
        });

        gbp = findViewById(R.id.button_gbp);
        gbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengbp();
            }
        });

        myr = findViewById(R.id.button_myr);
        myr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmyr();
            }
        });

        jpy = findViewById(R.id.button_jpy);
        jpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjpy();
            }
        });
    }

    public void openusd() {
        Intent usd = new Intent(this, IdrUsd.class);
        startActivity(usd);
    }

    public void openeuro() {
        Intent euro = new Intent(this, IdrEuro.class);
        startActivity(euro);
    }

    public void opengbp() {
        Intent gbp = new Intent(this, IdrGbp.class);
        startActivity(gbp);
    }

    public void openmyr() {
        Intent myr = new Intent(this, IdrMyr.class);
        startActivity(myr);
    }

    public void openjpy() {
        Intent jpy = new Intent(this, IdrYen.class);
        startActivity(jpy);
    }
}
