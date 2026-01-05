package il;

import d7.EnumC1644p;
import d7.InterfaceC1648t;
import d7.i0;
import eb.C1979c;
import gl.C2629e;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.RunnableC4307g;
import sf.AbstractC6840z;
import ug.g1;
import v0.C7622f;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: il.b */
/* loaded from: classes.dex */
public abstract class AbstractC3294b implements Closeable, InterfaceC1648t {

    /* renamed from: e */
    public static final C1979c f17520e = new C1979c("MobileVisionBase", "");

    /* renamed from: a */
    public final AtomicBoolean f17521a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C2629e f17522b;

    /* renamed from: c */
    public final g1 f17523c;

    /* renamed from: d */
    public final Executor f17524d;

    public AbstractC3294b(C2629e c2629e, Executor executor) {
        this.f17522b = c2629e;
        g1 g1Var = new g1(18);
        this.f17523c = g1Var;
        this.f17524d = executor;
        c2629e.f14211b.incrementAndGet();
        c2629e.m6600a(executor, CallableC3298f.f17533a, (C7622f) g1Var.f35448a).m15978e(C3296d.f17528a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, cl.InterfaceC0981a
    @i0(EnumC1644p.ON_DESTROY)
    public synchronized void close() {
        boolean z6 = true;
        if (this.f17521a.getAndSet(true)) {
            return;
        }
        this.f17523c.m13926q();
        C2629e c2629e = this.f17522b;
        Executor executor = this.f17524d;
        if (c2629e.f14211b.get() <= 0) {
            z6 = false;
        }
        AbstractC6840z.m13039j(z6);
        c2629e.f14210a.m427r(new RunnableC4307g(2, c2629e, new C8650g()), executor);
    }
}
