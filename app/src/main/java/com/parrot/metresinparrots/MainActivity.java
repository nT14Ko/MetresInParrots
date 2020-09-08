package com.parrot.metresinparrots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextParrots;
    private EditText editTextMetres;
    private TextView textViewParrots;
    private TextView textViewMetres;
    private Button buttonParrots;
    private Button buttonMetres;

    private int parrots;
    private int metres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMetres = findViewById(R.id.editTextMetres);
        editTextParrots = findViewById(R.id.editTextParrots);
        textViewMetres = findViewById(R.id.textViewMetres);
        textViewParrots = findViewById(R.id.textViewParrots);
        buttonParrots = findViewById(R.id.buttonParrots);
        buttonMetres = findViewById(R.id.buttonMetres);

    }

    public void calculateParrots(View view) {
        if (TextUtils.isEmpty(editTextParrots.getText().toString().trim())){
            editTextParrots.setError("Введите количество попугаев!");
        } else {
            String metres = String.valueOf(Float.parseFloat(editTextParrots.getText().toString().trim())/7.6);
            textViewParrots.setText(String.format("%s метров", metres.substring(0,6)));
        }
    }

    public void calculateMetres(View view) {
        if (TextUtils.isEmpty(editTextMetres.getText().toString().trim())){
            editTextMetres.setError("Введите количество метров!");
        } else {
            String parrots = String.valueOf(Float.parseFloat(editTextMetres.getText().toString().trim())*7.6);
            textViewMetres.setText(String.format("%s попугаев", parrots.substring(0,8)));
        }
    }
}