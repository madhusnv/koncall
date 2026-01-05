package com.amplifyframework.hub;

/* loaded from: classes5.dex */
public interface HubCategoryBehavior {
    <T> void publish(HubChannel hubChannel, HubEvent<T> hubEvent);

    SubscriptionToken subscribe(HubChannel hubChannel, HubEventFilter hubEventFilter, HubSubscriber hubSubscriber);

    SubscriptionToken subscribe(HubChannel hubChannel, HubSubscriber hubSubscriber);

    void unsubscribe(SubscriptionToken subscriptionToken);
}
