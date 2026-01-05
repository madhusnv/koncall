package com.onesignal.user.internal.migrations;

import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import p001o.gi9;
import p001o.si9;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class RecoverConfigPushSubscription extends MigrationRecovery {
    private final ConfigModelStore _configModelStore;
    private final SubscriptionModelStore _subscriptionModelStore;
    private final gi9 activePushSubscription$delegate;

    public RecoverConfigPushSubscription(ConfigModelStore configModelStore, SubscriptionModelStore subscriptionModelStore) {
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = configModelStore;
        this._subscriptionModelStore = subscriptionModelStore;
        this.activePushSubscription$delegate = si9.m48360a(new RecoverConfigPushSubscription$activePushSubscription$2(this));
    }

    public final SubscriptionModel getActivePushSubscription() {
        return (SubscriptionModel) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public boolean isInBadState() {
        return (this._configModelStore.getModel().getPushSubscriptionId() == null) && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public void recover() {
        ConfigModel model = this._configModelStore.getModel();
        SubscriptionModel activePushSubscription = getActivePushSubscription();
        model.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
