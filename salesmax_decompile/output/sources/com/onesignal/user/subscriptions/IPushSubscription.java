package com.onesignal.user.subscriptions;

/* loaded from: classes6.dex */
public interface IPushSubscription extends ISubscription {
    void addObserver(IPushSubscriptionObserver iPushSubscriptionObserver);

    boolean getOptedIn();

    String getToken();

    void optIn();

    void optOut();

    void removeObserver(IPushSubscriptionObserver iPushSubscriptionObserver);
}
