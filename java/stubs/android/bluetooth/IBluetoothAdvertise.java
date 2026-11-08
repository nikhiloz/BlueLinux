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

public interface IBluetoothAdvertise extends IInterface {
    public void startAdvertisingSet(AdvertisingSetParameters parameters, AdvertiseData advertiseData, AdvertiseData scanResponse, PeriodicAdvertisingParameters periodicParameters, AdvertiseData periodicData, int duration, int maxExtAdvEvents, int gattServerIf, IAdvertisingSetCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void stopAdvertisingSet(IAdvertisingSetCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void getOwnAddress(int advertiserId, AttributionSource attributionSource) throws android.os.RemoteException;
    public void enableAdvertisingSet(int advertiserId, boolean enable, int duration, int maxExtAdvEvents, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setAdvertisingData(int advertiserId, AdvertiseData data, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setScanResponseData(int advertiserId, AdvertiseData data, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setAdvertisingParameters(int advertiserId, AdvertisingSetParameters parameters, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setPeriodicAdvertisingParameters(int advertiserId, PeriodicAdvertisingParameters parameters, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setPeriodicAdvertisingData(int advertiserId, AdvertiseData data, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setPeriodicAdvertisingEnable(int advertiserId, boolean enable, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothAdvertise {
        public static IBluetoothAdvertise asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void startAdvertisingSet(AdvertisingSetParameters parameters, AdvertiseData advertiseData, AdvertiseData scanResponse, PeriodicAdvertisingParameters periodicParameters, AdvertiseData periodicData, int duration, int maxExtAdvEvents, int gattServerIf, IAdvertisingSetCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void stopAdvertisingSet(IAdvertisingSetCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void getOwnAddress(int advertiserId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void enableAdvertisingSet(int advertiserId, boolean enable, int duration, int maxExtAdvEvents, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setAdvertisingData(int advertiserId, AdvertiseData data, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setScanResponseData(int advertiserId, AdvertiseData data, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setAdvertisingParameters(int advertiserId, AdvertisingSetParameters parameters, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setPeriodicAdvertisingParameters(int advertiserId, PeriodicAdvertisingParameters parameters, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setPeriodicAdvertisingData(int advertiserId, AdvertiseData data, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setPeriodicAdvertisingEnable(int advertiserId, boolean enable, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }

    }
}
