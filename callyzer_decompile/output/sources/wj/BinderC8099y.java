package wj;

import a1.RunnableC0025x;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import h6.ExecutorC2852h;
import p020v.b0;
import ug.g1;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.y */
/* loaded from: classes.dex */
public final class BinderC8099y extends Binder {

    /* renamed from: e */
    public final g1 f38765e;

    public BinderC8099y(g1 g1Var) {
        this.f38765e = g1Var;
    }

    /* renamed from: a */
    public final void m15284a(C8100z c8100z) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Intent intent = c8100z.f38766a;
        AbstractServiceC8081g abstractServiceC8081g = (AbstractServiceC8081g) this.f38765e.f35448a;
        C8650g c8650g = new C8650g();
        abstractServiceC8081g.f38697a.execute(new RunnableC0025x(25, abstractServiceC8081g, intent, c8650g));
        c8650g.f41930a.m15975b(new ExecutorC2852h(0), new b0(7, c8100z));
    }
}
