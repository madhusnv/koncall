package com.google.firebase.perf.v1;

import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes6.dex */
public interface GaugeMetadataOrBuilder extends tcb {
    int getCpuClockRateKhz();

    int getCpuProcessorCount();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    int getDeviceRamSizeKb();

    int getMaxAppJavaHeapMemoryKb();

    int getMaxEncouragedAppJavaHeapMemoryKb();

    @Deprecated
    String getProcessName();

    @Deprecated
    xq1 getProcessNameBytes();

    boolean hasCpuClockRateKhz();

    boolean hasCpuProcessorCount();

    boolean hasDeviceRamSizeKb();

    boolean hasMaxAppJavaHeapMemoryKb();

    boolean hasMaxEncouragedAppJavaHeapMemoryKb();

    @Deprecated
    boolean hasProcessName();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
