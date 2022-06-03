package com.example.bookapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookapp.databinding.ActivityLoaiSachBinding;

public class LoaiSachActivity extends AppCompatActivity {

    private ActivityLoaiSachBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoaiSachBinding.inflate(getLayoutInflater());
    }
}