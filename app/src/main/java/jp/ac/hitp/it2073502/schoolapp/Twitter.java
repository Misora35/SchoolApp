package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Twitter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        WebView twitter = findViewById(R.id.Twitter);
        WebSettings webSettings = twitter.getSettings();
        webSettings.setJavaScriptEnabled(true);
        twitter.loadUrl("https://twitter.com/hitp_koudaisen?t=m-1dw-2j3ubxFAS8-HM87g&s=06");
    }
}