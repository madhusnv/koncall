package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface PageOrBuilder extends tcb {
    String getContent();

    xq1 getContentBytes();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getName();

    xq1 getNameBytes();

    Page getSubpages(int i);

    int getSubpagesCount();

    List<Page> getSubpagesList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
