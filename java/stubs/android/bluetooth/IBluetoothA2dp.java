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

public interface IBluetoothA2dp extends IInterface {
    public boolean connect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disconnect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setActiveDevice(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothDevice getActiveDevice(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setAvrcpAbsoluteVolume(int volume, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isA2dpPlaying(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothCodecType> getSupportedCodecTypes() throws android.os.RemoteException;
    public BluetoothCodecStatus getCodecStatus(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setCodecConfigPreference(BluetoothDevice device, BluetoothCodecConfig codecConfig, AttributionSource attributionSource) throws android.os.RemoteException;
    public void enableOptionalCodecs(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void disableOptionalCodecs(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int isOptionalCodecsSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int isOptionalCodecsEnabled(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setOptionalCodecsEnabled(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getDynamicBufferSupport(AttributionSource attributionSource) throws android.os.RemoteException;
    public BufferConstraints getBufferConstraints(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setBufferLengthMillis(int codec, int size, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothA2dp {
        public static IBluetoothA2dp asInterface(IBinder obj) {
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
        public boolean setActiveDevice(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public BluetoothDevice getActiveDevice(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
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
        public void setAvrcpAbsoluteVolume(int volume, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean isA2dpPlaying(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public List<BluetoothCodecType> getSupportedCodecTypes() throws android.os.RemoteException {
            return null;
        }
        @Override
        public BluetoothCodecStatus getCodecStatus(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void setCodecConfigPreference(BluetoothDevice device, BluetoothCodecConfig codecConfig, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void enableOptionalCodecs(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void disableOptionalCodecs(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int isOptionalCodecsSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int isOptionalCodecsEnabled(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void setOptionalCodecsEnabled(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int getDynamicBufferSupport(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public BufferConstraints getBufferConstraints(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean setBufferLengthMillis(int codec, int size, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }

    }
}
