package com.onesignal.notifications.internal.pushtoken;

import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PushTokenResponse {
    private final SubscriptionStatus status;
    private final String token;

    public PushTokenResponse(String str, SubscriptionStatus subscriptionStatus) {
        sq8.m48649h(subscriptionStatus, "status");
        this.token = str;
        this.status = subscriptionStatus;
    }

    public final SubscriptionStatus getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }
}
