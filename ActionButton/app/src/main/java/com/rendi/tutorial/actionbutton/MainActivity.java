package com.rendi.tutorial.actionbutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtChange = (TextView)findViewById(R.id.txtChange);
        Button btnRed = (Button)findViewById(R.id.btnRed);
        Button btnBlue = (Button)findViewById(R.id.btnBlue);


        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtChange.setTextColor(Color.parseColor("#AA0000"));
                txtChange.setText(" karakter merah");
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtChange.setTextColor(Color.parseColor("#0000AA"));
            }
        });

    }
}
