package com.example.praktikum2_via;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class skor extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namatimA = findViewById(R.id.pointA);
        TextView namatimB = findViewById(R.id.pointB);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namatimA.setText("Team" + " " + namaA);
        namatimB.setText("Team" + " " + namaB);
    }

    public void tambah(View view){
        if(view.getId()==R.id.satupointA){
            skorA=skorA+1;
        } else if (view.getId()==R.id.duapointA){
            skorA=skorA+2;
        } else if (view.getId()==R.id.tigapointA){
            skorA=skorA+3;
        } else if (view.getId()==R.id.satupointB){
            skorB=skorB+1;
        } else if (view.getId()==R.id.duapointB){
            skorB=skorB+2;
        } else if (view.getId()==R.id.tigapointB){
            skorB=skorB+3;
        }

        TextView skortimA = findViewById(R.id.skorA);
        TextView skortimB = findViewById(R.id.skorB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
    public void Reset(View view){
        if(view.getId()==R.id.resetA){
            skorA=0;
        }
        else if (view.getId()==R.id.resetB){
            skorB=0;
        }
        TextView skortimA = findViewById(R.id.skorA);
        TextView skortimB = findViewById(R.id.skorB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
}