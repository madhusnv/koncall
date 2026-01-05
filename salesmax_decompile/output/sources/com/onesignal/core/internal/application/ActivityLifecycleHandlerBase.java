package com.onesignal.core.internal.application;

import android.app.Activity;
import p001o.sq8;

/* loaded from: classes6.dex */
public class ActivityLifecycleHandlerBase implements IActivityLifecycleHandler {
    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityAvailable(Activity activity) {
        sq8.m48649h(activity, "activity");
    }

    @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
    public void onActivityStopped(Activity activity) {
        sq8.m48649h(activity, "activity");
    }
}
