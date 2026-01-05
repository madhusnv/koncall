package com.onesignal.common.services;

import com.onesignal.debug.internal.logging.Logging;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.ch3;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final Companion Companion = new Companion(null);
    private static String indent = "";
    private final Map<Class<?>, List<ServiceRegistration<?>>> serviceMap;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final String getIndent() {
            return ServiceProvider.indent;
        }

        public final void setIndent(String str) {
            sq8.m48649h(str, "<set-?>");
            ServiceProvider.indent = str;
        }
    }

    public ServiceProvider(List<? extends ServiceRegistration<?>> list) {
        sq8.m48649h(list, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (ServiceRegistration<?> serviceRegistration : list) {
            for (Class<?> cls : serviceRegistration.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<ServiceRegistration<?>> list2 = this.serviceMap.get(cls);
                    sq8.m48646e(list2);
                    list2.add(serviceRegistration);
                } else {
                    this.serviceMap.put(cls, ch3.m21252q(serviceRegistration));
                }
            }
        }
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> List<T> getAllServices(Class<T> cls) {
        ArrayList arrayList;
        sq8.m48649h(cls, "c");
        synchronized (this.serviceMap) {
            arrayList = new ArrayList();
            if (this.serviceMap.containsKey(cls)) {
                Map<Class<?>, List<ServiceRegistration<?>>> map = this.serviceMap;
                sq8.m48646e(map);
                List<ServiceRegistration<?>> list = map.get(cls);
                sq8.m48646e(list);
                for (ServiceRegistration<?> serviceRegistration : list) {
                    Object objResolve = serviceRegistration.resolve(this);
                    if (objResolve == null) {
                        throw new Exception("Could not instantiate service: " + serviceRegistration);
                    }
                    arrayList.add(objResolve);
                }
            }
        }
        return arrayList;
    }

    public final /* synthetic */ <T> List<T> getAllServices$com_onesignal_core() {
        sq8.m48655n(4, "T");
        return getAllServices(Object.class);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getService(Class<T> cls) throws Exception {
        sq8.m48649h(cls, "c");
        T t = (T) getServiceOrNull(cls);
        if (t != null) {
            return t;
        }
        Logging.warn$default("Service not found: " + cls, null, 2, null);
        throw new Exception("Service " + cls + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        sq8.m48655n(4, "T");
        return (T) getService(Object.class);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getServiceOrNull(Class<T> cls) {
        T t;
        ServiceRegistration serviceRegistration;
        sq8.m48649h(cls, "c");
        synchronized (this.serviceMap) {
            t = null;
            Logging.debug$default(indent + "Retrieving service " + cls, null, 2, null);
            List<ServiceRegistration<?>> list = this.serviceMap.get(cls);
            if (list != null && (serviceRegistration = (ServiceRegistration) kh3.r0(list)) != null) {
                t = (T) serviceRegistration.resolve(this);
            }
        }
        return t;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        sq8.m48655n(4, "T");
        return (T) getServiceOrNull(Object.class);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> boolean hasService(Class<T> cls) {
        boolean zContainsKey;
        sq8.m48649h(cls, "c");
        synchronized (this.serviceMap) {
            zContainsKey = this.serviceMap.containsKey(cls);
        }
        return zContainsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        sq8.m48655n(4, "T");
        return hasService(Object.class);
    }
}
