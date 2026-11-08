package android.bluetooth.le;

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

public interface IAdvertisingSetCallback extends IInterface {
    public void onAdvertisingSetStarted(IBinder advertiseBinder, int advertiserId, int tx_power, int status) throws android.os.RemoteException;
    public void onOwnAddressRead(int advertiserId, int addressType, String address) throws android.os.RemoteException;
    public void onAdvertisingSetStopped(int advertiserId) throws android.os.RemoteException;
    public void onAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException;
    public void onAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException;
    public void onScanResponseDataSet(int advertiserId, int status) throws android.os.RemoteException;
    public void onAdvertisingParametersUpdated(int advertiserId, int tx_power, int status) throws android.os.RemoteException;
    public void onPeriodicAdvertisingParametersUpdated(int advertiserId, int status) throws android.os.RemoteException;
    public void onPeriodicAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException;
    public void onPeriodicAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IAdvertisingSetCallback {
        public static IAdvertisingSetCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onAdvertisingSetStarted(IBinder advertiseBinder, int advertiserId, int tx_power, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onOwnAddressRead(int advertiserId, int addressType, String address) throws android.os.RemoteException {
            
        }
        @Override
        public void onAdvertisingSetStopped(int advertiserId) throws android.os.RemoteException {
            
        }
        @Override
        public void onAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onScanResponseDataSet(int advertiserId, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onAdvertisingParametersUpdated(int advertiserId, int tx_power, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onPeriodicAdvertisingParametersUpdated(int advertiserId, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onPeriodicAdvertisingDataSet(int advertiserId, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onPeriodicAdvertisingEnabled(int advertiserId, boolean enable, int status) throws android.os.RemoteException {
            
        }

    }
}
