package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import p001o.sq8;

/* loaded from: classes5.dex */
public class GlobalSignOutException extends ServiceException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSignOutException(Throwable th) {
        super("Failed to sign out globally", "See attached exception for more details. GlobalSignOut can be retried using the CognitoIdentityProviderClient accessible from the escape hatch.", th);
        sq8.m48649h(th, "cause");
    }
}
