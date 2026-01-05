package com.amplifyframework.api.aws.auth;

import p001o.ule;

/* loaded from: classes5.dex */
public class TokenRequestDecorator implements RequestDecorator {
    private static final String AUTHORIZATION = "authorization";
    private final TokenSupplier tokenSupplier;

    @FunctionalInterface
    public interface TokenSupplier {
        String get();
    }

    public TokenRequestDecorator(TokenSupplier tokenSupplier) {
        this.tokenSupplier = tokenSupplier;
    }

    @Override // com.amplifyframework.api.aws.auth.RequestDecorator
    public final ule decorate(ule uleVar) {
        return uleVar.m51738i().m51745a(AUTHORIZATION, this.tokenSupplier.get()).m51746b();
    }
}
