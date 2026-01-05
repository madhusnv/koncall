package tx;

import ay.C0496f;
import ex.InterfaceC2141e;
import i9.C3183a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.DispatchException;
import l7.C4417q;
import og.bb;
import og.md;
import og.od;
import ox.C5770a;
import ox.EnumC5772c;
import pg.n6;
import qw.C6364n;
import rw.C6668r;
import sq.i2;
import th.AbstractC7152b;
import uw.C7560d;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7561e;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.InterfaceC8194d;
import yx.AbstractC8808b;
import yx.C8810d;
import yx.C8812f;
import yx.C8822p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a */
    public static final C4417q f34605a;

    /* renamed from: b */
    public static final C4417q f34606b;

    /* renamed from: c */
    public static final C4417q f34607c;

    /* renamed from: d */
    public static final C4417q f34608d;

    /* renamed from: e */
    public static final C4417q f34609e;

    /* renamed from: f */
    public static final C4417q f34610f;

    /* renamed from: g */
    public static final C4417q f34611g;

    /* renamed from: h */
    public static final C4417q f34612h;

    /* renamed from: i */
    public static final q0 f34613i = new q0(false);

    /* renamed from: j */
    public static final q0 f34614j = new q0(true);

    static {
        int i10 = 3;
        f34605a = new C4417q("RESUME_TOKEN", i10);
        f34606b = new C4417q("REMOVED_TASK", i10);
        f34607c = new C4417q("CLOSED_EMPTY", i10);
        f34608d = new C4417q("COMPLETING_ALREADY", i10);
        f34609e = new C4417q("COMPLETING_WAITING_CHILDREN", i10);
        f34610f = new C4417q("COMPLETING_RETRY", i10);
        f34611g = new C4417q("TOO_LATE_TO_CANCEL", i10);
        f34612h = new C4417q("SEALED", i10);
    }

    /* renamed from: A */
    public static final InterfaceC7564h m13465A(InterfaceC7564h interfaceC7564h, InterfaceC7564h interfaceC7564h2) {
        return !((Boolean) interfaceC7564h2.A0(Boolean.FALSE, new i2(21))).booleanValue() ? interfaceC7564h.t0(interfaceC7564h2) : m13491n(interfaceC7564h, interfaceC7564h2, false);
    }

    /* renamed from: B */
    public static final Object m13466B(Object obj) {
        return obj instanceof C7260t ? od.m10796a(((C7260t) obj).f34677a) : obj;
    }

    /* renamed from: C */
    public static final void m13467C(C7251k c7251k, InterfaceC7559c interfaceC7559c, boolean z6) {
        Object obj = C7251k.f34648g.get(c7251k);
        Throwable thMo13531d = c7251k.mo13531d(obj);
        Object objM10796a = thMo13531d != null ? od.m10796a(thMo13531d) : c7251k.mo13532e(obj);
        if (!z6) {
            interfaceC7559c.resumeWith(objM10796a);
            return;
        }
        AbstractC4154l.m8921d(interfaceC7559c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C8812f c8812f = (C8812f) interfaceC7559c;
        AbstractC8193c abstractC8193c = c8812f.f42492e;
        Object obj2 = c8812f.f42494g;
        InterfaceC7564h context = abstractC8193c.getContext();
        Object objM16256p = AbstractC8808b.m16256p(context, obj2);
        c2 c2VarM13474J = objM16256p != AbstractC8808b.f42482d ? m13474J(abstractC8193c, context, objM16256p) : null;
        try {
            abstractC8193c.resumeWith(objM10796a);
            if (c2VarM13474J == null || c2VarM13474J.l0()) {
                AbstractC8808b.m16249i(context, objM16256p);
            }
        } catch (Throwable th2) {
            if (c2VarM13474J == null || c2VarM13474J.l0()) {
                AbstractC8808b.m16249i(context, objM16256p);
            }
            throw th2;
        }
    }

    /* renamed from: D */
    public static final Object m13468D(InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e) throws Throwable {
        w0 w0VarM13577a;
        InterfaceC7564h interfaceC7564hM13491n;
        long jJ0;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC7563g interfaceC7563g = C7560d.f36439a;
        InterfaceC7561e interfaceC7561e = (InterfaceC7561e) interfaceC7564h.o0(interfaceC7563g);
        C7565i c7565i = C7565i.f36440a;
        if (interfaceC7561e == null) {
            w0VarM13577a = w1.m13577a();
            interfaceC7564hM13491n = m13491n(c7565i, interfaceC7564h.t0(w0VarM13577a), true);
            C0496f c0496f = m0.f34659a;
            if (interfaceC7564hM13491n != c0496f && interfaceC7564hM13491n.o0(interfaceC7563g) == null) {
                interfaceC7564hM13491n = interfaceC7564hM13491n.t0(c0496f);
            }
        } else {
            if (interfaceC7561e instanceof w0) {
            }
            w0VarM13577a = (w0) w1.f34694a.get();
            interfaceC7564hM13491n = m13491n(c7565i, interfaceC7564h, true);
            C0496f c0496f2 = m0.f34659a;
            if (interfaceC7564hM13491n != c0496f2 && interfaceC7564hM13491n.o0(interfaceC7563g) == null) {
                interfaceC7564hM13491n = interfaceC7564hM13491n.t0(c0496f2);
            }
        }
        C7246f c7246f = new C7246f(interfaceC7564hM13491n, threadCurrentThread, w0VarM13577a);
        b0.DEFAULT.invoke(interfaceC2141e, c7246f, c7246f);
        w0 w0Var = c7246f.f34627e;
        if (w0Var != null) {
            int i10 = w0.f34690f;
            w0Var.I0(false);
        }
        while (true) {
            if (w0Var != null) {
                try {
                    jJ0 = w0Var.J0();
                } catch (Throwable th2) {
                    if (w0Var != null) {
                        int i11 = w0.f34690f;
                        w0Var.F0(false);
                    }
                    throw th2;
                }
            } else {
                jJ0 = Long.MAX_VALUE;
            }
            if (c7246f.m13556O()) {
                break;
            }
            LockSupport.parkNanos(c7246f, jJ0);
            if (Thread.interrupted()) {
                c7246f.m13565o(new InterruptedException());
            }
        }
        if (w0Var != null) {
            int i12 = w0.f34690f;
            w0Var.F0(false);
        }
        Object objM13473I = m13473I(k1.f34653a.get(c7246f));
        C7260t c7260t = objM13473I instanceof C7260t ? (C7260t) objM13473I : null;
        if (c7260t == null) {
            return objM13473I;
        }
        throw c7260t.f34677a;
    }

    /* renamed from: F */
    public static final Object m13470F(z1 z1Var, InterfaceC2141e interfaceC2141e) {
        m13498u(z1Var, true, new p0(0, m13493p(z1Var.f42516d.getContext()).mo13506R(z1Var.f34702e, z1Var, z1Var.f34593c)));
        return AbstractC7152b.m13416b(z1Var, false, z1Var, interfaceC2141e);
    }

    /* renamed from: G */
    public static final String m13471G(InterfaceC7559c interfaceC7559c) {
        Object objM10796a;
        if (interfaceC7559c instanceof C8812f) {
            return ((C8812f) interfaceC7559c).toString();
        }
        try {
            objM10796a = interfaceC7559c + '@' + m13494q(interfaceC7559c);
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        if (C6364n.m12363a(objM10796a) != null) {
            objM10796a = interfaceC7559c.getClass().getName() + '@' + m13494q(interfaceC7559c);
        }
        return (String) objM10796a;
    }

    /* renamed from: H */
    public static final long m13472H(long j6) {
        int i10 = C5770a.f28335d;
        boolean z6 = j6 > 0;
        if (z6) {
            return C5770a.m11293d(C5770a.m11299j(j6, bb.m10552h(999999L, EnumC5772c.NANOSECONDS)));
        }
        if (z6) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }

    /* renamed from: I */
    public static final Object m13473I(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f34615a) == null) ? obj : b1Var;
    }

    /* renamed from: J */
    public static final c2 m13474J(InterfaceC7559c interfaceC7559c, InterfaceC7564h interfaceC7564h, Object obj) {
        c2 c2Var = null;
        if ((interfaceC7559c instanceof InterfaceC8194d) && interfaceC7564h.o0(d2.f34622a) != null) {
            InterfaceC8194d callerFrame = (InterfaceC8194d) interfaceC7559c;
            while (true) {
                if ((callerFrame instanceof j0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof c2) {
                    c2Var = (c2) callerFrame;
                    break;
                }
            }
            if (c2Var != null) {
                c2Var.n0(interfaceC7564h, obj);
            }
        }
        return c2Var;
    }

    /* renamed from: K */
    public static final Object m13475K(InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) throws Throwable {
        Object objM13473I;
        InterfaceC7564h context = interfaceC7559c.getContext();
        InterfaceC7564h interfaceC7564hM13465A = m13465A(context, interfaceC7564h);
        m13490m(interfaceC7564hM13465A);
        if (interfaceC7564hM13465A == context) {
            C8822p c8822p = new C8822p(interfaceC7559c, interfaceC7564hM13465A);
            objM13473I = AbstractC7152b.m13416b(c8822p, true, c8822p, interfaceC2141e);
        } else {
            C7560d c7560d = C7560d.f36439a;
            if (AbstractC4154l.m8918a(interfaceC7564hM13465A.o0(c7560d), context.o0(c7560d))) {
                c2 c2Var = new c2(interfaceC7559c, interfaceC7564hM13465A);
                InterfaceC7564h interfaceC7564h2 = c2Var.f34593c;
                Object objM16256p = AbstractC8808b.m16256p(interfaceC7564h2, null);
                try {
                    Object objM13416b = AbstractC7152b.m13416b(c2Var, true, c2Var, interfaceC2141e);
                    AbstractC8808b.m16249i(interfaceC7564h2, objM16256p);
                    objM13473I = objM13416b;
                } catch (Throwable th2) {
                    AbstractC8808b.m16249i(interfaceC7564h2, objM16256p);
                    throw th2;
                }
            } else {
                j0 j0Var = new j0(interfaceC7559c, interfaceC7564hM13465A);
                try {
                    AbstractC8808b.m16250j(qw.a0.f30746a, n6.m11797c(n6.m11795a(interfaceC2141e, j0Var, j0Var)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0.f34642e;
                    while (true) {
                        int i10 = atomicIntegerFieldUpdater.get(j0Var);
                        if (i10 != 0) {
                            if (i10 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objM13473I = m13473I(k1.f34653a.get(j0Var));
                            if (objM13473I instanceof C7260t) {
                                throw ((C7260t) objM13473I).f34677a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(j0Var, 0, 1)) {
                            objM13473I = EnumC7794a.COROUTINE_SUSPENDED;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).f21165a;
                    }
                    j0Var.resumeWith(od.m10796a(th));
                    throw th;
                }
            }
        }
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13473I;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13476L(long r6, ex.InterfaceC2141e r8, ww.AbstractC8193c r9) {
        /*
            boolean r0 = r9 instanceof tx.a2
            if (r0 == 0) goto L13
            r0 = r9
            tx.a2 r0 = (tx.a2) r0
            int r1 = r0.f34598c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34598c = r1
            goto L18
        L13:
            tx.a2 r0 = new tx.a2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f34597b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34598c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.z r6 = r0.f34596a
            og.od.m10798c(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L29
            return r9
        L29:
            r7 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            og.od.m10798c(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5d
        L3d:
            kotlin.jvm.internal.z r9 = new kotlin.jvm.internal.z
            r9.<init>()
            r0.f34596a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r0.f34598c = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            tx.z1 r2 = new tx.z1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r2.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r9.f21164a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            java.lang.Object r6 = m13470F(r2, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            if (r6 != r1) goto L54
            return r1
        L54:
            return r6
        L55:
            r7 = move-exception
            r6 = r9
        L57:
            tx.e1 r8 = r7.f21167a
            java.lang.Object r6 = r6.f21164a
            if (r8 != r6) goto L5f
        L5d:
            r6 = 0
            return r6
        L5f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.c0.m13476L(long, ex.e, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13477M(ww.AbstractC8193c r7) {
        /*
            uw.h r0 = r7.getContext()
            m13490m(r0)
            uw.c r7 = pg.n6.m11797c(r7)
            boolean r1 = r7 instanceof yx.C8812f
            if (r1 == 0) goto L12
            yx.f r7 = (yx.C8812f) r7
            goto L13
        L12:
            r7 = 0
        L13:
            qw.a0 r1 = qw.a0.f30746a
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L88
        L1a:
            tx.v r2 = r7.f42491d
            boolean r3 = yx.AbstractC8808b.m16252l(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f42493f = r1
            r7.f34652c = r4
            r2.C0(r0, r7)
            goto L86
        L2b:
            tx.f2 r3 = new tx.f2
            tx.w r5 = tx.f2.f34629c
            r3.<init>(r5)
            uw.h r0 = r0.t0(r3)
            r7.f42493f = r1
            r7.f34652c = r4
            r2.C0(r0, r7)
            boolean r0 = r3.f34630b
            if (r0 == 0) goto L86
            tx.w0 r0 = tx.w1.m13577a()
            rw.k r2 = r0.f34693e
            if (r2 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 == 0) goto L52
            goto L17
        L52:
            long r2 = r0.f34691c
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5f
            r2 = r4
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6c
            r7.f42493f = r1
            r7.f34652c = r4
            r0.G0(r7)
            vw.a r7 = vw.EnumC7794a.COROUTINE_SUSPENDED
            goto L88
        L6c:
            r0.I0(r4)
            r7.run()     // Catch: java.lang.Throwable -> L7c
        L72:
            boolean r2 = r0.K0()     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L72
        L78:
            r0.F0(r4)
            goto L17
        L7c:
            r2 = move-exception
            r7.m13547g(r2)     // Catch: java.lang.Throwable -> L81
            goto L78
        L81:
            r7 = move-exception
            r0.F0(r4)
            throw r7
        L86:
            vw.a r7 = vw.EnumC7794a.COROUTINE_SUSPENDED
        L88:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r7 != r0) goto L8d
            return r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.c0.m13477M(ww.c):java.lang.Object");
    }

    /* renamed from: a */
    public static final CancellationException m13478a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: b */
    public static final C8810d m13479b(InterfaceC7564h interfaceC7564h) {
        if (interfaceC7564h.o0(C7263w.f34689b) == null) {
            interfaceC7564h = interfaceC7564h.t0(m13480c());
        }
        return new C8810d(interfaceC7564h);
    }

    /* renamed from: c */
    public static f1 m13480c() {
        return new f1(null);
    }

    /* renamed from: d */
    public static u1 m13481d() {
        return new u1(null);
    }

    /* renamed from: e */
    public static g0 m13482e(InterfaceC7266z interfaceC7266z, InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e, int i10) {
        if ((i10 & 1) != 0) {
            interfaceC7564h = C7565i.f36440a;
        }
        b0 b0Var = b0.DEFAULT;
        InterfaceC7564h interfaceC7564hM13503z = m13503z(interfaceC7266z, interfaceC7564h);
        g0 l1Var = b0Var.isLazy() ? new l1(interfaceC7564hM13503z, interfaceC2141e) : new g0(interfaceC7564hM13503z, true);
        b0Var.invoke(interfaceC2141e, l1Var, l1Var);
        return l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final Object m13483f(List list, AbstractC8193c abstractC8193c) {
        if (list.isEmpty()) {
            return C6668r.f31943a;
        }
        f0[] f0VarArr = (f0[]) list.toArray(new f0[0]);
        C7245e c7245e = new C7245e(f0VarArr);
        C7251k c7251k = new C7251k(1, n6.m11797c(abstractC8193c));
        c7251k.m13540p();
        int length = f0VarArr.length;
        C7243c[] c7243cArr = new C7243c[length];
        for (int i10 = 0; i10 < length; i10++) {
            m1 m1Var = f0VarArr[i10];
            m1Var.start();
            C7243c c7243c = new C7243c(c7245e, c7251k);
            c7243c.f34603f = m13498u(m1Var, true, c7243c);
            c7243cArr[i10] = c7243c;
        }
        C7244d c7244d = new C7244d(c7243cArr);
        for (int i11 = 0; i11 < length; i11++) {
            C7243c c7243c2 = c7243cArr[i11];
            c7243c2.getClass();
            C7243c.f34601h.set(c7243c2, c7244d);
        }
        if (C7251k.f34648g.get(c7251k) instanceof q1) {
            c7251k.m13543u(c7244d);
        } else {
            c7244d.m13505a();
        }
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vw.EnumC7794a m13484g(ww.AbstractC8193c r4) {
        /*
            boolean r0 = r4 instanceof tx.i0
            if (r0 == 0) goto L13
            r0 = r4
            tx.i0 r0 = (tx.i0) r0
            int r1 = r0.f34637b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34637b = r1
            goto L18
        L13:
            tx.i0 r0 = new tx.i0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f34636a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34637b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            og.od.m10798c(r4)
            goto L47
        L2f:
            og.od.m10798c(r4)
            r0.f34637b = r3
            tx.k r4 = new tx.k
            uw.c r0 = pg.n6.m11797c(r0)
            r4.<init>(r3, r0)
            r4.m13540p()
            java.lang.Object r4 = r4.m13539o()
            if (r4 != r1) goto L47
            return r1
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.c0.m13484g(ww.c):vw.a");
    }

    /* renamed from: h */
    public static final void m13485h(InterfaceC7266z interfaceC7266z, CancellationException cancellationException) {
        e1 e1Var = (e1) interfaceC7266z.mo1865w().o0(C7263w.f34689b);
        if (e1Var != null) {
            e1Var.mo13510j(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC7266z).toString());
        }
    }

    /* renamed from: i */
    public static final void m13486i(InterfaceC7564h interfaceC7564h, CancellationException cancellationException) {
        e1 e1Var = (e1) interfaceC7564h.o0(C7263w.f34689b);
        if (e1Var != null) {
            e1Var.mo13510j(cancellationException);
        }
    }

    /* renamed from: j */
    public static final Object m13487j(e1 e1Var, AbstractC8193c abstractC8193c) {
        e1Var.mo13510j(null);
        Object objMo13508U = e1Var.mo13508U(abstractC8193c);
        return objMo13508U == EnumC7794a.COROUTINE_SUSPENDED ? objMo13508U : qw.a0.f30746a;
    }

    /* renamed from: k */
    public static final Object m13488k(InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        C8822p c8822p = new C8822p(interfaceC7559c, interfaceC7559c.getContext());
        Object objM13416b = AbstractC7152b.m13416b(c8822p, true, c8822p, interfaceC2141e);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13416b;
    }

    /* renamed from: l */
    public static final Object m13489l(long j6, InterfaceC7559c interfaceC7559c) {
        if (j6 > 0) {
            C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
            c7251k.m13540p();
            if (j6 < Long.MAX_VALUE) {
                m13493p(c7251k.f34651e).mo13517w(j6, c7251k);
            }
            Object objM13539o = c7251k.m13539o();
            if (objM13539o == EnumC7794a.COROUTINE_SUSPENDED) {
                return objM13539o;
            }
        }
        return qw.a0.f30746a;
    }

    /* renamed from: m */
    public static final void m13490m(InterfaceC7564h interfaceC7564h) {
        e1 e1Var = (e1) interfaceC7564h.o0(C7263w.f34689b);
        if (e1Var != null && !e1Var.mo13509h()) {
            throw e1Var.mo13507A();
        }
    }

    /* renamed from: n */
    public static final InterfaceC7564h m13491n(InterfaceC7564h interfaceC7564h, InterfaceC7564h interfaceC7564h2, boolean z6) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC7564h.A0(bool, new i2(21))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC7564h2.A0(bool, new i2(21))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC7564h.t0(interfaceC7564h2);
        }
        i2 i2Var = new i2(22);
        C7565i c7565i = C7565i.f36440a;
        InterfaceC7564h interfaceC7564h3 = (InterfaceC7564h) interfaceC7564h.A0(c7565i, i2Var);
        Object objA0 = interfaceC7564h2;
        if (zBooleanValue2) {
            objA0 = interfaceC7564h2.A0(c7565i, new i2(23));
        }
        return interfaceC7564h3.t0((InterfaceC7564h) objA0);
    }

    /* renamed from: o */
    public static final AbstractC7262v m13492o(Executor executor) {
        return new y0(executor);
    }

    /* renamed from: p */
    public static final h0 m13493p(InterfaceC7564h interfaceC7564h) {
        InterfaceC7562f interfaceC7562fO0 = interfaceC7564h.o0(C7560d.f36439a);
        h0 h0Var = interfaceC7562fO0 instanceof h0 ? (h0) interfaceC7562fO0 : null;
        return h0Var == null ? e0.f34625a : h0Var;
    }

    /* renamed from: q */
    public static final String m13494q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: r */
    public static final e1 m13495r(InterfaceC7564h interfaceC7564h) {
        e1 e1Var = (e1) interfaceC7564h.o0(C7263w.f34689b);
        if (e1Var != null) {
            return e1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC7564h).toString());
    }

    /* renamed from: s */
    public static final C7251k m13496s(InterfaceC7559c interfaceC7559c) {
        C7251k c7251k;
        C7251k c7251k2;
        if (!(interfaceC7559c instanceof C8812f)) {
            return new C7251k(1, interfaceC7559c);
        }
        C8812f c8812f = (C8812f) interfaceC7559c;
        C4417q c4417q = AbstractC8808b.f42481c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8812f.f42490h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c8812f);
            c7251k = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c8812f, c4417q);
                c7251k2 = null;
                break;
            }
            if (obj instanceof C7251k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c8812f, obj, c4417q)) {
                    if (atomicReferenceFieldUpdater.get(c8812f) != obj) {
                        break;
                    }
                }
                c7251k2 = (C7251k) obj;
                break loop0;
            }
            if (obj != c4417q && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c7251k2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7251k.f34648g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c7251k2);
            if (!(obj2 instanceof C7259s) || ((C7259s) obj2).f34673d == null) {
                C7251k.f34647f.set(c7251k2, 536870911);
                atomicReferenceFieldUpdater2.set(c7251k2, C7242b.f34599a);
                c7251k = c7251k2;
            } else {
                c7251k2.m13537l();
            }
            if (c7251k != null) {
                return c7251k;
            }
        }
        return new C7251k(2, interfaceC7559c);
    }

    /* renamed from: t */
    public static final void m13497t(Throwable th2, InterfaceC7564h interfaceC7564h) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).f21165a;
        }
        try {
            InterfaceC7264x interfaceC7264x = (InterfaceC7264x) interfaceC7564h.o0(C7263w.f34688a);
            if (interfaceC7264x != null) {
                interfaceC7264x.mo1477P(th2);
            } else {
                AbstractC8808b.m16246f(th2, interfaceC7564h);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                md.m10764a(runtimeException, th2);
                th2 = runtimeException;
            }
            AbstractC8808b.m16246f(th2, interfaceC7564h);
        }
    }

    /* renamed from: u */
    public static final o0 m13498u(e1 e1Var, boolean z6, g1 g1Var) {
        if (e1Var instanceof k1) {
            return ((k1) e1Var).m13555N(z6, g1Var);
        }
        return e1Var.a0(g1Var.mo13463j(), z6, new C3183a(1, g1Var, g1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 25));
    }

    /* renamed from: v */
    public static final boolean m13499v(InterfaceC7266z interfaceC7266z) {
        e1 e1Var = (e1) interfaceC7266z.mo1865w().o0(C7263w.f34689b);
        if (e1Var != null) {
            return e1Var.mo13509h();
        }
        return true;
    }

    /* renamed from: w */
    public static final boolean m13500w(InterfaceC7564h interfaceC7564h) {
        e1 e1Var = (e1) interfaceC7564h.o0(C7263w.f34689b);
        if (e1Var != null) {
            return e1Var.mo13509h();
        }
        return true;
    }

    /* renamed from: x */
    public static final s1 m13501x(InterfaceC7266z interfaceC7266z, InterfaceC7564h interfaceC7564h, b0 b0Var, InterfaceC2141e interfaceC2141e) {
        InterfaceC7564h interfaceC7564hM13503z = m13503z(interfaceC7266z, interfaceC7564h);
        s1 m1Var = b0Var.isLazy() ? new m1(interfaceC7564hM13503z, interfaceC2141e) : new s1(interfaceC7564hM13503z, true);
        b0Var.invoke(interfaceC2141e, m1Var, m1Var);
        return m1Var;
    }

    /* renamed from: y */
    public static /* synthetic */ s1 m13502y(InterfaceC7266z interfaceC7266z, InterfaceC7564h interfaceC7564h, b0 b0Var, InterfaceC2141e interfaceC2141e, int i10) {
        if ((i10 & 1) != 0) {
            interfaceC7564h = C7565i.f36440a;
        }
        if ((i10 & 2) != 0) {
            b0Var = b0.DEFAULT;
        }
        return m13501x(interfaceC7266z, interfaceC7564h, b0Var, interfaceC2141e);
    }

    /* renamed from: z */
    public static final InterfaceC7564h m13503z(InterfaceC7266z interfaceC7266z, InterfaceC7564h interfaceC7564h) {
        InterfaceC7564h interfaceC7564hM13491n = m13491n(interfaceC7266z.mo1865w(), interfaceC7564h, true);
        C0496f c0496f = m0.f34659a;
        return (interfaceC7564hM13491n == c0496f || interfaceC7564hM13491n.o0(C7560d.f36439a) != null) ? interfaceC7564hM13491n : interfaceC7564hM13491n.t0(c0496f);
    }
}
