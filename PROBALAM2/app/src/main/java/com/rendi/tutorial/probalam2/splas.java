package com.rendi.tutorial.probalam2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splas);
        final ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        final Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(4000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(splas.this, login.class);
                    startActivity(intent);
                }
            }
            };
                timerThread.start();
            }

    @Override
    protected void onPause() {
        super.onPause();
      finish();
}
}




