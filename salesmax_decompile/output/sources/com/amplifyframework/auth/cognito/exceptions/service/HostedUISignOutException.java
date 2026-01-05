package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* loaded from: classes5.dex */
public class HostedUISignOutException extends ServiceException {
    public HostedUISignOutException(boolean z) {
        super("SignOut failed to redirect to the application. Custom Tab authorize cookie may still be valid.", z ? "You can retry the Custom Tab Sign Out by launching Custom Tabs with the provided url." : "Unable to provide retry URL. Please check HostedUI Configuration in amplifyconfiguration.json", null, 4, null);
    }
}
