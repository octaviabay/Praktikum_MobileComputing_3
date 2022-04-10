package com.example.praktikum2_via;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void input (View view) {
        EditText inputnamaTimA = findViewById(R.id.TimA);
        EditText inputnamaTimB = findViewById(R.id.TimB);

        String namaTimA = inputnamaTimA.getText() . toString();
        Log.d(TAG, namaTimA);

        String namaTimB = inputnamaTimB.getText() . toString();
        Log.d(TAG, namaTimB);

        Intent intent = new Intent(this, skor.class);
        intent.putExtra("Tim A", namaTimA);
        intent.putExtra("Tim B", namaTimB);
        startActivity(intent);
    }
}