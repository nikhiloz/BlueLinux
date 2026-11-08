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

public interface IBluetoothGattCallback extends IInterface {
    public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException;
    public void onClientConnectionState(int status, int clientIf, boolean connected, String address) throws android.os.RemoteException;
    public void onPhyUpdate(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException;
    public void onPhyRead(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException;
    public void onSearchComplete(String address, List<BluetoothGattService> services, int status) throws android.os.RemoteException;
    public void onCharacteristicRead(String address, int status, int handle, byte[] value) throws android.os.RemoteException;
    public void onCharacteristicWrite(String address, int status, int handle, byte[] value) throws android.os.RemoteException;
    public void onExecuteWrite(String address, int status) throws android.os.RemoteException;
    public void onDescriptorRead(String address, int status, int handle, byte[] value) throws android.os.RemoteException;
    public void onDescriptorWrite(String address, int status, int handle, byte[] value) throws android.os.RemoteException;
    public void onNotify(String address, int handle, byte[] value) throws android.os.RemoteException;
    public void onReadRemoteRssi(String address, int rssi, int status) throws android.os.RemoteException;
    public void onConfigureMTU(String address, int mtu, int status) throws android.os.RemoteException;
    public void onConnectionUpdated(String address, int interval, int latency, int timeout, int status) throws android.os.RemoteException;
    public void onServiceChanged(String address) throws android.os.RemoteException;
    public void onSubrateChange(String address, int subrateFactor, int latency, int contNum, int timeout, int status) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothGattCallback {
        public static IBluetoothGattCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException {
            
        }
        @Override
        public void onClientConnectionState(int status, int clientIf, boolean connected, String address) throws android.os.RemoteException {
            
        }
        @Override
        public void onPhyUpdate(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onPhyRead(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onSearchComplete(String address, List<BluetoothGattService> services, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onCharacteristicRead(String address, int status, int handle, byte[] value) throws android.os.RemoteException {
            
        }
        @Override
        public void onCharacteristicWrite(String address, int status, int handle, byte[] value) throws android.os.RemoteException {
            
        }
        @Override
        public void onExecuteWrite(String address, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onDescriptorRead(String address, int status, int handle, byte[] value) throws android.os.RemoteException {
            
        }
        @Override
        public void onDescriptorWrite(String address, int status, int handle, byte[] value) throws android.os.RemoteException {
            
        }
        @Override
        public void onNotify(String address, int handle, byte[] value) throws android.os.RemoteException {
            
        }
        @Override
        public void onReadRemoteRssi(String address, int rssi, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onConfigureMTU(String address, int mtu, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onConnectionUpdated(String address, int interval, int latency, int timeout, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onServiceChanged(String address) throws android.os.RemoteException {
            
        }
        @Override
        public void onSubrateChange(String address, int subrateFactor, int latency, int contNum, int timeout, int status) throws android.os.RemoteException {
            
        }

    }
}
