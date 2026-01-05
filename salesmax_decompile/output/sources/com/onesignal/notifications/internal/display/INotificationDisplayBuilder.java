package com.onesignal.notifications.internal.display;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.display.impl.IntentGeneratorForAttachingToNotifications;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import org.json.JSONObject;
import p001o.o2c;

/* loaded from: classes6.dex */
public interface INotificationDisplayBuilder {
    void addNotificationActionButtons(JSONObject jSONObject, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, o2c.C15694f c15694f, int i, String str);

    void addXiaomiSettings(NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder, Notification notification);

    NotificationDisplayBuilder.OneSignalNotificationBuilder getBaseOneSignalNotificationBuilder(NotificationGenerationJob notificationGenerationJob);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i);

    PendingIntent getNewDismissActionPendingIntent(int i, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(o2c.C15694f c15694f);
}
