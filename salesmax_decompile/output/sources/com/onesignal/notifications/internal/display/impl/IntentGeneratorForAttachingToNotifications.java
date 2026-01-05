package com.onesignal.notifications.internal.display.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.onesignal.notifications.activities.NotificationOpenedActivity;
import com.onesignal.notifications.activities.NotificationOpenedActivityAndroid22AndOlder;
import com.onesignal.notifications.internal.common.NotificationConstants;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class IntentGeneratorForAttachingToNotifications {
    private final Context context;
    private final Class<?> notificationOpenedClassAndroid22AndOlder;
    private final Class<?> notificationOpenedClassAndroid23Plus;

    public IntentGeneratorForAttachingToNotifications(Context context) {
        sq8.m48649h(context, "context");
        this.context = context;
        this.notificationOpenedClassAndroid23Plus = NotificationOpenedActivity.class;
        this.notificationOpenedClassAndroid22AndOlder = NotificationOpenedActivityAndroid22AndOlder.class;
    }

    private final Intent getNewBaseIntentAndroidAPI22AndOlder() {
        Intent intent = new Intent(this.context, this.notificationOpenedClassAndroid22AndOlder);
        intent.addFlags(403177472);
        return intent;
    }

    private final Intent getNewBaseIntentAndroidAPI23Plus() {
        return new Intent(this.context, this.notificationOpenedClassAndroid23Plus);
    }

    public final Context getContext() {
        return this.context;
    }

    public final PendingIntent getNewActionPendingIntent(int i, Intent intent) {
        sq8.m48649h(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.context, i, intent, 201326592);
    }

    public final Intent getNewBaseIntent(int i) {
        Intent intentAddFlags = getNewBaseIntentAndroidAPI23Plus().putExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, i).addFlags(603979776);
        sq8.m48648g(intentAddFlags, "intent\n            .putE…_CLEAR_TOP,\n            )");
        return intentAddFlags;
    }
}
