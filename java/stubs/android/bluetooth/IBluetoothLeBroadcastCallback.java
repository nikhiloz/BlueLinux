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

public interface IBluetoothLeBroadcastCallback extends IInterface {
    public void onBroadcastStarted(int reason, int broadcastId) throws android.os.RemoteException;
    public void onBroadcastStartFailed(int reason) throws android.os.RemoteException;
    public void onBroadcastStopped(int reason, int broadcastId) throws android.os.RemoteException;
    public void onBroadcastStopFailed(int reason) throws android.os.RemoteException;
    public void onPlaybackStarted(int reason, int broadcastId) throws android.os.RemoteException;
    public void onPlaybackStopped(int reason, int broadcastId) throws android.os.RemoteException;
    public void onBroadcastUpdated(int reason, int broadcastId) throws android.os.RemoteException;
    public void onBroadcastUpdateFailed(int reason, int broadcastId) throws android.os.RemoteException;
    public void onBroadcastMetadataChanged(int broadcastId, BluetoothLeBroadcastMetadata metadata) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothLeBroadcastCallback {
        public static IBluetoothLeBroadcastCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onBroadcastStarted(int reason, int broadcastId) throws android.os.RemoteException {
            
        }
        @Override
        public void onBroadcastStartFailed(int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onBroadcastStopped(int reason, int broadcastId) throws android.os.RemoteException {
            
        }
        @Override
        public void onBroadcastStopFailed(int reason) throws android.os.RemoteException {
            
        }
        @Override
        public void onPlaybackStarted(int reason, int broadcastId) throws android.os.RemoteException {
            
        }
        @Override
        public void onPlaybackStopped(int reason, int broadcastId) throws android.os.RemoteException {
            
        }
        @Override
        public void onBroadcastUpdated(int reason, int broadcastId) throws android.os.RemoteException {
            
        }
        @Override
        public void onBroadcastUpdateFailed(int reason, int broadcastId) throws android.os.RemoteException {
            
        }
        @Override
        public void onBroadcastMetadataChanged(int broadcastId, BluetoothLeBroadcastMetadata metadata) throws android.os.RemoteException {
            
        }

    }
}
