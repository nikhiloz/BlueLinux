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

public interface IBluetoothHidHost extends IInterface {
    public boolean connect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disconnect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setPreferredTransport(BluetoothDevice device, int transport, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getPreferredTransport(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean getProtocolMode(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean virtualUnplug(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setProtocolMode(BluetoothDevice device, int protocolMode, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean getReport(BluetoothDevice device, byte reportType, byte reportId, int bufferSize, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setReport(BluetoothDevice device, byte reportType, String report, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean sendData(BluetoothDevice device, String report, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean getIdleTime(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setIdleTime(BluetoothDevice device, byte idleTime, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothHidHost {
        public static IBluetoothHidHost asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
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
        public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setPreferredTransport(BluetoothDevice device, int transport, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getPreferredTransport(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean getProtocolMode(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean virtualUnplug(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setProtocolMode(BluetoothDevice device, int protocolMode, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean getReport(BluetoothDevice device, byte reportType, byte reportId, int bufferSize, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setReport(BluetoothDevice device, byte reportType, String report, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean sendData(BluetoothDevice device, String report, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean getIdleTime(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setIdleTime(BluetoothDevice device, byte idleTime, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }

    }
}
