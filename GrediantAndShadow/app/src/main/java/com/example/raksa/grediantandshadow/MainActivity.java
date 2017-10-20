package com.example.raksa.grediantandshadow;

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

        TextView textView = (TextView) findViewById(R.id.gradientTextView);

        //create LinearGradient For TextView
        LinearGradient linearGradient = new LinearGradient(0,0,textView.getTextSize(),0,getColor(R.color.color1),
                getColor(R.color.color2),Shader.TileMode.MIRROR);

        textView.getPaint().setShader(null);
        textView.getPaint().setShader(linearGradient);

    }
}
