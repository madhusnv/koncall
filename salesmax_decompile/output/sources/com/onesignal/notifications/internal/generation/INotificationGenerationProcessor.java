package com.onesignal.notifications.internal.generation;

import android.content.Context;
import org.json.JSONObject;
import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationGenerationProcessor {
    Object processNotificationData(Context context, int i, JSONObject jSONObject, boolean z, long j, n64 n64Var);
}
