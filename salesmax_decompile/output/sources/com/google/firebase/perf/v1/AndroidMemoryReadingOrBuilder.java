package com.google.firebase.perf.v1;

import p001o.scb;
import p001o.tcb;

/* loaded from: classes6.dex */
public interface AndroidMemoryReadingOrBuilder extends tcb {
    long getClientTimeUs();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    int getUsedAppJavaHeapMemoryKb();

    boolean hasClientTimeUs();

    boolean hasUsedAppJavaHeapMemoryKb();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
