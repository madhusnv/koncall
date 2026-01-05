package com.onesignal.core.internal.application;

/* loaded from: classes6.dex */
public enum AppEntryAction {
    NOTIFICATION_CLICK,
    APP_OPEN,
    APP_CLOSE;

    public final boolean isAppClose() {
        return this == APP_CLOSE;
    }

    public final boolean isAppOpen() {
        return this == APP_OPEN;
    }

    public final boolean isNotificationClick() {
        return this == NOTIFICATION_CLICK;
    }
}
