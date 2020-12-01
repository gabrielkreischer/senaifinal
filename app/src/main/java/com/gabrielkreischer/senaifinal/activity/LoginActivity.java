package com.gabrielkreischer.senaifinal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.gabrielkreischer.senaifinal.R;

public class LoginActivity extends AppCompatActivity {

    //Button btnLogar;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //btnLogar = findViewById(R.id.btnLogar);
        progressBar = findViewById(R.id.progressBar);

    }

    public void ativaProgressbar(View view){
        progressBar.setVisibility(View.VISIBLE);
    }

    public void abrirCadastro(View view){
        Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(intent);
    }
}