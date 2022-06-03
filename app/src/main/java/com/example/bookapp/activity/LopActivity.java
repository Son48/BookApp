package com.example.bookapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookapp.databinding.ActivityLopBinding;

public class LopActivity extends AppCompatActivity {

    private ActivityLopBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLopBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}