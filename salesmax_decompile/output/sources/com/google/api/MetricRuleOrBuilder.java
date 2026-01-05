package com.google.api;

import java.util.Map;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface MetricRuleOrBuilder extends tcb {
    boolean containsMetricCosts(String str);

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    @Deprecated
    Map<String, Long> getMetricCosts();

    int getMetricCostsCount();

    Map<String, Long> getMetricCostsMap();

    long getMetricCostsOrDefault(String str, long j);

    long getMetricCostsOrThrow(String str);

    String getSelector();

    xq1 getSelectorBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
