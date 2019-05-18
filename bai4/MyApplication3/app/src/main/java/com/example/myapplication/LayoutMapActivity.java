package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LayoutMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_map);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        double lat = bundle.getDouble("lat");
        double longatt = bundle.getDouble("longatt");
        LatLng latLng = new LatLng(lat,longatt);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,17.5f));
        map.addMarker(new MarkerOptions().title(title).position(latLng));
    }
}
