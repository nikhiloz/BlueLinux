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

public interface IBluetoothManager extends IInterface {

    String GET_SYSTEM_STATE_API = "get_system_state";
    String IPC_CACHE_MODULE_SYSTEM = "system";

    public IBinder registerAdapter(IBluetoothManagerCallback callback) throws android.os.RemoteException;
    public void unregisterAdapter(IBluetoothManagerCallback callback) throws android.os.RemoteException;
    public boolean enable(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean enableNoAutoConnect(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disable(AttributionSource attributionSource, boolean persist) throws android.os.RemoteException;
    public int getState() throws android.os.RemoteException;
    public String getAddress(AttributionSource attributionSource) throws android.os.RemoteException;
    public String getName(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean onFactoryReset(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isBleScanAvailable() throws android.os.RemoteException;
    public boolean enableBle(AttributionSource attributionSource, IBinder b) throws android.os.RemoteException;
    public boolean disableBle(AttributionSource attributionSource, IBinder b) throws android.os.RemoteException;
    public boolean isHearingAidProfileSupported() throws android.os.RemoteException;
    public int setBtHciSnoopLogMode(int mode) throws android.os.RemoteException;
    public int getBtHciSnoopLogMode() throws android.os.RemoteException;
    public boolean isAutoOnSupported() throws android.os.RemoteException;
    public boolean isAutoOnEnabled() throws android.os.RemoteException;
    public void setAutoOnEnabled(boolean status) throws android.os.RemoteException;
    public int handleShellCommand(android.os.ParcelFileDescriptor in, android.os.ParcelFileDescriptor out, android.os.ParcelFileDescriptor err, String[] args) throws android.os.RemoteException;
    public void dump(java.io.FileDescriptor fd, java.io.PrintWriter writer, String[] args) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothManager {
        public static IBluetoothManager asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public IBinder registerAdapter(IBluetoothManagerCallback callback) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void unregisterAdapter(IBluetoothManagerCallback callback) throws android.os.RemoteException {
            
        }
        @Override
        public boolean enable(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean enableNoAutoConnect(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean disable(AttributionSource attributionSource, boolean persist) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getState() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public String getAddress(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public String getName(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean onFactoryReset(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isBleScanAvailable() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean enableBle(AttributionSource attributionSource, IBinder b) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean disableBle(AttributionSource attributionSource, IBinder b) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isHearingAidProfileSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public int setBtHciSnoopLogMode(int mode) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getBtHciSnoopLogMode() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean isAutoOnSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isAutoOnEnabled() throws android.os.RemoteException {
            return false;
        }
        @Override
        public void setAutoOnEnabled(boolean status) throws android.os.RemoteException {
            
        }
        @Override
        public int handleShellCommand(android.os.ParcelFileDescriptor in, android.os.ParcelFileDescriptor out, android.os.ParcelFileDescriptor err, String[] args) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void dump(java.io.FileDescriptor fd, java.io.PrintWriter writer, String[] args) throws android.os.RemoteException {
            
        }

    }
}
