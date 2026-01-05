package com.onesignal.notifications;

import android.content.Context;

/* loaded from: classes6.dex */
public interface INotificationReceivedEvent {
    Context getContext();

    IDisplayableMutableNotification getNotification();

    void preventDefault();

    void preventDefault(boolean z);
}
