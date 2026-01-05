package com.onesignal.common.services;

import p001o.xk7;

/* loaded from: classes6.dex */
public interface IServiceBuilder {
    ServiceProvider build();

    <T> ServiceRegistration<T> register(Class<T> cls);

    <T> ServiceRegistration<T> register(T t);

    <T> ServiceRegistration<T> register(xk7 xk7Var);
}
