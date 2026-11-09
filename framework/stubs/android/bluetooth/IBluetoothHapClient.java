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

public interface IBluetoothHapClient extends IInterface {
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getHapGroup(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getActivePresetIndex(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothHapPresetInfo getActivePresetInfo(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void selectPreset(BluetoothDevice device, int presetIndex, AttributionSource attributionSource) throws android.os.RemoteException;
    public void selectPresetForGroup(int groupId, int presetIndex, AttributionSource attributionSource) throws android.os.RemoteException;
    public void switchToNextPreset(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void switchToNextPresetForGroup(int groupId, AttributionSource attributionSource) throws android.os.RemoteException;
    public void switchToPreviousPreset(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void switchToPreviousPresetForGroup(int groupId, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothHapPresetInfo getPresetInfo(BluetoothDevice device, int presetIndex, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothHapPresetInfo> getAllPresetInfo(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getFeatures(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setPresetName(BluetoothDevice device, int presetIndex, String name, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setPresetNameForGroup(int groupId, int presetIndex, String name, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerCallback(IBluetoothHapClientCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterCallback(IBluetoothHapClientCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothHapClient {
        public static IBluetoothHapClient asInterface(IBinder obj) {
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
        public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getHapGroup(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getActivePresetIndex(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public BluetoothHapPresetInfo getActivePresetInfo(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void selectPreset(BluetoothDevice device, int presetIndex, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void selectPresetForGroup(int groupId, int presetIndex, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void switchToNextPreset(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void switchToNextPresetForGroup(int groupId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void switchToPreviousPreset(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void switchToPreviousPresetForGroup(int groupId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public BluetoothHapPresetInfo getPresetInfo(BluetoothDevice device, int presetIndex, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public List<BluetoothHapPresetInfo> getAllPresetInfo(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getFeatures(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void setPresetName(BluetoothDevice device, int presetIndex, String name, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setPresetNameForGroup(int groupId, int presetIndex, String name, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void registerCallback(IBluetoothHapClientCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterCallback(IBluetoothHapClientCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }

    }


    int PRESET_INDEX_UNAVAILABLE = -1;
    int FEATURE_BIT_NUM_TYPE_MONAURAL = 0;
    int FEATURE_BIT_NUM_TYPE_BANDED = 1;
    int FEATURE_BIT_NUM_SYNCHRONIZATED_PRESETS = 2;
    int FEATURE_BIT_NUM_INDEPENDENT_PRESETS = 3;
    int FEATURE_BIT_NUM_DYNAMIC_PRESETS = 4;
    int FEATURE_BIT_NUM_WRITABLE_PRESETS = 5;

}
