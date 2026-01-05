package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface SystemParameterRuleOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    SystemParameter getParameters(int i);

    int getParametersCount();

    List<SystemParameter> getParametersList();

    String getSelector();

    xq1 getSelectorBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
