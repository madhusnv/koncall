package com.amplifyframework.hub;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface HubCategoryBehavior {
    <T> void publish(HubChannel hubChannel, HubEvent<T> hubEvent);

    SubscriptionToken subscribe(HubChannel hubChannel, HubEventFilter hubEventFilter, HubSubscriber hubSubscriber);

    SubscriptionToken subscribe(HubChannel hubChannel, HubSubscriber hubSubscriber);

    void unsubscribe(SubscriptionToken subscriptionToken);
}
