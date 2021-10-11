package com.example.lab121;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddKatoon, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button: upload food
        //
        bAddKatoon = (Button) findViewById(R.id.bAddKatoon);
        bAddKatoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddKatoon();
            }
        });

        // Button: show foods
        //
        bShowImages = (Button) findViewById(R.id.bShowKatoons);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showKatoons();
            }
        });

    }

    private void showAddKatoon(){
        Intent intent = new Intent(MainActivity.this, AddKatoon.class);
        MainActivity.this.startActivity(intent);
    }

    private void showKatoons(){
        Intent intent = new Intent(MainActivity.this, Showkatoon.class);
        MainActivity.this.startActivity(intent);
    }
}