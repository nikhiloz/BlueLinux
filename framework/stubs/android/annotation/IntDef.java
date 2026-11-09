package android.annotation;

import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface IntDef {
    int[] value() default {};
    boolean flag() default false;
    boolean open() default false;
    String[] prefix() default {};
    String[] prefixes() default {};
}
