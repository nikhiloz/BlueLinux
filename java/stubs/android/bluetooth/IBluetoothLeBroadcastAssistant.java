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

public interface IBluetoothLeBroadcastAssistant extends IInterface {
    public int getConnectionState(BluetoothDevice sink, AttributionSource source) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource source) throws android.os.RemoteException;
    public List<BluetoothDevice> getConnectedDevices(AttributionSource source) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource source) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException;
    public void registerCallback(IBluetoothLeBroadcastAssistantCallback cb, AttributionSource source) throws android.os.RemoteException;
    public void unregisterCallback(IBluetoothLeBroadcastAssistantCallback cb, AttributionSource source) throws android.os.RemoteException;
    public void startSearchingForSources(List<ScanFilter> filters, AttributionSource source) throws android.os.RemoteException;
    public void stopSearchingForSources(AttributionSource source) throws android.os.RemoteException;
    public boolean isSearchInProgress(AttributionSource source) throws android.os.RemoteException;
    public void addSource(BluetoothDevice sink, BluetoothLeBroadcastMetadata sourceMetadata, boolean isGroupOp, AttributionSource source) throws android.os.RemoteException;
    public void modifySource(BluetoothDevice sink, int sourceId, BluetoothLeBroadcastMetadata updatedMetadata, AttributionSource source) throws android.os.RemoteException;
    public void removeSource(BluetoothDevice sink, int sourceId, AttributionSource source) throws android.os.RemoteException;
    public List<BluetoothLeBroadcastReceiveState> getAllSources(BluetoothDevice sink, AttributionSource source) throws android.os.RemoteException;
    public int getMaximumSourceCapacity(BluetoothDevice sink, AttributionSource source) throws android.os.RemoteException;
    public BluetoothLeBroadcastMetadata getSourceMetadata(BluetoothDevice sink, int sourceId, AttributionSource source) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothLeBroadcastAssistant {
        public static IBluetoothLeBroadcastAssistant asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public int getConnectionState(BluetoothDevice sink, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource source) throws android.os.RemoteException {
            return null;
        }
        @Override
        public List<BluetoothDevice> getConnectedDevices(AttributionSource source) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource source) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getConnectionPolicy(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void registerCallback(IBluetoothLeBroadcastAssistantCallback cb, AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterCallback(IBluetoothLeBroadcastAssistantCallback cb, AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public void startSearchingForSources(List<ScanFilter> filters, AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public void stopSearchingForSources(AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public boolean isSearchInProgress(AttributionSource source) throws android.os.RemoteException {
            return false;
        }
        @Override
        public void addSource(BluetoothDevice sink, BluetoothLeBroadcastMetadata sourceMetadata, boolean isGroupOp, AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public void modifySource(BluetoothDevice sink, int sourceId, BluetoothLeBroadcastMetadata updatedMetadata, AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public void removeSource(BluetoothDevice sink, int sourceId, AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public List<BluetoothLeBroadcastReceiveState> getAllSources(BluetoothDevice sink, AttributionSource source) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getMaximumSourceCapacity(BluetoothDevice sink, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public BluetoothLeBroadcastMetadata getSourceMetadata(BluetoothDevice sink, int sourceId, AttributionSource source) throws android.os.RemoteException {
            return null;
        }

    }
}
