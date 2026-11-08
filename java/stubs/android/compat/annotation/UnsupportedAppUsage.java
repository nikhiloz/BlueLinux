package android.compat.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
public @interface UnsupportedAppUsage {
    int maxTargetSdk() default 0;
    String publicAlternatives() default "";
    long trackingBug() default 0L;
    int expectedRestrictionLevel() default 0;
}
