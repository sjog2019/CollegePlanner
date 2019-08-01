package com.example.tutorialapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static android.content.Intent.ACTION_VIEW;


public class Scholarship extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scholarship);
        Button dreambutton= findViewById(R.id.dreamBtn);
        Button girlbutton= findViewById(R.id.girlBtn);
        Button drivebutton = findViewById(R.id.driveBtn);
        Button amsbutton = findViewById(R.id.amsBtn);

        dreambutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri dreamUrl = Uri.parse("https://www.growyourgiving.org/scholarships/1000-dreams-scholarship-fund");
                Intent dreamIntent = new Intent(ACTION_VIEW, dreamUrl);
                startActivity(dreamIntent);
            }
        });

        girlbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri girlUrl = Uri.parse("https://www.connecther.org/gitw/prizes");
                Intent girlIntent = new Intent(ACTION_VIEW, girlUrl);
                startActivity(girlIntent);
            }
        });

        drivebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri driveUrl = Uri.parse("https://spirit.prudential.com/apply/2018");
                Intent driveIntent = new Intent(ACTION_VIEW, driveUrl);
                startActivity(driveIntent);
            }
        });

        amsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri amsUrl = Uri.parse("https://www.ametsoc.org/index.cfm/ams/information-for/students/ams-scholarships-and-fellowships/ams-minority-scholarships/");
                Intent amsIntent = new Intent(ACTION_VIEW, amsUrl);
                startActivity(amsIntent);
            }
        });

    }
}


