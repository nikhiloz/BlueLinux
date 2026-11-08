package com.android.server.bluetooth;



public class BluetoothAdapterState {
    
    public int get() { return 10; }
    public boolean oneOf(int... states) { return true; }
    public void set(int state) {}



    public boolean waitForState(Object timeout, int... states) { return true; }
    public boolean waitForState(Object timeout, int state) { return true; }

}
