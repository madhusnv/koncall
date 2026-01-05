package com.onesignal.notifications.internal;

import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.notifications.INotificationClickResult;
import com.onesignal.notifications.internal.common.NotificationConstants;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class NotificationClickResult implements INotificationClickResult {
    private final String actionId;
    private final String url;

    public NotificationClickResult(String str, String str2) {
        this.actionId = str;
        this.url = str2;
    }

    @Override // com.onesignal.notifications.INotificationClickResult
    public String getActionId() {
        return this.actionId;
    }

    @Override // com.onesignal.notifications.INotificationClickResult
    public String getUrl() {
        return this.url;
    }

    public final JSONObject toJSONObject() {
        return JSONObjectExtensionsKt.putSafe(JSONObjectExtensionsKt.putSafe(new JSONObject(), NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, getActionId()), ImagesContract.URL, getUrl());
    }
}
