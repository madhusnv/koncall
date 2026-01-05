package com.amplifyframework.kotlin.notifications.pushnotifications;

import com.amplifyframework.kotlin.notifications.Notifications;
import com.amplifyframework.notifications.pushnotifications.NotificationPayload;
import com.amplifyframework.notifications.pushnotifications.PushNotificationResult;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Push extends Notifications {
    Object handleNotificationReceived(NotificationPayload notificationPayload, InterfaceC7559c<? super PushNotificationResult> interfaceC7559c);

    Object recordNotificationOpened(NotificationPayload notificationPayload, InterfaceC7559c<? super a0> interfaceC7559c);

    Object recordNotificationReceived(NotificationPayload notificationPayload, InterfaceC7559c<? super a0> interfaceC7559c);

    Object registerDevice(String str, InterfaceC7559c<? super a0> interfaceC7559c);

    boolean shouldHandleNotification(NotificationPayload notificationPayload);
}
