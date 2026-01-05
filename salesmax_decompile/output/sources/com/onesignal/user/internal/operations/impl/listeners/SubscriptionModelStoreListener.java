package com.onesignal.user.internal.operations.impl.listeners;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.listeners.ModelStoreListener;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import org.apache.http.cookie.ClientCookie;
import p001o.hwc;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class SubscriptionModelStoreListener extends ModelStoreListener<SubscriptionModel> {
    public static final Companion Companion = new Companion(null);
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hwc getSubscriptionEnabledAndStatus(SubscriptionModel subscriptionModel) {
            SubscriptionStatus status;
            sq8.m48649h(subscriptionModel, "model");
            boolean z = false;
            if (subscriptionModel.getOptedIn()) {
                SubscriptionStatus status2 = subscriptionModel.getStatus();
                status = SubscriptionStatus.SUBSCRIBED;
                if (status2 != status) {
                    status = !subscriptionModel.getOptedIn() ? SubscriptionStatus.UNSUBSCRIBE : subscriptionModel.getStatus();
                } else {
                    if (subscriptionModel.getAddress().length() > 0) {
                        z = true;
                    }
                }
            }
            return new hwc(Boolean.valueOf(z), status);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionModelStoreListener(SubscriptionModelStore subscriptionModelStore, IOperationRepo iOperationRepo, IdentityModelStore identityModelStore, ConfigModelStore configModelStore) {
        super(subscriptionModelStore, iOperationRepo);
        sq8.m48649h(subscriptionModelStore, "store");
        sq8.m48649h(iOperationRepo, "opRepo");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._identityModelStore = identityModelStore;
        this._configModelStore = configModelStore;
    }

    @Override // com.onesignal.core.internal.operations.listeners.ModelStoreListener
    public Operation getAddOperation(SubscriptionModel subscriptionModel) {
        sq8.m48649h(subscriptionModel, "model");
        hwc subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(subscriptionModel);
        return new CreateSubscriptionOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), subscriptionModel.getId(), subscriptionModel.getType(), ((Boolean) subscriptionEnabledAndStatus.m31229c()).booleanValue(), subscriptionModel.getAddress(), (SubscriptionStatus) subscriptionEnabledAndStatus.m31230d());
    }

    @Override // com.onesignal.core.internal.operations.listeners.ModelStoreListener
    public Operation getRemoveOperation(SubscriptionModel subscriptionModel) {
        sq8.m48649h(subscriptionModel, "model");
        return new DeleteSubscriptionOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), subscriptionModel.getId());
    }

    @Override // com.onesignal.core.internal.operations.listeners.ModelStoreListener
    public Operation getUpdateOperation(SubscriptionModel subscriptionModel, String str, String str2, Object obj, Object obj2) {
        sq8.m48649h(subscriptionModel, "model");
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, "property");
        hwc subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(subscriptionModel);
        return new UpdateSubscriptionOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), subscriptionModel.getId(), subscriptionModel.getType(), ((Boolean) subscriptionEnabledAndStatus.m31229c()).booleanValue(), subscriptionModel.getAddress(), (SubscriptionStatus) subscriptionEnabledAndStatus.m31230d());
    }
}
