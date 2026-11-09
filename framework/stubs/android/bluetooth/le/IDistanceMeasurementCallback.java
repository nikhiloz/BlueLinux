package android.bluetooth.le;

import android.bluetooth.BluetoothDevice;
import android.os.IInterface;
import android.os.IBinder;
import android.os.RemoteException;

public interface IDistanceMeasurementCallback extends IInterface {
    void onStarted(BluetoothDevice device) throws RemoteException;
    void onStartFail(BluetoothDevice device, int reason) throws RemoteException;
    void onStopped(BluetoothDevice device, int reason) throws RemoteException;
    void onResult(BluetoothDevice device, DistanceMeasurementResult result) throws RemoteException;

    public abstract class Stub extends android.os.Binder implements IDistanceMeasurementCallback {
        public static IDistanceMeasurementCallback asInterface(IBinder obj) { return null; }
        @Override
        public IBinder asBinder() { return this; }
        @Override
        public void onStarted(BluetoothDevice device) {}
        @Override
        public void onStartFail(BluetoothDevice device, int reason) {}
        @Override
        public void onStopped(BluetoothDevice device, int reason) {}
        @Override
        public void onResult(BluetoothDevice device, DistanceMeasurementResult result) {}
    }
}
