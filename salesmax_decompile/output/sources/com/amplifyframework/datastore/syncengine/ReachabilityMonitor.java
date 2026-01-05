package com.amplifyframework.datastore.syncengine;

import android.content.Context;
import p001o.sq8;
import p001o.x6c;

/* loaded from: classes5.dex */
public interface ReachabilityMonitor {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ReachabilityMonitor create() {
            return new ReachabilityMonitorImpl(new ProdSchedulerProvider());
        }

        public final ReachabilityMonitor createForTesting(SchedulerProvider schedulerProvider) {
            sq8.m48649h(schedulerProvider, "baseSchedulerProvider");
            return new ReachabilityMonitorImpl(schedulerProvider);
        }
    }

    void configure(Context context);

    void configure(Context context, ConnectivityProvider connectivityProvider);

    x6c getObservable();
}
