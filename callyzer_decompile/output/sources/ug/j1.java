package ug;

import java.lang.Thread;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f35540a;

    /* renamed from: b */
    public final /* synthetic */ m1 f35541b;

    public j1(m1 m1Var, String str) {
        this.f35541b = m1Var;
        this.f35540a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        v0 v0Var = ((n1) this.f35541b.f482a).f35669f;
        n1.m14085m(v0Var);
        v0Var.f35862f.m14141b(th2, this.f35540a);
    }
}
