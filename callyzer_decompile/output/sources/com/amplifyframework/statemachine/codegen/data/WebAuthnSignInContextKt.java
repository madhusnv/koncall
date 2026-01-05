package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.exceptions.InvalidStateException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnSignInContextKt {
    public static final String requireRequestJson(WebAuthnSignInContext webAuthnSignInContext) throws InvalidStateException {
        AbstractC4154l.m8923f(webAuthnSignInContext, "<this>");
        String requestJson = webAuthnSignInContext.getRequestJson();
        if (requestJson != null) {
            return requestJson;
        }
        throw new InvalidStateException("Missing request json", null, null, 6, null);
    }

    public static final String requireResponseJson(WebAuthnSignInContext webAuthnSignInContext) throws InvalidStateException {
        AbstractC4154l.m8923f(webAuthnSignInContext, "<this>");
        String responseJson = webAuthnSignInContext.getResponseJson();
        if (responseJson != null) {
            return responseJson;
        }
        throw new InvalidStateException("Missing response json", null, null, 6, null);
    }
}
