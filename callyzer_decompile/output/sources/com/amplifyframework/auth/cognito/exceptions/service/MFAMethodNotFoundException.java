package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MFAMethodNotFoundException extends ServiceException {
    public MFAMethodNotFoundException(Throwable th2) {
        super("Could not find multi-factor authentication (MFA) method.", "Configure multi-factor authentication using Amplify CLI or AWS Cognito console.", th2);
    }
}
