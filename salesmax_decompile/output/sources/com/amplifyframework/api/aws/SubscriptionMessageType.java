package com.amplifyframework.api.aws;

import com.google.firebase.messaging.Constants;

/* loaded from: classes5.dex */
enum SubscriptionMessageType {
    CONNECTION_INIT("connection_init"),
    CONNECTION_ACK("connection_ack"),
    CONNECTION_ERROR("connection_error"),
    CONNECTION_KEEP_ALIVE("ka"),
    CONNECTION_TERMINATE("connection_terminate"),
    SUBSCRIPTION_START("start"),
    SUBSCRIPTION_ACK("start_ack"),
    SUBSCRIPTION_DATA(Constants.ScionAnalytics.MessageType.DATA_MESSAGE),
    SUBSCRIPTION_ERROR(Constants.IPC_BUNDLE_KEY_SEND_ERROR),
    SUBSCRIPTION_COMPLETE("complete"),
    SUBSCRIPTION_STOP("stop");

    private final String value;

    SubscriptionMessageType(String str) {
        this.value = str;
    }

    public static SubscriptionMessageType from(String str) {
        for (SubscriptionMessageType subscriptionMessageType : values()) {
            if (subscriptionMessageType.value.equals(str)) {
                return subscriptionMessageType;
            }
        }
        throw new IllegalArgumentException("No such subscription message type: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
