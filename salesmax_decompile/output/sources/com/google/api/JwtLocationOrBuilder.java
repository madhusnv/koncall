package com.google.api;

import com.google.api.JwtLocation;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface JwtLocationOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getHeader();

    xq1 getHeaderBytes();

    JwtLocation.InCase getInCase();

    String getQuery();

    xq1 getQueryBytes();

    String getValuePrefix();

    xq1 getValuePrefixBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
