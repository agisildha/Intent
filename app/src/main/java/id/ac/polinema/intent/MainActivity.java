package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.BundleActivity;
import id.ac.polinema.intent.ExplicitIntentActivity;
import id.ac.polinema.intent.ImplicitIntentActivity;
import id.ac.polinema.intent.ProfileParcelableActivity;
import id.ac.polinema.intent.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent intent =  new Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent intent = new Intent(this, ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleBundleIntent(View view) {
        Intent intent = new Intent(this, BundleActivity.class);
        startActivity(intent);
    }

    public void handleParcelableIntent(View view) {
        Intent intent = new Intent(this, ParcelableActivity.class);
        startActivity(intent);
    }
}
