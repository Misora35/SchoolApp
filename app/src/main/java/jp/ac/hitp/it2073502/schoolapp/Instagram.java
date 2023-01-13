package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Instagram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        WebView insta = findViewById(R.id.Instagram);
        WebSettings webSettings = insta.getSettings();
        webSettings.setJavaScriptEnabled(true);
        insta.loadUrl("https://www.instagram.com/hitp_koudaisen/");
    }
}