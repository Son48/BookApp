package com.example.bookapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookapp.databinding.ActivityTimkiemBinding;

public class TimkiemActivity extends AppCompatActivity {

    private ActivityTimkiemBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTimkiemBinding.inflate(getLayoutInflater());
    }
}