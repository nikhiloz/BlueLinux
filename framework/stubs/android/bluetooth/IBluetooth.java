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

public interface IBluetooth extends IInterface {
    public int getState() throws android.os.RemoteException;
    public void offToBleOn(boolean quietMode, AttributionSource attributionSource) throws android.os.RemoteException;
    public void onToBleOn(AttributionSource attributionSource) throws android.os.RemoteException;
    public String getAddress(AttributionSource attributionSource) throws android.os.RemoteException;
    public List<ParcelUuid> getUuids(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setName(String name, AttributionSource attributionSource) throws android.os.RemoteException;
    public String getIdentityAddress(String address) throws android.os.RemoteException;
    public BluetoothDevice.BluetoothAddress getIdentityAddressWithType(String address) throws android.os.RemoteException;
    public String getName(AttributionSource attributionSource) throws android.os.RemoteException;
    public int getNameLengthForAdvertise(AttributionSource attributionSource) throws android.os.RemoteException;
    public int getScanMode(AttributionSource attributionSource) throws android.os.RemoteException;
    public int setScanMode(int mode, AttributionSource attributionSource) throws android.os.RemoteException;
    public long getDiscoverableTimeout(AttributionSource attributionSource) throws android.os.RemoteException;
    public int setDiscoverableTimeout(long timeout, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean startDiscovery(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean cancelDiscovery(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isDiscovering(AttributionSource attributionSource) throws android.os.RemoteException;
    public long getDiscoveryEndMillis(AttributionSource attributionSource) throws android.os.RemoteException;
    public int getAdapterConnectionState() throws android.os.RemoteException;
    public int getProfileConnectionState(int profile, AttributionSource source) throws android.os.RemoteException;
    public List<BluetoothDevice> getBondedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean createBond(BluetoothDevice device, int transport, OobData p192Data, OobData p256Data, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean cancelBondProcess(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean removeBond(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getBondState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isBondingInitiatedLocally(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public long getSupportedProfiles(AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getConnectionHandle(BluetoothDevice device, int transport, AttributionSource attributionSource) throws android.os.RemoteException;
    public String getRemoteName(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getRemoteType(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public String getRemoteAlias(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int setRemoteAlias(BluetoothDevice device, String name, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getRemoteClass(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<ParcelUuid> getRemoteUuids(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean fetchRemoteUuids(BluetoothDevice device, int transport, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean sdpSearch(BluetoothDevice device, ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getBatteryLevel(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getMaxConnectedAudioDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setPin(BluetoothDevice device, boolean accept, int len, byte[] pinCode, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setPasskey(BluetoothDevice device, boolean accept, int len, byte[] passkey, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setPairingConfirmation(BluetoothDevice device, boolean accept, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getPhonebookAccessPermission(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setSilenceMode(BluetoothDevice device, boolean silence, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean getSilenceMode(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setPhonebookAccessPermission(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getMessageAccessPermission(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setMessageAccessPermission(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException;
    public int getSimAccessPermission(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setSimAccessPermission(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerCallback(IBluetoothCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterCallback(IBluetoothCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void logL2capcocServerConnection(BluetoothDevice device, int port, boolean isSecured, int result, long socketCreationTimeMillis, long socketCreationLatencyMillis, long socketConnectionTimeMillis, long timeoutMillis) throws android.os.RemoteException;
    public IBluetoothSocketManager getSocketManager() throws android.os.RemoteException;
    public void logL2capcocClientConnection(BluetoothDevice device, int port, boolean isSecured, int result, long socketCreationTimeNanos, long socketCreationLatencyNanos, long socketConnectionTimeNanos) throws android.os.RemoteException;
    public void logRfcommConnectionAttempt(BluetoothDevice device, boolean isSecured, int resultCode, long socketCreationTimeNanos, boolean isSerialPort) throws android.os.RemoteException;
    public boolean factoryReset(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isMultiAdvertisementSupported() throws android.os.RemoteException;
    public boolean isOffloadedFilteringSupported() throws android.os.RemoteException;
    public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException;
    public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException;
    public boolean isLe2MPhySupported() throws android.os.RemoteException;
    public boolean isLeCodedPhySupported() throws android.os.RemoteException;
    public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException;
    public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException;
    public int isLeAudioSupported() throws android.os.RemoteException;
    public int isLeAudioBroadcastSourceSupported() throws android.os.RemoteException;
    public int isLeAudioBroadcastAssistantSupported() throws android.os.RemoteException;
    public int isDistanceMeasurementSupported(AttributionSource attributionSource) throws android.os.RemoteException;
    public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException;
    public BluetoothActivityEnergyInfo reportActivityInfo(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean registerMetadataListener(IBluetoothMetadataListener listener, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean unregisterMetadataListener(IBluetoothMetadataListener listener, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setMetadata(BluetoothDevice device, int key, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException;
    public byte[] getMetadata(BluetoothDevice device, int key, AttributionSource attributionSource) throws android.os.RemoteException;
    public void requestActivityInfo(IBluetoothActivityEnergyInfoListener listener, AttributionSource attributionSource) throws android.os.RemoteException;
    public void bleOnToOn(AttributionSource attributionSource) throws android.os.RemoteException;
    public void bleOnToOff(AttributionSource attributionSource) throws android.os.RemoteException;
    public int connectAllEnabledProfiles(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int disconnectAllEnabledProfiles(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean setActiveDevice(BluetoothDevice device, int profiles, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getActiveDevices(int profile, AttributionSource attributionSource) throws android.os.RemoteException;
    public List<BluetoothDevice> getMostRecentlyConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean removeActiveDevice(int profiles, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerBluetoothConnectionCallback(IBluetoothConnectionCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterBluetoothConnectionCallback(IBluetoothConnectionCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean canBondWithoutDialog(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public String getPackageNameOfBondingApplication(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public void generateLocalOobData(int transport, IBluetoothOobDataCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean allowLowLatencyAudio(boolean allowed, BluetoothDevice device) throws android.os.RemoteException;
    public int isRequestAudioPolicyAsSinkSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int requestAudioPolicyAsSink(BluetoothDevice device, BluetoothSinkAudioPolicy policies, AttributionSource attributionSource) throws android.os.RemoteException;
    public BluetoothSinkAudioPolicy getRequestedAudioPolicyAsSink(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int startRfcommListener(String name, ParcelUuid uuid, PendingIntent intent, AttributionSource attributionSource) throws android.os.RemoteException;
    public int stopRfcommListener(ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException;
    public IncomingRfcommSocketInfo retrievePendingSocketForServiceRecord(ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException;
    public void setForegroundUserId(int userId, AttributionSource attributionSource) throws android.os.RemoteException;
    public int setPreferredAudioProfiles(BluetoothDevice device, Bundle modeToProfileBundle, AttributionSource source) throws android.os.RemoteException;
    public Bundle getPreferredAudioProfiles(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException;
    public int isDualModeAudioEnabled(AttributionSource attributionSource) throws android.os.RemoteException;
    public int registerPreferredAudioProfilesChangedCallback(IBluetoothPreferredAudioProfilesCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public int unregisterPreferredAudioProfilesChangedCallback(IBluetoothPreferredAudioProfilesCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public int notifyActiveDeviceChangeApplied(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException;
    public int registerBluetoothQualityReportReadyCallback(IBluetoothQualityReportReadyCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public int unregisterBluetoothQualityReportReadyCallback(IBluetoothQualityReportReadyCallback callback, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerHciVendorSpecificCallback(IBluetoothHciVendorSpecificCallback callback, int[] eventCodes) throws android.os.RemoteException;
    public void unregisterHciVendorSpecificCallback(IBluetoothHciVendorSpecificCallback callback) throws android.os.RemoteException;
    public void sendHciVendorSpecificCommand(int ocf, byte[] parameters, IBluetoothHciVendorSpecificCallback callback) throws android.os.RemoteException;
    public int getOffloadedTransportDiscoveryDataScanSupported(AttributionSource attributionSource) throws android.os.RemoteException;
    public boolean isMediaProfileConnected(AttributionSource attributionSource) throws android.os.RemoteException;
    public IBinder getBluetoothGatt() throws android.os.RemoteException;
    public IBinder getBluetoothScan() throws android.os.RemoteException;
    public void unregAllGattClient(AttributionSource attributionSource) throws android.os.RemoteException;
    public IBinder getProfile(int profile) throws android.os.RemoteException;
    public int setActiveAudioDevicePolicy(BluetoothDevice device, int activeAudioDevicePolicy, AttributionSource source) throws android.os.RemoteException;
    public int getActiveAudioDevicePolicy(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException;
    public int setMicrophonePreferredForCalls(BluetoothDevice device, boolean enabled, AttributionSource source) throws android.os.RemoteException;
    public boolean isMicrophonePreferredForCalls(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException;
    public void killBluetoothProcess() throws android.os.RemoteException;
    public boolean isLeCocSocketOffloadSupported(AttributionSource source) throws android.os.RemoteException;
    public boolean isRfcommSocketOffloadSupported(AttributionSource source) throws android.os.RemoteException;
    public IBinder getBluetoothAdvertise() throws android.os.RemoteException;
    public IBinder getDistanceMeasurement() throws android.os.RemoteException;
    public int getKeyMissingCount(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetooth {
        public static IBluetooth asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public int getState() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void offToBleOn(boolean quietMode, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void onToBleOn(AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public String getAddress(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public List<ParcelUuid> getUuids(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean setName(String name, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public String getIdentityAddress(String address) throws android.os.RemoteException {
            return null;
        }
        @Override
        public BluetoothDevice.BluetoothAddress getIdentityAddressWithType(String address) throws android.os.RemoteException {
            return null;
        }
        @Override
        public String getName(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getNameLengthForAdvertise(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getScanMode(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int setScanMode(int mode, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public long getDiscoverableTimeout(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int setDiscoverableTimeout(long timeout, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean startDiscovery(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean cancelDiscovery(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isDiscovering(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public long getDiscoveryEndMillis(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getAdapterConnectionState() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getProfileConnectionState(int profile, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public List<BluetoothDevice> getBondedDevices(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean createBond(BluetoothDevice device, int transport, OobData p192Data, OobData p256Data, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean cancelBondProcess(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean removeBond(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getBondState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean isBondingInitiatedLocally(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public long getSupportedProfiles(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getConnectionState(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getConnectionHandle(BluetoothDevice device, int transport, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public String getRemoteName(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getRemoteType(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public String getRemoteAlias(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int setRemoteAlias(BluetoothDevice device, String name, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getRemoteClass(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public List<ParcelUuid> getRemoteUuids(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean fetchRemoteUuids(BluetoothDevice device, int transport, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean sdpSearch(BluetoothDevice device, ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getBatteryLevel(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getMaxConnectedAudioDevices(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setPin(BluetoothDevice device, boolean accept, int len, byte[] pinCode, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setPasskey(BluetoothDevice device, boolean accept, int len, byte[] passkey, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setPairingConfirmation(BluetoothDevice device, boolean accept, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getPhonebookAccessPermission(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setSilenceMode(BluetoothDevice device, boolean silence, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean getSilenceMode(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setPhonebookAccessPermission(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getMessageAccessPermission(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setMessageAccessPermission(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int getSimAccessPermission(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setSimAccessPermission(BluetoothDevice device, int value, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public void registerCallback(IBluetoothCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterCallback(IBluetoothCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void logL2capcocServerConnection(BluetoothDevice device, int port, boolean isSecured, int result, long socketCreationTimeMillis, long socketCreationLatencyMillis, long socketConnectionTimeMillis, long timeoutMillis) throws android.os.RemoteException {
            
        }
        @Override
        public IBluetoothSocketManager getSocketManager() throws android.os.RemoteException {
            return null;
        }
        @Override
        public void logL2capcocClientConnection(BluetoothDevice device, int port, boolean isSecured, int result, long socketCreationTimeNanos, long socketCreationLatencyNanos, long socketConnectionTimeNanos) throws android.os.RemoteException {
            
        }
        @Override
        public void logRfcommConnectionAttempt(BluetoothDevice device, boolean isSecured, int resultCode, long socketCreationTimeNanos, boolean isSerialPort) throws android.os.RemoteException {
            
        }
        @Override
        public boolean factoryReset(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isMultiAdvertisementSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isOffloadedFilteringSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isOffloadedScanBatchingSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isActivityAndEnergyReportingSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isLe2MPhySupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isLeCodedPhySupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isLeExtendedAdvertisingSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isLePeriodicAdvertisingSupported() throws android.os.RemoteException {
            return false;
        }
        @Override
        public int isLeAudioSupported() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int isLeAudioBroadcastSourceSupported() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int isLeAudioBroadcastAssistantSupported() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int isDistanceMeasurementSupported(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getLeMaximumAdvertisingDataLength() throws android.os.RemoteException {
            return 0;
        }
        @Override
        public BluetoothActivityEnergyInfo reportActivityInfo(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean registerMetadataListener(IBluetoothMetadataListener listener, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean unregisterMetadataListener(IBluetoothMetadataListener listener, BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean setMetadata(BluetoothDevice device, int key, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public byte[] getMetadata(BluetoothDevice device, int key, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void requestActivityInfo(IBluetoothActivityEnergyInfoListener listener, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void bleOnToOn(AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void bleOnToOff(AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int connectAllEnabledProfiles(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int disconnectAllEnabledProfiles(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean setActiveDevice(BluetoothDevice device, int profiles, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public List<BluetoothDevice> getActiveDevices(int profile, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public List<BluetoothDevice> getMostRecentlyConnectedDevices(AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public boolean removeActiveDevice(int profiles, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public void registerBluetoothConnectionCallback(IBluetoothConnectionCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterBluetoothConnectionCallback(IBluetoothConnectionCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean canBondWithoutDialog(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public String getPackageNameOfBondingApplication(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void generateLocalOobData(int transport, IBluetoothOobDataCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public boolean allowLowLatencyAudio(boolean allowed, BluetoothDevice device) throws android.os.RemoteException {
            return false;
        }
        @Override
        public int isRequestAudioPolicyAsSinkSupported(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int requestAudioPolicyAsSink(BluetoothDevice device, BluetoothSinkAudioPolicy policies, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public BluetoothSinkAudioPolicy getRequestedAudioPolicyAsSink(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int startRfcommListener(String name, ParcelUuid uuid, PendingIntent intent, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int stopRfcommListener(ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public IncomingRfcommSocketInfo retrievePendingSocketForServiceRecord(ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void setForegroundUserId(int userId, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int setPreferredAudioProfiles(BluetoothDevice device, Bundle modeToProfileBundle, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public Bundle getPreferredAudioProfiles(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int isDualModeAudioEnabled(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int registerPreferredAudioProfilesChangedCallback(IBluetoothPreferredAudioProfilesCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int unregisterPreferredAudioProfilesChangedCallback(IBluetoothPreferredAudioProfilesCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int notifyActiveDeviceChangeApplied(BluetoothDevice device, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int registerBluetoothQualityReportReadyCallback(IBluetoothQualityReportReadyCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int unregisterBluetoothQualityReportReadyCallback(IBluetoothQualityReportReadyCallback callback, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void registerHciVendorSpecificCallback(IBluetoothHciVendorSpecificCallback callback, int[] eventCodes) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterHciVendorSpecificCallback(IBluetoothHciVendorSpecificCallback callback) throws android.os.RemoteException {
            
        }
        @Override
        public void sendHciVendorSpecificCommand(int ocf, byte[] parameters, IBluetoothHciVendorSpecificCallback callback) throws android.os.RemoteException {
            
        }
        @Override
        public int getOffloadedTransportDiscoveryDataScanSupported(AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean isMediaProfileConnected(AttributionSource attributionSource) throws android.os.RemoteException {
            return false;
        }
        @Override
        public IBinder getBluetoothGatt() throws android.os.RemoteException {
            return null;
        }
        @Override
        public IBinder getBluetoothScan() throws android.os.RemoteException {
            return null;
        }
        @Override
        public void unregAllGattClient(AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public IBinder getProfile(int profile) throws android.os.RemoteException {
            return null;
        }
        @Override
        public int setActiveAudioDevicePolicy(BluetoothDevice device, int activeAudioDevicePolicy, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int getActiveAudioDevicePolicy(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public int setMicrophonePreferredForCalls(BluetoothDevice device, boolean enabled, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public boolean isMicrophonePreferredForCalls(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException {
            return false;
        }
        @Override
        public void killBluetoothProcess() throws android.os.RemoteException {
            
        }
        @Override
        public boolean isLeCocSocketOffloadSupported(AttributionSource source) throws android.os.RemoteException {
            return false;
        }
        @Override
        public boolean isRfcommSocketOffloadSupported(AttributionSource source) throws android.os.RemoteException {
            return false;
        }
        @Override
        public IBinder getBluetoothAdvertise() throws android.os.RemoteException {
            return null;
        }
        @Override
        public IBinder getDistanceMeasurement() throws android.os.RemoteException {
            return null;
        }
        @Override
        public int getKeyMissingCount(BluetoothDevice device, AttributionSource source) throws android.os.RemoteException {
            return 0;
        }

    }


}
