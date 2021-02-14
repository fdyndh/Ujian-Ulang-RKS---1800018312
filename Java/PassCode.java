package com.example.cekresijne;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.goodiebag.pinview.Pinview;

public class PassCode extends AppCompatActivity {

    Pinview pinview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_code);
        pinview = (Pinview) findViewById(R.id.pin_view);

        pinview.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
                startActivity(new Intent(PassCode.this, MainActivity.class));
                closeKeyboard();
            }
        });
    }

    public void closeKeyboard(){
        View view = this.getCurrentFocus();
        if(view != null){
            InputMethodManager imm = (InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}