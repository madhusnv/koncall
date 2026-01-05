package com.google.api;

import com.google.api.BackendRule;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface BackendRuleOrBuilder extends tcb {
    String getAddress();

    xq1 getAddressBytes();

    BackendRule.AuthenticationCase getAuthenticationCase();

    double getDeadline();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    boolean getDisableAuth();

    String getJwtAudience();

    xq1 getJwtAudienceBytes();

    double getMinDeadline();

    double getOperationDeadline();

    BackendRule.PathTranslation getPathTranslation();

    int getPathTranslationValue();

    String getProtocol();

    xq1 getProtocolBytes();

    String getSelector();

    xq1 getSelectorBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
