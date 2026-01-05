package com.amplifyframework.api.aws.auth;

import com.amplifyframework.api.aws.sigv4.ApiKeyAuthProvider;
import p001o.ule;

/* loaded from: classes5.dex */
public final class ApiKeyRequestDecorator implements RequestDecorator {
    private static final String X_API_KEY = "x-api-key";
    private final ApiKeyAuthProvider apiKeyProvider;

    public ApiKeyRequestDecorator(ApiKeyAuthProvider apiKeyAuthProvider) {
        this.apiKeyProvider = apiKeyAuthProvider;
    }

    @Override // com.amplifyframework.api.aws.auth.RequestDecorator
    public ule decorate(ule uleVar) {
        return uleVar.m51738i().m51745a(X_API_KEY, this.apiKeyProvider.getAPIKey()).m51746b();
    }
}
