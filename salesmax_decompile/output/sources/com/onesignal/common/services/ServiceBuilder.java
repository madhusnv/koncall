package com.onesignal.common.services;

import java.util.ArrayList;
import java.util.List;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes6.dex */
public final class ServiceBuilder implements IServiceBuilder {
    private final List<ServiceRegistration<?>> registrations = new ArrayList();

    @Override // com.onesignal.common.services.IServiceBuilder
    public ServiceProvider build() {
        return new ServiceProvider(this.registrations);
    }

    public final /* synthetic */ <T> ServiceRegistration<T> register() {
        sq8.m48655n(4, "T");
        return register((Class) Object.class);
    }

    @Override // com.onesignal.common.services.IServiceBuilder
    public <T> ServiceRegistration<T> register(Class<T> cls) {
        sq8.m48649h(cls, "c");
        ServiceRegistrationReflection serviceRegistrationReflection = new ServiceRegistrationReflection(cls);
        this.registrations.add(serviceRegistrationReflection);
        return serviceRegistrationReflection;
    }

    @Override // com.onesignal.common.services.IServiceBuilder
    public <T> ServiceRegistration<T> register(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "create");
        ServiceRegistrationLambda serviceRegistrationLambda = new ServiceRegistrationLambda(xk7Var);
        this.registrations.add(serviceRegistrationLambda);
        return serviceRegistrationLambda;
    }

    @Override // com.onesignal.common.services.IServiceBuilder
    public <T> ServiceRegistration<T> register(T t) {
        ServiceRegistrationSingleton serviceRegistrationSingleton = new ServiceRegistrationSingleton(t);
        this.registrations.add(serviceRegistrationSingleton);
        return serviceRegistrationSingleton;
    }
}
