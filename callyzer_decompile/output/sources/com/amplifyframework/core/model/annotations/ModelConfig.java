package com.amplifyframework.core.model.annotations;

import com.amplifyframework.core.model.Model;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface ModelConfig {
    AuthRule[] authRules() default {};

    boolean hasLazySupport() default false;

    String listPluralName() default "";

    String pluralName() default "";

    String syncPluralName() default "";

    Model.Type type() default Model.Type.USER;

    int version() default 0;
}
