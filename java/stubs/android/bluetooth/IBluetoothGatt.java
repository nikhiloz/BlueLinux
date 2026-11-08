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

public interface IBluetoothGatt extends IInterface {
    public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerClient(ParcelUuid appId, IBluetoothGattCallback callback, boolean eatt_support, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterClient(int clientIf, AttributionSource attributionSource) throws android.os.RemoteException;
    public void clientConnect(int clientIf, String address, int addressType, boolean isDirect, int transport, boolean opportunistic, int phy, AttributionSource attributionSource) throws android.os.RemoteException;
    public void clientDisconnect(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException;
    public void clientSetPreferredPhy(int clientIf, String address, int txPhy, int rxPhy, int phyOptions, AttributionSource attributionSource) throws android.os.RemoteException;
    public void clientReadPhy(int clientIf, String address, AttributionSource attributionSources) throws android.os.RemoteException;
    public void refreshDevice(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException;
    public void discoverServices(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException;
    public void discoverServiceByUuid(int clientIf, String address, ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException;
    public void readCharacteristic(int clientIf, String address, int handle, int authReq, AttributionSource attributionSource) throws android.os.RemoteException;
    public void readUsingCharacteristicUuid(int clientIf, String address, ParcelUuid uuid, int startHandle, int endHandle, int authReq, AttributionSource attributionSource) throws android.os.RemoteException;
    public int writeCharacteristic(int clientIf, String address, int handle, int writeType, int authReq, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException;
    public void readDescriptor(int clientIf, String address, int handle, int authReq, AttributionSource attributionSource) throws android.os.RemoteException;
    public int writeDescriptor(int clientIf, String address, int handle, int authReq, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerForNotification(int clientIf, String address, int handle, boolean enable, AttributionSource attributionSource) throws android.os.RemoteException;
    public void beginReliableWrite(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException;
    public void endReliableWrite(int clientIf, String address, boolean execute, AttributionSource attributionSource) throws android.os.RemoteException;
    public void readRemoteRssi(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException;
    public void configureMTU(int clientIf, String address, int mtu, AttributionSource attributionSource) throws android.os.RemoteException;
    public void connectionParameterUpdate(int clientIf, String address, int connectionPriority, AttributionSource attributionSource) throws android.os.RemoteException;
    public void leConnectionUpdate(int clientIf, String address, int minInterval, int maxInterval, int peripheralLatency, int supervisionTimeout, int minConnectionEventLen, int maxConnectionEventLen, AttributionSource attributionSource) throws android.os.RemoteException;
    public void registerServer(ParcelUuid appId, IBluetoothGattServerCallback callback, boolean eatt_support, AttributionSource attributionSource) throws android.os.RemoteException;
    public void unregisterServer(int serverIf, AttributionSource attributionSource) throws android.os.RemoteException;
    public void serverConnect(int serverIf, String address, int addressType, boolean isDirect, int transport, AttributionSource attributionSource) throws android.os.RemoteException;
    public void serverDisconnect(int serverIf, String address, AttributionSource attributionSource) throws android.os.RemoteException;
    public void serverSetPreferredPhy(int clientIf, String address, int txPhy, int rxPhy, int phyOptions, AttributionSource attributionSource) throws android.os.RemoteException;
    public void serverReadPhy(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException;
    public void addService(int serverIf, BluetoothGattService service, AttributionSource attributionSource) throws android.os.RemoteException;
    public void removeService(int serverIf, int handle, AttributionSource attributionSource) throws android.os.RemoteException;
    public void clearServices(int serverIf, AttributionSource attributionSource) throws android.os.RemoteException;
    public void sendResponse(int serverIf, String address, int requestId, int status, int offset, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException;
    public int sendNotification(int serverIf, String address, int handle, boolean confirm, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException;
    public void disconnectAll(AttributionSource attributionSource) throws android.os.RemoteException;
    public int subrateModeRequest(int clientIf, BluetoothDevice device, int subrateMode, AttributionSource attributionSource) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothGatt {
        public static IBluetoothGatt asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states, AttributionSource attributionSource) throws android.os.RemoteException {
            return null;
        }
        @Override
        public void registerClient(ParcelUuid appId, IBluetoothGattCallback callback, boolean eatt_support, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterClient(int clientIf, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void clientConnect(int clientIf, String address, int addressType, boolean isDirect, int transport, boolean opportunistic, int phy, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void clientDisconnect(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void clientSetPreferredPhy(int clientIf, String address, int txPhy, int rxPhy, int phyOptions, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void clientReadPhy(int clientIf, String address, AttributionSource attributionSources) throws android.os.RemoteException {
            
        }
        @Override
        public void refreshDevice(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void discoverServices(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void discoverServiceByUuid(int clientIf, String address, ParcelUuid uuid, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void readCharacteristic(int clientIf, String address, int handle, int authReq, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void readUsingCharacteristicUuid(int clientIf, String address, ParcelUuid uuid, int startHandle, int endHandle, int authReq, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int writeCharacteristic(int clientIf, String address, int handle, int writeType, int authReq, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void readDescriptor(int clientIf, String address, int handle, int authReq, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int writeDescriptor(int clientIf, String address, int handle, int authReq, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void registerForNotification(int clientIf, String address, int handle, boolean enable, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void beginReliableWrite(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void endReliableWrite(int clientIf, String address, boolean execute, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void readRemoteRssi(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void configureMTU(int clientIf, String address, int mtu, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void connectionParameterUpdate(int clientIf, String address, int connectionPriority, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void leConnectionUpdate(int clientIf, String address, int minInterval, int maxInterval, int peripheralLatency, int supervisionTimeout, int minConnectionEventLen, int maxConnectionEventLen, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void registerServer(ParcelUuid appId, IBluetoothGattServerCallback callback, boolean eatt_support, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void unregisterServer(int serverIf, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void serverConnect(int serverIf, String address, int addressType, boolean isDirect, int transport, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void serverDisconnect(int serverIf, String address, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void serverSetPreferredPhy(int clientIf, String address, int txPhy, int rxPhy, int phyOptions, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void serverReadPhy(int clientIf, String address, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void addService(int serverIf, BluetoothGattService service, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void removeService(int serverIf, int handle, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void clearServices(int serverIf, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public void sendResponse(int serverIf, String address, int requestId, int status, int offset, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int sendNotification(int serverIf, String address, int handle, boolean confirm, byte[] value, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }
        @Override
        public void disconnectAll(AttributionSource attributionSource) throws android.os.RemoteException {
            
        }
        @Override
        public int subrateModeRequest(int clientIf, BluetoothDevice device, int subrateMode, AttributionSource attributionSource) throws android.os.RemoteException {
            return 0;
        }

    }
}
