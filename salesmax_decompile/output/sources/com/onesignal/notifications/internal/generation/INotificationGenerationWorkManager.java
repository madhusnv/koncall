package com.onesignal.notifications.internal.generation;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface INotificationGenerationWorkManager {
    boolean beginEnqueueingWork(Context context, String str, int i, JSONObject jSONObject, long j, boolean z, boolean z2);
}
