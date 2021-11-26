package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        this.getWindow().setStatusBarColor(Color.WHITE);
        getSupportActionBar().hide();

        String text1 = "By proceeding,you agree to our <b>Terms of service</b> and <b>Privacy Policy</b>";
        TextView tv1 = findViewById(R.id.tv1);
        tv1.setText(Html.fromHtml(text1));

        String text2 = "An <b>e-Teaching</b> Service from School";
        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(Html.fromHtml(text2));

        Button btn = findViewById(R.id.btn1);

    }
}