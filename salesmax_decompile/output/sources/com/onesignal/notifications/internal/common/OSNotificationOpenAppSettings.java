package com.onesignal.notifications.internal.common;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OSNotificationOpenAppSettings {
    public static final OSNotificationOpenAppSettings INSTANCE = new OSNotificationOpenAppSettings();

    private OSNotificationOpenAppSettings() {
    }

    public final boolean getShouldOpenActivity(Context context) {
        sq8.m48649h(context, "context");
        return !sq8.m48644c("DISABLE", AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean getSuppressLaunchURL(Context context) {
        sq8.m48649h(context, "context");
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.suppressLaunchURLs");
    }
}
