package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface AuthenticationRuleOrBuilder extends tcb {
    boolean getAllowWithoutCredential();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    OAuthRequirements getOauth();

    AuthRequirement getRequirements(int i);

    int getRequirementsCount();

    List<AuthRequirement> getRequirementsList();

    String getSelector();

    xq1 getSelectorBytes();

    boolean hasOauth();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
