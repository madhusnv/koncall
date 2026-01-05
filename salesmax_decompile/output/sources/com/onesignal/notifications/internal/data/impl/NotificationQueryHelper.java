package com.onesignal.notifications.internal.data.impl;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationQueryHelper implements INotificationQueryHelper {
    private final ConfigModelStore _configModelStore;
    private final ITime _time;

    public NotificationQueryHelper(ConfigModelStore configModelStore, ITime iTime) {
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iTime, "_time");
        this._configModelStore = configModelStore;
        this._time = iTime;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationQueryHelper
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (this._configModelStore.getModel().getRestoreTTLFilter()) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }
}
