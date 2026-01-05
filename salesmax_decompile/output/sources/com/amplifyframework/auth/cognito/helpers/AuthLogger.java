package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import java.util.Arrays;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthLogger {
    public static final Logger authLogger(Object obj) {
        sq8.m48649h(obj, "<this>");
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.AUTH;
        String str = String.format(AWSCognitoAuthPlugin.AWS_COGNITO_AUTH_LOG_NAMESPACE, Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
        sq8.m48648g(str, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str);
        sq8.m48648g(logger, "logger(...)");
        return logger;
    }
}
