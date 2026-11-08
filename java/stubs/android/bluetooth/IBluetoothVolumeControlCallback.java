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

public interface IBluetoothVolumeControlCallback extends IInterface {
    public void onVolumeOffsetChanged(BluetoothDevice device, int instanceId, int volumeOffset) throws android.os.RemoteException;
    public void onVolumeOffsetAudioLocationChanged(BluetoothDevice device, int instanceId, int audioLocation) throws android.os.RemoteException;
    public void onVolumeOffsetAudioDescriptionChanged(BluetoothDevice device, int instanceId, String audioDescription) throws android.os.RemoteException;
    public void onDeviceVolumeChanged(BluetoothDevice device, int volume) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothVolumeControlCallback {
        public static IBluetoothVolumeControlCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onVolumeOffsetChanged(BluetoothDevice device, int instanceId, int volumeOffset) throws android.os.RemoteException {
            
        }
        @Override
        public void onVolumeOffsetAudioLocationChanged(BluetoothDevice device, int instanceId, int audioLocation) throws android.os.RemoteException {
            
        }
        @Override
        public void onVolumeOffsetAudioDescriptionChanged(BluetoothDevice device, int instanceId, String audioDescription) throws android.os.RemoteException {
            
        }
        @Override
        public void onDeviceVolumeChanged(BluetoothDevice device, int volume) throws android.os.RemoteException {
            
        }

    }
}
