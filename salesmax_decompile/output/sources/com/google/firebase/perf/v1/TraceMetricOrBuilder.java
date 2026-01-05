package com.google.firebase.perf.v1;

import java.util.List;
import java.util.Map;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes6.dex */
public interface TraceMetricOrBuilder extends tcb {
    boolean containsCounters(String str);

    boolean containsCustomAttributes(String str);

    long getClientStartTimeUs();

    @Deprecated
    Map<String, Long> getCounters();

    int getCountersCount();

    Map<String, Long> getCountersMap();

    long getCountersOrDefault(String str, long j);

    long getCountersOrThrow(String str);

    @Deprecated
    Map<String, String> getCustomAttributes();

    int getCustomAttributesCount();

    Map<String, String> getCustomAttributesMap();

    String getCustomAttributesOrDefault(String str, String str2);

    String getCustomAttributesOrThrow(String str);

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    long getDurationUs();

    boolean getIsAuto();

    String getName();

    xq1 getNameBytes();

    PerfSession getPerfSessions(int i);

    int getPerfSessionsCount();

    List<PerfSession> getPerfSessionsList();

    TraceMetric getSubtraces(int i);

    int getSubtracesCount();

    List<TraceMetric> getSubtracesList();

    boolean hasClientStartTimeUs();

    boolean hasDurationUs();

    boolean hasIsAuto();

    boolean hasName();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
