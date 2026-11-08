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

public interface IBluetoothVolumeControl extends IInterface {
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isVolumeOffsetAvailable(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getNumberOfVolumeOffsetInstances(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setVolumeOffset(BluetoothDevice device, int instanceId, int volumeOffset, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setGroupVolume(int group_id, int volume, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getGroupVolume(int group_id, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setGroupActive(int group_id, boolean active, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setDeviceVolume(BluetoothDevice device, int volume, boolean isGroupOp, AttributionSource attributionSource) throws android.os.RemoteException;
    public void mute(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void muteGroup(int group_id, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unmute(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unmuteGroup(int group_id, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerCallback(IBluetoothVolumeControlCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterCallback(IBluetoothVolumeControlCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void notifyNewRegisteredCallback(IBluetoothVolumeControlCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getNumberOfAudioInputControlServices(AttributionSource attributionSource, BluetoothDevice device) throws android.os.RemoteException;
    public void registerAudioInputControlCallback(AttributionSource attributionSource, BluetoothDevice device, int instanceId, IAudioInputCallback callback) throws android.os.RemoteException;
    public void unregisterAudioInputControlCallback(AttributionSource attributionSource, BluetoothDevice device, int instanceId, IAudioInputCallback callback) throws android.os.RemoteException;
    public int getAudioInputGainSettingUnit(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public int getAudioInputGainSettingMin(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public int getAudioInputGainSettingMax(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public String getAudioInputDescription(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public boolean isAudioInputDescriptionWritable(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public boolean setAudioInputDescription(AttributionSource attributionSource, BluetoothDevice device, int instanceId, String description) throws android.os.RemoteException;
    public int getAudioInputStatus(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public int getAudioInputType(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public int getAudioInputGainSetting(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public boolean setAudioInputGainSetting(AttributionSource attributionSource, BluetoothDevice device, int instanceId, int gainSetting) throws android.os.RemoteException;
    public int getAudioInputGainMode(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public boolean setAudioInputGainMode(AttributionSource attributionSource, BluetoothDevice device, int instanceId, int gainMode) throws android.os.RemoteException;
    public int getAudioInputMute(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException;
    public boolean setAudioInputMute(AttributionSource attributionSource, BluetoothDevice device, int instanceId, int mute) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothVolumeControl {
        public static IBluetoothVolumeControl asInterface(IBinder obj) {
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
        public boolean isVolumeOffsetAvailable(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getNumberOfVolumeOffsetInstances(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void setVolumeOffset(BluetoothDevice device, int instanceId, int volumeOffset, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setGroupVolume(int group_id, int volume, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int getGroupVolume(int group_id, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void setGroupActive(int group_id, boolean active, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setDeviceVolume(BluetoothDevice device, int volume, boolean isGroupOp, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void mute(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void muteGroup(int group_id, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unmute(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unmuteGroup(int group_id, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void registerCallback(IBluetoothVolumeControlCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterCallback(IBluetoothVolumeControlCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void notifyNewRegisteredCallback(IBluetoothVolumeControlCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int getNumberOfAudioInputControlServices(AttributionSource attributionSource, BluetoothDevice device) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void registerAudioInputControlCallback(AttributionSource attributionSource, BluetoothDevice device, int instanceId, IAudioInputCallback callback) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterAudioInputControlCallback(AttributionSource attributionSource, BluetoothDevice device, int instanceId, IAudioInputCallback callback) throws android.os.RemoteException {
            
        }
        @Override
        public int getAudioInputGainSettingUnit(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getAudioInputGainSettingMin(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getAudioInputGainSettingMax(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public String getAudioInputDescription(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean isAudioInputDescriptionWritable(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setAudioInputDescription(AttributionSource attributionSource, BluetoothDevice device, int instanceId, String description) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getAudioInputStatus(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getAudioInputType(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getAudioInputGainSetting(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setAudioInputGainSetting(AttributionSource attributionSource, BluetoothDevice device, int instanceId, int gainSetting) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getAudioInputGainMode(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setAudioInputGainMode(AttributionSource attributionSource, BluetoothDevice device, int instanceId, int gainMode) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getAudioInputMute(AttributionSource attributionSource, BluetoothDevice device, int instanceId) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setAudioInputMute(AttributionSource attributionSource, BluetoothDevice device, int instanceId, int mute) throws android.os.RemoteException {
            return false;
        }

    }
}
