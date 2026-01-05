package p001o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class zs implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final ai7 f57580a;

    /* renamed from: b */
    public final HashMap f57581b;

    /* renamed from: c */
    public boolean f57582c;

    /* renamed from: d */
    public final jf7 f57583d;

    /* renamed from: e */
    public final tja f57584e;

    public zs(jf7 jf7Var, tja tjaVar, boolean z) {
        sq8.m48649h(jf7Var, "formatter");
        sq8.m48649h(tjaVar, "logger");
        this.f57583d = jf7Var;
        this.f57584e = tjaVar;
        this.f57580a = z ? new ai7(jf7Var, tjaVar) : null;
        this.f57581b = new HashMap();
    }

    /* renamed from: a */
    public final boolean m59812a() {
        return this.f57582c;
    }

    /* renamed from: b */
    public final void m59813b(Activity activity) {
        Bundle bundle = (Bundle) this.f57581b.remove(activity);
        if (bundle != null) {
            try {
                this.f57584e.mo40676b(this.f57583d.mo21058b(activity, bundle));
            } catch (RuntimeException e) {
                this.f57584e.mo40675a(e);
            }
        }
    }

    /* renamed from: c */
    public final void m59814c() {
        this.f57582c = true;
        ai7 ai7Var = this.f57580a;
        if (ai7Var != null) {
            ai7Var.m17145b();
        }
    }

    /* renamed from: d */
    public final void m59815d() {
        this.f57582c = false;
        this.f57581b.clear();
        ai7 ai7Var = this.f57580a;
        if (ai7Var != null) {
            ai7Var.m17146c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        sq8.m48649h(activity, "activity");
        if (!(activity instanceof FragmentActivity) || this.f57580a == null) {
            return;
        }
        ((FragmentActivity) activity).getSupportFragmentManager().u1(this.f57580a, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        sq8.m48649h(activity, "activity");
        m59813b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        sq8.m48649h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        sq8.m48649h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        sq8.m48649h(activity, "activity");
        sq8.m48649h(bundle, "outState");
        if (this.f57582c) {
            this.f57581b.put(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        sq8.m48649h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        sq8.m48649h(activity, "activity");
        m59813b(activity);
    }
}
