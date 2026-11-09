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

public interface IBluetoothGattServerCallback extends IInterface {
    public void onServerRegistered(int status, int serverIf) throws android.os.RemoteException;
    public void onServerConnectionState(int status, int serverIf, boolean connected, String address) throws android.os.RemoteException;
    public void onServiceAdded(int status, BluetoothGattService service) throws android.os.RemoteException;
    public void onCharacteristicReadRequest(String address, int transId, int offset, boolean isLong, int handle) throws android.os.RemoteException;
    public void onDescriptorReadRequest(String address, int transId, int offset, boolean isLong, int handle) throws android.os.RemoteException;
    public void onCharacteristicWriteRequest(String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int handle, byte[] value) throws android.os.RemoteException;
    public void onDescriptorWriteRequest(String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int handle, byte[] value) throws android.os.RemoteException;
    public void onExecuteWrite(String address, int transId, boolean execWrite) throws android.os.RemoteException;
    public void onNotificationSent(String address, int status) throws android.os.RemoteException;
    public void onMtuChanged(String address, int mtu) throws android.os.RemoteException;
    public void onPhyUpdate(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException;
    public void onPhyRead(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException;
    public void onConnectionUpdated(String address, int interval, int latency, int timeout, int status) throws android.os.RemoteException;
    public void onSubrateChange(String address, int subrateFactor, int latency, int contNum, int timeout, int status) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothGattServerCallback {
        public static IBluetoothGattServerCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onServerRegistered(int status, int serverIf) throws android.os.RemoteException {
            
        }
        @Override
        public void onServerConnectionState(int status, int serverIf, boolean connected, String address) throws android.os.RemoteException {
            
        }
        @Override
        public void onServiceAdded(int status, BluetoothGattService service) throws android.os.RemoteException {
            
        }
        @Override
        public void onCharacteristicReadRequest(String address, int transId, int offset, boolean isLong, int handle) throws android.os.RemoteException {
            
        }
        @Override
        public void onDescriptorReadRequest(String address, int transId, int offset, boolean isLong, int handle) throws android.os.RemoteException {
            
        }
        @Override
        public void onCharacteristicWriteRequest(String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int handle, byte[] value) throws android.os.RemoteException {
            
        }
        @Override
        public void onDescriptorWriteRequest(String address, int transId, int offset, int length, boolean isPrep, boolean needRsp, int handle, byte[] value) throws android.os.RemoteException {
            
        }
        @Override
        public void onExecuteWrite(String address, int transId, boolean execWrite) throws android.os.RemoteException {
            
        }
        @Override
        public void onNotificationSent(String address, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onMtuChanged(String address, int mtu) throws android.os.RemoteException {
            
        }
        @Override
        public void onPhyUpdate(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onPhyRead(String address, int txPhy, int rxPhy, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onConnectionUpdated(String address, int interval, int latency, int timeout, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onSubrateChange(String address, int subrateFactor, int latency, int contNum, int timeout, int status) throws android.os.RemoteException {
            
        }

    }
}
