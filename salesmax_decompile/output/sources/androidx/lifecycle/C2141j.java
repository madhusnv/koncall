package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.a66;
import p001o.sq8;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes2.dex */
public final class C2141j {

    /* renamed from: a */
    public static final C2141j f7680a = new C2141j();

    /* renamed from: b */
    public static final AtomicBoolean f7681b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    public static final class a extends a66 {
        @Override // p001o.a66, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            FragmentC2150s.f7747b.m6578c(activity);
        }
    }

    /* renamed from: a */
    public static final void m6532a(Context context) {
        sq8.m48649h(context, "context");
        if (f7681b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        sq8.m48647f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
