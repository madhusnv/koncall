package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface DocumentationOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getDocumentationRootUrl();

    xq1 getDocumentationRootUrlBytes();

    String getOverview();

    xq1 getOverviewBytes();

    Page getPages(int i);

    int getPagesCount();

    List<Page> getPagesList();

    DocumentationRule getRules(int i);

    int getRulesCount();

    List<DocumentationRule> getRulesList();

    String getSummary();

    xq1 getSummaryBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
