package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        WebView Heal = (WebView) findViewById(R.id.Heal);
        Heal.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=vL6qjbE1nk6BKnUwcNaqRL0SbFlyEZlJhAH6offwLHlUNkRNMzZONjhRR0EwRTJTRVJVMVlVWTVKOS4u&qrcode=true\n" +
                "Please fill out this form");
    }
}