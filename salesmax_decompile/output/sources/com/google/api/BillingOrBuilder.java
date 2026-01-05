package com.google.api;

import com.google.api.Billing;
import java.util.List;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface BillingOrBuilder extends tcb {
    Billing.BillingDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Billing.BillingDestination> getConsumerDestinationsList();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
