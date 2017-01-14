package com.rendi.tutorial.probalam2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class navigasi_tools extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button btn_keluar;
    private Button wisata;
    private  Button sekolah;
    private Button hotel;
    private Button pasarmall;
    private Button rumahmakan;
    private Button rumahsakit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigasi_tools);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        wisata =(Button)findViewById(R.id.btn_wisata);
        sekolah =(Button)findViewById(R.id.btn_sekolah);
        hotel =(Button)findViewById(R.id.btn_sekolah);
        pasarmall =(Button)findViewById(R.id.btn_pasarmall);
        rumahmakan =(Button)findViewById(R.id.btn_rumahmakan);
        rumahsakit = (Button)findViewById(R.id.btn_rumahsakit);


        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(navigasi_tools.this,Nav_mps.class);
               // startActivity(intent);
            }
        });

        sekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(navigasi_tools.this,Nav_mps.class);
              //  startActivity(intent);

            }
        });


        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Intent intent = new Intent(navigasi_tools.this,Nav_mps.class);
              //  startActivity(intent);

            }
        });

        pasarmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Intent intent = new Intent(navigasi_tools.this,Nav_mps.class);
               // startActivity(intent);


            }
        });



        rumahmakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /// Intent intent = new Intent(navigasi_tools.this,Nav_mps.class);
              //  startActivity(intent);

            }
        });

        rumahsakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(navigasi_tools.this,Nav_mps.class);
               // startActivity(intent);
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigasi_tools, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

              // input lokasi
        if (id == R.id.nav_tbhlokasi) {
            // Handle the camera action
            Intent intent = new Intent(navigasi_tools.this,Tambahlokasi.class);
            startActivity(intent);

           // input video
        } else if (id == R.id.nav_video) {
            Intent intent = new Intent(navigasi_tools.this,video_prola.class);
            startActivity(intent);

             //input kontak
        } else if (id == R.id.nav_kontak) {
            Intent intent = new Intent(navigasi_tools.this,input_datauser.class);
            startActivity(intent);

            //input tentang
        } else if (id == R.id.nav_tentang) {

            // input keluar
        } else if (id == R.id.nav_keluar) {


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
