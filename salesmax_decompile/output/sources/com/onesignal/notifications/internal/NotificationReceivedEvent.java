package com.onesignal.notifications.internal;

import android.content.Context;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationReceivedEvent;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationReceivedEvent implements INotificationReceivedEvent {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final Notification notification;

    public NotificationReceivedEvent(Context context, Notification notification) {
        sq8.m48649h(context, "context");
        sq8.m48649h(notification, OneSignalDbContract.NotificationTable.TABLE_NAME);
        this.context = context;
        this.notification = notification;
    }

    @Override // com.onesignal.notifications.INotificationReceivedEvent
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // com.onesignal.notifications.INotificationReceivedEvent
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z) {
        this.discard = z;
    }

    public final void setPreventDefault(boolean z) {
        this.isPreventDefault = z;
    }

    @Override // com.onesignal.notifications.INotificationReceivedEvent
    public Notification getNotification() {
        return this.notification;
    }

    @Override // com.onesignal.notifications.INotificationReceivedEvent
    public void preventDefault(boolean z) {
        Logging.debug$default("NotificationReceivedEvent.preventDefault(" + z + ')', null, 2, null);
        if (this.isPreventDefault && z) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z;
    }
}
