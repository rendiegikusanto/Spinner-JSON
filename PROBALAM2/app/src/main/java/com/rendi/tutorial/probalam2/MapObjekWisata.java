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

public class MapObjekWisata extends AppCompatActivity {

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

        OverlayItem LembahHijau  = new OverlayItem("Taman Wisata Lembah Hijau","Sukadanaham Tj. Karang Barat, Kota Bandar Lampung",
                new GeoPoint( -5.415667, 105.230722));
        overlayItemArray.add(LembahHijau);

        OverlayItem TamanBudaya  = new OverlayItem("Taman Budaya","Jl. Cut Nyak Dien Palapa Tj. Karang Pusat  Kota Bandar Lampung",
                new GeoPoint( -5.416028, 105.247861));
        overlayItemArray.add(TamanBudaya);

        OverlayItem TamanKupukupuGitaPersada = new OverlayItem("Taman Kupu-kupu Gita Persada","Jl. Way Rahman Kecamatan Kemiling Bandar Lampung",
                new GeoPoint( -5.420833, 105.188583));
        overlayItemArray.add(TamanKupukupuGitaPersada);

        OverlayItem TamanDipangga = new OverlayItem("Taman Dipangga","Jl. WR. Mongonsidi Talang Teluk Betung Selatan Kota B. Lampung",
                new GeoPoint( -5.445806, 105.262167));
        overlayItemArray.add(TamanDipangga);

        OverlayItem TamanRefleksi  = new OverlayItem("Taman Refleksi","Jl. WR Supratman Gd. Mas Teluk Betung Utara Kota B. Lampung",
                new GeoPoint(-5.443944, 105.268722));
        overlayItemArray.add(TamanRefleksi);

        OverlayItem BumiKedaton = new OverlayItem("Bumi Kedaton","Jl. Way Abdul Rahman, Batu Putu, Lampung",
                new GeoPoint(-5.436778, 105.222861));
        overlayItemArray.add(BumiKedaton);

        OverlayItem PantaiDutaWisata = new OverlayItem("Pantai Duta Wisata","Jl. R.E Marthadinata Teluk Betung Utara",
                new GeoPoint( -5.476833, 105.252556));
        overlayItemArray.add(PantaiDutaWisata);

        OverlayItem WaterPark = new OverlayItem("Water Park Citra Garden","Jl. Setia Budi No. 170 Bandar Lampung",
                new GeoPoint(-5.445667, 105.248028));
        overlayItemArray.add(WaterPark);

        OverlayItem Wihara = new OverlayItem("Vihara Thai Hin Bio","Jl. Ikan Kakap Teluk Betung Bandar Lampung",
                new GeoPoint(-5.448778, 105.263139));
        overlayItemArray.add(Wihara);

        OverlayItem HutanKera = new OverlayItem("Taman Wisata Hutan Kera","",
                new GeoPoint(-5.432056, 105.265417));
        overlayItemArray.add(HutanKera);

        OverlayItem Wiragarden = new OverlayItem("WiraGarden","Jl. Way Abdul Rahman, Batu Putu, Lampung",
                new GeoPoint(-5.436222, 105.229556));
        overlayItemArray.add(Wiragarden);

        OverlayItem MuseumLampung = new OverlayItem("Museum Lampung","Jl. ZA Pagar Alam Bandar Lampung",
                new GeoPoint(-5.372278, 105.240944));
        overlayItemArray.add(MuseumLampung);

        OverlayItem WaterParkLampungWalk = new OverlayItem("Water Park Lampung Walk","Jl. Urip Sumoharjo Bandar Lampung",
                new GeoPoint(-5.390500, 105.276444));
        overlayItemArray.add(WaterParkLampungWalk);

        OverlayItem WaterParkBumiKedaton = new OverlayItem("Water Park Bumi Kedaton","Jl. Way Abdul Rahman, Batu Putu, Lampung",
                new GeoPoint(-5.434500, 105.226139));
        overlayItemArray.add(WaterParkBumiKedaton);

        OverlayItem AlamWawai = new OverlayItem("Alam Wawai","Jl. Raden Ajeng Maulana Bandar Lampung",
                new GeoPoint( -5.422278, 105.233778));
        overlayItemArray.add(AlamWawai);



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
                    R.mipmap.lampung);
            canvas.drawBitmap(bm,
                    out.x - bm.getWidth() / 2,
                    out.y - bm.getHeight() /2,
                    null);

        }
    }
}
