package android.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface BinderThread {}
