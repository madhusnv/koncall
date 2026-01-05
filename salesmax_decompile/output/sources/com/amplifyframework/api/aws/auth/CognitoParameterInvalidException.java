package com.amplifyframework.api.aws.auth;

import p001o.id5;

/* loaded from: classes5.dex */
public final class CognitoParameterInvalidException extends RuntimeException {
    public CognitoParameterInvalidException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ CognitoParameterInvalidException(String str, Throwable th, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
