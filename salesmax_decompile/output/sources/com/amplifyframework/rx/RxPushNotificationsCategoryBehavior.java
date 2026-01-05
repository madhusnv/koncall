package com.amplifyframework.rx;

import com.amplifyframework.notifications.pushnotifications.NotificationPayload;
import p001o.wtf;
import p001o.xk3;

/* loaded from: classes5.dex */
public interface RxPushNotificationsCategoryBehavior extends RxNotificationsCategoryBehavior {
    wtf handleNotificationReceived(NotificationPayload notificationPayload);

    xk3 recordNotificationOpened(NotificationPayload notificationPayload);

    xk3 recordNotificationReceived(NotificationPayload notificationPayload);

    xk3 registerDevice(String str);

    Boolean shouldHandleNotification(NotificationPayload notificationPayload);
}
