package com.maria.valeb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.maria.valeb.servico.DownloadJsonAsyncTask;

public class MainActivity extends AppCompatActivity {
    private EditText edPrimeira;
    private EditText edSegunda;
    private EditText edTerceira;
    private EditText edQuarta;
    private TextView tvMostrarPalavra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DownloadJsonAsyncTask().execute("http://172.21.104.41:8080/Lista/resource/palavras/listar1");

        this.edPrimeira = (EditText) findViewById(R.id.ed_primeira);
        this.edSegunda = (EditText) findViewById(R.id.ed_segunda);
        this.edTerceira = (EditText) findViewById(R.id.ed_terceira);
        this.edQuarta= (EditText) findViewById(R.id.ed_quarta);

        this.tvMostrarPalavra = (TextView) findViewById(R.id.tv_mostrar_palavra);
    }
}
