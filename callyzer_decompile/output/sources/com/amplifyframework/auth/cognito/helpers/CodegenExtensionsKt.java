package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AuthProvider;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CodegenExtensionsKt {
    public static final String getIdentityProviderName(AuthProvider authProvider) {
        AbstractC4154l.m8923f(authProvider, "<this>");
        if (authProvider.equals(AuthProvider.amazon())) {
            return "www.amazon.com";
        }
        if (authProvider.equals(AuthProvider.facebook())) {
            return "graph.facebook.com";
        }
        if (authProvider.equals(AuthProvider.google())) {
            return "accounts.google.com";
        }
        if (authProvider.equals(AuthProvider.apple())) {
            return "appleid.apple.com";
        }
        String providerKey = authProvider.getProviderKey();
        AbstractC4154l.m8922e(providerKey, "getProviderKey(...)");
        return providerKey;
    }

    public static final String getUserPoolProviderName(AuthProvider authProvider) {
        AbstractC4154l.m8923f(authProvider, "<this>");
        if (authProvider.equals(AuthProvider.amazon())) {
            return "LoginWithAmazon";
        }
        if (authProvider.equals(AuthProvider.facebook())) {
            return "Facebook";
        }
        if (authProvider.equals(AuthProvider.google())) {
            return "Google";
        }
        if (authProvider.equals(AuthProvider.apple())) {
            return "SignInWithApple";
        }
        String providerKey = authProvider.getProviderKey();
        AbstractC4154l.m8922e(providerKey, "getProviderKey(...)");
        return providerKey;
    }
}
