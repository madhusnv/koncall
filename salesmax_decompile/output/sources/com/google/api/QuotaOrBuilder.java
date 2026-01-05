package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface QuotaOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    QuotaLimit getLimits(int i);

    int getLimitsCount();

    List<QuotaLimit> getLimitsList();

    MetricRule getMetricRules(int i);

    int getMetricRulesCount();

    List<MetricRule> getMetricRulesList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
