package android.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface SdkConstant {
    enum SdkConstantType {
        ACTIVITY_INTENT_ACTION,
        BROADCAST_INTENT_ACTION,
        SERVICE_ACTION,
        INTENT_CATEGORY,
        FEATURE
    }
    SdkConstantType value();
}
