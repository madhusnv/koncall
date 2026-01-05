package com.onesignal.notifications.internal.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class GenerateNotificationOpenIntentFromPushPayload {
    public static final GenerateNotificationOpenIntentFromPushPayload INSTANCE = new GenerateNotificationOpenIntentFromPushPayload();

    private GenerateNotificationOpenIntentFromPushPayload() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final GenerateNotificationOpenIntent create(Context context, JSONObject jSONObject) {
        sq8.m48649h(context, "context");
        sq8.m48649h(jSONObject, "fcmPayload");
        OSNotificationOpenBehaviorFromPushPayload oSNotificationOpenBehaviorFromPushPayload = new OSNotificationOpenBehaviorFromPushPayload(context, jSONObject);
        return new GenerateNotificationOpenIntent(context, openBrowserIntent(oSNotificationOpenBehaviorFromPushPayload.getUri()), oSNotificationOpenBehaviorFromPushPayload.getShouldOpenApp());
    }
}
