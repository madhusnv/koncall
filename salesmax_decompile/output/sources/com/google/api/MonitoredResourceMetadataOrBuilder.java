package com.google.api;

import java.util.Map;
import p001o.k9g;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface MonitoredResourceMetadataOrBuilder extends tcb {
    boolean containsUserLabels(String str);

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    k9g getSystemLabels();

    @Deprecated
    Map<String, String> getUserLabels();

    int getUserLabelsCount();

    Map<String, String> getUserLabelsMap();

    String getUserLabelsOrDefault(String str, String str2);

    String getUserLabelsOrThrow(String str);

    boolean hasSystemLabels();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
