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

public class MapHotel extends AppCompatActivity {

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


       // isi data titik kordinat pada hotel

        overlayItemArray = new ArrayList<OverlayItem>();

        OverlayItem Arinas = new OverlayItem("Arinas ","Bandar Lampung , Jl. Raden Intan Bandar Lampung",
                new GeoPoint(-5.412917, 105.258556));
        OverlayItem Amalia = new OverlayItem("Amalia","Bandar Lampung, Jl. Raden Intan Bandar Lampung",
                new GeoPoint(-5.415806, 105.258694));
        OverlayItem KurniaII = new OverlayItem("Kurnia II","Bandar Lampung,Jl. Raden Intan Bandar Lampung",
                new GeoPoint(-5.418722, 105.258528));
        OverlayItem Astoria = new OverlayItem("Astoria","Bandar Lampung,Jl. Raden Intan Bandar Lampung",
                new GeoPoint(-5.418944, 105.258056));
        OverlayItem Grande = new OverlayItem("Grande","Bandar Lampung, Jl. Raden Intan Bandar Lampung",
                new GeoPoint(-5.418917, 105.258444));
        OverlayItem Andalas = new OverlayItem("Andalas","Bandar Lampung, Jl. Raden Intan Bandar Lampung",
                new GeoPoint(-5.419444, 105.258472));
        OverlayItem GrandAnugrah  = new OverlayItem("Grand Anugrah ","Bandar Lampung, Jl. Raden Intan Bandar Lampung",
                new GeoPoint(-5.421028, 105.257917));
        OverlayItem BatiQa = new OverlayItem("BatiQa","Bandar Lampung,Jl. Jend. Sudirman Bandar Lampung",
                new GeoPoint(-5.422944, 105.270806));
        OverlayItem Novotel = new OverlayItem("Novotel","Bandar Lampung,Jl. Jend. Gatot Subroto",
                new GeoPoint(-5.440000, 105.288722));
        OverlayItem Enggal = new OverlayItem("Enggal","Bandar Lampung,Jl.Mawar Enggal",
                new GeoPoint(-5.422917, 105.261389));
        OverlayItem DwipaWisata  = new OverlayItem("Dwipa Wisata ","Bandar Lampung,Jl. Ikan Tembakang ",
                new GeoPoint(-5.442444, 105.285667));
        OverlayItem Pasifichotel  = new OverlayItem("Pasific Hotel ","Bandar Lampung,Jl. Yos Sudarso ",
                new GeoPoint(-5.445500, 105.275889));
        OverlayItem InnaEightHotel  = new OverlayItem("Inna Eight Hotel ","Bandar Lampung,Jl. Ikan Hiu Teluk Betung ",
                new GeoPoint(-5.445472, 105.265500));
        OverlayItem Pelangi  = new OverlayItem("Pelangi ","Bandar Lampung,Jl. Tulang Bawang Enggal ",
                new GeoPoint(-5.418000, 105.260778));
        OverlayItem Bukitrandu  = new OverlayItem("Bukit Randu ","Bandar Lampung,Jl. Kamboja Bandar Lampung ",
                new GeoPoint(-5.411917, 105.263611));
        OverlayItem WhitzPrime  = new OverlayItem("Whitz Prime ","Bandar Lampung,Jl. Jendral Ahmad Yani ",
                new GeoPoint(-5.421389, 105.255389));
        OverlayItem AnugrahHotel  = new OverlayItem("Anugerah Hotel ","Bandar Lampung,Jl. Jendral Ahmad Yani ",
                new GeoPoint(-5.421389, 105.254667));
        OverlayItem Andalaspermai  = new OverlayItem("Andalaspermai ","Bandar Lampung,Jl. S. Parman Bandar Lampung ",
                new GeoPoint(-5.419389, 105.256611));
        OverlayItem Kurniaperdana  = new OverlayItem("Kurnia perdana ","Bandar Lampung,Jl. Raden Intan ",
                new GeoPoint(-5.419500, 105.258000));
        OverlayItem GrandCitihub  = new OverlayItem("Grand Citihub ","Bandar Lampung,Jl. R.A Kartini Bandar Lampung ",
                new GeoPoint(-5.418333, 105.253111));
        OverlayItem Horizon = new OverlayItem("Horizone ","Bandar Lampung,Jl. R.A Kartini Bandar Lampung ",
                new GeoPoint(-5.414861, 105.255111));
        OverlayItem Pophotel = new OverlayItem("Pop Hotel ","Bandar Lampung,.Jl. W.R Monginsidi  ",
                new GeoPoint(-5.424278, 105.251111));
        OverlayItem Emersia = new OverlayItem("Emersia ","Bandar Lampung,.Jl. W.R Monginsidi  ",
                new GeoPoint(-5.426306, 105.250667));
        OverlayItem Sahid = new OverlayItem("Sahid ","Bandar Lampung,.Jl. Yos Sudarso   ",
                new GeoPoint(-5.445944, 105.295722));
        OverlayItem Swadek = new OverlayItem("Swadek ","Bandar Lampung,.Jl. Yos Sudarso   ",
                new GeoPoint(-5.469444, 105.322833));
        OverlayItem Puriintan = new OverlayItem("Puri Intan ","Bandar Lampung,Jl. Soekarno Hatta    ",
                new GeoPoint(-5.402194, 105.289861));
        OverlayItem Arnez = new OverlayItem("Arnez ","Bandar Lampung,Jl. Cut Nyak Dien   ",
                new GeoPoint(-5.418306, 105.252389));
        OverlayItem Saridamai = new OverlayItem("Sari damai ","Bandar Lampung,Jl. Teuku Umar   ",
                new GeoPoint(-5.395111, 105.262000));
        OverlayItem Sriwijaya = new OverlayItem("Sriwijaya ","Bandar Lampung,Jl. Ikan Kakap Teluk Betung ",
                new GeoPoint(-5.449722, 105.264194));
        OverlayItem Lusyhotel = new OverlayItem("Lussy Hotel ","Bandar Lampung,Jl. P. Diponogoro ",
                new GeoPoint(-5.437639, 105.265111));
        OverlayItem GrandPraba = new OverlayItem("Grand Praba ","Bandar Lampung,Jl. W.R Monginsidi ",
                new GeoPoint(-5.432306, 105.253778));
        OverlayItem Marcopollo = new OverlayItem("Marcopollo ","Bandar Lampung, Jl. Dr. Susilo  ",
                new GeoPoint(-5.430139, 105.263361));
        OverlayItem AsokaLuxury = new OverlayItem("Asoka Luxury ","Bandar Lampung, Jl. Pulau Morotai  ",
                new GeoPoint(-5.403861, 105.276917));
        OverlayItem Aston = new OverlayItem("Aston ","Bandar Lampung, Jl. Gatot Subroto   ",
                new GeoPoint(-5.436250, 105.286361));
        OverlayItem ShratonLampung = new OverlayItem("Shraton Lampung ","Bandar Lampung,  Jl. W.R Monginsidi    ",
                new GeoPoint(-5.436250, 105.256639));
        OverlayItem BumiKedatonResort = new OverlayItem("Bumi Kedaton Resort ","Bandar Lampung, Jl. Way Rahman    ",
                new GeoPoint(-5.437167, 105.223028));
        OverlayItem Kridawisata = new OverlayItem("Kridawisata ","Bandar Lampung, Jl. Way Rahman    ",
                new GeoPoint(-5.392444, 105.284444));
        OverlayItem Nusantara = new OverlayItem("Nusantra ","Bandar Lampung, Jl. Way Soekarno Hatta    ",
                new GeoPoint(-5.396139, 105.290139));


