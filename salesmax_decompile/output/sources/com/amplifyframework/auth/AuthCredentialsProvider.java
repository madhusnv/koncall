package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalApiWarning;
import com.amplifyframework.core.Consumer;
import p001o.n64;
import p001o.qc4;
import p001o.qx0;

@InternalApiWarning
/* loaded from: classes5.dex */
public interface AuthCredentialsProvider extends qc4 {
    void getAccessToken(Consumer<String> consumer, Consumer<Exception> consumer2);

    Object getIdentityId(n64 n64Var);

    @Override // p001o.qc4, p001o.nb8
    /* synthetic */ Object resolve(qx0 qx0Var, n64 n64Var);
}
