package tx;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import uw.InterfaceC7564h;
import yx.C8818l;
import yx.C8828v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class v0 extends w0 implements h0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34685g = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34686h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34687j = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        M0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // tx.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long J0() {
        /*
            r10 = this;
            l7.q r0 = tx.c0.f34607c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = tx.v0.f34685g
            boolean r2 = r10.K0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.N0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof yx.C8818l
            if (r6 == 0) goto L3e
            r6 = r2
            yx.l r6 = (yx.C8818l) r6
            java.lang.Object r7 = r6.m16272d()
            l7.q r8 = yx.C8818l.f42509g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            yx.l r6 = r6.m16271c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            rw.k r2 = r10.f34693e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof yx.C8818l
            if (r2 == 0) goto L8d
            yx.l r1 = (yx.C8818l) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = yx.C8818l.f42508f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = tx.v0.f34686h
            java.lang.Object r0 = r0.get(r10)
            tx.u0 r0 = (tx.u0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            tx.t0[] r1 = r0.f42526a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f34678a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.v0.J0():long");
    }

    public void M0(Runnable runnable) {
        N0();
        if (!O0(runnable)) {
            d0.f34618k.M0(runnable);
            return;
        }
        Thread threadH0 = H0();
        if (Thread.currentThread() != threadH0) {
            LockSupport.unpark(threadH0);
        }
    }

    public final void N0() {
        t0 t0VarM16280b;
        u0 u0Var = (u0) f34686h.get(this);
        if (u0Var == null || C8828v.f42525b.get(u0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f42526a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (t0Var != null) {
                        t0VarM16280b = ((jNanoTime - t0Var.f34678a) > 0L ? 1 : ((jNanoTime - t0Var.f34678a) == 0L ? 0 : -1)) >= 0 ? O0(t0Var) : false ? u0Var.m16280b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (t0VarM16280b != null);
    }

    public final boolean O0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34685g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f34687j.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof C8818l)) {
                        if (obj != c0.f34607c) {
                            C8818l c8818l = new C8818l(8, true);
                            c8818l.m16269a((Runnable) obj);
                            c8818l.m16269a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c8818l)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    C8818l c8818l2 = (C8818l) obj;
                    int iM16269a = c8818l2.m16269a(runnable);
                    if (iM16269a == 0) {
                        break;
                    }
                    if (iM16269a == 1) {
                        C8818l c8818lM16271c = c8818l2.m16271c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c8818lM16271c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM16269a == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P0() {
        /*
            r7 = this;
            rw.k r0 = r7.f34693e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = tx.v0.f34686h
            java.lang.Object r0 = r0.get(r7)
            tx.u0 r0 = (tx.u0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = yx.C8828v.f42525b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = tx.v0.f34685g
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof yx.C8818l
            if (r3 == 0) goto L4f
            yx.l r0 = (yx.C8818l) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = yx.C8818l.f42508f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            l7.q r3 = tx.c0.f34607c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.v0.P0():boolean");
    }

    public final void Q0(long j6, t0 t0Var) {
        int iM13575b;
        Thread threadH0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34686h;
        if (f34687j.get(this) == 1) {
            iM13575b = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                u0 u0Var2 = new u0();
                u0Var2.f34683c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, u0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC4154l.m8920c(obj);
                u0Var = (u0) obj;
            }
            iM13575b = t0Var.m13575b(j6, u0Var, this);
        }
        if (iM13575b != 0) {
            if (iM13575b == 1) {
                L0(j6, t0Var);
                return;
            } else {
                if (iM13575b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        u0 u0Var3 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var3 != null) {
            synchronized (u0Var3) {
                t0[] t0VarArr = u0Var3.f42526a;
                t0Var = t0VarArr != null ? t0VarArr[0] : null;
            }
        }
        if (t0Var != t0Var || Thread.currentThread() == (threadH0 = H0())) {
            return;
        }
        LockSupport.unpark(threadH0);
    }

    /* renamed from: R */
    public o0 mo13506R(long j6, Runnable runnable, InterfaceC7564h interfaceC7564h) {
        return e0.f34625a.mo13506R(j6, runnable, interfaceC7564h);
    }

    @Override // tx.w0
    public void shutdown() {
        t0 t0VarM16280b;
        w1.f34694a.set(null);
        f34687j.set(this, 1);
        C4417q c4417q = c0.f34607c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34685g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C8818l)) {
                    if (obj != c4417q) {
                        C8818l c8818l = new C8818l(8, true);
                        c8818l.m16269a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c8818l)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C8818l) obj).m16270b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c4417q)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (J0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) f34686h.get(this);
            if (u0Var == null) {
                return;
            }
            synchronized (u0Var) {
                t0VarM16280b = C8828v.f42525b.get(u0Var) > 0 ? u0Var.m16280b(0) : null;
            }
            if (t0VarM16280b == null) {
                return;
            } else {
                L0(jNanoTime, t0VarM16280b);
            }
        }
    }

    @Override // tx.h0
    /* renamed from: w */
    public final void mo13517w(long j6, C7251k c7251k) {
        long j10 = j6 > 0 ? j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6 : 0L;
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j10 + jNanoTime, c7251k);
            Q0(jNanoTime, r0Var);
            c7251k.m13543u(new C7248h(2, r0Var));
        }
    }
}
