package k2;

import android.os.Trace;
import e1.C1922x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import l2.C4328a;
import m2.C4642g;
import mx.C4912h;
import qw.C6361k;
import rw.C6670t;
import s2.C6734c;
import s2.C6739h;
import u2.AbstractC7329z;
import u2.InterfaceC7328y;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.u */
/* loaded from: classes.dex */
public final class C3972u implements InterfaceC3968q {

    /* renamed from: a */
    public final AbstractC3969r f20557a;

    /* renamed from: b */
    public final C7439j f20558b;

    /* renamed from: c */
    public final AtomicReference f20559c = new AtomicReference(null);

    /* renamed from: d */
    public final Object f20560d = new Object();

    /* renamed from: e */
    public final e1.m0 f20561e;

    /* renamed from: f */
    public final v1 f20562f;

    /* renamed from: g */
    public final e1.j0 f20563g;

    /* renamed from: h */
    public final e1.k0 f20564h;

    /* renamed from: j */
    public final e1.k0 f20565j;

    /* renamed from: k */
    public final e1.j0 f20566k;

    /* renamed from: l */
    public final C4328a f20567l;

    /* renamed from: m */
    public final C4328a f20568m;

    /* renamed from: n */
    public final e1.j0 f20569n;

    /* renamed from: p */
    public e1.j0 f20570p;

    /* renamed from: q */
    public boolean f20571q;

    /* renamed from: r */
    public C3972u f20572r;

    /* renamed from: s */
    public int f20573s;

    /* renamed from: t */
    public final s0 f20574t;

    /* renamed from: v */
    public final C3966o f20575v;

    /* renamed from: w */
    public boolean f20576w;

    public C3972u(AbstractC3969r abstractC3969r, C7439j c7439j) {
        this.f20557a = abstractC3969r;
        this.f20558b = c7439j;
        e1.m0 m0Var = new e1.m0(new e1.k0());
        this.f20561e = m0Var;
        v1 v1Var = new v1();
        if (abstractC3969r.mo8558c()) {
            v1Var.f20603l = new C1922x();
        }
        if (abstractC3969r.mo8560e()) {
            v1Var.m8701h();
        }
        this.f20562f = v1Var;
        this.f20563g = fb.b0.m5941b();
        this.f20564h = new e1.k0();
        this.f20565j = new e1.k0();
        this.f20566k = fb.b0.m5941b();
        C4328a c4328a = new C4328a();
        this.f20567l = c4328a;
        C4328a c4328a2 = new C4328a();
        this.f20568m = c4328a2;
        this.f20569n = fb.b0.m5941b();
        this.f20570p = fb.b0.m5941b();
        this.f20574t = new s0(7);
        C3966o c3966o = new C3966o(c7439j, abstractC3969r, v1Var, m0Var, c4328a, c4328a2, this);
        abstractC3969r.mo8567l(c3966o);
        this.f20575v = c3966o;
        C6734c c6734c = AbstractC3959h.f20397a;
    }

