package com.google.api;

import com.google.api.Monitoring;
import java.util.List;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface MonitoringOrBuilder extends tcb {
    Monitoring.MonitoringDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Monitoring.MonitoringDestination> getConsumerDestinationsList();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    Monitoring.MonitoringDestination getProducerDestinations(int i);

    int getProducerDestinationsCount();

    List<Monitoring.MonitoringDestination> getProducerDestinationsList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
