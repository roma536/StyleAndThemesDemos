package com.example.heenamungre.styleandthemesdemo;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txvGradient = findViewById(R.id.textViewGrd);
        LinearGradient lnrGradient =  new LinearGradient(0, 0, 0 , txvGradient.getTextSize(), Color.GREEN, Color.RED, Shader.TileMode.MIRROR);

        txvGradient.getPaint().setShader(lnrGradient);
    }
}

