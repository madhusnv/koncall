package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface EndpointOrBuilder extends tcb {
    @Deprecated
    String getAliases(int i);

    @Deprecated
    xq1 getAliasesBytes(int i);

    @Deprecated
    int getAliasesCount();

    @Deprecated
    List<String> getAliasesList();

    boolean getAllowCors();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getFeatures(int i);

    xq1 getFeaturesBytes(int i);

    int getFeaturesCount();

    List<String> getFeaturesList();

    String getName();

    xq1 getNameBytes();

    String getTarget();

    xq1 getTargetBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
