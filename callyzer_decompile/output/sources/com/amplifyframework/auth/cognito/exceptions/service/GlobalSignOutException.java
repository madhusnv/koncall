package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class GlobalSignOutException extends ServiceException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSignOutException(Throwable cause) {
        super("Failed to sign out globally", "See attached exception for more details. GlobalSignOut can be retried using the CognitoIdentityProviderClient accessible from the escape hatch.", cause);
        AbstractC4154l.m8923f(cause, "cause");
    }
}
