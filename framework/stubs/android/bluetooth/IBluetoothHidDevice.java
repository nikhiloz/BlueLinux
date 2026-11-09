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

public interface IBluetoothHidDevice extends IInterface {
    public boolean registerApp(BluetoothHidDeviceAppSdpSettings sdp, BluetoothHidDeviceAppQosSettings inQos, BluetoothHidDeviceAppQosSettings outQos, IBluetoothHidDeviceCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean unregisterApp(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean sendReport(BluetoothDevice device, int id, byte[] data, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean replyReport(BluetoothDevice device, byte type, byte id, byte[] data, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean reportError(BluetoothDevice device, byte error, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean unplug(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean connect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disconnect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public String getUserAppName(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothHidDevice {
        public static IBluetoothHidDevice asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public boolean registerApp(BluetoothHidDeviceAppSdpSettings sdp, BluetoothHidDeviceAppQosSettings inQos, BluetoothHidDeviceAppQosSettings outQos, IBluetoothHidDeviceCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean unregisterApp(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean sendReport(BluetoothDevice device, int id, byte[] data, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean replyReport(BluetoothDevice device, byte type, byte id, byte[] data, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean reportError(BluetoothDevice device, byte error, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean unplug(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean connect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean disconnect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
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
        public String getUserAppName(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }

    }
}
