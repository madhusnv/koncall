package com.google.firebase.perf.v1;

import p001o.scb;
import p001o.tcb;

/* loaded from: classes6.dex */
public interface CpuMetricReadingOrBuilder extends tcb {
    long getClientTimeUs();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    long getSystemTimeUs();

    long getUserTimeUs();

    boolean hasClientTimeUs();

    boolean hasSystemTimeUs();

    boolean hasUserTimeUs();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
