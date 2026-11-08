package android.os;

public class ServiceManager {
    public static class ServiceNotFoundException extends Exception {
        public ServiceNotFoundException(String name) {
            super(name);
        }
    }
}
