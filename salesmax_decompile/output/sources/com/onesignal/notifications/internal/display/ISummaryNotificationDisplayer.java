package com.onesignal.notifications.internal.display;

import android.app.Notification;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.display.impl.IntentGeneratorForAttachingToNotifications;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import org.json.JSONObject;
import p001o.n64;
import p001o.o2c;

/* loaded from: classes6.dex */
public interface ISummaryNotificationDisplayer {
    void createGenericPendingIntentsForGroup(o2c.C15694f c15694f, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String str, int i);

    Object createGrouplessSummaryNotification(NotificationGenerationJob notificationGenerationJob, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, int i, int i2, n64 n64Var);

    Notification createSingleNotificationBeforeSummaryBuilder(NotificationGenerationJob notificationGenerationJob, o2c.C15694f c15694f);

    Object createSummaryNotification(NotificationGenerationJob notificationGenerationJob, NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder, int i, n64 n64Var);

    Object updateSummaryNotification(NotificationGenerationJob notificationGenerationJob, n64 n64Var);
}
