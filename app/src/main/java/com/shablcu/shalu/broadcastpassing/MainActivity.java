package com.shablcu.shalu.broadcastpassing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//    MyBroadcastReceiver myReceiver;
//    IntentFilter intentFilter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        myReceiver=new MyBroadcastReceiver();
//        intentFilter =new IntentFilter("MY_SPECIFIC_ACTION");
    }


//    @Override
//    public void onResume() {
//        super.onResume();
//---register the receiver---
//        intentFilter.setPriority(10);
//        registerReceiver(myReceiver, intentFilter);
//    }
//    @Override
//    public void onPause() {
//  super.onPause();
//---unregister the receiver---
//        unregisterReceiver(myReceiver);
//    }



    public void onClick(View view){

        Intent intent=new Intent("MY_SPECIFIC_ACTION");
        intent.putExtra("name", "broadcast receiver");
//        sendBroadcast(intent);
        sendOrderedBroadcast(intent, null);

    }




}
