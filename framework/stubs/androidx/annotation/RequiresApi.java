package androidx.annotation;
import java.lang.annotation.*;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface RequiresApi {
    int value() default 1;
    int api() default 1;
}
