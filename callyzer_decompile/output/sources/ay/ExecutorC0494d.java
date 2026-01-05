package ay;

import com.sun.mail.util.AbstractC1452a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tx.c0;
import yx.C8821o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.d */
/* loaded from: classes3.dex */
public final class ExecutorC0494d implements Executor, Closeable {

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f3527h = AtomicLongFieldUpdater.newUpdater(ExecutorC0494d.class, "parkedWorkersStack$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f3528j = AtomicLongFieldUpdater.newUpdater(ExecutorC0494d.class, "controlState$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3529k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0494d.class, "_isTerminated$volatile");

    /* renamed from: l */
    public static final C4417q f3530l = new C4417q("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a */
    public final int f3531a;

    /* renamed from: b */
    public final int f3532b;

    /* renamed from: c */
    public final long f3533c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d */
    public final String f3534d;

    /* renamed from: e */
    public final C0497g f3535e;

    /* renamed from: f */
    public final C0497g f3536f;

    /* renamed from: g */
    public final C8821o f3537g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC0494d(String str, int i10, int i11, long j6) {
        this.f3531a = i10;
        this.f3532b = i11;
        this.f3533c = j6;
        this.f3534d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Max pool size ", i11, i10, " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f3535e = new C0497g();
        this.f3536f = new C0497g();
        this.f3537g = new C8821o((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
    }

    /* renamed from: n */
    public static /* synthetic */ void m1492n(ExecutorC0494d executorC0494d, Runnable runnable, int i10) {
        executorC0494d.m1494j(runnable, false, (i10 & 4) == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ay.ExecutorC0494d.f3529k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof ay.C0492b
            r3 = 0
            if (r1 == 0) goto L17
            ay.b r0 = (ay.C0492b) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            ay.d r1 = r0.f3526h
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            yx.o r1 = r8.f3537g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = ay.ExecutorC0494d.f3528j     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            yx.o r5 = r8.f3537g
            java.lang.Object r5 = r5.m16274b(r1)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            ay.b r5 = (ay.C0492b) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            ay.n r5 = r5.f3519a
            ay.g r6 = r8.f3536f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = ay.C0504n.f3553b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            ay.j r7 = (ay.AbstractRunnableC0500j) r7
            if (r7 == 0) goto L68
            r6.m16265a(r7)
        L68:
            ay.j r7 = r5.m1499b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.m16265a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            ay.g r1 = r8.f3536f
            r1.m16266b()
            ay.g r1 = r8.f3535e
            r1.m16266b()
        L82:
            if (r0 == 0) goto L8a
            ay.j r1 = r0.m1483a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            ay.g r1 = r8.f3535e
            java.lang.Object r1 = r1.m16268d()
            ay.j r1 = (ay.AbstractRunnableC0500j) r1
            if (r1 != 0) goto Lb2
            ay.g r1 = r8.f3536f
            java.lang.Object r1 = r1.m16268d()
            ay.j r1 = (ay.AbstractRunnableC0500j) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            ay.c r1 = ay.EnumC0493c.TERMINATED
            r0.m1490h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ay.ExecutorC0494d.f3527h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ay.ExecutorC0494d.f3528j
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ay.ExecutorC0494d.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m1492n(this, runnable, 6);
    }

    /* renamed from: h */
    public final int m1493h() {
        synchronized (this.f3537g) {
            try {
                if (f3529k.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3528j;
                long j6 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j6 & 2097151);
                int i11 = i10 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f3531a) {
                    return 0;
                }
                if (i10 >= this.f3532b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f3537g.m16274b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0492b c0492b = new C0492b(this, i12);
                this.f3537g.m16275c(i12, c0492b);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                c0492b.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m1494j(Runnable runnable, boolean z6, boolean z10) {
        AbstractRunnableC0500j c0501k;
        EnumC0493c enumC0493c;
        AbstractC0502l.f3551f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC0500j) {
            c0501k = (AbstractRunnableC0500j) runnable;
            c0501k.f3543a = jNanoTime;
            c0501k.f3544b = z6;
        } else {
            c0501k = new C0501k(runnable, jNanoTime, z6);
        }
        boolean z11 = c0501k.f3544b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3528j;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0492b c0492b = threadCurrentThread instanceof C0492b ? (C0492b) threadCurrentThread : null;
        if (c0492b == null || !AbstractC4154l.m8918a(c0492b.f3526h, this)) {
            c0492b = null;
        }
        if (c0492b != null && (enumC0493c = c0492b.f3521c) != EnumC0493c.TERMINATED && (c0501k.f3544b || enumC0493c != EnumC0493c.BLOCKING)) {
            c0492b.f3525g = true;
            C0504n c0504n = c0492b.f3519a;
            if (z10) {
                c0501k = c0504n.m1498a(c0501k);
            } else {
                c0504n.getClass();
                AbstractRunnableC0500j abstractRunnableC0500j = (AbstractRunnableC0500j) C0504n.f3553b.getAndSet(c0504n, c0501k);
                c0501k = abstractRunnableC0500j == null ? null : c0504n.m1498a(abstractRunnableC0500j);
            }
        }
        if (c0501k != null) {
            if (!(c0501k.f3544b ? this.f3536f.m16265a(c0501k) : this.f3535e.m16265a(c0501k))) {
                throw new RejectedExecutionException(AbstractC1452a.m4564k(new StringBuilder(), this.f3534d, " was terminated"));
            }
        }
        if (z11) {
            if (m1497z() || m1496w(jAddAndGet)) {
                return;
            }
            m1497z();
            return;
        }
        if (m1497z() || m1496w(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m1497z();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C8821o c8821o = this.f3537g;
        int iM16273a = c8821o.m16273a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iM16273a; i15++) {
            C0492b c0492b = (C0492b) c8821o.m16274b(i15);
            if (c0492b != null) {
                C0504n c0504n = c0492b.f3519a;
                c0504n.getClass();
                int i16 = C0504n.f3553b.get(c0504n) != null ? (C0504n.f3554c.get(c0504n) - C0504n.f3555d.get(c0504n)) + 1 : C0504n.f3554c.get(c0504n) - C0504n.f3555d.get(c0504n);
                int i17 = AbstractC0491a.f3517a[c0492b.f3521c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j6 = f3528j.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f3534d);
        sb5.append('@');
        sb5.append(c0.m13494q(this));
        sb5.append("[Pool Size {core = ");
        int i18 = this.f3531a;
        sb5.append(i18);
        sb5.append(", max = ");
        sb5.append(this.f3532b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f3535e.m16267c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f3536f.m16267c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j6));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j6) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i18 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    /* renamed from: u */
    public final void m1495u(C0492b c0492b, int i10, int i11) {
        while (true) {
            long j6 = f3527h.get(this);
            int i12 = (int) (2097151 & j6);
            long j10 = (2097152 + j6) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objM1485c = c0492b.m1485c();
                    while (true) {
                        if (objM1485c == f3530l) {
                            i12 = -1;
                            break;
                        }
                        if (objM1485c == null) {
                            i12 = 0;
                            break;
                        }
                        C0492b c0492b2 = (C0492b) objM1485c;
                        int iM1484b = c0492b2.m1484b();
                        if (iM1484b != 0) {
                            i12 = iM1484b;
                            break;
                        }
                        objM1485c = c0492b2.m1485c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f3527h.compareAndSet(this, j6, i12 | j10)) {
                    return;
                }
            }
        }
    }

    /* renamed from: w */
    public final boolean m1496w(long j6) {
        int i10 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f3531a;
        if (i10 < i11) {
            int iM1493h = m1493h();
            if (iM1493h == 1 && i11 > 1) {
                m1493h();
            }
            if (iM1493h > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m1497z() {
        C4417q c4417q;
        int iM1484b;
        while (true) {
            long j6 = f3527h.get(this);
            C0492b c0492b = (C0492b) this.f3537g.m16274b((int) (2097151 & j6));
            if (c0492b == null) {
                c0492b = null;
            } else {
                long j10 = (2097152 + j6) & (-2097152);
                Object objM1485c = c0492b.m1485c();
                while (true) {
                    c4417q = f3530l;
                    if (objM1485c == c4417q) {
                        iM1484b = -1;
                        break;
                    }
                    if (objM1485c == null) {
                        iM1484b = 0;
                        break;
                    }
                    C0492b c0492b2 = (C0492b) objM1485c;
                    iM1484b = c0492b2.m1484b();
                    if (iM1484b != 0) {
                        break;
                    }
                    objM1485c = c0492b2.m1485c();
                }
                if (iM1484b >= 0) {
                    if (f3527h.compareAndSet(this, j6, iM1484b | j10)) {
                        c0492b.m1489g(c4417q);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0492b == null) {
                return false;
            }
            if (C0492b.f3518j.compareAndSet(c0492b, -1, 0)) {
                LockSupport.unpark(c0492b);
                return true;
            }
        }
    }
}
