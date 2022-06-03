package com.example.bookapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookapp.databinding.ActivityMainBinding;
import com.example.bookapp.databinding.ActivityMayTinhBinding;

public class MayTinhActivity extends AppCompatActivity {

    private ActivityMayTinhBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMayTinhBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}