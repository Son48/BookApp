package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bookapp.activity.LoaiSachActivity;
import com.example.bookapp.activity.MayTinhActivity;
import com.example.bookapp.activity.SachActivity;
import com.example.bookapp.activity.TimkiemActivity;
import com.example.bookapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //khai báo binding
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        //xét layout cho binding
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        internChinh();
    }

    private void internChinh(){
        binding.cvLoaiSach.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, LoaiSachActivity.class));
        });
        binding.cvSach.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SachActivity.class));
        });
        binding.cvMayTinh.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MayTinhActivity.class));
        });
        binding.cvTimKiemSach.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TimkiemActivity.class));
        });
    }
}