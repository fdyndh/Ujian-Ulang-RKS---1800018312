package com.example.cekresijne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CekResiDetail extends AppCompatActivity {

    TextView noResi;
    EditText masukanResi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_resi_detail);

        Bundle extras = getIntent().getExtras();
        String nomorResi = extras.getString("noResi");

        masukanResi = findViewById(R.id.cari_resi);
        noResi = findViewById(R.id.no_resi);

        if(!nomorResi.isEmpty()){
            noResi.setText(nomorResi);
        }else{
            noResi.setText("145600987034121");
        }

        masukanResi.setText(nomorResi);
    }
}