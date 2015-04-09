package bross.wishplace.material.ui.menu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapView;

import bross.wishplace.material.R;

public class DaumMapActivity extends ActionBarActivity {

    private String apiKey = "fd8fc8b690022e264d198a13ba3060a9";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daum_map);

        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey(apiKey);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.daum_map_view);
        mapViewContainer.addView(mapView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_daum_map, menu);
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
}
