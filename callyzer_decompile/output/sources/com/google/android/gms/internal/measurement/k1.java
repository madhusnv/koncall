package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ l1 f6263a;

    public k1(l1 l1Var) {
        this.f6263a = l1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f6263a.m3482c(new a1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f6263a.m3482c(new j1(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f6263a.m3482c(new j1(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f6263a.m3482c(new j1(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i0 i0Var = new i0();
        this.f6263a.m3482c(new a1(this, activity, i0Var));
        Bundle bundleM3312f = i0Var.m3312f(50L);
        if (bundleM3312f != null) {
            bundle.putAll(bundleM3312f);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f6263a.m3482c(new j1(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f6263a.m3482c(new j1(this, activity, 3));
    }
}
