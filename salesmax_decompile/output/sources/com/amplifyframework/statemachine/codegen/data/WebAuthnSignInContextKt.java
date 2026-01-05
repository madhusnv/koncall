package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.exceptions.InvalidStateException;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class WebAuthnSignInContextKt {
    public static final String requireRequestJson(WebAuthnSignInContext webAuthnSignInContext) throws InvalidStateException {
        sq8.m48649h(webAuthnSignInContext, "<this>");
        String requestJson = webAuthnSignInContext.getRequestJson();
        if (requestJson != null) {
            return requestJson;
        }
        throw new InvalidStateException("Missing request json", null, null, 6, null);
    }

    public static final String requireResponseJson(WebAuthnSignInContext webAuthnSignInContext) throws InvalidStateException {
        sq8.m48649h(webAuthnSignInContext, "<this>");
        String responseJson = webAuthnSignInContext.getResponseJson();
        if (responseJson != null) {
            return responseJson;
        }
        throw new InvalidStateException("Missing response json", null, null, 6, null);
    }
}
