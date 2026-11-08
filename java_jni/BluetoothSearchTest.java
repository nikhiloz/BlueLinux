package com.test;

import android.bluetooth.BluetoothAdapter;

public class BluetoothSearchTest {
    static {
        System.loadLibrary("bluetooth_jni");
    }

    private static native boolean nativeEnableBluetooth();
    private static native boolean nativeStartDiscovery();

    public static void main(String[] args) {
        System.out.println("=== AOSP Bluetooth Minimal JNI Search & Discovery Test ===");
        try {
            BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
            System.out.println("BluetoothAdapter instance: " + adapter);

            boolean enabled = nativeEnableBluetooth();
            System.out.println("Native enable Bluetooth result: " + enabled);

            boolean discovering = nativeStartDiscovery();
            System.out.println("Native start discovery result: " + discovering);

            System.out.println("Minimal JNI integration test completed successfully!");
        } catch (Throwable t) {
            System.err.println("Error during minimal JNI test: " + t.getMessage());
            t.printStackTrace();
            System.exit(1);
        }
    }
}
