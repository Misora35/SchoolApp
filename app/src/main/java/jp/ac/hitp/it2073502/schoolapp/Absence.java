package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Absence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs2);

        Button SCH = findViewById(R.id.SCH);
        SCH.setOnClickListener ((View v)-> {
            startActivity(new Intent(this, SCH.class));
        });
    }
}