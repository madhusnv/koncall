package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.NotificationsCategoryBehavior;

/* loaded from: classes5.dex */
public interface PushNotificationsCategoryBehavior extends NotificationsCategoryBehavior {
    void handleNotificationReceived(NotificationPayload notificationPayload, Consumer<PushNotificationResult> consumer, Consumer<PushNotificationsException> consumer2);

    void recordNotificationOpened(NotificationPayload notificationPayload, Action action, Consumer<PushNotificationsException> consumer);

    void recordNotificationReceived(NotificationPayload notificationPayload, Action action, Consumer<PushNotificationsException> consumer);

    void registerDevice(String str, Action action, Consumer<PushNotificationsException> consumer);

    boolean shouldHandleNotification(NotificationPayload notificationPayload);
}
