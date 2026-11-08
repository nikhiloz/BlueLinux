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

public interface IBluetoothScan extends IInterface {
    public void registerScanner(IScannerCallback callback, WorkSource workSource, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterScanner(int scannerId, AttributionSource attributionSource) throws android.os.RemoteException;
    public void startScan(int scannerId, ScanSettings settings, List<ScanFilter> filters, AttributionSource attributionSource) throws android.os.RemoteException;
    public void startScanForIntent(PendingIntent intent, ScanSettings settings, List<ScanFilter> filters, AttributionSource attributionSource) throws android.os.RemoteException;
    public void stopScan(int scannerId, AttributionSource attributionSource) throws android.os.RemoteException;
    public void stopScanForIntent(PendingIntent intent, AttributionSource attributionSource) throws android.os.RemoteException;
    public void flushPendingBatchResults(int scannerId, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerSync(ScanResult scanResult, int skip, int timeout, IPeriodicAdvertisingCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterSync(IPeriodicAdvertisingCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void transferSync(BluetoothDevice bda, int serviceData, int syncHandle, AttributionSource attributionSource) throws android.os.RemoteException;
    public void transferSetInfo(BluetoothDevice bda, int serviceData, int advertisingHandle, IPeriodicAdvertisingCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public int numHwTrackFiltersAvailable(AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothScan {
        public static IBluetoothScan asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void registerScanner(IScannerCallback callback, WorkSource workSource, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterScanner(int scannerId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void startScan(int scannerId, ScanSettings settings, List<ScanFilter> filters, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void startScanForIntent(PendingIntent intent, ScanSettings settings, List<ScanFilter> filters, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void stopScan(int scannerId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void stopScanForIntent(PendingIntent intent, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void flushPendingBatchResults(int scannerId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void registerSync(ScanResult scanResult, int skip, int timeout, IPeriodicAdvertisingCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterSync(IPeriodicAdvertisingCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void transferSync(BluetoothDevice bda, int serviceData, int syncHandle, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void transferSetInfo(BluetoothDevice bda, int serviceData, int advertisingHandle, IPeriodicAdvertisingCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int numHwTrackFiltersAvailable(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }

    }
}
