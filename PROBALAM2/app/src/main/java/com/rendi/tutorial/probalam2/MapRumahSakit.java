package com.rendi.tutorial.probalam2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import org.osmdroid.DefaultResourceProxyImpl;
import org.osmdroid.api.IMapController;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.ResourceProxyImpl;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.ScaleBarOverlay;

import java.util.ArrayList;

public class MapRumahSakit extends AppCompatActivity {


    private ImageButton imageButton;
    private MapView osm;
    private IMapController mc;
    private ResourceProxyImpl mResourceProxy;
    ArrayList<OverlayItem> overlayItemArray;
    LocationManager locationManager;

    //   private MapView myOpenMapView;
    //private MapController myMapController;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        osm = (MapView) findViewById(R.id.mapview);
        osm. setBuiltInZoomControls(true);
        mc = osm.getController();
        mc.setZoom(18);

//

        overlayItemArray = new ArrayList<OverlayItem>();

        mc = (MapController) osm.getController();


        GeoPoint centre = new GeoPoint(-5.4292, 105.2610);
        mc.animateTo(centre);


//

        overlayItemArray = new ArrayList<OverlayItem>();

        OverlayItem RSIABelleza = new OverlayItem("RSIA Belleza.","Bandar LampungJl. Sultan Agung Labuhan Ratu Kedaton  ",
                new GeoPoint(-5.380583, 105.258472));
        overlayItemArray.add(RSIABelleza);

        OverlayItem RSAdvant = new OverlayItem("RS. Advant.","Jl. Teuku Umar No.48, Surabaya, Kedaton Surabaya Kedaton Kota Bandar Lampung  ",
                new GeoPoint(-5.392028, 105.262194));
        overlayItemArray.add(RSAdvant);

        OverlayItem RSIAPutribetikhati = new OverlayItem("RSIA Putri betik hati","Jalan Pajajaran No.109 Jagabaya II Kecamatan Sukabumi, Kota Bandar Lampung  ",
                new GeoPoint(-5.394139, 105.265944));
        overlayItemArray.add(RSIAPutribetikhati);

        OverlayItem DrHAbdulMuluk = new OverlayItem("Rs Drs. Abdul Mulik","JL. Doktor Rivai, No. 6, Tanjungkarang, Bandar Lampung Penengahan",
                new GeoPoint(-5.402583, 105.258611));
        overlayItemArray.add(DrHAbdulMuluk);

        OverlayItem RSGrahaHusada = new OverlayItem("RS Graha Husada","Jl. Gajah Mada No.88 Tj. Agung Tj. Karang Tim. Kota Bandar Lampung Kedamaian",
                new GeoPoint(-5.413389, 105.267556));
        overlayItemArray.add(RSGrahaHusada);

        OverlayItem RSKartika = new OverlayItem("RS Kartika","Jl. Jend. Gatot Subroto No.96 Tj. Gading Kedamaian Kota Bandar Lampung",
                new GeoPoint(-5.429194, 105.275667));
        overlayItemArray.add(RSKartika);

        OverlayItem RSImmanuel  = new OverlayItem("RS Immanuel","Jl. Soekarno Hatta No.1 Way Dadi Sukarame Kota Bandar Lampung",
                new GeoPoint(-5.385833, 105.287806));
        overlayItemArray.add(RSImmanuel);

        OverlayItem RSIAMutiaraPutri = new OverlayItem("RSIA Mutiara Putri","Jl. Hos Cokroaminoto No.96, Tanjung Karang Enggal Bandar Lampung",
                new GeoPoint(-5.422972, 105.262500));
        overlayItemArray.add(RSIAMutiaraPutri);

        OverlayItem RumahSakitMataPeramanasari  = new OverlayItem("Rumah Sakit Mata Peramana sari","JL.HOS Cokroaminoto Bandar Lampung",
                new GeoPoint(-5.422139, 105.262778));
        overlayItemArray.add(RumahSakitMataPeramanasari);

