package android.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface IntRange {
    long from() default Long.MIN_VALUE;
    long to() default Long.MAX_VALUE;
}