        overlayItemArray.add(Nusantara);
        overlayItemArray.add(Kridawisata);
        overlayItemArray.add(BumiKedatonResort);
        overlayItemArray.add(ShratonLampung);
        overlayItemArray.add(Aston);
        overlayItemArray.add(AsokaLuxury);
        overlayItemArray.add(Marcopollo);
        overlayItemArray.add(GrandPraba);
        overlayItemArray.add(Lusyhotel);
        overlayItemArray.add(Sriwijaya);
        overlayItemArray.add(Saridamai);
        overlayItemArray.add(Arnez);
        overlayItemArray.add(Puriintan);
        overlayItemArray.add(Swadek);
        overlayItemArray.add(Sahid);
        overlayItemArray.add(Emersia);
        overlayItemArray.add(Pophotel);
        overlayItemArray.add(Horizon);
        overlayItemArray.add(Kurniaperdana);
        overlayItemArray.add(GrandCitihub);
        overlayItemArray.add(Andalaspermai);
        overlayItemArray.add(AnugrahHotel);
        overlayItemArray.add(Grande);
        overlayItemArray.add(Arinas);
        overlayItemArray.add(Amalia);
        overlayItemArray.add(KurniaII);
        overlayItemArray.add(Astoria);
        overlayItemArray.add(Andalas);
        overlayItemArray.add(GrandAnugrah );
        overlayItemArray.add(BatiQa);
        overlayItemArray.add(Novotel);
        overlayItemArray.add(Enggal);
        overlayItemArray.add(DwipaWisata);
        overlayItemArray.add(Pasifichotel);
        overlayItemArray.add(InnaEightHotel);
        overlayItemArray.add(Pelangi);
        overlayItemArray.add(Bukitrandu);
        overlayItemArray.add(WhitzPrime);
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
