package com.onesignal.common.services;

import java.util.LinkedHashSet;
import java.util.Set;
import p001o.sq8;

/* loaded from: classes6.dex */
public abstract class ServiceRegistration<T> {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final /* synthetic */ <TService> ServiceRegistration<T> provides() {
        sq8.m48655n(4, "TService");
        return provides(Object.class);
    }

    public abstract Object resolve(IServiceProvider iServiceProvider);

    public final <TService> ServiceRegistration<T> provides(Class<TService> cls) {
        sq8.m48649h(cls, "c");
        this.services.add(cls);
        return this;
    }
}
