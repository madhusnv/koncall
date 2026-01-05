package yx;

import a2.AbstractC0030c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import kotlinx.coroutines.internal.UndeliveredElementException;
import l7.C4417q;
import mm.AbstractC4801l;
import nx.AbstractC5185w;
import og.md;
import tx.AbstractC7262v;
import tx.InterfaceC7264x;
import tx.c0;
import tx.v1;
import uw.InterfaceC7564h;
import vr.C7734b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8808b {

    /* renamed from: a */
    public static final C4417q f42479a;

    /* renamed from: b */
    public static final C4417q f42480b;

    /* renamed from: c */
    public static final C4417q f42481c;

    /* renamed from: d */
    public static final C4417q f42482d;

    /* renamed from: e */
    public static final C7734b f42483e = new C7734b(23);

    /* renamed from: f */
    public static final C7734b f42484f = new C7734b(24);

    /* renamed from: g */
    public static final C7734b f42485g = new C7734b(25);

    static {
        int i10 = 3;
        f42479a = new C4417q("CLOSED", i10);
        f42480b = new C4417q("UNDEFINED", i10);
        f42481c = new C4417q("REUSABLE_CLAIMED", i10);
        f42482d = new C4417q("NO_THREAD_ELEMENTS", i10);
    }

    /* renamed from: a */
    public static final void m16241a(InterfaceC2139c interfaceC2139c, Object obj, InterfaceC7564h interfaceC7564h) {
        UndeliveredElementException undeliveredElementExceptionM16242b = m16242b(interfaceC2139c, obj, null);
        if (undeliveredElementExceptionM16242b != null) {
            c0.m13497t(undeliveredElementExceptionM16242b, interfaceC7564h);
        }
    }

    /* renamed from: b */
    public static final UndeliveredElementException m16242b(InterfaceC2139c interfaceC2139c, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            interfaceC2139c.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException(AbstractC0030c.m118i(obj, "Exception in undelivered element handler for "), th2);
            }
            md.m10764a(undeliveredElementException, th2);
            return undeliveredElementException;
        }
    }

    /* renamed from: c */
    public static final void m16243c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* renamed from: d */
    public static final Object m16244d(AbstractC8823q abstractC8823q, long j6, InterfaceC2141e interfaceC2141e) {
        while (true) {
            if (abstractC8823q.f42518c >= j6 && !abstractC8823q.mo16259d()) {
                return abstractC8823q;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC8809c.f42486a;
            Object obj = atomicReferenceFieldUpdater.get(abstractC8823q);
            C4417q c4417q = f42479a;
            if (obj == c4417q) {
                return c4417q;
            }
            AbstractC8823q abstractC8823q2 = (AbstractC8823q) ((AbstractC8809c) obj);
            if (abstractC8823q2 == null) {
                abstractC8823q2 = (AbstractC8823q) interfaceC2141e.invoke(Long.valueOf(abstractC8823q.f42518c + 1), abstractC8823q);
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC8823q, null, abstractC8823q2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC8823q) != null) {
                        break;
                    }
                }
                if (abstractC8823q.mo16259d()) {
                    abstractC8823q.m16260e();
                }
            }
            abstractC8823q = abstractC8823q2;
        }
    }

    /* renamed from: e */
    public static final AbstractC8823q m16245e(Object obj) {
        if (obj != f42479a) {
            return (AbstractC8823q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* renamed from: f */
    public static final void m16246f(Throwable th2, InterfaceC7564h interfaceC7564h) {
        Throwable runtimeException;
        Iterator it = AbstractC8811e.f42489a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC7264x) it.next()).mo1477P(th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    md.m10764a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            md.m10764a(th2, new DiagnosticCoroutineContextException(interfaceC7564h));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    /* renamed from: g */
    public static final boolean m16247g(Object obj) {
        return obj == f42479a;
    }

    /* renamed from: h */
    public static final Object m16248h(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* renamed from: i */
    public static final void m16249i(InterfaceC7564h interfaceC7564h, Object obj) {
        if (obj == f42482d) {
            return;
        }
        if (!(obj instanceof C8829w)) {
            Object objA0 = interfaceC7564h.A0(null, f42484f);
            AbstractC4154l.m8921d(objA0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((v1) objA0).mo9584H(interfaceC7564h, obj);
            return;
        }
        C8829w c8829w = (C8829w) obj;
        v1[] v1VarArr = c8829w.f42529c;
        int length = v1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            v1 v1Var = v1VarArr[length];
            AbstractC4154l.m8920c(v1Var);
            v1Var.mo9584H(interfaceC7564h, c8829w.f42528b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16250j(java.lang.Object r9, uw.InterfaceC7559c r10) throws kotlinx.coroutines.DispatchException {
        /*
            boolean r0 = r10 instanceof yx.C8812f
            if (r0 == 0) goto Lae
            yx.f r10 = (yx.C8812f) r10
            tx.v r0 = r10.f42491d
            ww.c r1 = r10.f42492e
            java.lang.Throwable r2 = qw.C6364n.m12363a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            tx.t r3 = new tx.t
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            uw.h r2 = r1.getContext()
            boolean r2 = m16252l(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f42493f = r3
            r10.f34652c = r4
            uw.h r9 = r1.getContext()
            m16251k(r0, r9, r10)
            return
        L2f:
            tx.w0 r0 = tx.w1.m13577a()
            long r5 = r0.f34691c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f42493f = r3
            r10.f34652c = r4
            r0.G0(r10)
            goto La8
        L46:
            r0.I0(r4)
            uw.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            tx.w r3 = tx.C7263w.f34689b     // Catch: java.lang.Throwable -> L69
            uw.f r2 = r2.o0(r3)     // Catch: java.lang.Throwable -> L69
            tx.e1 r2 = (tx.e1) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.mo13509h()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.mo13507A()     // Catch: java.lang.Throwable -> L69
            qw.m r9 = og.od.m10796a(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.f42494g     // Catch: java.lang.Throwable -> L69
            uw.h r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = m16256p(r3, r2)     // Catch: java.lang.Throwable -> L69
            l7.q r5 = yx.AbstractC8808b.f42482d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            tx.c2 r5 = tx.c0.m13474J(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.l0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            m16249i(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.K0()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.F0(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.l0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            m16249i(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.m13547g(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.F0(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yx.AbstractC8808b.m16250j(java.lang.Object, uw.c):void");
    }

    /* renamed from: k */
    public static final void m16251k(AbstractC7262v abstractC7262v, InterfaceC7564h interfaceC7564h, Runnable runnable) throws DispatchException {
        try {
            abstractC7262v.B0(interfaceC7564h, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, abstractC7262v, interfaceC7564h);
        }
    }

    /* renamed from: l */
    public static final boolean m16252l(AbstractC7262v abstractC7262v, InterfaceC7564h interfaceC7564h) throws DispatchException {
        try {
            return abstractC7262v.D0(interfaceC7564h);
        } catch (Throwable th2) {
            throw new DispatchException(th2, abstractC7262v, interfaceC7564h);
        }
    }

    /* renamed from: m */
    public static final long m16253m(long j6, long j10, long j11, String str) {
        String property;
        int i10 = AbstractC8825s.f42520a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j6;
        }
        Long lM10141w = AbstractC5185w.m10141w(property);
        if (lM10141w == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM10141w.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: n */
    public static int m16254n(int i10, int i11, String str) {
        return (int) m16253m(i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    /* renamed from: o */
    public static final Object m16255o(InterfaceC7564h interfaceC7564h) {
        Object objA0 = interfaceC7564h.A0(0, f42483e);
        AbstractC4154l.m8920c(objA0);
        return objA0;
    }

    /* renamed from: p */
    public static final Object m16256p(InterfaceC7564h interfaceC7564h, Object obj) {
        if (obj == null) {
            obj = m16255o(interfaceC7564h);
        }
        return obj == 0 ? f42482d : obj instanceof Integer ? interfaceC7564h.A0(new C8829w(((Number) obj).intValue(), interfaceC7564h), f42485g) : ((v1) obj).f0(interfaceC7564h);
    }
}
