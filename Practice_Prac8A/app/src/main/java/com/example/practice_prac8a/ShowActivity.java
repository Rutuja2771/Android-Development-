package com.example.practice_prac8a;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    WebView webView;
    TextView receivedUrl;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        webView = findViewById(R.id.webView);
        receivedUrl = findViewById(R.id.receivedUrl);

        Intent a = getIntent();
        String str = a.getStringExtra("url");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(str);
        WebSettings web = webView.getSettings();
        web.setJavaScriptEnabled(true);


    }
}
