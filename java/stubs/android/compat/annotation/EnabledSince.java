package android.compat.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface EnabledSince {
    int targetSdkVersion();
}
