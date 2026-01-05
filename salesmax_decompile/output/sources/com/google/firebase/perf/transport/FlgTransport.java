package com.google.firebase.perf.transport;

import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.PerfMetric;
import p001o.dvh;
import p001o.n76;
import p001o.owh;
import p001o.rwh;
import p001o.xj6;

/* loaded from: classes6.dex */
final class FlgTransport {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private owh flgTransport;
    private final Provider<rwh> flgTransportFactoryProvider;
    private final String logSourceName;

    public FlgTransport(Provider<rwh> provider, String str) {
        this.logSourceName = str;
        this.flgTransportFactoryProvider = provider;
    }

    private boolean initializeFlgTransportClient() {
        if (this.flgTransport == null) {
            rwh rwhVar = this.flgTransportFactoryProvider.get();
            if (rwhVar != null) {
                this.flgTransport = rwhVar.mo47214a(this.logSourceName, PerfMetric.class, n76.m40202b("proto"), new dvh() { // from class: o.x27
                    @Override // p001o.dvh
                    public final Object apply(Object obj) {
                        return ((PerfMetric) obj).toByteArray();
                    }
                });
            } else {
                logger.warn("Flg TransportFactory is not available at the moment");
            }
        }
        return this.flgTransport != null;
    }

    public void log(PerfMetric perfMetric) {
        if (initializeFlgTransportClient()) {
            this.flgTransport.mo42730a(xj6.m56377e(perfMetric));
        } else {
            logger.warn("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
