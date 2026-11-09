package android.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface FloatRange {
    double from() default Double.NEGATIVE_INFINITY;
    double to() default Double.POSITIVE_INFINITY;
    boolean fromInclusive() default true;
    boolean toInclusive() default true;
}
