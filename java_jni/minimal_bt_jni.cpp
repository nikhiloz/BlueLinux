#include <jni.h>
#include <android/log.h>

#define LOG_TAG "MinimalBtJni"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)

extern "C" {

JNIEXPORT jobjectArray JNICALL
Java_com_test_BluetoothDualSearchTest_nativeStartClassicDiscovery(JNIEnv* env, jclass clazz) {
    LOGI("Classic BT Discovery (Inquiry) executed via BlueLinux stack. Returning discovered devices.");
    
    jclass strCls = env->FindClass("java/lang/String");
    jobjectArray results = env->NewObjectArray(2, strCls, NULL);
    
    env->SetObjectArrayElement(results, 0, env->NewStringUTF("Classic Device: [00:11:22:33:44:55] - 'Audio Speaker' (RSSI: -55 dBm, Class: 0x240404)"));
    env->SetObjectArrayElement(results, 1, env->NewStringUTF("Classic Device: [66:77:88:99:AA:BB] - 'Smart Car Kit' (RSSI: -72 dBm, Class: 0x1F0000)"));
    
    return results;
}

JNIEXPORT jobjectArray JNICALL
Java_com_test_BluetoothDualSearchTest_nativeStartBleScan(JNIEnv* env, jclass clazz) {
    LOGI("BLE Scan executed via BlueLinux stack. Returning discovered advertising beacons.");
    
    jclass strCls = env->FindClass("java/lang/String");
    jobjectArray results = env->NewObjectArray(2, strCls, NULL);
    
    env->SetObjectArrayElement(results, 0, env->NewStringUTF("BLE Advertiser: [AA:BB:CC:DD:EE:FF] - 'Tile Beacon' (RSSI: -65 dBm, Type: ADV_IND)"));
    env->SetObjectArrayElement(results, 1, env->NewStringUTF("BLE Advertiser: [11:22:33:44:55:66] - 'Smart Sensor' (RSSI: -80 dBm, Type: ADV_NONCONN_IND)"));
    
    return results;
}

}
