package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface AuthenticationOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    AuthProvider getProviders(int i);

    int getProvidersCount();

    List<AuthProvider> getProvidersList();

    AuthenticationRule getRules(int i);

    int getRulesCount();

    List<AuthenticationRule> getRulesList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
