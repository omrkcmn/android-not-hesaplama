package com.example.nothesaplama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private  EditText vize, finall, finalyuzde, vizeYuzde;
    private TextView txtsonuc;
    private Button btnHesap;
    int f, vv, fy, vy;
    CoordinatorLayout coordinatorLayout;
    private void init()
    {
        vize = findViewById(R.id.txtVize);
        finall = findViewById(R.id.txtFinalnot);
        finalyuzde = findViewById(R.id.txtFinalyuzde);
        vizeYuzde = findViewById(R.id.txtVizeyuzde);
        txtsonuc = findViewById(R.id.txtSonuc);
        btnHesap = findViewById(R.id.btnHesap);

        btnHesap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(vize.getText().toString().matches(""))
                {
                    Toast.makeText(MainActivity.this, "Veri girmediniz!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    f = Integer.parseInt(vize.getText().toString());
                    vv = Integer.parseInt(finall.getText().toString());
                    vy = Integer.parseInt(vizeYuzde.getText().toString());
                    fy = Integer.parseInt(finalyuzde.getText().toString());
                    float vize = (float) (vv * vy) / 100;
                    float finall = (float) (f * fy) / 100;
                    float sonuc = vize + finall;
                    String veri = String.valueOf(sonuc);
                    txtsonuc.setText(veri);
                }
            }
        });


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        init();
    }
}
