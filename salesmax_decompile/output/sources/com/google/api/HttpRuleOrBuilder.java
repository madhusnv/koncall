package com.google.api;

import com.google.api.HttpRule;
import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface HttpRuleOrBuilder extends tcb {
    HttpRule getAdditionalBindings(int i);

    int getAdditionalBindingsCount();

    List<HttpRule> getAdditionalBindingsList();

    String getBody();

    xq1 getBodyBytes();

    CustomHttpPattern getCustom();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getDelete();

    xq1 getDeleteBytes();

    String getGet();

    xq1 getGetBytes();

    String getPatch();

    xq1 getPatchBytes();

    HttpRule.PatternCase getPatternCase();

    String getPost();

    xq1 getPostBytes();

    String getPut();

    xq1 getPutBytes();

    String getResponseBody();

    xq1 getResponseBodyBytes();

    String getSelector();

    xq1 getSelectorBytes();

    boolean hasCustom();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
