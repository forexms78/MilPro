package com.example.milpro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buy, sel, upg;
    TextView hago, upgo, sego, gang, tt;
    View.OnClickListener cl;

    int a, b, c, d= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buy = findViewById(R.id.buy);
        sel = findViewById(R.id.sell);
        upg = findViewById(R.id.upgrade);

        hago = findViewById(R.id.havegold);
        upgo = findViewById(R.id.upgold);
        sego = findViewById(R.id.sellgold);
        gang = findViewById(R.id.gang);
        tt = findViewById(R.id.testtext);




        cl = new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                a =10000;
                hago.setText(a+"");
                switch (v.getId()){
                    case R.id.buy:
                        if(a>=3000){
                            a  = a -3000;
                            hago.setText(a+"");
                            d = 1;
                            gang.setText(d+"");
                            b = 500;
                            upgo.setText(b+"");
                            c = 1000;
                            sego.setText(c+"");
                        }else{
                            Toast.makeText(getApplicationContext(),"돈이 부족합니다 겜망",Toast.LENGTH_LONG).show();
                        }
                        break;
                    case R.id.upgrade:
                        if(d>=1){
                            double gangp = Math.random();
                            int iValue = (int)(gangp * 10);
                        }

                }

            }
        };
        buy.setOnClickListener(cl);
        sel.setOnClickListener(cl);
        upg.setOnClickListener(cl);
    }
}
