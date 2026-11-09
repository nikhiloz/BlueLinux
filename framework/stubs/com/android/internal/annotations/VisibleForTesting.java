package com.android.internal.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface VisibleForTesting {
    enum Visibility {
        PRIVATE,
        PROTECTED,
        PACKAGE,
        NONE
    }
    Visibility visibility() default Visibility.PRIVATE;
}
