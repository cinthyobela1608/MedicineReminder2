package com.example.medicinereminder2.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyFirebaseIdService extends Service {
    public MyFirebaseIdService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
