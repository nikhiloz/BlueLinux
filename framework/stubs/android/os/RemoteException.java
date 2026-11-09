package android.os;

public class RemoteException extends Exception {
    public RemoteException() {
        super();
    }

    public RemoteException(String message) {
        super(message);
    }

    public RemoteException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeException rethrowAsRuntimeException() {
        return new RuntimeException(this);
    }

    public RuntimeException rethrowFromSystemServer() {
        return new RuntimeException(this);
    }
}
