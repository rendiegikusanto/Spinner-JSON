package com.rendi.tutorial.probalam2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

public class Destination extends AppCompatActivity {

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

        OverlayItem lembahhijau = new OverlayItem("Lembah Hijau","Bandar Lampung",
                new GeoPoint(-5.415744, 105.231125));
        OverlayItem tamankupukupu = new OverlayItem("taman kupu- kupu","Bandar Lampung",
                new GeoPoint(-5.420918, 105.188637));
        OverlayItem bumikedaton = new OverlayItem("Bumi kedaton","Bandar Lampung",
                new GeoPoint(-5.436464, 105.224208));
        OverlayItem tamandwipangga = new OverlayItem("Taman dwi pangga","Bandar Lampung",
                new GeoPoint(-5.445812, 105.262204));
        OverlayItem wiragaden = new OverlayItem("Wira garden","Bandar Lampung",
                new GeoPoint(-5.435390, 105.229756));
        OverlayItem alamwawai = new OverlayItem("Wira garden","Bandar Lampung",
                new GeoPoint(-5.413839, 105.228076));
        OverlayItem tamanhutankera = new OverlayItem("taman hutan kera","Bandar Lampung",
                new GeoPoint(5.431533, 105.265390));
        OverlayItem tabekindah = new OverlayItem("tabek indah","Bandar Lampung",
                new GeoPoint(-5.448340, 105.265362));


        overlayItemArray.add(lembahhijau);
        overlayItemArray.add(tamankupukupu);
        overlayItemArray.add(bumikedaton);
        overlayItemArray.add(tamandwipangga);
        overlayItemArray.add(wiragaden);
        overlayItemArray.add(alamwawai);
        overlayItemArray.add(tamanhutankera);
        overlayItemArray.add(tabekindah);
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
