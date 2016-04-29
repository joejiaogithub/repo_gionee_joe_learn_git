package com.example.joe.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(" [ joe test ]","com.example.joe.test.MyReceiver");

        context.sendBroadcast(new Intent("com.weishu.upf.demo.app2.PLUGIN_ACTION"));

        context.registerReceiver(mReceiver, new IntentFilter("com.weishu.upf.demo.app2.PLUGIN_ACTION"));
    }

    BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "XXXXXX", Toast.LENGTH_SHORT).show();
        }
    };
}
