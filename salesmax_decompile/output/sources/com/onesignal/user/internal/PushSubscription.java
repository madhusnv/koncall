package com.onesignal.user.internal;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.Model;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.IPushSubscriptionObserver;
import com.onesignal.user.subscriptions.PushSubscriptionState;
import p001o.sq8;

/* loaded from: classes6.dex */
public class PushSubscription extends Subscription implements IPushSubscription {
    private final EventProducer<IPushSubscriptionObserver> changeHandlersNotifier;
    private PushSubscriptionState savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSubscription(SubscriptionModel subscriptionModel) {
        super(subscriptionModel);
        sq8.m48649h(subscriptionModel, "model");
        this.changeHandlersNotifier = new EventProducer<>();
        this.savedState = fetchState();
    }

    private final PushSubscriptionState fetchState() {
        return new PushSubscriptionState(getId(), getToken(), getOptedIn());
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void addObserver(IPushSubscriptionObserver iPushSubscriptionObserver) {
        sq8.m48649h(iPushSubscriptionObserver, "observer");
        this.changeHandlersNotifier.subscribe(iPushSubscriptionObserver);
    }

    public final EventProducer<IPushSubscriptionObserver> getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != SubscriptionStatus.NO_PERMISSION;
    }

    public final PushSubscriptionState getSavedState() {
        return this.savedState;
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void optIn() {
        Model.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final PushSubscriptionState refreshState() {
        PushSubscriptionState pushSubscriptionStateFetchState = fetchState();
        this.savedState = pushSubscriptionStateFetchState;
        return pushSubscriptionStateFetchState;
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void removeObserver(IPushSubscriptionObserver iPushSubscriptionObserver) {
        sq8.m48649h(iPushSubscriptionObserver, "observer");
        this.changeHandlersNotifier.unsubscribe(iPushSubscriptionObserver);
    }
}
