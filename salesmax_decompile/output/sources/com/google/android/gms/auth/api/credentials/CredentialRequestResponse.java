package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Response;

@Deprecated
/* loaded from: classes5.dex */
public class CredentialRequestResponse extends Response<CredentialRequestResult> {
    public Credential getCredential() {
        return getResult().getCredential();
    }
}
