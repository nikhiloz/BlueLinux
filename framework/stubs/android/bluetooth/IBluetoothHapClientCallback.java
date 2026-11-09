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

public interface IBluetoothHapClientCallback extends IInterface {
    public void onPresetSelected(BluetoothDevice device, int presetIndex, int reasonCode) throws android.os.RemoteException;
    public void onPresetSelectionFailed(BluetoothDevice device, int statusCode) throws android.os.RemoteException;
    public void onPresetSelectionForGroupFailed(int hapGroupId, int statusCode) throws android.os.RemoteException;
    public void onPresetInfoChanged(BluetoothDevice device, List<BluetoothHapPresetInfo> presetInfoList, int statusCode) throws android.os.RemoteException;
    public void onSetPresetNameFailed(BluetoothDevice device, int status) throws android.os.RemoteException;
    public void onSetPresetNameForGroupFailed(int hapGroupId, int status) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothHapClientCallback {
        public static IBluetoothHapClientCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onPresetSelected(BluetoothDevice device, int presetIndex, int reasonCode) throws android.os.RemoteException {
            
        }
        @Override
        public void onPresetSelectionFailed(BluetoothDevice device, int statusCode) throws android.os.RemoteException {
            
        }
        @Override
        public void onPresetSelectionForGroupFailed(int hapGroupId, int statusCode) throws android.os.RemoteException {
            
        }
        @Override
        public void onPresetInfoChanged(BluetoothDevice device, List<BluetoothHapPresetInfo> presetInfoList, int statusCode) throws android.os.RemoteException {
            
        }
        @Override
        public void onSetPresetNameFailed(BluetoothDevice device, int status) throws android.os.RemoteException {
            
        }
        @Override
        public void onSetPresetNameForGroupFailed(int hapGroupId, int status) throws android.os.RemoteException {
            
        }

    }
}
