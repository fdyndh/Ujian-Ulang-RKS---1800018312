package com.example.cekresijne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CekResi extends AppCompatActivity {

    TextView textView, noResi;
    Bundle extras;
    EditText cariResi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_resi);

        extras = getIntent().getExtras();
        String nomorResi = extras.getString("noResi");

        cariResi = findViewById(R.id.cari_resi);
        cariResi.setText(nomorResi);

        noResi = findViewById(R.id.no_resi);
        if(!nomorResi.isEmpty()){
            noResi.setText(nomorResi);
        }else{
            noResi.setText("145600987034121");
        }


        textView = findViewById(R.id.txtLihatDetail);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CekResi.this, CekResiDetail.class);
                intent.putExtra("noResi", cariResi.getText().toString());
                startActivity(intent);
            }
        });

    }
}