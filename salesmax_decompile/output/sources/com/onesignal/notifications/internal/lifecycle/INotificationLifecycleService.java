package com.onesignal.notifications.internal.lifecycle;

import android.app.Activity;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationLifecycleService {
    void addExternalClickListener(INotificationClickListener iNotificationClickListener);

    void addExternalForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, n64 n64Var);

    Object canReceiveNotification(JSONObject jSONObject, n64 n64Var);

    void externalNotificationWillShowInForeground(INotificationWillDisplayEvent iNotificationWillDisplayEvent);

    void externalRemoteNotificationReceived(INotificationReceivedEvent iNotificationReceivedEvent);

    Object notificationOpened(Activity activity, JSONArray jSONArray, n64 n64Var);

    Object notificationReceived(NotificationGenerationJob notificationGenerationJob, n64 n64Var);

    void removeExternalClickListener(INotificationClickListener iNotificationClickListener);

    void removeExternalForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    void setInternalNotificationLifecycleCallback(INotificationLifecycleCallback iNotificationLifecycleCallback);
}
