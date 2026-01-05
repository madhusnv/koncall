package com.onesignal.notifications.internal.common;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OSNotificationOpenBehaviorFromPushPayload {
    private final Context context;
    private final JSONObject fcmPayload;

    public OSNotificationOpenBehaviorFromPushPayload(Context context, JSONObject jSONObject) {
        sq8.m48649h(context, "context");
        sq8.m48649h(jSONObject, "fcmPayload");
        this.context = context;
        this.fcmPayload = jSONObject;
    }

    public final boolean getShouldOpenApp() {
        return OSNotificationOpenAppSettings.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    public final Uri getUri() {
        OSNotificationOpenAppSettings oSNotificationOpenAppSettings = OSNotificationOpenAppSettings.INSTANCE;
        if (!oSNotificationOpenAppSettings.getShouldOpenActivity(this.context) || oSNotificationOpenAppSettings.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject.has("u")) {
            String strOptString = jSONObject.optString("u");
            if (!sq8.m48644c(strOptString, "")) {
                sq8.m48648g(strOptString, ImagesContract.URL);
                int length = strOptString.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = sq8.m48651j(strOptString.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                return Uri.parse(strOptString.subSequence(i, length + 1).toString());
            }
        }
        return null;
    }
}
