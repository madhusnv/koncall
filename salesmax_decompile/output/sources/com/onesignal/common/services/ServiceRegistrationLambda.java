package com.onesignal.common.services;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes6.dex */
public final class ServiceRegistrationLambda<T> extends ServiceRegistration<T> {
    private final xk7 create;
    private T obj;

    public ServiceRegistrationLambda(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "create");
        this.create = xk7Var;
    }

    @Override // com.onesignal.common.services.ServiceRegistration
    public Object resolve(IServiceProvider iServiceProvider) {
        sq8.m48649h(iServiceProvider, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        T t = this.obj;
        if (t != null) {
            return t;
        }
        T t2 = (T) this.create.invoke(iServiceProvider);
        this.obj = t2;
        return t2;
    }
}
