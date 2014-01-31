package net.trolldad.daydream.launcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by jacob-tabak on 1/30/14.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            // Major hack, who knows if it will continue to work?
            final Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setClassName("com.android.systemui", "com.android.systemui.Somnambulator");
            startActivity(intent);
        }
        catch (Exception e) {
            Toast.makeText(this, "Sorry! This app does not work with your device.", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}
