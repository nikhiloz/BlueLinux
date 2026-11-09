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

public interface IDistanceMeasurement extends IInterface {
    public List<DistanceMeasurementMethod> getSupportedDistanceMeasurementMethods(AttributionSource attributionSource) throws android.os.RemoteException;
    public void startDistanceMeasurement(ParcelUuid uuid, DistanceMeasurementParams params, IDistanceMeasurementCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public int stopDistanceMeasurement(ParcelUuid uuid, BluetoothDevice device, int method, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getChannelSoundingMaxSupportedSecurityLevel(BluetoothDevice remoteDevice, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getLocalChannelSoundingMaxSupportedSecurityLevel(AttributionSource attributionSource) throws android.os.RemoteException;
    public int[] getChannelSoundingSupportedSecurityLevels(AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IDistanceMeasurement {
        public static IDistanceMeasurement asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public List<DistanceMeasurementMethod> getSupportedDistanceMeasurementMethods(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void startDistanceMeasurement(ParcelUuid uuid, DistanceMeasurementParams params, IDistanceMeasurementCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int stopDistanceMeasurement(ParcelUuid uuid, BluetoothDevice device, int method, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getChannelSoundingMaxSupportedSecurityLevel(BluetoothDevice remoteDevice, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getLocalChannelSoundingMaxSupportedSecurityLevel(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int[] getChannelSoundingSupportedSecurityLevels(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }

    }
}
