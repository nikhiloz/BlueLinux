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

public interface IBluetoothLeAudioCallback extends IInterface {
    public void onCodecConfigChanged(int groupId, BluetoothLeAudioCodecStatus status) throws android.os.RemoteException;
    public void onGroupNodeAdded(BluetoothDevice device, int groupId) throws android.os.RemoteException;
    public void onGroupNodeRemoved(BluetoothDevice device, int groupId) throws android.os.RemoteException;
    public void onGroupStatusChanged(int groupId, int groupStatus) throws android.os.RemoteException;
    public void onGroupStreamStatusChanged(int groupId, int groupStreamStatus) throws android.os.RemoteException;
    public void onBroadcastToUnicastFallbackGroupChanged(int groupId) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothLeAudioCallback {
        public static IBluetoothLeAudioCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onCodecConfigChanged(int groupId, BluetoothLeAudioCodecStatus status) throws android.os.RemoteException {
            
        }
        @Override
        public void onGroupNodeAdded(BluetoothDevice device, int groupId) throws android.os.RemoteException {
            
        }
        @Override
        public void onGroupNodeRemoved(BluetoothDevice device, int groupId) throws android.os.RemoteException {
            
        }
        @Override
        public void onGroupStatusChanged(int groupId, int groupStatus) throws android.os.RemoteException {
            
        }
        @Override
        public void onGroupStreamStatusChanged(int groupId, int groupStreamStatus) throws android.os.RemoteException {
            
        }
        @Override
        public void onBroadcastToUnicastFallbackGroupChanged(int groupId) throws android.os.RemoteException {
            
        }

    }
}
