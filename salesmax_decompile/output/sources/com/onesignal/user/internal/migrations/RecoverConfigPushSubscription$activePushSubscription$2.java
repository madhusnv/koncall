package com.onesignal.user.internal.migrations;

import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.Iterator;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class RecoverConfigPushSubscription$activePushSubscription$2 extends kf9 implements uk7 {
    final /* synthetic */ RecoverConfigPushSubscription this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverConfigPushSubscription$activePushSubscription$2(RecoverConfigPushSubscription recoverConfigPushSubscription) {
        super(0);
        this.this$0 = recoverConfigPushSubscription;
    }

    @Override // p001o.uk7
    public final SubscriptionModel invoke() {
        Object next;
        Iterator it = this.this$0._subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SubscriptionModel) next).getType() == SubscriptionType.PUSH) {
                break;
            }
        }
        return (SubscriptionModel) next;
    }
}
