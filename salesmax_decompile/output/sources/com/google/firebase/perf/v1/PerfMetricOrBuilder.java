package com.google.firebase.perf.v1;

import p001o.scb;
import p001o.tcb;

/* loaded from: classes6.dex */
public interface PerfMetricOrBuilder extends tcb {
    ApplicationInfo getApplicationInfo();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    GaugeMetric getGaugeMetric();

    NetworkRequestMetric getNetworkRequestMetric();

    TraceMetric getTraceMetric();

    TransportInfo getTransportInfo();

    boolean hasApplicationInfo();

    boolean hasGaugeMetric();

    boolean hasNetworkRequestMetric();

    boolean hasTraceMetric();

    boolean hasTransportInfo();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
