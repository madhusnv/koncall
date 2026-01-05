package com.onesignal.common.services;

import java.util.List;

/* loaded from: classes6.dex */
public interface IServiceProvider {
    <T> List<T> getAllServices(Class<T> cls);

    <T> T getService(Class<T> cls);

    <T> T getServiceOrNull(Class<T> cls);

    <T> boolean hasService(Class<T> cls);
}
