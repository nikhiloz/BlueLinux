package android.annotation;
import java.lang.annotation.*;
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface SystemApi {
    enum Client {
        PRIVILEGED_APPS,
        MODULE_LIBRARIES
    }
    Client client() default Client.PRIVILEGED_APPS;
}
