package com.example.bookapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookapp.databinding.ActivityTatCaBinding;

public class TatCaActivity extends AppCompatActivity {

    private ActivityTatCaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTatCaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}