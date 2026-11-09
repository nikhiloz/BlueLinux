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

public interface IBluetoothHeadsetClient extends IInterface {
    public boolean connect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disconnect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean startVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean stopVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothHeadsetClientCall> getCurrentCalls(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public Bundle getCurrentAgEvents(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean acceptCall(BluetoothDevice device, int flag, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean holdCall(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean rejectCall(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean terminateCall(BluetoothDevice device, BluetoothHeadsetClientCall call, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean enterPrivateMode(BluetoothDevice device, int index, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean explicitCallTransfer(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothHeadsetClientCall dial(BluetoothDevice device, String number, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean sendDTMF(BluetoothDevice device, byte code, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean getLastVoiceTagNumber(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getAudioState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean connectAudio(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disconnectAudio(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setAudioRouteAllowed(BluetoothDevice device, boolean allowed, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean getAudioRouteAllowed(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean sendVendorAtCommand(BluetoothDevice device, int vendorId, String atCommand, AttributionSource attributionSource) throws android.os.RemoteException;
    public Bundle getCurrentAgFeatures(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothHeadsetClient {
        public static IBluetoothHeadsetClient asInterface(IBinder obj) {
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
        public boolean startVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean stopVoiceRecognition(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public List<BluetoothHeadsetClientCall> getCurrentCalls(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public Bundle getCurrentAgEvents(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean acceptCall(BluetoothDevice device, int flag, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean holdCall(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean rejectCall(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean terminateCall(BluetoothDevice device, BluetoothHeadsetClientCall call, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean enterPrivateMode(BluetoothDevice device, int index, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean explicitCallTransfer(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public BluetoothHeadsetClientCall dial(BluetoothDevice device, String number, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean sendDTMF(BluetoothDevice device, byte code, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean getLastVoiceTagNumber(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getAudioState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean connectAudio(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean disconnectAudio(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public void setAudioRouteAllowed(BluetoothDevice device, boolean allowed, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean getAudioRouteAllowed(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean sendVendorAtCommand(BluetoothDevice device, int vendorId, String atCommand, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public Bundle getCurrentAgFeatures(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }

    }
}
