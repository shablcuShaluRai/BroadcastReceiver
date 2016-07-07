package com.shablcu.shalu.broadcastpassing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class MySecondBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,
                "Received broadcast in MySecondBroadcastReceiver, " +
                        " value received: " + intent.getStringExtra("name"),
                Toast.LENGTH_LONG).show();
    }
}
