package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface UsageOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getProducerNotificationChannel();

    xq1 getProducerNotificationChannelBytes();

    String getRequirements(int i);

    xq1 getRequirementsBytes(int i);

    int getRequirementsCount();

    List<String> getRequirementsList();

    UsageRule getRules(int i);

    int getRulesCount();

    List<UsageRule> getRulesList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
