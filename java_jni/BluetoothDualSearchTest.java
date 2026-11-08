package com.test;

public class BluetoothDualSearchTest {
    static {
        System.loadLibrary("bluetooth_jni");
    }

    private static native String[] nativeStartClassicDiscovery();
    private static native String[] nativeStartBleScan();

    public static void main(String[] args) {
        System.out.println("=== AOSP Bluetooth Classic & BLE Dual Search Results ===");
        try {
            System.out.println("\n[1] Classic Bluetooth Discovery (Inquiry) Results:");
            String[] classicDevices = nativeStartClassicDiscovery();
            if (classicDevices != null) {
                for (String dev : classicDevices) {
                    System.out.println("  -> " + dev);
                }
            }

            System.out.println("\n[2] Bluetooth Low Energy (BLE) Scan Results:");
            String[] bleDevices = nativeStartBleScan();
            if (bleDevices != null) {
                for (String dev : bleDevices) {
                    System.out.println("  -> " + dev);
                }
            }

            System.out.println("\nDual search results printed successfully!");
        } catch (Throwable t) {
            System.err.println("Error during dual search test: " + t.getMessage());
            t.printStackTrace();
            System.exit(1);
        }
    }
}
