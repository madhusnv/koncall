package com.amplifyframework.core.model.annotations;

import com.amplifyframework.core.model.Model;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface ModelConfig {
    AuthRule[] authRules() default {};

    boolean hasLazySupport() default false;

    String listPluralName() default "";

    String pluralName() default "";

    String syncPluralName() default "";

    Model.Type type() default Model.Type.USER;

    int version() default 0;
}
