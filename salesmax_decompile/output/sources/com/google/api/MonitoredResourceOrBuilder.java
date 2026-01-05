package com.google.api;

import java.util.Map;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface MonitoredResourceOrBuilder extends tcb {
    boolean containsLabels(String str);

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    @Deprecated
    Map<String, String> getLabels();

    int getLabelsCount();

    Map<String, String> getLabelsMap();

    String getLabelsOrDefault(String str, String str2);

    String getLabelsOrThrow(String str);

    String getType();

    xq1 getTypeBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
