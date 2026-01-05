package com.onesignal.user.internal.builduser.impl;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class RebuildUserService implements IRebuildUserService {
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final PropertiesModelStore _propertiesModelStore;
    private final SubscriptionModelStore _subscriptionsModelStore;

    public RebuildUserService(IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, SubscriptionModelStore subscriptionModelStore, ConfigModelStore configModelStore) {
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        sq8.m48649h(subscriptionModelStore, "_subscriptionsModelStore");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._identityModelStore = identityModelStore;
        this._propertiesModelStore = propertiesModelStore;
        this._subscriptionsModelStore = subscriptionModelStore;
        this._configModelStore = configModelStore;
    }

    @Override // com.onesignal.user.internal.builduser.IRebuildUserService
    public List<Operation> getRebuildOperationsIfCurrentUser(String str, String str2) {
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        sq8.m48649h(str2, "onesignalId");
        IdentityModel identityModel = new IdentityModel();
        Object obj = null;
        identityModel.initializeFromModel(null, this._identityModelStore.getModel());
        new PropertiesModel().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        for (TModel tmodel : this._subscriptionsModelStore.list()) {
            SubscriptionModel subscriptionModel = new SubscriptionModel();
            subscriptionModel.initializeFromModel(null, tmodel);
            arrayList.add(subscriptionModel);
        }
        if (!sq8.m48644c(identityModel.getOnesignalId(), str2)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new LoginUserOperation(str, str2, identityModel.getExternalId(), null, 8, null));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (sq8.m48644c(((SubscriptionModel) next).getId(), this._configModelStore.getModel().getPushSubscriptionId())) {
                obj = next;
                break;
            }
        }
        SubscriptionModel subscriptionModel2 = (SubscriptionModel) obj;
        if (subscriptionModel2 != null) {
            arrayList2.add(new CreateSubscriptionOperation(str, str2, subscriptionModel2.getId(), subscriptionModel2.getType(), subscriptionModel2.getOptedIn(), subscriptionModel2.getAddress(), subscriptionModel2.getStatus()));
        }
        arrayList2.add(new RefreshUserOperation(str, str2));
        return arrayList2;
    }
}
