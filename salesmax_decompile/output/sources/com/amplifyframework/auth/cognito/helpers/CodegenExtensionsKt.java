package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AuthProvider;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CodegenExtensionsKt {
    public static final String getIdentityProviderName(AuthProvider authProvider) {
        sq8.m48649h(authProvider, "<this>");
        if (sq8.m48644c(authProvider, AuthProvider.amazon())) {
            return "www.amazon.com";
        }
        if (sq8.m48644c(authProvider, AuthProvider.facebook())) {
            return "graph.facebook.com";
        }
        if (sq8.m48644c(authProvider, AuthProvider.google())) {
            return "accounts.google.com";
        }
        if (sq8.m48644c(authProvider, AuthProvider.apple())) {
            return "appleid.apple.com";
        }
        String providerKey = authProvider.getProviderKey();
        sq8.m48648g(providerKey, "getProviderKey(...)");
        return providerKey;
    }

    public static final String getUserPoolProviderName(AuthProvider authProvider) {
        sq8.m48649h(authProvider, "<this>");
        if (sq8.m48644c(authProvider, AuthProvider.amazon())) {
            return "LoginWithAmazon";
        }
        if (sq8.m48644c(authProvider, AuthProvider.facebook())) {
            return "Facebook";
        }
        if (sq8.m48644c(authProvider, AuthProvider.google())) {
            return "Google";
        }
        if (sq8.m48644c(authProvider, AuthProvider.apple())) {
            return "SignInWithApple";
        }
        String providerKey = authProvider.getProviderKey();
        sq8.m48648g(providerKey, "getProviderKey(...)");
        return providerKey;
    }
}
