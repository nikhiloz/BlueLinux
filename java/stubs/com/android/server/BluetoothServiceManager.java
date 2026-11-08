package com.android.server;

import android.bluetooth.IBluetoothManager;

public class BluetoothServiceManager {
    
    public interface BinderInterfaceRegisterer<T> {
        T get();
    }
    public BinderInterfaceRegisterer<android.bluetooth.IBluetoothManager> getBluetoothManagerServiceRegisterer() { return null; }

}
