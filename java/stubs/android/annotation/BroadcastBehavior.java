package android.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface BroadcastBehavior {
    boolean distinct() default false;
    boolean privileged() default false;
    boolean exposedToInstantApps() default false;
    boolean registeredOnly() default false;
    boolean protectedBroadcast() default false;
}
