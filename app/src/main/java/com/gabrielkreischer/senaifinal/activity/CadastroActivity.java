package com.gabrielkreischer.senaifinal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.gabrielkreischer.senaifinal.R;
import com.gabrielkreischer.senaifinal.model.Usuario;
import com.google.firebase.auth.FirebaseAuth;

public class CadastroActivity extends AppCompatActivity {

    //Declara as variaveis
    private EditText nome, email, senha;
    private Button btnCadastrar;
    private ProgressBar progressBar;
    //Declaração de objeto
    private Usuario usuario;

    // autenticação do firebase
    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_actinity);

        inicializarComponentes();

        progressBar.setVisibility(View.GONE);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                String textoNome = nome.getText().toString();
                String textoEmail = email.getText().toString();
                String textoSenha = senha.getText().toString();

                if(!textoNome.isEmpty()){
                    if(!textoEmail.isEmpty()){
                        if(!textoSenha.isEmpty()){

                            usuario = new Usuario();
                            usuario.setNome(textoNome);
                            usuario.setEmail(textoEmail);
                            usuario.setSenha(textoSenha);
                            cadastrarUsuario(usuario);

                        }else{
                            Toast.makeText(CadastroActivity.this, "Preencha a senha!", Toast.LENGTH_SHORT);
                        }
                    }else{
                        Toast.makeText(CadastroActivity.this, "Preencha o e-mail!", Toast.LENGTH_SHORT);
                    }
                }else{
                    Toast.makeText(CadastroActivity.this, "Preencha o nome!", Toast.LENGTH_SHORT);
                }

            }
        });

    }

    public void cadastrarUsuario(Usuario usuario){

    }
    public void inicializarComponentes(){

        nome = findViewById(R.id.edTxtNome);
        email = findViewById(R.id.edTxtEmail);
        nome = findViewById(R.id.edTxtSenha);
        btnCadastrar = findViewById(R.id.btnLogar);
        progressBar = findViewById(R.id.progressBar);

    }
}