package fk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import dr.C1770t;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final h1 f10338a;

    public a1(h1 sharedSessionRepository) {
        AbstractC4154l.m8923f(sharedSessionRepository, "sharedSessionRepository");
        this.f10338a = sharedSessionRepository;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC4154l.m8923f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC4154l.m8923f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC4154l.m8923f(activity, "activity");
        this.f10338a.m5972b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC4154l.m8923f(activity, "activity");
        h1 h1Var = this.f10338a;
        h1Var.f10417i = true;
        k0 k0Var = h1Var.f10416h;
        if (k0Var == null) {
            return;
        }
        InterfaceC7559c interfaceC7559c = null;
        if (k0Var == null) {
            AbstractC4154l.m8928k("localSessionData");
            throw null;
        }
        h1Var.f10414f.m5967a();
        if (h1Var.m5974d(k0Var) || h1Var.m5973c(k0Var)) {
            tx.c0.m13502y(tx.c0.m13479b(h1Var.f10415g), null, null, new C1770t(h1Var, k0Var, interfaceC7559c, 12), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC4154l.m8923f(activity, "activity");
        AbstractC4154l.m8923f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC4154l.m8923f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC4154l.m8923f(activity, "activity");
    }
}
