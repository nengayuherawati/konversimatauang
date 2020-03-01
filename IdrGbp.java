package org.sandec.konversimatauangasing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.text.DecimalFormat;

public class IdrGbp extends AppCompatActivity {

    /**
     * Called when the activity is first created.
     */
    private EditText etAngka;
    private RadioButton rbcf;
    private Button btnProses;
    DecimalFormat gbp;
    DecimalFormat rp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idr_gbp);

        etAngka = findViewById(R.id.editText1);
        rbcf = findViewById(R.id.radio0);
        rbcf.setChecked(true);
        btnProses = findViewById(R.id.button1);
        btnProses.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kalkulasi();

            }
        });
    }

    public void kalkulasi() {
        double angka = 0;
        gbp = new DecimalFormat("£###,###,###,###,###.#######");
        rp = new DecimalFormat("Rp ###,###,###,###,###.##");

        try {
            angka = Double.parseDouble(
                    etAngka.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Masukkan Angka",
                    Toast.LENGTH_LONG).show();
        }

        String hasil;
        if (rbcf.isChecked()) {
            hasil = gbp.format(angka) + " = " + rp.format(angka * 17639);
        } else {
            hasil = rp.format(angka) + " = " + gbp.format(angka / 17639);
        }

        AlertDialog.Builder ab = new AlertDialog.Builder(this);
        ab.setTitle("Hasil");
        ab.setMessage(hasil);
        ab.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = ab.create();
        dialog.show();
    }
}

