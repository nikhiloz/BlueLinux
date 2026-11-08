package android.bluetooth;

import android.os.IInterface;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ParcelUuid;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothClass;
import android.bluetooth.OobData;
import android.bluetooth.BluetoothSinkAudioPolicy;
import android.bluetooth.IncomingRfcommSocketInfo;
import android.bluetooth.BluetoothQualityReport;
import android.bluetooth.BluetoothActivityEnergyInfo;
import android.content.AttributionSource;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.content.ComponentName;
import android.net.Uri;
import android.os.WorkSource;
import android.bluetooth.le.*;
import java.util.Map;
import java.util.List;

public interface IBluetoothHidDeviceCallback extends IInterface {
    public void onAppStatusChanged(BluetoothDevice device, boolean registered) throws android.os.RemoteException;
    public void onConnectionStateChanged(BluetoothDevice device, int state) throws android.os.RemoteException;
    public void onGetReport(BluetoothDevice device, byte type, byte id, int bufferSize) throws android.os.RemoteException;
    public void onSetReport(BluetoothDevice device, byte type, byte id, byte[] data) throws android.os.RemoteException;
    public void onSetProtocol(BluetoothDevice device, byte protocol) throws android.os.RemoteException;
    public void onInterruptData(BluetoothDevice device, byte reportId, byte[] data) throws android.os.RemoteException;
    public void onVirtualCableUnplug(BluetoothDevice device) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothHidDeviceCallback {
        public static IBluetoothHidDeviceCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onAppStatusChanged(BluetoothDevice device, boolean registered) throws android.os.RemoteException {
            
        }
        @Override
        public void onConnectionStateChanged(BluetoothDevice device, int state) throws android.os.RemoteException {
            
        }
        @Override
        public void onGetReport(BluetoothDevice device, byte type, byte id, int bufferSize) throws android.os.RemoteException {
            
        }
        @Override
        public void onSetReport(BluetoothDevice device, byte type, byte id, byte[] data) throws android.os.RemoteException {
            
        }
        @Override
        public void onSetProtocol(BluetoothDevice device, byte protocol) throws android.os.RemoteException {
            
        }
        @Override
        public void onInterruptData(BluetoothDevice device, byte reportId, byte[] data) throws android.os.RemoteException {
            
        }
        @Override
        public void onVirtualCableUnplug(BluetoothDevice device) throws android.os.RemoteException {
            
        }

    }
}
