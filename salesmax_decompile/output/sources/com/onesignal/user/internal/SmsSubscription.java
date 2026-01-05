package com.onesignal.user.internal;

import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.subscriptions.ISmsSubscription;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class SmsSubscription extends Subscription implements ISmsSubscription {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsSubscription(SubscriptionModel subscriptionModel) {
        super(subscriptionModel);
        sq8.m48649h(subscriptionModel, "model");
    }

    @Override // com.onesignal.user.subscriptions.ISmsSubscription
    public String getNumber() {
        return getModel().getAddress();
    }
}
