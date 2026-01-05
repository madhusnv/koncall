package com.google.firebase.perf.v1;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes6.dex */
public interface GaugeMetricOrBuilder extends tcb {
    AndroidMemoryReading getAndroidMemoryReadings(int i);

    int getAndroidMemoryReadingsCount();

    List<AndroidMemoryReading> getAndroidMemoryReadingsList();

    CpuMetricReading getCpuMetricReadings(int i);

    int getCpuMetricReadingsCount();

    List<CpuMetricReading> getCpuMetricReadingsList();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    GaugeMetadata getGaugeMetadata();

    String getSessionId();

    xq1 getSessionIdBytes();

    boolean hasGaugeMetadata();

    boolean hasSessionId();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
