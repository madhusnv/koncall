package tx;

import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import l7.C4417q;
import qw.C6364n;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.InterfaceC8194d;
import yx.AbstractC8808b;
import yx.AbstractC8823q;
import yx.C8812f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.k */
/* loaded from: classes3.dex */
public class C7251k extends k0 implements InterfaceC7250j, InterfaceC8194d, e2 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34647f = AtomicIntegerFieldUpdater.newUpdater(C7251k.class, "_decisionAndIndex$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34648g = AtomicReferenceFieldUpdater.newUpdater(C7251k.class, Object.class, "_state$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34649h = AtomicReferenceFieldUpdater.newUpdater(C7251k.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public final InterfaceC7559c f34650d;

    /* renamed from: e */
    public final InterfaceC7564h f34651e;

    public C7251k(int i10, InterfaceC7559c interfaceC7559c) {
        super(i10);
        this.f34650d = interfaceC7559c;
        this.f34651e = interfaceC7559c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C7242b.f34599a;
    }

    /* renamed from: C */
    public static Object m13524C(q1 q1Var, Object obj, int i10, InterfaceC2142f interfaceC2142f) {
        if (obj instanceof C7260t) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (interfaceC2142f != null || (q1Var instanceof InterfaceC7249i)) {
            return new C7259s(obj, q1Var instanceof InterfaceC7249i ? (InterfaceC7249i) q1Var : null, interfaceC2142f, (Throwable) null, 16);
        }
        return obj;
    }

    /* renamed from: x */
    public static void m13525x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: A */
    public final void m13526A(Object obj, int i10, InterfaceC2142f interfaceC2142f) throws DispatchException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34648g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object objM13524C = m13524C((q1) obj2, obj, i10, interfaceC2142f);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM13524C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m13545w()) {
                    m13537l();
                }
                m13538m(i10);
                return;
            }
            if (obj2 instanceof C7252l) {
                C7252l c7252l = (C7252l) obj2;
                if (C7252l.f34655c.compareAndSet(c7252l, 0, 1)) {
                    if (interfaceC2142f != null) {
                        m13535j(interfaceC2142f, c7252l.f34677a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* renamed from: B */
    public final void m13527B(AbstractC7262v abstractC7262v) throws DispatchException {
        InterfaceC7559c interfaceC7559c = this.f34650d;
        C8812f c8812f = interfaceC7559c instanceof C8812f ? (C8812f) interfaceC7559c : null;
        m13526A(qw.a0.f30746a, (c8812f != null ? c8812f.f42491d : null) == abstractC7262v ? 4 : this.f34652c, null);
    }

    /* renamed from: D */
    public final C4417q m13528D(Object obj, InterfaceC2142f interfaceC2142f) {
        C4417q c4417q = c0.f34605a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34648g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof q1)) {
                return null;
            }
            Object objM13524C = m13524C((q1) obj2, obj, this.f34652c, interfaceC2142f);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM13524C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m13545w()) {
                m13537l();
            }
            return c4417q;
        }
    }

    @Override // tx.e2
    /* renamed from: a */
    public final void mo5076a(AbstractC8823q abstractC8823q, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f34647f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        m13543u(abstractC8823q);
    }

    @Override // tx.k0
    /* renamed from: b */
    public final void mo13529b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34648g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C7260t) {
                return;
            }
            if (!(obj instanceof C7259s)) {
                cancellationException2 = cancellationException;
                C7259s c7259s = new C7259s(obj, (InterfaceC7249i) null, (InterfaceC2142f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7259s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C7259s c7259s2 = (C7259s) obj;
            if (c7259s2.f34674e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C7259s c7259sM13574a = C7259s.m13574a(c7259s2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7259sM13574a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC7249i interfaceC7249i = c7259s2.f34671b;
            if (interfaceC7249i != null) {
                m13534i(interfaceC7249i, cancellationException);
            }
            InterfaceC2142f interfaceC2142f = c7259s2.f34672c;
            if (interfaceC2142f != null) {
                m13535j(interfaceC2142f, cancellationException, c7259s2.f34670a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // tx.k0
    /* renamed from: c */
    public final InterfaceC7559c mo13530c() {
        return this.f34650d;
    }

    @Override // tx.InterfaceC7250j
    public final boolean cancel(Throwable th2) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34648g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q1)) {
                return false;
            }
            boolean z6 = (obj instanceof InterfaceC7249i) || (obj instanceof AbstractC8823q);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            C7252l c7252l = new C7252l(cancellationException, z6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7252l)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            q1 q1Var = (q1) obj;
            if (q1Var instanceof InterfaceC7249i) {
                m13534i((InterfaceC7249i) obj, th2);
            } else if (q1Var instanceof AbstractC8823q) {
                m13536k((AbstractC8823q) obj, th2);
            }
            if (!m13545w()) {
                m13537l();
            }
            m13538m(this.f34652c);
            return true;
        }
    }

    @Override // tx.k0
    /* renamed from: d */
    public final Throwable mo13531d(Object obj) {
        Throwable thMo13531d = super.mo13531d(obj);
        if (thMo13531d != null) {
            return thMo13531d;
        }
        return null;
    }

    @Override // tx.k0
    /* renamed from: e */
    public final Object mo13532e(Object obj) {
        return obj instanceof C7259s ? ((C7259s) obj).f34670a : obj;
    }

    @Override // tx.InterfaceC7250j
    /* renamed from: f */
    public final void mo5485f(Object obj, InterfaceC2142f interfaceC2142f) throws DispatchException {
        m13526A(obj, this.f34652c, interfaceC2142f);
    }

    @Override // ww.InterfaceC8194d
    public final InterfaceC8194d getCallerFrame() {
        InterfaceC7559c interfaceC7559c = this.f34650d;
        if (interfaceC7559c instanceof InterfaceC8194d) {
            return (InterfaceC8194d) interfaceC7559c;
        }
        return null;
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return this.f34651e;
    }

    @Override // tx.k0
    /* renamed from: h */
    public final Object mo13533h() {
        return f34648g.get(this);
    }

    /* renamed from: i */
    public final void m13534i(InterfaceC7249i interfaceC7249i, Throwable th2) {
        try {
            interfaceC7249i.mo5077b(th2);
        } catch (Throwable th3) {
            c0.m13497t(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3), this.f34651e);
        }
    }

    /* renamed from: j */
    public final void m13535j(InterfaceC2142f interfaceC2142f, Throwable th2, Object obj) {
        InterfaceC7564h interfaceC7564h = this.f34651e;
        try {
            interfaceC2142f.invoke(th2, obj, interfaceC7564h);
        } catch (Throwable th3) {
            c0.m13497t(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3), interfaceC7564h);
        }
    }

    /* renamed from: k */
    public final void m13536k(AbstractC8823q abstractC8823q, Throwable th2) {
        InterfaceC7564h interfaceC7564h = this.f34651e;
        int i10 = f34647f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC8823q.mo5496h(i10, interfaceC7564h);
        } catch (Throwable th3) {
            c0.m13497t(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3), interfaceC7564h);
        }
    }

    /* renamed from: l */
    public final void m13537l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34649h;
        o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var == null) {
            return;
        }
        o0Var.dispose();
        atomicReferenceFieldUpdater.set(this, p1.f34666a);
    }

    /* renamed from: m */
    public final void m13538m(int i10) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f34647f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z6 = i10 == 4;
                InterfaceC7559c interfaceC7559c = this.f34650d;
                if (!z6 && (interfaceC7559c instanceof C8812f)) {
                    boolean z10 = i10 == 1 || i10 == 2;
                    int i13 = this.f34652c;
                    if (z10 == (i13 == 1 || i13 == 2)) {
                        C8812f c8812f = (C8812f) interfaceC7559c;
                        AbstractC7262v abstractC7262v = c8812f.f42491d;
                        InterfaceC7564h context = c8812f.f42492e.getContext();
                        if (AbstractC8808b.m16252l(abstractC7262v, context)) {
                            AbstractC8808b.m16251k(abstractC7262v, context, this);
                            return;
                        }
                        w0 w0VarM13577a = w1.m13577a();
                        if (w0VarM13577a.f34691c >= 4294967296L) {
                            w0VarM13577a.G0(this);
                            return;
                        }
                        w0VarM13577a.I0(true);
                        try {
                            c0.m13467C(this, interfaceC7559c, true);
                            do {
                            } while (w0VarM13577a.K0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                c0.m13467C(this, interfaceC7559c, z6);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    /* renamed from: n */
    public Throwable mo13518n(k1 k1Var) {
        return k1Var.mo13507A();
    }

    /* renamed from: o */
    public final Object m13539o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        e1 e1Var;
        boolean zM13545w = m13545w();
        do {
            atomicIntegerFieldUpdater = f34647f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM13545w) {
                    m13546z();
                }
                Object obj = f34648g.get(this);
                if (obj instanceof C7260t) {
                    throw ((C7260t) obj).f34677a;
                }
                int i12 = this.f34652c;
                if ((i12 != 1 && i12 != 2) || (e1Var = (e1) this.f34651e.o0(C7263w.f34689b)) == null || e1Var.mo13509h()) {
                    return mo13532e(obj);
                }
                CancellationException cancellationExceptionMo13507A = e1Var.mo13507A();
                mo13529b(cancellationExceptionMo13507A);
                throw cancellationExceptionMo13507A;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((o0) f34649h.get(this)) == null) {
            m13541q();
        }
        if (zM13545w) {
            m13546z();
        }
        return EnumC7794a.COROUTINE_SUSPENDED;
    }

    /* renamed from: p */
    public final void m13540p() {
        o0 o0VarM13541q = m13541q();
        if (o0VarM13541q == null || (f34648g.get(this) instanceof q1)) {
            return;
        }
        o0VarM13541q.dispose();
        f34649h.set(this, p1.f34666a);
    }

    /* renamed from: q */
    public final o0 m13541q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = (e1) this.f34651e.o0(C7263w.f34689b);
        if (e1Var == null) {
            return null;
        }
        o0 o0VarM13498u = c0.m13498u(e1Var, true, new C7253m(this, 0));
        do {
            atomicReferenceFieldUpdater = f34649h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, o0VarM13498u)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return o0VarM13498u;
    }

    @Override // tx.InterfaceC7250j
    /* renamed from: r */
    public final C4417q mo5486r(Object obj, InterfaceC2142f interfaceC2142f) {
        return m13528D(obj, interfaceC2142f);
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        Throwable thM12363a = C6364n.m12363a(obj);
        if (thM12363a != null) {
            obj = new C7260t(thM12363a, false);
        }
        m13526A(obj, this.f34652c, null);
    }

    @Override // tx.InterfaceC7250j
    /* renamed from: s */
    public final void mo5487s(Object obj) throws DispatchException {
        m13538m(this.f34652c);
    }

    /* renamed from: t */
    public final void m13542t(InterfaceC2139c interfaceC2139c) {
        m13543u(new C7248h(1, interfaceC2139c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo13519y());
        sb2.append('(');
        sb2.append(c0.m13471G(this.f34650d));
        sb2.append("){");
        Object obj = f34648g.get(this);
        sb2.append(obj instanceof q1 ? "Active" : obj instanceof C7252l ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(c0.m13494q(this));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        m13525x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        throw null;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13543u(tx.q1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = tx.C7251k.f34648g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof tx.C7242b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La5
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof tx.InterfaceC7249i
            r3 = 0
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof yx.AbstractC8823q
            if (r1 != 0) goto Lae
            boolean r1 = r2 instanceof tx.C7260t
            if (r1 == 0) goto L52
            r0 = r2
            tx.t r0 = (tx.C7260t) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = tx.C7260t.f34676b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4e
            boolean r1 = r2 instanceof tx.C7252l
            if (r1 == 0) goto La5
            java.lang.Throwable r0 = r0.f34677a
            boolean r1 = r8 instanceof tx.InterfaceC7249i
            if (r1 == 0) goto L43
            tx.i r8 = (tx.InterfaceC7249i) r8
            r7.m13534i(r8, r0)
            return
        L43:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r8, r1)
            yx.q r8 = (yx.AbstractC8823q) r8
            r7.m13536k(r8, r0)
            return
        L4e:
            m13525x(r8, r2)
            throw r3
        L52:
            boolean r1 = r2 instanceof tx.C7259s
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L8b
            r1 = r2
            tx.s r1 = (tx.C7259s) r1
            tx.i r5 = r1.f34671b
            if (r5 != 0) goto L87
            boolean r5 = r8 instanceof yx.AbstractC8823q
            if (r5 == 0) goto L64
            return
        L64:
            kotlin.jvm.internal.AbstractC4154l.m8921d(r8, r4)
            r4 = r8
            tx.i r4 = (tx.InterfaceC7249i) r4
            java.lang.Throwable r5 = r1.f34674e
            if (r5 == 0) goto L72
            r7.m13534i(r4, r5)
            return
        L72:
            r5 = 29
            tx.s r1 = tx.C7259s.m13574a(r1, r4, r3, r5)
        L78:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7f
            goto La5
        L7f:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L78
            goto L0
        L87:
            m13525x(r8, r2)
            throw r3
        L8b:
            boolean r1 = r8 instanceof yx.AbstractC8823q
            if (r1 == 0) goto L90
            return
        L90:
            kotlin.jvm.internal.AbstractC4154l.m8921d(r8, r4)
            r3 = r8
            tx.i r3 = (tx.InterfaceC7249i) r3
            tx.s r1 = new tx.s
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9f:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La6
        La5:
            return
        La6:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9f
            goto L0
        Lae:
            m13525x(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.C7251k.m13543u(tx.q1):void");
    }

    /* renamed from: v */
    public final boolean m13544v() {
        return f34648g.get(this) instanceof q1;
    }

    /* renamed from: w */
    public final boolean m13545w() {
        if (this.f34652c != 2) {
            return false;
        }
        InterfaceC7559c interfaceC7559c = this.f34650d;
        AbstractC4154l.m8921d(interfaceC7559c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C8812f.f42490h.get((C8812f) interfaceC7559c) != null;
    }

    /* renamed from: y */
    public String mo13519y() {
        return "CancellableContinuation";
    }

    /* renamed from: z */
    public final void m13546z() {
        InterfaceC7559c interfaceC7559c = this.f34650d;
        Throwable th2 = null;
        C8812f c8812f = interfaceC7559c instanceof C8812f ? (C8812f) interfaceC7559c : null;
        if (c8812f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8812f.f42490h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c8812f);
                C4417q c4417q = AbstractC8808b.f42481c;
                if (obj == c4417q) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c8812f, c4417q, this)) {
                        if (atomicReferenceFieldUpdater.get(c8812f) != c4417q) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c8812f, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c8812f) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            m13537l();
            cancel(th2);
        }
    }
}
