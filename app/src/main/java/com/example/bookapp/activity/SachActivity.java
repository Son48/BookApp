package com.example.bookapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookapp.databinding.ActivityLoaiSachBinding;
import com.example.bookapp.databinding.ActivitySachBinding;

public class SachActivity extends AppCompatActivity {

    ActivitySachBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySachBinding.inflate(getLayoutInflater());
    }
}