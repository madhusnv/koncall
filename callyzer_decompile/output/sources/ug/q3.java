package ug;

import bk.RunnableC0683n;
import c9.C0910e;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q3 implements Runnable {

    /* renamed from: a */
    public final long f35791a;

    /* renamed from: b */
    public final long f35792b;

    /* renamed from: c */
    public final /* synthetic */ C0910e f35793c;

    public q3(C0910e c0910e, long j6, long j10) {
        Objects.requireNonNull(c0910e);
        this.f35793c = c0910e;
        this.f35791a = j6;
        this.f35792b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1 m1Var = ((n1) ((s3) this.f35793c.f5580c).f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new RunnableC0683n(18, this));
    }
}
