package com.onesignal.notifications.internal;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationWillDisplayEvent implements INotificationWillDisplayEvent {
    private boolean discard;
    private boolean isPreventDefault;
    private final Notification notification;

    public NotificationWillDisplayEvent(Notification notification) {
        sq8.m48649h(notification, OneSignalDbContract.NotificationTable.TABLE_NAME);
        this.notification = notification;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // com.onesignal.notifications.INotificationWillDisplayEvent
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z) {
        this.discard = z;
    }

    public final void setPreventDefault(boolean z) {
        this.isPreventDefault = z;
    }

    @Override // com.onesignal.notifications.INotificationWillDisplayEvent
    public Notification getNotification() {
        return this.notification;
    }

    @Override // com.onesignal.notifications.INotificationWillDisplayEvent
    public void preventDefault(boolean z) {
        Logging.debug$default("NotificationWillDisplayEvent.preventDefault(" + z + ')', null, 2, null);
        if (this.isPreventDefault && z) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z;
    }
}
