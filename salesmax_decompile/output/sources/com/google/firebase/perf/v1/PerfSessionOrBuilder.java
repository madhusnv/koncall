package com.google.firebase.perf.v1;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes6.dex */
public interface PerfSessionOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getSessionId();

    xq1 getSessionIdBytes();

    SessionVerbosity getSessionVerbosity(int i);

    int getSessionVerbosityCount();

    List<SessionVerbosity> getSessionVerbosityList();

    boolean hasSessionId();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
