package br.com.ayla.listacomasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.ayla.listacomasynctask.model.Android;

public class DetalheActivity extends AppCompatActivity {
    private TextView tvNome ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe );
        tvNome = (TextView) findViewById(R.id.tvNome );
        if (getIntent() != null ) {
            tvNome.setText(getIntent().getStringExtra(Android.TAG_NOME ));
        }
    }
}
