package com.onesignal.notifications.internal;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.INotification;
import com.onesignal.notifications.INotificationClickEvent;
import com.onesignal.notifications.INotificationClickResult;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationClickEvent implements INotificationClickEvent {
    private final Notification _notification;
    private final NotificationClickResult _result;

    public NotificationClickEvent(Notification notification, NotificationClickResult notificationClickResult) {
        sq8.m48649h(notification, "_notification");
        sq8.m48649h(notificationClickResult, "_result");
        this._notification = notification;
        this._result = notificationClickResult;
    }

    @Override // com.onesignal.notifications.INotificationClickEvent
    public INotification getNotification() {
        return this._notification;
    }

    @Override // com.onesignal.notifications.INotificationClickEvent
    public INotificationClickResult getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(OneSignalDbContract.NotificationTable.TABLE_NAME, this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        sq8.m48648g(jSONObjectPut, "JSONObject()\n           …, _result.toJSONObject())");
        return jSONObjectPut;
    }
}
