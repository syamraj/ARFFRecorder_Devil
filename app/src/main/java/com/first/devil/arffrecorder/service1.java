package com.first.devil.arffrecorder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by devil on 02/05/16.
 */
public class service1 extends Service {
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Let it continue running until it is stopped.
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}

