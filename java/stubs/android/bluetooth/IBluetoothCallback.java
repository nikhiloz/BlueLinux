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

public interface IBluetoothCallback extends IInterface {
    public void onBluetoothStateChange(int prevState, int newState) throws android.os.RemoteException;
    public void onAdapterNameChange(String name) throws android.os.RemoteException;
    public void onAdapterAddressChange(String address) throws android.os.RemoteException;

    abstract class Stub extends android.os.Binder implements IBluetoothCallback {
        public static IBluetoothCallback asInterface(IBinder obj) {
            return null;
        }
        @Override
        public IBinder asBinder() {
            return this;
        }
        @Override
        public void onBluetoothStateChange(int prevState, int newState) throws android.os.RemoteException {
            
        }
        @Override
        public void onAdapterNameChange(String name) throws android.os.RemoteException {
            
        }
        @Override
        public void onAdapterAddressChange(String address) throws android.os.RemoteException {
            
        }

    }
}
