package com.android.server.bluetooth;

import android.bluetooth.IBluetooth;
import android.os.IBinder;

public class AdapterBinder extends IBluetooth.Stub {
    public AdapterBinder() {}
    public AdapterBinder(IBinder binder) {}
    public IBluetooth getAdapterBinder() { return this; }
}
