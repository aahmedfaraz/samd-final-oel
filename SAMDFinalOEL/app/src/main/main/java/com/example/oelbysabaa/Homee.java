package com.example.oelbysabaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

public class Homee extends AppCompatActivity {
ImageView imageView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);
        imageView8 = findViewById(R.id.imageView8);

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Homee.this, Detail.class);
                startActivity(intent);
            }
        });
    }

}