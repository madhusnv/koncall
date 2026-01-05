package com.onesignal.core.internal.startup;

import com.onesignal.common.services.ServiceProvider;
import com.onesignal.core.internal.startup.StartupService;
import java.util.Iterator;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class StartupService {
    private final ServiceProvider services;

    public StartupService(ServiceProvider serviceProvider) {
        sq8.m48649h(serviceProvider, "services");
        this.services = serviceProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scheduleStart$lambda-2, reason: not valid java name */
    public static final void m68751scheduleStart$lambda2(StartupService startupService) {
        sq8.m48649h(startupService, "this$0");
        Iterator it = startupService.services.getAllServices(IStartableService.class).iterator();
        while (it.hasNext()) {
            ((IStartableService) it.next()).start();
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(IBootstrapService.class).iterator();
        while (it.hasNext()) {
            ((IBootstrapService) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        new Thread(new Runnable() { // from class: o.n4g
            @Override // java.lang.Runnable
            public final void run() {
                StartupService.m68751scheduleStart$lambda2(this.f36371a);
            }
        }).start();
    }
}
