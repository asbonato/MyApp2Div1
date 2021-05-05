package br.saojudas.sdm21_1.myapp2div1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);

        TextView mensagemTextView = findViewById(R.id.mensagemTextView);
        Intent originalIntent = getIntent();
        String mensagem = originalIntent.getStringExtra("msg");
        mensagemTextView.setText(mensagem);
    }
}