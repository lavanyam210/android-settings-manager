package com.vuclip.viu.settingsmanager;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.vuclip.viu.settingsmanager.constants.IntentExtras;

public class WifiSettingsManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleWifi();
    }

    private void toggleWifi() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(IntentExtras.ENABLE_WIFI)) {
            boolean enableWifi = Boolean.parseBoolean(extras.getString(IntentExtras.ENABLE_WIFI));
            Log.d(WifiSettingsManagerActivity.class.getSimpleName(), "enableWifi = " + enableWifi);

            WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            wifiManager.setWifiEnabled(enableWifi);
        }
    }
}
