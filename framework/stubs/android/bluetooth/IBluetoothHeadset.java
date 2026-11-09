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

public interface IBluetoothHeadset extends IInterface {
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean startVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean stopVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isAudioConnected(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean sendVendorSpecificResultCode(BluetoothDevice device, String command, String arg, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean connect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disconnect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getAudioState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int connectAudio(AttributionSource attributionSource) throws android.os.RemoteException;
    public int disconnectAudio(AttributionSource attributionSource) throws android.os.RemoteException;
    public void setAudioRouteAllowed(boolean allowed, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean getAudioRouteAllowed(AttributionSource attributionSource) throws android.os.RemoteException;
    public void setForceScoAudio(boolean forced, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean startScoUsingVirtualVoiceCall(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean stopScoUsingVirtualVoiceCall(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setActiveDevice(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothDevice getActiveDevice(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isInbandRingingEnabled(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isNoiseReductionSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isVoiceRecognitionSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothHeadset {
        public static IBluetoothHeadset asInterface(IBinder obj) {
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
        public boolean startVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean stopVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isAudioConnected(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean sendVendorSpecificResultCode(BluetoothDevice device, String command, String arg, AttributionSource attributionSource) throws android.os.RemoteException {
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
        public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getAudioState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int connectAudio(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int disconnectAudio(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void setAudioRouteAllowed(boolean allowed, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean getAudioRouteAllowed(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public void setForceScoAudio(boolean forced, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean startScoUsingVirtualVoiceCall(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean stopScoUsingVirtualVoiceCall(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
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
        public boolean isInbandRingingEnabled(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isNoiseReductionSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isVoiceRecognitionSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }

    }
}
