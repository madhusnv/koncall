package com.amplifyframework.datastore.syncengine;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.amplifyframework.datastore.DataStoreException;
import java.util.concurrent.TimeUnit;
import p001o.ah1;
import p001o.m8c;
import p001o.q7c;
import p001o.sq8;
import p001o.x6c;

/* loaded from: classes5.dex */
final class ReachabilityMonitorImpl implements ReachabilityMonitor {
    private ConnectivityProvider connectivityProvider;
    private final SchedulerProvider schedulerProvider;
    private final ah1 subject;

    public ReachabilityMonitorImpl(SchedulerProvider schedulerProvider) {
        sq8.m48649h(schedulerProvider, "schedulerProvider");
        this.schedulerProvider = schedulerProvider;
        ah1 ah1VarN0 = ah1.N0();
        sq8.m48648g(ah1VarN0, "create(...)");
        this.subject = ah1VarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$0(ConnectivityProvider connectivityProvider, Context context, final q7c q7cVar) {
        sq8.m48649h(connectivityProvider, "$connectivityProvider");
        sq8.m48649h(context, "$context");
        sq8.m48649h(q7cVar, "emitter");
        connectivityProvider.registerDefaultNetworkCallback(context, new ConnectivityManager.NetworkCallback() { // from class: com.amplifyframework.datastore.syncengine.ReachabilityMonitorImpl$configure$observable$1$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                sq8.m48649h(network, "network");
                q7cVar.mo16430e(Boolean.TRUE);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                sq8.m48649h(network, "network");
                q7cVar.mo16430e(Boolean.FALSE);
            }
        });
        q7cVar.mo16430e(Boolean.valueOf(connectivityProvider.getHasActiveNetwork()));
    }

    @Override // com.amplifyframework.datastore.syncengine.ReachabilityMonitor
    public void configure(Context context) {
        sq8.m48649h(context, "context");
        configure(context, new DefaultConnectivityProvider());
    }

    @Override // com.amplifyframework.datastore.syncengine.ReachabilityMonitor
    public x6c getObservable() throws DataStoreException {
        if (this.connectivityProvider == null) {
            throw new DataStoreException("ReachabilityMonitor has not been configured.", "Call ReachabilityMonitor.configure() before calling ReachabilityMonitor.getObservable()");
        }
        x6c x6cVarY0 = this.subject.y0(this.schedulerProvider.io());
        sq8.m48648g(x6cVarY0, "subscribeOn(...)");
        return x6cVarY0;
    }

    public final SchedulerProvider getSchedulerProvider() {
        return this.schedulerProvider;
    }

    @Override // com.amplifyframework.datastore.syncengine.ReachabilityMonitor
    public void configure(final Context context, final ConnectivityProvider connectivityProvider) {
        sq8.m48649h(context, "context");
        sq8.m48649h(connectivityProvider, "connectivityProvider");
        this.connectivityProvider = connectivityProvider;
        x6c x6cVarM55706q = x6c.m55706q(new m8c() { // from class: com.amplifyframework.datastore.syncengine.h0
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                ReachabilityMonitorImpl.configure$lambda$0(connectivityProvider, context, q7cVar);
            }
        });
        sq8.m48648g(x6cVarM55706q, "create(...)");
        x6cVarM55706q.m55736s(250L, TimeUnit.MILLISECONDS, this.schedulerProvider.computation()).m55737u().mo55724b(this.subject);
    }
}
