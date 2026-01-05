package com.onesignal.core.internal.application;

import android.app.Activity;

/* loaded from: classes6.dex */
public interface IActivityLifecycleHandler {
    void onActivityAvailable(Activity activity);

    void onActivityStopped(Activity activity);
}
