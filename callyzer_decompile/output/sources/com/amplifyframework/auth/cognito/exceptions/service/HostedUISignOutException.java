package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class HostedUISignOutException extends ServiceException {
    public HostedUISignOutException(boolean z6) {
        super("SignOut failed to redirect to the application. Custom Tab authorize cookie may still be valid.", z6 ? "You can retry the Custom Tab Sign Out by launching Custom Tabs with the provided url." : "Unable to provide retry URL. Please check HostedUI Configuration in amplifyconfiguration.json", null, 4, null);
    }
}
