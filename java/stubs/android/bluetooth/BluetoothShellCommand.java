package android.bluetooth;

import com.android.modules.utils.BasicShellCommandHandler;
import com.android.server.bluetooth.BluetoothServiceBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class BluetoothShellCommand extends BasicShellCommandHandler {
    public BluetoothShellCommand(Object service) {}
    public int exec(Object service, FileDescriptor in, FileDescriptor out, FileDescriptor err, String[] args) { return 0; }
    public int exec(BluetoothServiceBinder service, FileDescriptor in, FileDescriptor out, FileDescriptor err, String[] args) { return 0; }
}
