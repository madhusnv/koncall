package com.google.api;

import java.util.Map;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface QuotaLimitOrBuilder extends tcb {
    boolean containsValues(String str);

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    long getDefaultLimit();

    String getDescription();

    xq1 getDescriptionBytes();

    String getDisplayName();

    xq1 getDisplayNameBytes();

    String getDuration();

    xq1 getDurationBytes();

    long getFreeTier();

    long getMaxLimit();

    String getMetric();

    xq1 getMetricBytes();

    String getName();

    xq1 getNameBytes();

    String getUnit();

    xq1 getUnitBytes();

    @Deprecated
    Map<String, Long> getValues();

    int getValuesCount();

    Map<String, Long> getValuesMap();

    long getValuesOrDefault(String str, long j);

    long getValuesOrThrow(String str);

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
