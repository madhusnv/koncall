package com.onesignal.notifications;

/* loaded from: classes6.dex */
public interface INotificationWillDisplayEvent {
    IDisplayableNotification getNotification();

    void preventDefault();

    void preventDefault(boolean z);
}
