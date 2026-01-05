package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkConnectionInfo;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes6.dex */
public interface NetworkConnectionInfoOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    NetworkConnectionInfo.MobileSubtype getMobileSubtype();

    NetworkConnectionInfo.NetworkType getNetworkType();

    boolean hasMobileSubtype();

    boolean hasNetworkType();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
