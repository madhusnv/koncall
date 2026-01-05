package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class MFAMethodNotFoundException extends ServiceException {
    public MFAMethodNotFoundException(Throwable th) {
        super("Could not find multi-factor authentication (MFA) method.", "Configure multi-factor authentication using Amplify CLI or AWS Cognito console.", th);
    }
}
