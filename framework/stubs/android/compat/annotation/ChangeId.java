package android.compat.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface ChangeId {
    int enabledAfter() default -1;
    int enabledSince() default -1;
    boolean forbidSinceSdk() default false;
}
