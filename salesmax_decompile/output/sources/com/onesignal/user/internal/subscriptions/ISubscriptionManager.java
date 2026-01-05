package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.events.IEventNotifier;

/* loaded from: classes6.dex */
public interface ISubscriptionManager extends IEventNotifier<ISubscriptionChangedHandler> {
    void addEmailSubscription(String str);

    void addOrUpdatePushSubscriptionToken(String str, SubscriptionStatus subscriptionStatus);

    void addSmsSubscription(String str);

    SubscriptionModel getPushSubscriptionModel();

    SubscriptionList getSubscriptions();

    void removeEmailSubscription(String str);

    void removeSmsSubscription(String str);

    void setSubscriptions(SubscriptionList subscriptionList);
}
