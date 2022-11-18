package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HITPYtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitpytube);

        WebView myWebView = (WebView) findViewById(R.id.youtube);
        myWebView.loadUrl("https://www.youtube.com/watch?v=w0NhsHPdHKU");
    }
}