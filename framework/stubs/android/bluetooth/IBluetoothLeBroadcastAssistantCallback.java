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

public interface IBluetoothLeBroadcastAssistantCallback extends IInterface {
    public void onSearchStarted(int reason) throws android.os.RemoteException;
    public void onSearchStartFailed(int reason) throws android.os.RemoteException;
    public void onSearchStopped(int reason) throws android.os.RemoteException;
    public void onSearchStopFailed(int reason) throws android.os.RemoteException;
    public void onSourceFound(BluetoothLeBroadcastMetadata source) throws android.os.RemoteException;
    public void onSourceAdded(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException;
    public void onSourceAddFailed(BluetoothDevice sink, BluetoothLeBroadcastMetadata source, int reason) throws android.os.RemoteException;
    public void onSourceModified(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException;
    public void onSourceModifyFailed(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException;
    public void onSourceRemoved(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException;
    public void onSourceRemoveFailed(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException;
    public void onReceiveStateChanged(BluetoothDevice sink, int sourceId, BluetoothLeBroadcastReceiveState state) throws android.os.RemoteException;
    public void onSourceLost(int broadcastId) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothLeBroadcastAssistantCallback {
        public static IBluetoothLeBroadcastAssistantCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onSearchStarted(int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSearchStartFailed(int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSearchStopped(int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSearchStopFailed(int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceFound(BluetoothLeBroadcastMetadata source) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceAdded(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceAddFailed(BluetoothDevice sink, BluetoothLeBroadcastMetadata source, int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceModified(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceModifyFailed(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceRemoved(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceRemoveFailed(BluetoothDevice sink, int sourceId, int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onReceiveStateChanged(BluetoothDevice sink, int sourceId, BluetoothLeBroadcastReceiveState state) throws android.os.RemoteException {
            
        }
        @Override
        public void onSourceLost(int broadcastId) throws android.os.RemoteException {
            
        }

    }
}
