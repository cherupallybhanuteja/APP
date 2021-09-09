package com.example.whatsappstickersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView imageView;
    //int[] img1={R.drawable.emojiset,R.drawable.emojiset};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView=findViewById(R.id.imageView);
        Intent intent2 = getIntent();

        int receivedImage = intent2.getIntExtra("images",0);
        imageView.setImageResource(receivedImage);

    }
}