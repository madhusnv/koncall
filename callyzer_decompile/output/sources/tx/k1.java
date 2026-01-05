package tx;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import og.md;
import pg.n6;
import pg.x5;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import yx.C8814h;
import yx.C8815i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class k1 implements e1, r1 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34653a = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34654b = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k1(boolean z6) {
        this._state$volatile = z6 ? c0.f34614j : c0.f34613i;
    }

    /* renamed from: W */
    public static C7255o m13548W(C8815i c8815i) {
        while (c8815i.mo13573f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8815i.f42503b;
            C8815i c8815iM16262c = c8815i.m16262c();
            if (c8815iM16262c == null) {
                Object obj = atomicReferenceFieldUpdater.get(c8815i);
                while (true) {
                    c8815i = (C8815i) obj;
                    if (!c8815i.mo13573f()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c8815i);
                }
            } else {
                c8815i = c8815iM16262c;
            }
        }
        while (true) {
            c8815i = c8815i.m16264e();
            if (!c8815i.mo13573f()) {
                if (c8815i instanceof C7255o) {
                    return (C7255o) c8815i;
                }
                if (c8815i instanceof n1) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof j1)) {
            return obj instanceof b1 ? ((b1) obj).mo13461h() ? "Active" : "New" : obj instanceof C7260t ? "Cancelled" : "Completed";
        }
        j1 j1Var = (j1) obj;
        return j1Var.m13522c() ? "Cancelling" : j1.f34643b.get(j1Var) == 1 ? "Completing" : "Active";
    }

    @Override // tx.e1
    /* renamed from: A */
    public final CancellationException mo13507A() {
        CancellationException cancellationException;
        Object obj = f34653a.get(this);
        if (!(obj instanceof j1)) {
            if (obj instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C7260t)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((C7260t) obj).f34677a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new JobCancellationException(mo13460t(), th2, this) : cancellationException;
        }
        Throwable thM13521b = ((j1) obj).m13521b();
        if (thM13521b == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM13521b instanceof CancellationException ? (CancellationException) thM13521b : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo13460t();
        }
        return new JobCancellationException(strConcat, thM13521b, this);
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    /* renamed from: B */
    public final Object m13549B(j1 j1Var, Object obj) {
        Throwable thM13551D;
        C7260t c7260t = obj instanceof C7260t ? (C7260t) obj : null;
        Throwable th2 = c7260t != null ? c7260t.f34677a : null;
        synchronized (j1Var) {
            j1Var.m13522c();
            ArrayList arrayListM13523d = j1Var.m13523d(th2);
            thM13551D = m13551D(j1Var, arrayListM13523d);
            if (thM13551D != null && arrayListM13523d.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM13523d.size()));
                int size = arrayListM13523d.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayListM13523d.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != thM13551D && th3 != thM13551D && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        md.m10764a(thM13551D, th3);
                    }
                }
            }
        }
        if (thM13551D != null && thM13551D != th2) {
            obj = new C7260t(thM13551D, false);
        }
        if (thM13551D != null && (m13567q(thM13551D) || mo13553K(thM13551D))) {
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C7260t.f34676b.compareAndSet((C7260t) obj, 0, 1);
        }
        mo13459Y(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34653a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, j1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == j1Var) {
        }
        m13569x(j1Var, obj);
        return obj;
    }

    /* renamed from: C */
    public final Object m13550C() throws Throwable {
        Object obj = f34653a.get(this);
        if (obj instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C7260t) {
            throw ((C7260t) obj).f34677a;
        }
        return c0.m13473I(obj);
    }

    /* renamed from: D */
    public final Throwable m13551D(j1 j1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (j1Var.m13522c()) {
                return new JobCancellationException(mo13460t(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    /* renamed from: E */
    public boolean mo13514E() {
        return true;
    }

    /* renamed from: F */
    public boolean mo13515F() {
        return this instanceof C7257q;
    }

    /* renamed from: I */
    public final n1 m13552I(b1 b1Var) {
        n1 n1VarMo13462i = b1Var.mo13462i();
        if (n1VarMo13462i != null) {
            return n1VarMo13462i;
        }
        if (b1Var instanceof q0) {
            return new n1();
        }
        if (b1Var instanceof g1) {
            c0((g1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    /* renamed from: K */
    public boolean mo13553K(Throwable th2) {
        return false;
    }

    /* renamed from: M */
    public final void m13554M(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34654b;
        p1 p1Var = p1.f34666a;
        if (e1Var == null) {
            atomicReferenceFieldUpdater.set(this, p1Var);
            return;
        }
        e1Var.start();
        InterfaceC7254n interfaceC7254nW0 = e1Var.w0(this);
        atomicReferenceFieldUpdater.set(this, interfaceC7254nW0);
        if (m13556O()) {
            interfaceC7254nW0.dispose();
            atomicReferenceFieldUpdater.set(this, p1Var);
        }
    }

    /* renamed from: N */
    public final o0 m13555N(boolean z6, g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p1 p1Var;
        boolean z10;
        boolean zM16261b;
        g1Var.f34632d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f34653a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof q0;
            p1Var = p1.f34666a;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof b1)) {
                    z10 = false;
                    break;
                }
                b1 b1Var = (b1) obj;
                n1 n1VarMo13462i = b1Var.mo13462i();
                if (n1VarMo13462i == null) {
                    c0((g1) obj);
                } else {
                    if (g1Var.mo13463j()) {
                        j1 j1Var = b1Var instanceof j1 ? (j1) b1Var : null;
                        Throwable thM13521b = j1Var != null ? j1Var.m13521b() : null;
                        if (thM13521b == null) {
                            zM16261b = n1VarMo13462i.m16261b(g1Var, 5);
                        } else if (z6) {
                            g1Var.mo13464k(thM13521b);
                            return p1Var;
                        }
                    } else {
                        zM16261b = n1VarMo13462i.m16261b(g1Var, 1);
                    }
                    if (zM16261b) {
                        break;
                    }
                }
            } else {
                q0 q0Var = (q0) obj;
                if (q0Var.f34667a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(q0Var);
            }
        }
        if (z10) {
            return g1Var;
        }
        if (z6) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C7260t c7260t = obj2 instanceof C7260t ? (C7260t) obj2 : null;
            g1Var.mo13464k(c7260t != null ? c7260t.f34677a : null);
        }
        return p1Var;
    }

    /* renamed from: O */
    public final boolean m13556O() {
        return !(f34653a.get(this) instanceof b1);
    }

    /* renamed from: Q */
    public boolean mo13557Q() {
        return this instanceof C7246f;
    }

    /* renamed from: R */
    public final boolean m13558R(Object obj) {
        Object objG0;
        do {
            objG0 = g0(f34653a.get(this), obj);
            if (objG0 == c0.f34608d) {
                return false;
            }
            if (objG0 == c0.f34609e) {
                return true;
            }
        } while (objG0 == c0.f34610f);
        mo13511k(objG0);
        return true;
    }

    /* renamed from: T */
    public final Object m13559T(Object obj) {
        Object objG0;
        do {
            objG0 = g0(f34653a.get(this), obj);
            if (objG0 == c0.f34608d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C7260t c7260t = obj instanceof C7260t ? (C7260t) obj : null;
                throw new IllegalStateException(str, c7260t != null ? c7260t.f34677a : null);
            }
        } while (objG0 == c0.f34610f);
        return objG0;
    }

    @Override // tx.e1
    /* renamed from: U */
    public final Object mo13508U(AbstractC8193c abstractC8193c) {
        Object obj;
        qw.a0 a0Var;
        do {
            obj = f34653a.get(this);
            boolean z6 = obj instanceof b1;
            a0Var = qw.a0.f30746a;
            if (!z6) {
                c0.m13490m(abstractC8193c.getContext());
                return a0Var;
            }
        } while (d0(obj) < 0);
        C7251k c7251k = new C7251k(1, n6.m11797c(abstractC8193c));
        c7251k.m13540p();
        c7251k.m13543u(new C7248h(2, c0.m13498u(this, true, new C7253m(c7251k, 1))));
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (objM13539o != enumC7794a) {
            objM13539o = a0Var;
        }
        return objM13539o == enumC7794a ? objM13539o : a0Var;
    }

    /* renamed from: V */
    public String mo13560V() {
        return getClass().getSimpleName();
    }

    /* renamed from: X */
    public final void m13561X(n1 n1Var, Throwable th2) {
        n1Var.m16261b(new C8814h(4), 4);
        Object obj = C8815i.f42502a.get(n1Var);
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C8815i c8815iM16264e = (C8815i) obj; !c8815iM16264e.equals(n1Var); c8815iM16264e = c8815iM16264e.m16264e()) {
            if ((c8815iM16264e instanceof g1) && ((g1) c8815iM16264e).mo13463j()) {
                try {
                    ((g1) c8815iM16264e).mo13464k(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        md.m10764a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c8815iM16264e + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo13458L(completionHandlerException);
        }
        m13567q(th2);
    }

    @Override // tx.e1
    public final o0 a0(boolean z6, boolean z10, InterfaceC2139c interfaceC2139c) {
        return m13555N(z10, z6 ? new d1(interfaceC2139c) : new p0(1, interfaceC2139c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [tx.a1] */
    public final void b0(q0 q0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var = new n1();
        if (!q0Var.f34667a) {
            n1Var = new a1(n1Var);
        }
        do {
            atomicReferenceFieldUpdater = f34653a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, q0Var, n1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == q0Var);
    }

    public final void c0(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var = new n1();
        g1Var.getClass();
        C8815i.f42503b.set(n1Var, g1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C8815i.f42502a;
        atomicReferenceFieldUpdater2.set(n1Var, g1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(g1Var) == g1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(g1Var, g1Var, n1Var)) {
                    if (atomicReferenceFieldUpdater2.get(g1Var) != g1Var) {
                        break;
                    }
                }
                n1Var.m16263d(g1Var);
                break loop0;
            }
            break;
        }
        C8815i c8815iM16264e = g1Var.m16264e();
        do {
            atomicReferenceFieldUpdater = f34653a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g1Var, c8815iM16264e)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g1Var);
    }

    public final int d0(Object obj) {
        boolean z6 = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34653a;
        if (z6) {
            if (((q0) obj).f34667a) {
                return 0;
            }
            q0 q0Var = c0.f34614j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo13562Z();
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        n1 n1Var = ((a1) obj).f34595a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo13562Z();
        return 1;
    }

    public final Object g0(Object obj, Object obj2) {
        if (!(obj instanceof b1)) {
            return c0.f34608d;
        }
        if (((obj instanceof q0) || (obj instanceof g1)) && !(obj instanceof C7255o) && !(obj2 instanceof C7260t)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34653a;
            Object c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return c0.f34610f;
                }
            }
            mo13459Y(obj2);
            m13569x(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        n1 n1VarM13552I = m13552I(b1Var2);
        if (n1VarM13552I == null) {
            return c0.f34610f;
        }
        j1 j1Var = b1Var2 instanceof j1 ? (j1) b1Var2 : null;
        if (j1Var == null) {
            j1Var = new j1(n1VarM13552I, null);
        }
        synchronized (j1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j1.f34643b;
            if (atomicIntegerFieldUpdater.get(j1Var) == 1) {
                return c0.f34608d;
            }
            atomicIntegerFieldUpdater.set(j1Var, 1);
            if (j1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34653a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, j1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return c0.f34610f;
                    }
                }
            }
            boolean zM13522c = j1Var.m13522c();
            C7260t c7260t = obj2 instanceof C7260t ? (C7260t) obj2 : null;
            if (c7260t != null) {
                j1Var.m13520a(c7260t.f34677a);
            }
            Throwable thM13521b = zM13522c ? null : j1Var.m13521b();
            if (thM13521b != null) {
                m13561X(n1VarM13552I, thM13521b);
            }
            C7255o c7255oM13548W = m13548W(n1VarM13552I);
            if (c7255oM13548W != null && h0(j1Var, c7255oM13548W, obj2)) {
                return c0.f34609e;
            }
            n1VarM13552I.m16261b(new C8814h(2), 2);
            C7255o c7255oM13548W2 = m13548W(n1VarM13552I);
            return (c7255oM13548W2 == null || !h0(j1Var, c7255oM13548W2, obj2)) ? m13549B(j1Var, obj2) : c0.f34609e;
        }
    }

    @Override // uw.InterfaceC7562f
    public final InterfaceC7563g getKey() {
        return C7263w.f34689b;
    }

    @Override // tx.e1
    /* renamed from: h */
    public boolean mo13509h() {
        Object obj = f34653a.get(this);
        return (obj instanceof b1) && ((b1) obj).mo13461h();
    }

    public final boolean h0(j1 j1Var, C7255o c7255o, Object obj) {
        while (c0.m13498u(c7255o.f34662e, false, new i1(this, j1Var, c7255o, obj)) == p1.f34666a) {
            c7255o = m13548W(c7255o);
            if (c7255o == null) {
                return false;
            }
        }
        return true;
    }

    @Override // tx.e1
    public final boolean isCancelled() {
        Object obj = f34653a.get(this);
        if (obj instanceof C7260t) {
            return true;
        }
        return (obj instanceof j1) && ((j1) obj).m13522c();
    }

    @Override // tx.e1
    /* renamed from: j */
    public void mo13510j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo13460t(), null, this);
        }
        mo13566p(cancellationException);
    }

    /* renamed from: l */
    public void mo13504l(Object obj) {
        mo13511k(obj);
    }

    /* renamed from: m */
    public final Object m13563m(AbstractC8193c abstractC8193c) throws Throwable {
        Object obj;
        do {
            obj = f34653a.get(this);
            if (!(obj instanceof b1)) {
                if (obj instanceof C7260t) {
                    throw ((C7260t) obj).f34677a;
                }
                return c0.m13473I(obj);
            }
        } while (d0(obj) < 0);
        h1 h1Var = new h1(n6.m11797c(abstractC8193c), this);
        h1Var.m13540p();
        int i10 = 2;
        h1Var.m13543u(new C7248h(i10, c0.m13498u(this, true, new p0(i10, h1Var))));
        Object objM13539o = h1Var.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* renamed from: n */
    public Object m13564n() {
        return m13550C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13565o(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.k1.m13565o(java.lang.Object):boolean");
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7562f o0(InterfaceC7563g interfaceC7563g) {
        return x5.m11926a(this, interfaceC7563g);
    }

    /* renamed from: p */
    public void mo13566p(CancellationException cancellationException) {
        m13565o(cancellationException);
    }

    /* renamed from: q */
    public final boolean m13567q(Throwable th2) {
        if (mo13557Q()) {
            return true;
        }
        boolean z6 = th2 instanceof CancellationException;
        InterfaceC7254n interfaceC7254n = (InterfaceC7254n) f34654b.get(this);
        return (interfaceC7254n == null || interfaceC7254n == p1.f34666a) ? z6 : interfaceC7254n.mo13572a(th2) || z6;
    }

    @Override // tx.e1
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(f34653a.get(this));
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    /* renamed from: t */
    public String mo13460t() {
        return "Job was cancelled";
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7564h t0(InterfaceC7564h interfaceC7564h) {
        return x5.m11928d(this, interfaceC7564h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo13560V() + '{' + e0(f34653a.get(this)) + '}');
        sb2.append('@');
        sb2.append(c0.m13494q(this));
        return sb2.toString();
    }

    /* renamed from: v */
    public boolean mo13568v(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return m13565o(th2) && mo13514E();
    }

    @Override // tx.e1
    public final o0 v0(InterfaceC2139c interfaceC2139c) {
        return m13555N(true, new p0(1, interfaceC2139c));
    }

    @Override // tx.e1
    public final InterfaceC7254n w0(k1 k1Var) {
        C7255o c7255o = new C7255o(k1Var);
        c7255o.f34632d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34653a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                if (q0Var.f34667a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7255o)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(q0Var);
            } else {
                boolean z6 = obj instanceof b1;
                p1 p1Var = p1.f34666a;
                if (!z6) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C7260t c7260t = obj2 instanceof C7260t ? (C7260t) obj2 : null;
                    c7255o.mo13464k(c7260t != null ? c7260t.f34677a : null);
                    return p1Var;
                }
                n1 n1VarMo13462i = ((b1) obj).mo13462i();
                if (n1VarMo13462i == null) {
                    c0((g1) obj);
                } else if (!n1VarMo13462i.m16261b(c7255o, 7)) {
                    boolean zM16261b = n1VarMo13462i.m16261b(c7255o, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof j1) {
                        thM13521b = ((j1) obj3).m13521b();
                    } else {
                        C7260t c7260t2 = obj3 instanceof C7260t ? (C7260t) obj3 : null;
                        if (c7260t2 != null) {
                            thM13521b = c7260t2.f34677a;
                        }
                    }
                    c7255o.mo13464k(thM13521b);
                    if (zM16261b) {
                        break loop0;
                    }
                    return p1Var;
                }
            }
        }
        return c7255o;
    }

    /* renamed from: x */
    public final void m13569x(b1 b1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34654b;
        InterfaceC7254n interfaceC7254n = (InterfaceC7254n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC7254n != null) {
            interfaceC7254n.dispose();
            atomicReferenceFieldUpdater.set(this, p1.f34666a);
        }
        CompletionHandlerException completionHandlerException = null;
        C7260t c7260t = obj instanceof C7260t ? (C7260t) obj : null;
        Throwable th2 = c7260t != null ? c7260t.f34677a : null;
        if (b1Var instanceof g1) {
            try {
                ((g1) b1Var).mo13464k(th2);
                return;
            } catch (Throwable th3) {
                mo13458L(new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th3));
                return;
            }
        }
        n1 n1VarMo13462i = b1Var.mo13462i();
        if (n1VarMo13462i != null) {
            n1VarMo13462i.m16261b(new C8814h(1), 1);
            Object obj2 = C8815i.f42502a.get(n1VarMo13462i);
            AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C8815i c8815iM16264e = (C8815i) obj2; !c8815iM16264e.equals(n1VarMo13462i); c8815iM16264e = c8815iM16264e.m16264e()) {
                if (c8815iM16264e instanceof g1) {
                    try {
                        ((g1) c8815iM16264e).mo13464k(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            md.m10764a(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c8815iM16264e + " for " + this, th4);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo13458L(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* renamed from: y */
    public final Throwable m13570y(Object obj) {
        CancellationException cancellationExceptionM13521b;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k1 k1Var = (k1) ((r1) obj);
        Object obj2 = f34653a.get(k1Var);
        if (obj2 instanceof j1) {
            cancellationExceptionM13521b = ((j1) obj2).m13521b();
        } else if (obj2 instanceof C7260t) {
            cancellationExceptionM13521b = ((C7260t) obj2).f34677a;
        } else {
            if (obj2 instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionM13521b = null;
        }
        CancellationException cancellationException = cancellationExceptionM13521b instanceof CancellationException ? cancellationExceptionM13521b : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(e0(obj2)), cancellationExceptionM13521b, k1Var) : cancellationException;
    }

    @Override // uw.InterfaceC7564h
    /* renamed from: z */
    public final InterfaceC7564h mo1766z(InterfaceC7563g interfaceC7563g) {
        return x5.m11927b(this, interfaceC7563g);
    }

    /* renamed from: Z */
    public void mo13562Z() {
    }

    /* renamed from: L */
    public void mo13458L(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* renamed from: Y */
    public void mo13459Y(Object obj) {
    }

    /* renamed from: k */
    public void mo13511k(Object obj) {
    }
}
