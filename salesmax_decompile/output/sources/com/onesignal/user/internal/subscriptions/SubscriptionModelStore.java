package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import java.util.Iterator;
import java.util.List;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class SubscriptionModelStore extends SimpleModelStore<SubscriptionModel> {

    /* renamed from: com.onesignal.user.internal.subscriptions.SubscriptionModelStore$1 */
    public static final class C118761 extends kf9 implements uk7 {
        public static final C118761 INSTANCE = new C118761();

        public C118761() {
            super(0);
        }

        @Override // p001o.uk7
        public final SubscriptionModel invoke() {
            return new SubscriptionModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionModelStore(IPreferencesService iPreferencesService) {
        super(C118761.INSTANCE, "subscriptions", iPreferencesService);
        sq8.m48649h(iPreferencesService, "prefs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.ModelStore, com.onesignal.common.modeling.IModelStore
    public void replaceAll(List<SubscriptionModel> list, String str) {
        sq8.m48649h(list, "models");
        sq8.m48649h(str, "tag");
        if (!sq8.m48644c(str, ModelChangeTags.HYDRATE)) {
            super.replaceAll(list, str);
            return;
        }
        synchronized (list) {
            Iterator<SubscriptionModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SubscriptionModel next = it.next();
                if (next.getType() == SubscriptionType.PUSH) {
                    SubscriptionModel subscriptionModel = (SubscriptionModel) get(next.getId());
                    if (subscriptionModel != null) {
                        next.setSdk(subscriptionModel.getSdk());
                        next.setDeviceOS(subscriptionModel.getDeviceOS());
                        next.setCarrier(subscriptionModel.getCarrier());
                        next.setAppVersion(subscriptionModel.getAppVersion());
                        next.setStatus(subscriptionModel.getStatus());
                    }
                }
            }
            super.replaceAll(list, str);
            y3i y3iVar = y3i.f54824a;
        }
    }
}
