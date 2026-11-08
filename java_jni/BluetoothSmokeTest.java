package com.test;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

public class BluetoothSmokeTest {
    public static void main(String[] args) {
        System.out.println("=== AOSP Bluetooth Java Runtime Smoke Test ===");
        try {
            System.out.println("Loading BluetoothAdapter class...");
            Class<?> adapterClass = BluetoothAdapter.class;
            System.out.println("Successfully loaded: " + adapterClass.getName());
            
            System.out.println("Loading BluetoothDevice class...");
            Class<?> deviceClass = BluetoothDevice.class;
            System.out.println("Successfully loaded: " + deviceClass.getName());
            
            System.out.println("AOSP Bluetooth Java classes verified successfully!");
        } catch (Throwable t) {
            System.err.println("Error during smoke test: " + t.getMessage());
            t.printStackTrace();
            System.exit(1);
        }
    }
}
