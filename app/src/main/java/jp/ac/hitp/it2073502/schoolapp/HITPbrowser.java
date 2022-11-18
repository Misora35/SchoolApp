package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HITPbrowser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitpbrowser);

        WebView myWebView = (WebView) findViewById(R.id.WebView);
        myWebView.loadUrl("https://www.hitp.ac.jp");
    }
}