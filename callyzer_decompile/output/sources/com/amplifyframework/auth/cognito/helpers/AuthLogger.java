package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthLogger {
    public static final Logger authLogger(Object obj) {
        AbstractC4154l.m8923f(obj, "<this>");
        Logger logger = Amplify.Logging.logger(CategoryType.AUTH, String.format(AWSCognitoAuthPlugin.AWS_COGNITO_AUTH_LOG_NAMESPACE, Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        return logger;
    }
}
