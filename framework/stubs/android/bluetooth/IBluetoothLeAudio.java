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

public interface IBluetoothLeAudio extends IInterface {
    public boolean connect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean disconnect(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setActiveDevice(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getActiveDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setConnectionPolicy(BluetoothDevice device, int connectionPolicy, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionPolicy(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothDevice getConnectedGroupLeadDevice(int groupId, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothLeAudioCodecStatus getCodecStatus(int groupId, AttributionSource source) throws android.os.RemoteException;
    public void setCodecConfigPreference(int groupId, BluetoothLeAudioCodecConfig inputCodecConfig, BluetoothLeAudioCodecConfig outputCodecConfig, AttributionSource source) throws android.os.RemoteException;
    public void setBroadcastToUnicastFallbackGroup(int groupId, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getBroadcastToUnicastFallbackGroup(AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerCallback(IBluetoothLeAudioCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterCallback(IBluetoothLeAudioCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setCcidInformation(ParcelUuid userUuid, int ccid, int contextType, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setInCall(boolean inCall, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setInactiveForHfpHandover(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getGroupId(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setVolume(int volume, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean groupAddNode(int group_id, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean groupRemoveNode(int group_id, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getAudioLocation(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isInbandRingtoneEnabled(AttributionSource attributionSource, int groupId) throws android.os.RemoteException;
    public void registerLeBroadcastCallback(IBluetoothLeBroadcastCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterLeBroadcastCallback(IBluetoothLeBroadcastCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void startBroadcast(BluetoothLeBroadcastSettings broadcastSettings, AttributionSource attributionSource) throws android.os.RemoteException;
    public void stopBroadcast(int broadcastId, AttributionSource attributionSource) throws android.os.RemoteException;
    public void updateBroadcast(int broadcastId, BluetoothLeBroadcastSettings broadcastSettings, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isPlaying(int broadcastId, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothLeBroadcastMetadata> getAllBroadcastMetadata(AttributionSource attributionSource) throws android.os.RemoteException;
    public int getMaximumNumberOfBroadcasts() throws android.os.RemoteException;
    public int getMaximumStreamsPerBroadcast() throws android.os.RemoteException;
    public int getMaximumSubgroupsPerBroadcast() throws android.os.RemoteException;
    public boolean isBroadcastActive(AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothLeAudio {
        public static IBluetoothLeAudio asInterface(IBinder obj) {
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
        public List<BluetoothDevice> getActiveDevices(AttributionSource attributionSource) throws android.os.RemoteException {
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
        public BluetoothDevice getConnectedGroupLeadDevice(int groupId, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public BluetoothLeAudioCodecStatus getCodecStatus(int groupId, AttributionSource source) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void setCodecConfigPreference(int groupId, BluetoothLeAudioCodecConfig inputCodecConfig, BluetoothLeAudioCodecConfig outputCodecConfig, AttributionSource source) throws android.os.RemoteException {
            
        }
        @Override
        public void setBroadcastToUnicastFallbackGroup(int groupId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int getBroadcastToUnicastFallbackGroup(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void registerCallback(IBluetoothLeAudioCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterCallback(IBluetoothLeAudioCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setCcidInformation(ParcelUuid userUuid, int ccid, int contextType, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setInCall(boolean inCall, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void setInactiveForHfpHandover(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int getGroupId(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void setVolume(int volume, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean groupAddNode(int group_id, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean groupRemoveNode(int group_id, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getAudioLocation(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean isInbandRingtoneEnabled(AttributionSource attributionSource, int groupId) throws android.os.RemoteException {
            return false;
        }
        @Override
        public void registerLeBroadcastCallback(IBluetoothLeBroadcastCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterLeBroadcastCallback(IBluetoothLeBroadcastCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void startBroadcast(BluetoothLeBroadcastSettings broadcastSettings, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void stopBroadcast(int broadcastId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void updateBroadcast(int broadcastId, BluetoothLeBroadcastSettings broadcastSettings, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean isPlaying(int broadcastId, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public List<BluetoothLeBroadcastMetadata> getAllBroadcastMetadata(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getMaximumNumberOfBroadcasts() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getMaximumStreamsPerBroadcast() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getMaximumSubgroupsPerBroadcast() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean isBroadcastActive(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }

    }


    int GROUP_STATUS_ACTIVE = 1;
    int GROUP_STATUS_INACTIVE = 2;
    int GROUP_STREAM_STATUS_IDLE = 0;
    int GROUP_STREAM_STATUS_STREAMING = 1;
    int LE_AUDIO_GROUP_ID_INVALID = -1;

}
