package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.C2147p;
import androidx.lifecycle.FragmentC2150s;
import p001o.a66;
import p001o.id5;
import p001o.sq8;
import p001o.xca;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes2.dex */
public final class C2147p implements xca {

    /* renamed from: q */
    public static final b f7702q = new b(null);

    /* renamed from: s */
    public static final C2147p f7703s = new C2147p();

    /* renamed from: a */
    public int f7704a;

    /* renamed from: b */
    public int f7705b;

    /* renamed from: e */
    public Handler f7708e;

    /* renamed from: c */
    public boolean f7706c = true;

    /* renamed from: d */
    public boolean f7707d = true;

    /* renamed from: f */
    public final C2144m f7709f = new C2144m(this);

    /* renamed from: g */
    public final Runnable f7710g = new Runnable() { // from class: o.qid
        @Override // java.lang.Runnable
        public final void run() {
            C2147p.m6556i(this.f42042a);
        }
    };

    /* renamed from: h */
    public final FragmentC2150s.a f7711h = new d();

    /* renamed from: androidx.lifecycle.p$a */
    public static final class a {

        /* renamed from: a */
        public static final a f7712a = new a();

        /* renamed from: a */
        public static final void m6564a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: androidx.lifecycle.p$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xca m6565a() {
            return C2147p.f7703s;
        }

        /* renamed from: b */
        public final void m6566b(Context context) {
            sq8.m48649h(context, "context");
            C2147p.f7703s.m6561h(context);
        }
    }

    /* renamed from: androidx.lifecycle.p$c */
    public static final class c extends a66 {

        /* renamed from: androidx.lifecycle.p$c$a */
        public static final class a extends a66 {
            final /* synthetic */ C2147p this$0;

            public a(C2147p c2147p) {
                this.this$0 = c2147p;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                sq8.m48649h(activity, "activity");
                this.this$0.m6558e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                sq8.m48649h(activity, "activity");
                this.this$0.m6559f();
            }
        }

        public c() {
        }

        @Override // p001o.a66, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC2150s.f7747b.m6577b(activity).m6575f(C2147p.this.f7711h);
            }
        }

        @Override // p001o.a66, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            sq8.m48649h(activity, "activity");
            C2147p.this.m6557d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            a.m6564a(activity, new a(C2147p.this));
        }

        @Override // p001o.a66, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            sq8.m48649h(activity, "activity");
            C2147p.this.m6560g();
        }
    }

    /* renamed from: androidx.lifecycle.p$d */
    public static final class d implements FragmentC2150s.a {
        public d() {
        }

        @Override // androidx.lifecycle.FragmentC2150s.a
        /* renamed from: a */
        public void mo6567a() {
        }

        @Override // androidx.lifecycle.FragmentC2150s.a
        public void onResume() {
            C2147p.this.m6558e();
        }

        @Override // androidx.lifecycle.FragmentC2150s.a
        public void onStart() {
            C2147p.this.m6559f();
        }
    }

    /* renamed from: i */
    public static final void m6556i(C2147p c2147p) {
        sq8.m48649h(c2147p, "this$0");
        c2147p.m6562j();
        c2147p.m6563k();
    }

    /* renamed from: d */
    public final void m6557d() {
        int i = this.f7705b - 1;
        this.f7705b = i;
        if (i == 0) {
            Handler handler = this.f7708e;
            sq8.m48646e(handler);
            handler.postDelayed(this.f7710g, 700L);
        }
    }

    /* renamed from: e */
    public final void m6558e() {
        int i = this.f7705b + 1;
        this.f7705b = i;
        if (i == 1) {
            if (this.f7706c) {
                this.f7709f.m6538i(AbstractC2139h.a.ON_RESUME);
                this.f7706c = false;
            } else {
                Handler handler = this.f7708e;
                sq8.m48646e(handler);
                handler.removeCallbacks(this.f7710g);
            }
        }
    }

    /* renamed from: f */
    public final void m6559f() {
        int i = this.f7704a + 1;
        this.f7704a = i;
        if (i == 1 && this.f7707d) {
            this.f7709f.m6538i(AbstractC2139h.a.ON_START);
            this.f7707d = false;
        }
    }

    /* renamed from: g */
    public final void m6560g() {
        this.f7704a--;
        m6563k();
    }

    @Override // p001o.xca
    public AbstractC2139h getLifecycle() {
        return this.f7709f;
    }

    /* renamed from: h */
    public final void m6561h(Context context) {
        sq8.m48649h(context, "context");
        this.f7708e = new Handler();
        this.f7709f.m6538i(AbstractC2139h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        sq8.m48647f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* renamed from: j */
    public final void m6562j() {
        if (this.f7705b == 0) {
            this.f7706c = true;
            this.f7709f.m6538i(AbstractC2139h.a.ON_PAUSE);
        }
    }

    /* renamed from: k */
    public final void m6563k() {
        if (this.f7704a == 0 && this.f7706c) {
            this.f7709f.m6538i(AbstractC2139h.a.ON_STOP);
            this.f7707d = true;
        }
    }
}
