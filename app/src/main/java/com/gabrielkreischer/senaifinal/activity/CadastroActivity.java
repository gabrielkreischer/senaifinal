package com.gabrielkreischer.senaifinal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.gabrielkreischer.senaifinal.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText nome, usuario, senha;
    private Button btnCadastrar;
    //private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_actinity);

        nome = findViewById(R.id.edTxtNome);
        usuario = findViewById(R.id.edTxtEmail);
        senha = findViewById(R.id.edTxtSenha);


    }
    /*public void inicializarComponentes(){

        nome = findViewById(R.id.edTxtNome);
        usuario = findViewById(R.id.edTxtEmail);
        nome = findViewById(R.id.edTxtSenha);
        btnCadastrar = findViewById(R.id.btnCadastrar);


    }*/
}