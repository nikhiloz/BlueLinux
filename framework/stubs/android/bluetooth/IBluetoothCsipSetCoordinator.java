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

public interface IBluetoothCsipSetCoordinator extends IInterface {
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List getAllGroupIds(ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException;
    public Map getGroupUuidMapByDevice(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getDesiredGroupSize(int group_id, AttributionSource attributionSource) throws android.os.RemoteException;
    public ParcelUuid lockGroup(int groupId, IBluetoothCsipSetCoordinatorLockCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unlockGroup(ParcelUuid lockUuid, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothCsipSetCoordinator {
        public static IBluetoothCsipSetCoordinator asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public List getAllGroupIds(ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public Map getGroupUuidMapByDevice(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getDesiredGroupSize(int group_id, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public ParcelUuid lockGroup(int groupId, IBluetoothCsipSetCoordinatorLockCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void unlockGroup(ParcelUuid lockUuid, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }

    }


    int CSIS_GROUP_ID_INVALID = -1;

}
