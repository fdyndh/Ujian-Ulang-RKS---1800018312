package com.example.cekresijne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cekresijne.ui.login.LoginForm;

public class BuatAkun extends AppCompatActivity {

    EditText namauser, emails;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_akun);

        namauser = findViewById(R.id.nama);
        emails = findViewById(R.id.email);
        btnSubmit = findViewById(R.id.submit);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nama = namauser.getText().toString();
                if ( nama.equals("fidiyah nadhili") && emails.getText().toString().equals("vitaminsea2499@gmail.com")){
                        startActivity(new Intent(BuatAkun.this, InputOtp.class));
                        finish();
                }else{
                    startActivity(new Intent(BuatAkun.this, InputOtp.class));
                }
            }
        });
    }
}
