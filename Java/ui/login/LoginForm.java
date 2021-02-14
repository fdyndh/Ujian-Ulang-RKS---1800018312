package com.example.cekresijne.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cekresijne.BuatAkun;
import com.example.cekresijne.MainActivity;
import com.example.cekresijne.PassCode;
import com.example.cekresijne.R;
import com.example.cekresijne.WelcomeActivity;

public class LoginForm extends AppCompatActivity {

    EditText nomorHp;
    Button btnMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);
        nomorHp = findViewById(R.id.nohp);
        btnMulai = findViewById(R.id.mulai);

        btnMulai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nomor = nomorHp.getText().toString();
                if ( nomor.equals("081352211334")){
                    startActivity(new Intent(LoginForm.this, BuatAkun.class));
                    finish();
                }else{
                    //startActivity(new Intent(LoginForm.this, BuatAkun.class));
                    startActivity(new Intent(LoginForm.this, BuatAkun.class));
                    finish();
                }

            }
        });
    }
}
