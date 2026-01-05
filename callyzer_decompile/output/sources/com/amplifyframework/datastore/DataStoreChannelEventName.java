package com.amplifyframework.datastore;

import i0.m0;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum DataStoreChannelEventName {
    READY("ready"),
    NETWORK_STATUS("networkStatus"),
    SUBSCRIPTIONS_ESTABLISHED("subscriptionsEstablished"),
    SUBSCRIPTION_DATA_PROCESSED("subscriptionDataProcessed"),
    OUTBOX_STATUS("outboxStatus"),
    OUTBOX_MUTATION_ENQUEUED("outboxMutationEnqueued"),
    OUTBOX_MUTATION_PROCESSED("outboxMutationProcessed"),
    OUTBOX_MUTATION_FAILED("outboxMutationFailed"),
    SYNC_QUERIES_STARTED("syncQueriesStarted"),
    SYNC_QUERIES_READY("syncQueriesReady"),
    MODEL_SYNCED("modelSynced"),
    NON_APPLICABLE_DATA_RECEIVED("nonApplicableDataReceived");

    private final String hubEventName;

    DataStoreChannelEventName(String str) {
        Objects.requireNonNull(str);
        this.hubEventName = str;
    }

    public static DataStoreChannelEventName fromString(String str) {
        for (DataStoreChannelEventName dataStoreChannelEventName : values()) {
            if (dataStoreChannelEventName.toString().equals(str)) {
                return dataStoreChannelEventName;
            }
        }
        throw new IllegalArgumentException(m0.m7378k("DataStore category does not publish any Hub event with name = ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.hubEventName;
    }
}
