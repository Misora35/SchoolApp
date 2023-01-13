package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Absence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs2);

        TextView Name4 = findViewById(R.id.name4);
        Button SCH = findViewById(R.id.SCH);

        SharedPreferences data = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        String UserName = data.getString("username", null);

        if(UserName != null) {
            Name4.setText(UserName);
        }

        SCH.setOnClickListener ((View v)-> {
            startActivity(new Intent(this, SCH.class));
        });
    }
}