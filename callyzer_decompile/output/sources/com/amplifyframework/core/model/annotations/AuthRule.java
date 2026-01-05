package com.amplifyframework.core.model.annotations;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.ModelOperation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface AuthRule {
    AuthStrategy allow();

    String groupClaim() default "";

    String[] groups() default {};

    String groupsField() default "";

    String identityClaim() default "";

    ModelOperation[] operations() default {};

    String ownerField() default "";

    String provider() default "";
}
