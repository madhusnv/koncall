package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.user.subscriptions.ISubscription;

/* loaded from: classes6.dex */
public interface ISubscriptionChangedHandler {
    void onSubscriptionAdded(ISubscription iSubscription);

    void onSubscriptionChanged(ISubscription iSubscription, ModelChangedArgs modelChangedArgs);

    void onSubscriptionRemoved(ISubscription iSubscription);
}
