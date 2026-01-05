package com.onesignal.user.internal;

import com.onesignal.common.IDManager;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.subscriptions.ISubscription;
import p001o.sq8;

/* loaded from: classes6.dex */
public abstract class Subscription implements ISubscription {
    private final SubscriptionModel model;

    public Subscription(SubscriptionModel subscriptionModel) {
        sq8.m48649h(subscriptionModel, "model");
        this.model = subscriptionModel;
    }

    @Override // com.onesignal.user.subscriptions.ISubscription
    public String getId() {
        return IDManager.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final SubscriptionModel getModel() {
        return this.model;
    }
}
