package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.wh0;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface HttpBodyOrBuilder extends tcb {
    String getContentType();

    xq1 getContentTypeBytes();

    xq1 getData();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    wh0 getExtensions(int i);

    int getExtensionsCount();

    List<wh0> getExtensionsList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