        OverlayItem RumahSakitBumiWaras = new OverlayItem("Rumah Sakit Bumi Waras","JL.Monginsidi No.235 Bandar Lampung",
                new GeoPoint(-5.424972, 105.250694));
        overlayItemArray.add(RumahSakitBumiWaras);

        OverlayItem RumahSakitUripSumoharjo  = new OverlayItem("Rumah Sakit Urip Sumoharjo","JL.Urip sumoharjio Bandar Lampung",
                new GeoPoint(-5.391167, 105.276528));
        overlayItemArray.add(RumahSakitUripSumoharjo);

        OverlayItem RumahSakitPertaminaBintangamin = new OverlayItem("Rumah Sakit Pertamina Bintang amin","JL.Pramuka No.27 Raja Basa Bandar lampung",
                new GeoPoint(-5.378750, 105.219556));
        overlayItemArray.add(RumahSakitPertaminaBintangamin);

        OverlayItem RumahSakitBayangkara = new OverlayItem("Rumah Sakit Bayangkara","JL.Pramuka No.88 Raja Basa Bandar lampung",
                new GeoPoint(-5.374278, 105.224194));
        overlayItemArray.add(RumahSakitBayangkara);

        OverlayItem RumahSakitDAadiTjokrodipo = new OverlayItem("Rumah Sakit Dr.A Dadi Tjokrodipo","JL.Basuki Rachmad No.73 teluk betung Bandar Lampung",
                new GeoPoint(-5.436278, 105.253194));
        overlayItemArray.add(RumahSakitDAadiTjokrodipo);

        OverlayItem RSIARestuBunda = new OverlayItem("RSIA Restu Bunda","JL.KH.Hasyim Ashari No.73 Teluk Betung Bandar ",
                new GeoPoint(-5.447750, 105.256222));
        overlayItemArray.add(RSIARestuBunda);



        ItemizedIconOverlay<OverlayItem> itemItemizedIconOverlay = new ItemizedIconOverlay<OverlayItem>(this, overlayItemArray, null);
        osm.getOverlays().add(itemItemizedIconOverlay);
        DefaultResourceProxyImpl defaultResourceProxyImpi = new DefaultResourceProxyImpl(this);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        try {
            Location lastloLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if (lastloLocation != null) {
                updateLoc(lastloLocation);


            }

        } catch (SecurityException e) {

        }
        ScaleBarOverlay myscaleBarOverlay = new ScaleBarOverlay(this);
        osm.getOverlays().add(myscaleBarOverlay);
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, myLocationListener);
            locationManager.requestLocationUpdates(locationManager.NETWORK_PROVIDER, 0, 0, myLocationListener);
        } catch (SecurityException a) {
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        try {
            locationManager.removeUpdates(myLocationListener);

        } catch (SecurityException b) {

        }
    }
    private  void  updateLoc(Location loc){
        GeoPoint locGeopoint = new GeoPoint(loc.getLatitude(),loc.getLongitude());
        mc.setCenter(locGeopoint);
        setOverlayLoc(loc);
        osm.invalidate();

    }
    private  void setOverlayLoc(Location overlayLoc){
        GeoPoint overlocGeoPoint =new GeoPoint(overlayLoc);
        overlayItemArray.clear();
        OverlayItem newMyLocationItem =new OverlayItem("My location","My location", overlocGeoPoint);
        overlayItemArray.add(newMyLocationItem);
    }
    private LocationListener myLocationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            updateLoc(location);
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };
    public  void draw(Canvas canvas, MapView mapView, boolean arg2){
        if (!overlayItemArray.isEmpty()){

            GeoPoint in = overlayItemArray.get(0).getPoint();

            Point out = new Point();
            mapView.getProjection().toPixels(in, out);

            Bitmap bm = BitmapFactory.decodeResource(getResources(),
                    R.mipmap.ic_launcher);
            canvas.drawBitmap(bm,
                    out.x - bm.getWidth() / 2,
                    out.y - bm.getHeight() /2,
                    null);

        }
    }
}
