package com.onesignal.user.internal.backend;

import p001o.n64;

/* loaded from: classes6.dex */
public interface ISubscriptionBackendService {
    Object createSubscription(String str, String str2, String str3, SubscriptionObject subscriptionObject, n64 n64Var);

    Object deleteSubscription(String str, String str2, n64 n64Var);

    Object getIdentityFromSubscription(String str, String str2, n64 n64Var);

    Object transferSubscription(String str, String str2, String str3, String str4, n64 n64Var);

    Object updateSubscription(String str, String str2, SubscriptionObject subscriptionObject, n64 n64Var);
}
