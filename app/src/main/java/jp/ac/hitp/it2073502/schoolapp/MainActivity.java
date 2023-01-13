package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button = findViewById(R.id.button);
        Button Button2 = findViewById(R.id.button2);
        Button Button3 = findViewById(R.id.button3);
        Button Button4 = findViewById(R.id.button4);
        Button Button5 = findViewById(R.id.button5);
        Button Button6 = findViewById(R.id.button6);
        Button Button7 = findViewById(R.id.button7);
        Button Button8 = findViewById(R.id.button8);

        Button.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, HITPbrowser.class));
        });

        Button2.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, Health.class));
        });

        Button3.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, Absence.class));
        });

        Button4.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, timetable.class));
        });

        Button5.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, HITPYtube.class));
        });
        Button6.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, Management.class));
        });
        Button7.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, Instagram.class));
        });
        Button8.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, Twitter.class));
        });
    }
}
