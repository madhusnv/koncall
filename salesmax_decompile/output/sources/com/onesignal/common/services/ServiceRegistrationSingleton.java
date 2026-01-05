package com.onesignal.common.services;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class ServiceRegistrationSingleton<T> extends ServiceRegistration<T> {
    private T obj;

    public ServiceRegistrationSingleton(T t) {
        this.obj = t;
    }

    @Override // com.onesignal.common.services.ServiceRegistration
    public Object resolve(IServiceProvider iServiceProvider) {
        sq8.m48649h(iServiceProvider, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        return this.obj;
    }
}
