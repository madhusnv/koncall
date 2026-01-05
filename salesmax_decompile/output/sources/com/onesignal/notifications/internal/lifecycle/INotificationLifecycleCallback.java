package com.onesignal.notifications.internal.lifecycle;

import android.app.Activity;
import org.json.JSONObject;
import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationLifecycleCallback {
    Object canOpenNotification(Activity activity, JSONObject jSONObject, n64 n64Var);

    Object canReceiveNotification(JSONObject jSONObject, n64 n64Var);
}
