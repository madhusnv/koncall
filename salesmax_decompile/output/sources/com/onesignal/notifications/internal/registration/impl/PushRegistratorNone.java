package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import p001o.n64;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class PushRegistratorNone implements IPushRegistrator, IPushRegistratorCallback {
    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, n64 n64Var) {
        return y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    public Object registerForPush(n64 n64Var) {
        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.ERROR);
    }
}
