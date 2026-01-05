package com.onesignal.notifications.internal.registration;

import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import p001o.n64;
import p001o.sq8;

/* loaded from: classes6.dex */
public interface IPushRegistrator {

    public static final class RegisterResult {
        private final String id;
        private final SubscriptionStatus status;

        public RegisterResult(String str, SubscriptionStatus subscriptionStatus) {
            sq8.m48649h(subscriptionStatus, "status");
            this.id = str;
            this.status = subscriptionStatus;
        }

        public final String getId() {
            return this.id;
        }

        public final SubscriptionStatus getStatus() {
            return this.status;
        }
    }

    Object registerForPush(n64 n64Var);
}
