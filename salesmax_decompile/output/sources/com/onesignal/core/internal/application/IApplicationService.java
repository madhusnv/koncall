package com.onesignal.core.internal.application;

import android.app.Activity;
import android.content.Context;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IApplicationService {
    void addActivityLifecycleHandler(IActivityLifecycleHandler iActivityLifecycleHandler);

    void addApplicationLifecycleHandler(IApplicationLifecycleHandler iApplicationLifecycleHandler);

    Context getAppContext();

    Activity getCurrent();

    AppEntryAction getEntryState();

    boolean isInForeground();

    void removeActivityLifecycleHandler(IActivityLifecycleHandler iActivityLifecycleHandler);

    void removeApplicationLifecycleHandler(IApplicationLifecycleHandler iApplicationLifecycleHandler);

    void setEntryState(AppEntryAction appEntryAction);

    Object waitUntilActivityReady(n64 n64Var);

    Object waitUntilSystemConditionsAvailable(n64 n64Var);
}
