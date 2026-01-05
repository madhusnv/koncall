package com.amplifyframework.rx;

import com.amplifyframework.analytics.UserProfile;
import p001o.xk3;

/* loaded from: classes5.dex */
public interface RxNotificationsCategoryBehavior {
    public static final RxPushNotificationsCategoryBehavior Push = new RxPushNotificationsBinding();

    xk3 identifyUser(String str);

    xk3 identifyUser(String str, UserProfile userProfile);
}
