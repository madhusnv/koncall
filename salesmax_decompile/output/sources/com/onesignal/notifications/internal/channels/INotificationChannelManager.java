package com.onesignal.notifications.internal.channels;

import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public interface INotificationChannelManager {
    String createNotificationChannel(NotificationGenerationJob notificationGenerationJob);

    void processChannelList(JSONArray jSONArray);
}
