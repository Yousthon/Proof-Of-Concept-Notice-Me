package com.example.android.bluetoothchat;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.android.common.logger.Log;

public class ItineraireActivity extends Activity {

    private static final int CHOIX_ITINERAIRE_CODE = 2002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraire);
    }

    public void validate(View view) {

        Log.i("tag1", "In itineraire activity");

        Intent intent = new Intent(getApplicationContext(), BluetoothChatFragment.class);
        setResult(CHOIX_ITINERAIRE_CODE,intent);
        finish();
    }

    public void annuler(View view) {
        Intent intent = new Intent(getApplicationContext(), BluetoothChatFragment.class);
        setResult(CHOIX_ITINERAIRE_CODE, intent);
        finish();
    }
}
