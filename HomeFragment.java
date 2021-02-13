package com.example.cekresijne.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cekresijne.CekResi;
import com.example.cekresijne.R;
import com.example.cekresijne.WelcomeActivity;
import com.example.cekresijne.ui.login.LoginForm;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageButton btnSearh;
    EditText cariResi;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        btnSearh = root.findViewById(R.id.btn_search);
        cariResi = root.findViewById(R.id.cari_resi);

        btnSearh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CekResi.class);
                intent.putExtra("noResi", cariResi.getText().toString());
                startActivity(intent);

            }
        });

        return root;
    }
}