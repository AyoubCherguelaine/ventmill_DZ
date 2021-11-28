package com.example.vingtmille;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class view_map_places extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap googleMap ;
    SupportMapFragment supportMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_map_places);
        supportMapFragment = getSupportFragmentManager().findFragmentById(R.id.google_map);
        Intent intent = getIntent();
        if (intent != null){
            String str = "";
            if (intent.hasExtra("edittext")){
                str = intent.getStringExtra("edittext");
            }
            TextView textView = (TextView) findViewById(R.id.tv1);
            textView.setText(str + "; " + str);
        }

        String location = edittext.getQuery().toString;
        geocoder = new geoCoder

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }
}