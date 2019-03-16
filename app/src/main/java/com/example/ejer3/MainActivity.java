package com.example.ejer3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout c1,c2,c3;
    private int paint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.redOne);
        c2 = findViewById(R.id.greenOne);
        c3 = findViewById(R.id.blueOne);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = (int) Math.floor(Math.random()*3);
                switch (color){
                    case 0:
                         paint = getResources().getColor(R.color.red1);
                        break;
                    case 1:
                         paint = getResources().getColor(R.color.red2);
                        break;
                    case 2:
                        paint = getResources().getColor(R.color.red3);
                        break;
                }
                c1.setBackgroundColor(paint);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = (int) Math.floor(Math.random()*3);
                switch (color){
                    case 0:
                        paint = getResources().getColor(R.color.green1);
                        break;
                    case 1:
                        paint = getResources().getColor(R.color.green2);
                        break;
                    case 2:
                        paint = getResources().getColor(R.color.green3);
                        break;
                }
                c2.setBackgroundColor(paint);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = (int) Math.floor(Math.random()*3);
                switch (color){
                    case 0:
                        paint = getResources().getColor(R.color.blue1);
                        break;
                    case 1:
                        paint = getResources().getColor(R.color.blue2);
                        break;
                    case 2:
                        paint = getResources().getColor(R.color.blue3);
                        break;
                }
                c3.setBackgroundColor(paint);
            }
        });
    }


}
