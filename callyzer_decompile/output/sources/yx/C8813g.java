package yx;

import com.sun.mail.util.AbstractC1452a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l0.RunnableC4307g;
import tx.AbstractC7262v;
import tx.C7251k;
import tx.e0;
import tx.h0;
import tx.o0;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.g */
/* loaded from: classes3.dex */
public final class C8813g extends AbstractC7262v implements h0 {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42495h = AtomicIntegerFieldUpdater.newUpdater(C8813g.class, "runningWorkers$volatile");

    /* renamed from: c */
    public final /* synthetic */ h0 f42496c;

    /* renamed from: d */
    public final AbstractC7262v f42497d;

    /* renamed from: e */
    public final int f42498e;

    /* renamed from: f */
    public final C8816j f42499f;

    /* renamed from: g */
    public final Object f42500g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C8813g(AbstractC7262v abstractC7262v, int i10) {
        h0 h0Var = abstractC7262v instanceof h0 ? (h0) abstractC7262v : null;
        this.f42496c = h0Var == null ? e0.f34625a : h0Var;
        this.f42497d = abstractC7262v;
        this.f42498e = i10;
        this.f42499f = new C8816j();
        this.f42500g = new Object();
    }

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        Runnable runnableF0;
        this.f42499f.m16265a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42495h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f42498e || !G0() || (runnableF0 = F0()) == null) {
            return;
        }
        try {
            AbstractC8808b.m16251k(this.f42497d, this, new RunnableC4307g(29, this, runnableF0, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // tx.AbstractC7262v
    public final void C0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        Runnable runnableF0;
        this.f42499f.m16265a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42495h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f42498e || !G0() || (runnableF0 = F0()) == null) {
            return;
        }
        try {
            this.f42497d.C0(this, new RunnableC4307g(29, this, runnableF0, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // tx.AbstractC7262v
    public final AbstractC7262v E0(int i10) {
        AbstractC8808b.m16243c(i10);
        return i10 >= this.f42498e ? this : super.E0(i10);
    }

    public final Runnable F0() {
        while (true) {
            Runnable runnable = (Runnable) this.f42499f.m16268d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f42500g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42495h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f42499f.m16267c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean G0() {
        synchronized (this.f42500g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42495h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f42498e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // tx.h0
    /* renamed from: R */
    public final o0 mo13506R(long j6, Runnable runnable, InterfaceC7564h interfaceC7564h) {
        return this.f42496c.mo13506R(j6, runnable, interfaceC7564h);
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42497d);
        sb2.append(".limitedParallelism(");
        return AbstractC1452a.m4563j(sb2, this.f42498e, ')');
    }

    @Override // tx.h0
    /* renamed from: w */
    public final void mo13517w(long j6, C7251k c7251k) {
        this.f42496c.mo13517w(j6, c7251k);
    }
}
