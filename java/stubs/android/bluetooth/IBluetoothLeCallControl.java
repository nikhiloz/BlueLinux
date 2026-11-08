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

public interface IBluetoothLeCallControl extends IInterface {
    public void registerBearer(String token, IBluetoothLeCallControlCallback callback, String uci, List<String> uriSchemes, int capabilities, String provider, int technology, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterBearer(String token, AttributionSource attributionSource) throws android.os.RemoteException;
    public void requestResult(int ccid, int requestId, int result, AttributionSource attributionSource) throws android.os.RemoteException;
    public void callAdded(int ccid, BluetoothLeCall call, AttributionSource attributionSource) throws android.os.RemoteException;
    public void callRemoved(int ccid, ParcelUuid callId, int reason, AttributionSource attributionSource) throws android.os.RemoteException;
    public void callStateChanged(int ccid, ParcelUuid callId, int state, AttributionSource attributionSource) throws android.os.RemoteException;
    public void currentCallsList(int ccid, List<BluetoothLeCall> calls, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothLeCallControl {
        public static IBluetoothLeCallControl asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void registerBearer(String token, IBluetoothLeCallControlCallback callback, String uci, List<String> uriSchemes, int capabilities, String provider, int technology, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterBearer(String token, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void requestResult(int ccid, int requestId, int result, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void callAdded(int ccid, BluetoothLeCall call, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void callRemoved(int ccid, ParcelUuid callId, int reason, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void callStateChanged(int ccid, ParcelUuid callId, int state, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void currentCallsList(int ccid, List<BluetoothLeCall> calls, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }

    }
}
