package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.NotificationsCategoryBehavior;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface PushNotificationsCategoryBehavior extends NotificationsCategoryBehavior {
    void handleNotificationReceived(NotificationPayload notificationPayload, Consumer<PushNotificationResult> consumer, Consumer<PushNotificationsException> consumer2);

    void recordNotificationOpened(NotificationPayload notificationPayload, Action action, Consumer<PushNotificationsException> consumer);

    void recordNotificationReceived(NotificationPayload notificationPayload, Action action, Consumer<PushNotificationsException> consumer);

    void registerDevice(String str, Action action, Consumer<PushNotificationsException> consumer);

    boolean shouldHandleNotification(NotificationPayload notificationPayload);
}
