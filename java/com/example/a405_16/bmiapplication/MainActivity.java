package com.example.a405_16.bmiapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText height = findViewById(R.id.height);
        final EditText weight = findViewById(R.id.weight);
        final TextView res = findViewById(R.id.res);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sHeight = height.getText().toString();
                String sWeight = weight.getText().toString();
                double dHeight = Double.parseDouble(sHeight);
                double dWeight = Double.parseDouble(sWeight);
                String result = "";
                double bmi = dWeight/(dHeight*dHeight)/100;
                Log.d("bmi : ", bmi+"");
                if (bmi>40){
                    result = "고도비만";
                }else if(bmi>35){
                    result = "중등도비만";
                }else if(bmi>30){
                    result = "경도비만";
                }else if(bmi>25){
                    result = "과체중";
                }else if(bmi>18.5){
                    result = "정상";
                }else{
                    result = "저체중";
                }
                res.setText(result);
            }
        });
    }
}
