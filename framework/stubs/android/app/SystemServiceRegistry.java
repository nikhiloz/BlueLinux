package android.app;
public class SystemServiceRegistry {
    public static <T> void registerContextAwareService(String serviceName, Class<T> serviceClass, android.app.SystemServiceRegistry.ContextAwareServiceProducer<T> producer) {}
    public interface ContextAwareServiceProducer<T> {
        T createService(android.content.Context context) throws android.os.ServiceManager.ServiceNotFoundException;
    }
}