    /* renamed from: a */
    public final void m8658a() {
        this.f20559c.set(null);
        this.f20567l.f21789a.m9062c();
        this.f20568m.f21789a.m9062c();
        e1.m0 m0Var = this.f20561e;
        if (m0Var.f9028a.m5587g()) {
            return;
        }
        new ArrayList();
        if (m0Var.f9028a.m5587g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            e1.h0 h0Var = new e1.h0(m0Var);
            C4912h c4912h = (C4912h) h0Var.f8992c;
            while (c4912h.hasNext()) {
                r1 r1Var = (r1) c4912h.next();
                h0Var.remove();
                r1Var.mo5874b();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8659b(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            e1.j0 r2 = r0.f20563g
            java.lang.Object r2 = r2.m5574g(r1)
            if (r2 == 0) goto L9a
            boolean r3 = r2 instanceof e1.k0
            e1.k0 r4 = r0.f20564h
            e1.k0 r5 = r0.f20565j
            e1.j0 r6 = r0.f20569n
            if (r3 == 0) goto L7d
            e1.k0 r2 = (e1.k0) r2
            java.lang.Object[] r3 = r2.f9006b
            long[] r2 = r2.f9005a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6c
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            k2.n1 r15 = (k2.n1) r15
            boolean r16 = fb.b0.m5942c(r6, r1, r15)
            if (r16 != 0) goto L6c
            k2.n0 r8 = r15.m8578c(r1)
            r17 = r13
            k2.n0 r13 = k2.n0.IGNORED
            if (r8 == r13) goto L6e
            e1.j0 r8 = r15.f20446g
            if (r8 == 0) goto L68
            if (r21 != 0) goto L68
            r5.m5581a(r15)
            goto L6e
        L68:
            r4.m5581a(r15)
            goto L6e
        L6c:
            r17 = r13
        L6e:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L75:
            r8 = r13
            if (r12 != r8) goto L9a
        L78:
            if (r9 == r7) goto L9a
            int r9 = r9 + 1
            goto L22
        L7d:
            k2.n1 r2 = (k2.n1) r2
            boolean r3 = fb.b0.m5942c(r6, r1, r2)
            if (r3 != 0) goto L9a
            k2.n0 r1 = r2.m8578c(r1)
            k2.n0 r3 = k2.n0.IGNORED
            if (r1 == r3) goto L9a
            e1.j0 r1 = r2.f20446g
            if (r1 == 0) goto L97
            if (r21 != 0) goto L97
            r5.m5581a(r2)
            return
        L97:
            r4.m5581a(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3972u.m8659b(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8660c(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3972u.m8660c(java.util.Set, boolean):void");
    }

    /* renamed from: d */
    public final void m8661d() {
        synchronized (this.f20560d) {
            try {
                m8662e(this.f20567l);
                m8670m();
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f20561e.f9028a.m5587g()) {
                            e1.m0 m0Var = this.f20561e;
                            new ArrayList();
                            if (!m0Var.f9028a.m5587g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    e1.h0 h0Var = new e1.h0(m0Var);
                                    while (((C4912h) h0Var.f8992c).hasNext()) {
                                        r1 r1Var = (r1) ((C4912h) h0Var.f8992c).next();
                                        h0Var.remove();
                                        r1Var.mo5874b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e2) {
                        m8658a();
                        throw e2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // k2.InterfaceC3968q
    public final void dispose() {
        synchronized (this.f20560d) {
            try {
                if (this.f20575v.f20451E) {
                    j1.m8543b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f20576w) {
                    this.f20576w = true;
                    C6734c c6734c = AbstractC3959h.f20398b;
                    C4328a c4328a = this.f20575v.f20457K;
                    if (c4328a != null) {
                        m8662e(c4328a);
                    }
                    boolean z6 = this.f20562f.f20594b > 0;
                    if (z6 || !this.f20561e.f9028a.m5587g()) {
                        C6739h c6739h = new C6739h(this.f20561e);
                        if (z6) {
                            y1 y1VarM8703q = this.f20562f.m8703q();
                            try {
                                AbstractC3967p.m8640g(y1VarM8703q, c6739h);
                                y1VarM8703q.m8736e(true);
                                this.f20558b.m14006q();
                                this.f20558b.m13995A();
                                c6739h.m12896d();
                            } catch (Throwable th2) {
                                y1VarM8703q.m8736e(false);
                                throw th2;
                            }
                        }
                        c6739h.m12895c();
                    }
                    C3966o c3966o = this.f20575v;
                    c3966o.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c3966o.f20465b.mo8570o(c3966o);
                        c3966o.f20450D.clear();
                        c3966o.f20481r.clear();
                        c3966o.f20468e.f21789a.m9062c();
                        c3966o.f20484u = null;
                        c3966o.f20464a.m14006q();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f20557a.mo8571p(this);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8662e(l2.C4328a r33) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3972u.m8662e(l2.a):void");
    }

    /* renamed from: f */
    public final void m8663f() {
        synchronized (this.f20560d) {
            try {
                if (this.f20568m.f21789a.m9065f()) {
                    m8662e(this.f20568m);
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f20561e.f9028a.m5587g()) {
                            e1.m0 m0Var = this.f20561e;
                            new ArrayList();
                            if (!m0Var.f9028a.m5587g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    e1.h0 h0Var = new e1.h0(m0Var);
                                    while (((C4912h) h0Var.f8992c).hasNext()) {
                                        r1 r1Var = (r1) ((C4912h) h0Var.f8992c).next();
                                        h0Var.remove();
                                        r1Var.mo5874b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e2) {
                        m8658a();
                        throw e2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m8664g() {
        synchronized (this.f20560d) {
            try {
                this.f20575v.f20484u = null;
                if (!this.f20561e.f9028a.m5587g()) {
                    e1.m0 m0Var = this.f20561e;
                    new ArrayList();
                    if (!m0Var.f9028a.m5587g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            e1.h0 h0Var = new e1.h0(m0Var);
                            while (((C4912h) h0Var.f8992c).hasNext()) {
                                r1 r1Var = (r1) ((C4912h) h0Var.f8992c).next();
                                h0Var.remove();
                                r1Var.mo5874b();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f20561e.f9028a.m5587g()) {
                            e1.m0 m0Var2 = this.f20561e;
                            new ArrayList();
                            if (!m0Var2.f9028a.m5587g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    e1.h0 h0Var2 = new e1.h0(m0Var2);
                                    while (((C4912h) h0Var2.f8992c).hasNext()) {
                                        r1 r1Var2 = (r1) ((C4912h) h0Var2.f8992c).next();
                                        h0Var2.remove();
                                        r1Var2.mo5874b();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e2) {
                        m8658a();
                        throw e2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8665h() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3972u.m8665h():void");
    }

    /* renamed from: i */
    public final void m8666i(C6734c c6734c) throws Exception {
        try {
            synchronized (this.f20560d) {
                m8669l();
                e1.j0 j0Var = this.f20570p;
                this.f20570p = fb.b0.m5941b();
                try {
                    this.f20574t.getClass();
                    this.f20557a.getClass();
                    C3966o c3966o = this.f20575v;
                    if (!c3966o.f20468e.f21789a.m9064e()) {
                        AbstractC3967p.m8636c("Expected applyChanges() to have been called");
                    }
                    c3966o.m8621n(j0Var, c6734c);
                } catch (Exception e2) {
                    this.f20570p = j0Var;
                    throw e2;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f20561e.f9028a.m5587g()) {
                    e1.m0 m0Var = this.f20561e;
                    new ArrayList();
                    if (!m0Var.f9028a.m5587g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            e1.h0 h0Var = new e1.h0(m0Var);
                            while (((C4912h) h0Var.f8992c).hasNext()) {
                                r1 r1Var = (r1) ((C4912h) h0Var.f8992c).next();
                                h0Var.remove();
                                r1Var.mo5874b();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e10) {
                m8658a();
                throw e10;
            }
        }
    }

    /* renamed from: j */
    public final void m8667j(C6734c c6734c) {
        if (this.f20576w) {
            j1.m8543b("The composition is disposed");
        }
        this.f20557a.mo8556a(this, c6734c);
    }

    /* renamed from: k */
    public final void m8668k() {
        synchronized (this.f20560d) {
            try {
                boolean z6 = this.f20562f.f20594b > 0;
                if (z6 || !this.f20561e.f9028a.m5587g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C6739h c6739h = new C6739h(this.f20561e);
                        if (z6) {
                            y1 y1VarM8703q = this.f20562f.m8703q();
                            try {
                                AbstractC3967p.m8638e(y1VarM8703q, c6739h);
                                y1VarM8703q.m8736e(true);
                                this.f20558b.m13995A();
                                c6739h.m12896d();
                            } catch (Throwable th2) {
                                y1VarM8703q.m8736e(false);
                                throw th2;
                            }
                        }
                        c6739h.m12895c();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f20563g.m5568a();
                this.f20566k.m5568a();
                this.f20570p.m5568a();
                this.f20567l.f21789a.m9062c();
                this.f20568m.f21789a.m9062c();
                C3966o c3966o = this.f20575v;
                c3966o.f20450D.clear();
                c3966o.f20481r.clear();
                c3966o.f20468e.f21789a.m9062c();
                c3966o.f20484u = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* renamed from: l */
    public final void m8669l() {
        Object obj = C3953b.f20347a;
        AtomicReference atomicReference = this.f20559c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC3967p.m8637d("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                m8660c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC3967p.m8637d("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                m8660c(set, true);
            }
        }
    }

    /* renamed from: m */
    public final void m8670m() {
        AtomicReference atomicReference = this.f20559c;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC4154l.m8918a(andSet, C3953b.f20347a)) {
            return;
        }
        if (andSet instanceof Set) {
            m8660c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m8660c(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC3967p.m8637d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        AbstractC3967p.m8637d("corrupt pendingModifications drain: " + atomicReference);
        throw new KotlinNothingValueException();
    }

    /* renamed from: n */
    public final void m8671n() {
        C6670t c6670t = C6670t.f31945a;
        AtomicReference atomicReference = this.f20559c;
        Object andSet = atomicReference.getAndSet(c6670t);
        if (AbstractC4154l.m8918a(andSet, C3953b.f20347a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m8660c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC3967p.m8637d("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            m8660c(set, false);
        }
    }

    /* renamed from: o */
    public final void m8672o(ArrayList arrayList) throws Exception {
        e1.m0 m0Var = this.f20561e;
        if (arrayList.size() > 0) {
            ((v0) ((C6361k) arrayList.get(0)).f30755a).getClass();
            throw null;
        }
        try {
            C3966o c3966o = this.f20575v;
            c3966o.getClass();
            try {
                c3966o.m8587D(arrayList);
                c3966o.m8617j();
            } catch (Throwable th2) {
                c3966o.m8609a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!m0Var.f9028a.m5587g()) {
                    new ArrayList();
                    if (!m0Var.f9028a.m5587g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            e1.h0 h0Var = new e1.h0(m0Var);
                            C4912h c4912h = (C4912h) h0Var.f8992c;
                            while (c4912h.hasNext()) {
                                r1 r1Var = (r1) c4912h.next();
                                h0Var.remove();
                                r1Var.mo5874b();
                            }
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                }
                throw th3;
            } catch (Exception e2) {
                m8658a();
                throw e2;
            }
        }
    }

    /* renamed from: p */
    public final n0 m8673p(n1 n1Var, Object obj) {
        C3972u c3972u;
        int i10 = n1Var.f20440a;
        if ((i10 & 2) != 0) {
            n1Var.f20440a = i10 | 4;
        }
        C3952a c3952a = n1Var.f20442c;
        if (c3952a == null || !c3952a.m8486a()) {
            return n0.IGNORED;
        }
        if (this.f20562f.m8704r(c3952a)) {
            return n1Var.f20443d != null ? m8675r(n1Var, c3952a, obj) : n0.IGNORED;
        }
        synchronized (this.f20560d) {
            c3972u = this.f20572r;
        }
        if (c3972u != null) {
            C3966o c3966o = c3972u.f20575v;
            if (c3966o.f20451E && c3966o.e0(n1Var, obj)) {
                return n0.IMMINENT;
            }
        }
        return n0.IGNORED;
    }

    /* renamed from: q */
    public final void m8674q() {
        C3972u c3972u;
        synchronized (this.f20560d) {
            try {
                for (Object obj : this.f20562f.f20595c) {
                    n1 n1Var = obj instanceof n1 ? (n1) obj : null;
                    if (n1Var != null && (c3972u = n1Var.f20441b) != null) {
                        c3972u.m8673p(n1Var, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:48:0x0096->B:62:0x00d7], EDGE_INSN: B:82:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:48:0x0096->B:62:0x00d7], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0068, B:38:0x0071, B:40:0x0075, B:41:0x007e, B:43:0x0086, B:45:0x008a, B:48:0x0096, B:50:0x00a6, B:52:0x00b2, B:54:0x00bc, B:58:0x00cb, B:62:0x00d7, B:63:0x00da, B:66:0x00df), top: B:79:0x000b }] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k2.n0 m8675r(k2.n1 r21, k2.C3952a r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3972u.m8675r(k2.n1, k2.a, java.lang.Object):k2.n0");
    }

    /* renamed from: s */
    public final void m8676s(Object obj) {
        Object objM5574g = this.f20563g.m5574g(obj);
        if (objM5574g == null) {
            return;
        }
        boolean z6 = objM5574g instanceof e1.k0;
        e1.j0 j0Var = this.f20569n;
        if (!z6) {
            n1 n1Var = (n1) objM5574g;
            if (n1Var.m8578c(obj) == n0.IMMINENT) {
                fb.b0.m5940a(j0Var, obj, n1Var);
                return;
            }
            return;
        }
        e1.k0 k0Var = (e1.k0) objM5574g;
        Object[] objArr = k0Var.f9006b;
        long[] jArr = k0Var.f9005a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        n1 n1Var2 = (n1) objArr[(i10 << 3) + i12];
                        if (n1Var2.m8578c(obj) == n0.IMMINENT) {
                            fb.b0.m5940a(j0Var, obj, n1Var2);
                        }
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m8677t(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof m2.C4642g
            e1.j0 r3 = r0.f20566k
            e1.j0 r4 = r0.f20563g
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            m2.g r1 = (m2.C4642g) r1
            e1.k0 r1 = r1.f22887a
            java.lang.Object[] r2 = r1.f9006b
            long[] r1 = r1.f9005a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.m5570c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.m5570c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.m5570c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.m5570c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3972u.m8677t(java.util.Set):boolean");
    }

    /* renamed from: u */
    public final boolean m8678u() {
        boolean zM8590G;
        synchronized (this.f20560d) {
            try {
                m8669l();
                try {
                    e1.j0 j0Var = this.f20570p;
                    this.f20570p = fb.b0.m5941b();
                    try {
                        this.f20574t.getClass();
                        this.f20557a.getClass();
                        zM8590G = this.f20575v.m8590G(j0Var);
                        if (!zM8590G) {
                            m8670m();
                        }
                    } catch (Exception e2) {
                        this.f20570p = j0Var;
                        throw e2;
                    }
                } catch (Throwable th2) {
                    try {
                        if (!this.f20561e.f9028a.m5587g()) {
                            e1.m0 m0Var = this.f20561e;
                            new ArrayList();
                            if (!m0Var.f9028a.m5587g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    e1.h0 h0Var = new e1.h0(m0Var);
                                    while (((C4912h) h0Var.f8992c).hasNext()) {
                                        r1 r1Var = (r1) ((C4912h) h0Var.f8992c).next();
                                        h0Var.remove();
                                        r1Var.mo5874b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        m8658a();
                        throw e10;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zM8590G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set[]] */
    /* renamed from: v */
    public final void m8679v(C4642g c4642g) {
        Object obj;
        boolean z6;
        C4642g c4642g2;
        do {
            obj = this.f20559c.get();
            z6 = true;
            if (obj == null ? true : obj.equals(C3953b.f20347a)) {
                c4642g2 = c4642g;
            } else if (obj instanceof Set) {
                c4642g2 = new Set[]{obj, c4642g};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f20559c).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = c4642g;
                c4642g2 = CopyOf;
            }
            AtomicReference atomicReference = this.f20559c;
            while (true) {
                if (atomicReference.compareAndSet(obj, c4642g2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z6 = false;
                    break;
                }
            }
        } while (!z6);
        if (obj == null) {
            synchronized (this.f20560d) {
                m8670m();
            }
        }
    }

    /* renamed from: w */
    public final void m8680w(Object obj) {
        n1 n1VarM8633z;
        boolean z6;
        boolean z10;
        int i10;
        int i11;
        C3966o c3966o = this.f20575v;
        if (c3966o.f20489z <= 0 && (n1VarM8633z = c3966o.m8633z()) != null) {
            boolean z11 = true;
            int i12 = n1VarM8633z.f20440a | 1;
            n1VarM8633z.f20440a = i12;
            if ((i12 & 32) == 0) {
                e1.d0 d0Var = n1VarM8633z.f20445f;
                if (d0Var == null) {
                    d0Var = new e1.d0();
                    n1VarM8633z.f20445f = d0Var;
                }
                int i13 = n1VarM8633z.f20444e;
                int iM5534c = d0Var.m5534c(obj);
                if (iM5534c < 0) {
                    iM5534c = ~iM5534c;
                    i11 = -1;
                } else {
                    i11 = d0Var.f8949c[iM5534c];
                }
                d0Var.f8948b[iM5534c] = obj;
                d0Var.f8949c[iM5534c] = i13;
                if (i11 == n1VarM8633z.f20444e) {
                    return;
                }
            }
            if (obj instanceof AbstractC7329z) {
                ((AbstractC7329z) obj).m13725e(1);
            }
            fb.b0.m5940a(this.f20563g, obj, n1VarM8633z);
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                b0 b0VarM8530g = c0Var.m8530g();
                e1.j0 j0Var = this.f20566k;
                fb.b0.m5943d(j0Var, obj);
                e1.d0 d0Var2 = b0VarM8530g.f20352e;
                Object[] objArr = d0Var2.f8948b;
                long[] jArr = d0Var2.f8947a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j6 = jArr[i14];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j6 & 255) < 128) {
                                    i10 = i15;
                                    InterfaceC7328y interfaceC7328y = (InterfaceC7328y) objArr[(i14 << 3) + i17];
                                    if (interfaceC7328y instanceof AbstractC7329z) {
                                        z10 = true;
                                        ((AbstractC7329z) interfaceC7328y).m13725e(1);
                                    } else {
                                        z10 = true;
                                    }
                                    fb.b0.m5940a(j0Var, interfaceC7328y, obj);
                                } else {
                                    z10 = z11;
                                    i10 = i15;
                                }
                                j6 >>= i10;
                                i17++;
                                z11 = z10;
                                i15 = i10;
                            }
                            z6 = z11;
                            if (i16 != i15) {
                                break;
                            }
                        } else {
                            z6 = z11;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        z11 = z6;
                    }
                }
                Object obj2 = b0VarM8530g.f20353f;
                e1.j0 j0Var2 = n1VarM8633z.f20446g;
                if (j0Var2 == null) {
                    j0Var2 = new e1.j0();
                    n1VarM8633z.f20446g = j0Var2;
                }
                j0Var2.m5579l(c0Var, obj2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8681x(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f20560d
            monitor-enter(r0)
            r14.m8676s(r15)     // Catch: java.lang.Throwable -> L4f
            e1.j0 r1 = r14.f20566k     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.m5574g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof e1.k0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            e1.k0 r15 = (e1.k0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f9006b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f9005a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            k2.c0 r10 = (k2.c0) r10     // Catch: java.lang.Throwable -> L4f
            r14.m8676s(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            k2.c0 r15 = (k2.c0) r15     // Catch: java.lang.Throwable -> L4f
            r14.m8676s(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3972u.m8681x(java.lang.Object):void");
    }
}
