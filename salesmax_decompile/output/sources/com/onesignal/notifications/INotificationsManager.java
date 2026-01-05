package com.onesignal.notifications;

import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationsManager {
    /* renamed from: addClickListener */
    void mo68768addClickListener(INotificationClickListener iNotificationClickListener);

    /* renamed from: addForegroundLifecycleListener */
    void mo68769addForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    /* renamed from: addPermissionObserver */
    void mo68770addPermissionObserver(IPermissionObserver iPermissionObserver);

    /* renamed from: clearAllNotifications */
    void mo68771clearAllNotifications();

    /* renamed from: getCanRequestPermission */
    boolean mo68772getCanRequestPermission();

    /* renamed from: getPermission */
    boolean mo68773getPermission();

    /* renamed from: removeClickListener */
    void mo68774removeClickListener(INotificationClickListener iNotificationClickListener);

    /* renamed from: removeForegroundLifecycleListener */
    void mo68775removeForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    /* renamed from: removeGroupedNotifications */
    void mo68776removeGroupedNotifications(String str);

    /* renamed from: removeNotification */
    void mo68777removeNotification(int i);

    /* renamed from: removePermissionObserver */
    void mo68778removePermissionObserver(IPermissionObserver iPermissionObserver);

    Object requestPermission(boolean z, n64 n64Var);
}
