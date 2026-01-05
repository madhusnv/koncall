package com.google.api;

import com.google.api.Logging;
import java.util.List;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface LoggingOrBuilder extends tcb {
    Logging.LoggingDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Logging.LoggingDestination> getConsumerDestinationsList();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    Logging.LoggingDestination getProducerDestinations(int i);

    int getProducerDestinationsCount();

    List<Logging.LoggingDestination> getProducerDestinationsList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}
