package com.onesignal.user.internal;

import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.subscriptions.IEmailSubscription;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class EmailSubscription extends Subscription implements IEmailSubscription {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSubscription(SubscriptionModel subscriptionModel) {
        super(subscriptionModel);
        sq8.m48649h(subscriptionModel, "model");
    }

    @Override // com.onesignal.user.subscriptions.IEmailSubscription
    public String getEmail() {
        return getModel().getAddress();
    }
}
