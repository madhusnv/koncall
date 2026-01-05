package com.amplifyframework.notifications;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface NotificationsCategoryBehavior {
    void identifyUser(String str, UserProfile userProfile, Action action, Consumer<PushNotificationsException> consumer);

    void identifyUser(String str, Action action, Consumer<PushNotificationsException> consumer);
}
