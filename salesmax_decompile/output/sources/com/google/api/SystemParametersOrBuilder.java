package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface SystemParametersOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    SystemParameterRule getRules(int i);

    int getRulesCount();

    List<SystemParameterRule> getRulesList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
