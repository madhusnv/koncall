package k2;

import a2.C0036i;
import a3.C0043b;
import a3.C0045d;
import androidx.compose.runtime.ComposeRuntimeError;
import c9.C0917l;
import com.sun.mail.imap.IMAPStore;
import i1.C3135n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m2.C4640e;
import m2.C4642g;
import q2.C6100b;
import rw.C6668r;
import s2.AbstractC6740i;
import s2.C6734c;
import tx.C7251k;
import tx.C7263w;
import tx.InterfaceC7250j;
import u2.AbstractC7311h;
import u2.AbstractC7316m;
import u2.C7307d;
import u2.C7312i;
import uw.InterfaceC7564h;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 extends AbstractC3969r {

    /* renamed from: x */
    public static final wx.m1 f20516x = wx.c1.m15372c(C6100b.f29795d);

    /* renamed from: y */
    public static final AtomicReference f20517y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a */
    public final C3956e f20518a;

    /* renamed from: b */
    public final Object f20519b;

    /* renamed from: c */
    public tx.e1 f20520c;

    /* renamed from: d */
    public Throwable f20521d;

    /* renamed from: e */
    public final ArrayList f20522e;

    /* renamed from: f */
    public Object f20523f;

    /* renamed from: g */
    public e1.k0 f20524g;

    /* renamed from: h */
    public final C4640e f20525h;

    /* renamed from: i */
    public final ArrayList f20526i;

    /* renamed from: j */
    public final ArrayList f20527j;

    /* renamed from: k */
    public final e1.j0 f20528k;

    /* renamed from: l */
    public final C0917l f20529l;

    /* renamed from: m */
    public final e1.j0 f20530m;

    /* renamed from: n */
    public final e1.j0 f20531n;

    /* renamed from: o */
    public ArrayList f20532o;

    /* renamed from: p */
    public LinkedHashSet f20533p;

    /* renamed from: q */
    public C7251k f20534q;

    /* renamed from: r */
    public C8986c f20535r;

    /* renamed from: s */
    public boolean f20536s;

    /* renamed from: t */
    public final wx.m1 f20537t;

    /* renamed from: u */
    public final tx.f1 f20538u;

    /* renamed from: v */
    public final InterfaceC7564h f20539v;

    /* renamed from: w */
    public final s0 f20540w;

    public q1(InterfaceC7564h interfaceC7564h) {
        C3956e c3956e = new C3956e(new C0036i(25, this));
        this.f20518a = c3956e;
        this.f20519b = new Object();
        this.f20522e = new ArrayList();
        this.f20524g = new e1.k0();
        this.f20525h = new C4640e(new C3972u[16]);
        this.f20526i = new ArrayList();
        this.f20527j = new ArrayList();
        this.f20528k = new e1.j0();
        this.f20529l = new C0917l(9);
        this.f20530m = new e1.j0();
        this.f20531n = new e1.j0();
        this.f20537t = wx.c1.m15372c(o1.Inactive);
        new AtomicReference(AbstractC6740i.f32190a);
        tx.f1 f1Var = new tx.f1((tx.e1) interfaceC7564h.o0(C7263w.f34689b));
        f1Var.v0(new C0045d(20, this));
        this.f20538u = f1Var;
        this.f20539v = interfaceC7564h.t0(c3956e).t0(f1Var);
        this.f20540w = new s0(9);
    }

    /* renamed from: q */
    public static final C3972u m8644q(q1 q1Var, C3972u c3972u, e1.k0 k0Var) {
        LinkedHashSet linkedHashSet;
        C7307d c7307dMo13640C;
        if (!c3972u.f20575v.f20451E && !c3972u.f20576w && ((linkedHashSet = q1Var.f20533p) == null || !linkedHashSet.contains(c3972u))) {
            C0045d c0045d = new C0045d(21, c3972u);
            C3135n c3135n = new C3135n(11, c3972u, k0Var);
            AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
            C7307d c7307d = abstractC7311hM13686k instanceof C7307d ? (C7307d) abstractC7311hM13686k : null;
            if (c7307d == null || (c7307dMo13640C = c7307d.mo13640C(c0045d, c3135n)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC7311h abstractC7311hM13669j = c7307dMo13640C.m13669j();
                if (k0Var != null) {
                    try {
                        if (k0Var.m5588h()) {
                            C0043b c0043b = new C0043b(13, k0Var, c3972u);
                            C3966o c3966o = c3972u.f20575v;
                            if (c3966o.f20451E) {
                                AbstractC3967p.m8636c("Preparing a composition while composing is not supported");
                            }
                            c3966o.f20451E = true;
                            try {
                                c0043b.invoke();
                                c3966o.f20451E = false;
                            } catch (Throwable th2) {
                                c3966o.f20451E = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC7311h.m13667q(abstractC7311hM13669j);
                        throw th3;
                    }
                }
                boolean zM8678u = c3972u.m8678u();
                AbstractC7311h.m13667q(abstractC7311hM13669j);
                if (zM8678u) {
                    return c3972u;
                }
            } finally {
                m8646s(c7307dMo13640C);
            }
        }
        return null;
    }

    /* renamed from: r */
    public static final boolean m8645r(q1 q1Var) {
        List listM8654x;
        synchronized (q1Var.f20519b) {
            boolean z6 = true;
            if (q1Var.f20524g.m5587g()) {
                if (q1Var.f20525h.f22886c == 0 && !q1Var.m8652v()) {
                    z6 = false;
                }
                return z6;
            }
            C4642g c4642g = new C4642g(q1Var.f20524g);
            q1Var.f20524g = new e1.k0();
            synchronized (q1Var.f20519b) {
                listM8654x = q1Var.m8654x();
            }
            try {
                int size = listM8654x.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C3972u) listM8654x.get(i10)).m8679v(c4642g);
                    if (((o1) q1Var.f20537t.getValue()).compareTo(o1.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (q1Var.f20519b) {
                    q1Var.f20524g = new e1.k0();
                }
                synchronized (q1Var.f20519b) {
                    if (q1Var.m8651u() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (q1Var.f20525h.f22886c == 0 && !q1Var.m8652v()) {
                        z6 = false;
                    }
                }
                return z6;
            } catch (Throwable th2) {
                synchronized (q1Var.f20519b) {
                    e1.k0 k0Var = q1Var.f20524g;
                    k0Var.getClass();
                    Iterator<E> it = c4642g.iterator();
                    while (it.hasNext()) {
                        k0Var.m5591k(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    /* renamed from: s */
    public static void m8646s(C7307d c7307d) {
        try {
            if (c7307d.mo13646w() instanceof C7312i) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c7307d.mo13641c();
        }
    }

    /* renamed from: y */
    public static final void m8647y(ArrayList arrayList, q1 q1Var, C3972u c3972u) {
        arrayList.clear();
        synchronized (q1Var.f20519b) {
            Iterator it = q1Var.f20527j.iterator();
            if (it.hasNext()) {
                ((v0) it.next()).getClass();
                throw null;
            }
        }
    }

    /* renamed from: A */
    public final void m8648A(Throwable th2, C3972u c3972u) throws Throwable {
        if (!((Boolean) f20517y.get()).booleanValue() || (th2 instanceof ComposeRuntimeError)) {
            synchronized (this.f20519b) {
                C8986c c8986c = this.f20535r;
                if (c8986c != null) {
                    throw ((Throwable) c8986c.f43336b);
                }
                this.f20535r = new C8986c(27, th2);
            }
            throw th2;
        }
        synchronized (this.f20519b) {
            try {
                this.f20526i.clear();
                this.f20525h.m9511h();
                this.f20524g = new e1.k0();
                this.f20527j.clear();
                this.f20528k.m5568a();
                this.f20530m.m5568a();
                this.f20535r = new C8986c(27, th2);
                if (c3972u != null) {
                    m8649B(c3972u);
                }
                m8651u();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: B */
    public final void m8649B(C3972u c3972u) {
        ArrayList arrayList = this.f20532o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f20532o = arrayList;
        }
        if (!arrayList.contains(c3972u)) {
            arrayList.add(c3972u);
        }
        if (this.f20522e.remove(c3972u)) {
            this.f20523f = null;
        }
    }

    @Override // k2.AbstractC3969r
    /* renamed from: a */
    public final void mo8556a(C3972u c3972u, C6734c c6734c) throws Throwable {
        C7307d c7307dMo13640C;
        boolean z6 = c3972u.f20575v.f20451E;
        try {
            C0045d c0045d = new C0045d(21, c3972u);
            C3135n c3135n = new C3135n(11, c3972u, null);
            AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
            C7307d c7307d = abstractC7311hM13686k instanceof C7307d ? (C7307d) abstractC7311hM13686k : null;
            if (c7307d == null || (c7307dMo13640C = c7307d.mo13640C(c0045d, c3135n)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC7311h abstractC7311hM13669j = c7307dMo13640C.m13669j();
                try {
                    c3972u.m8666i(c6734c);
                    if (!z6) {
                        AbstractC7316m.m13686k().mo13644m();
                    }
                    synchronized (this.f20519b) {
                        if (((o1) this.f20537t.getValue()).compareTo(o1.ShuttingDown) > 0 && !m8654x().contains(c3972u)) {
                            this.f20522e.add(c3972u);
                            this.f20523f = null;
                        }
                    }
                    try {
                        synchronized (this.f20519b) {
                            ArrayList arrayList = this.f20527j;
                            if (arrayList.size() > 0) {
                                ((v0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            c3972u.m8661d();
                            c3972u.m8663f();
                            if (z6) {
                                return;
                            }
                            AbstractC7316m.m13686k().mo13644m();
                        } catch (Throwable th2) {
                            m8648A(th2, null);
                        }
                    } catch (Throwable th3) {
                        m8648A(th3, c3972u);
                    }
                } finally {
                    AbstractC7311h.m13667q(abstractC7311hM13669j);
                }
            } finally {
                m8646s(c7307dMo13640C);
            }
        } catch (Throwable th4) {
            m8648A(th4, c3972u);
        }
    }

    @Override // k2.AbstractC3969r
    /* renamed from: c */
    public final boolean mo8558c() {
        return ((Boolean) f20517y.get()).booleanValue();
    }

    @Override // k2.AbstractC3969r
    /* renamed from: d */
    public final boolean mo8559d() {
        return false;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: e */
    public final boolean mo8560e() {
        return false;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: g */
    public final int mo8562g() {
        return IMAPStore.RESPONSE;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: h */
    public final InterfaceC7564h mo8563h() {
        return this.f20539v;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: i */
    public final void mo8564i(C3972u c3972u) {
        InterfaceC7250j interfaceC7250jM8651u;
        synchronized (this.f20519b) {
            if (this.f20525h.m9512j(c3972u)) {
                interfaceC7250jM8651u = null;
            } else {
                this.f20525h.m9506b(c3972u);
                interfaceC7250jM8651u = m8651u();
            }
        }
        if (interfaceC7250jM8651u != null) {
            ((C7251k) interfaceC7250jM8651u).resumeWith(qw.a0.f30746a);
        }
    }

    @Override // k2.AbstractC3969r
    /* renamed from: j */
    public final u0 mo8565j(v0 v0Var) {
        u0 u0Var;
        synchronized (this.f20519b) {
            u0Var = (u0) this.f20530m.m5577j(v0Var);
        }
        return u0Var;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: m */
    public final void mo8568m(C3972u c3972u) {
        synchronized (this.f20519b) {
            try {
                LinkedHashSet linkedHashSet = this.f20533p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f20533p = linkedHashSet;
                }
                linkedHashSet.add(c3972u);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k2.AbstractC3969r
    /* renamed from: p */
    public final void mo8571p(C3972u c3972u) {
        synchronized (this.f20519b) {
            if (this.f20522e.remove(c3972u)) {
                this.f20523f = null;
            }
            this.f20525h.m9514l(c3972u);
            this.f20526i.remove(c3972u);
        }
    }

    /* renamed from: t */
    public final void m8650t() {
        synchronized (this.f20519b) {
            if (((o1) this.f20537t.getValue()).compareTo(o1.Idle) >= 0) {
                this.f20537t.m15398j(o1.ShuttingDown);
            }
        }
        this.f20538u.mo13510j(null);
    }

    /* renamed from: u */
    public final InterfaceC7250j m8651u() {
        o1 o1Var;
        wx.m1 m1Var = this.f20537t;
        int iCompareTo = ((o1) m1Var.getValue()).compareTo(o1.ShuttingDown);
        ArrayList arrayList = this.f20527j;
        ArrayList arrayList2 = this.f20526i;
        C4640e c4640e = this.f20525h;
        if (iCompareTo <= 0) {
            this.f20522e.clear();
            this.f20523f = C6668r.f31943a;
            this.f20524g = new e1.k0();
            c4640e.m9511h();
            arrayList2.clear();
            arrayList.clear();
            this.f20532o = null;
            C7251k c7251k = this.f20534q;
            if (c7251k != null) {
                c7251k.cancel(null);
            }
            this.f20534q = null;
            this.f20535r = null;
            return null;
        }
        if (this.f20535r != null) {
            o1Var = o1.Inactive;
        } else if (this.f20520c == null) {
            this.f20524g = new e1.k0();
            c4640e.m9511h();
            o1Var = m8652v() ? o1.InactivePendingWork : o1.Inactive;
        } else {
            o1Var = (c4640e.f22886c == 0 && !this.f20524g.m5588h() && arrayList2.isEmpty() && arrayList.isEmpty() && !m8652v()) ? o1.Idle : o1.PendingWork;
        }
        m1Var.m15398j(o1Var);
        if (o1Var != o1.PendingWork) {
            return null;
        }
        C7251k c7251k2 = this.f20534q;
        this.f20534q = null;
        return c7251k2;
    }

    /* renamed from: v */
    public final boolean m8652v() {
        return (this.f20536s || this.f20518a.f20371f.get() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m8653w() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f20519b
            monitor-enter(r0)
            e1.k0 r1 = r2.f20524g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.m5588h()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            m2.e r1 = r2.f20525h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f22886c     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.m8652v()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.q1.m8653w():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: x */
    public final List m8654x() {
        Object obj = this.f20523f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f20522e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? C6668r.f31943a : new ArrayList(arrayList);
            this.f20523f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        if (((qw.C6361k) r10.get(r4)).f30756b == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015f, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0161, code lost:
    
        r11 = (qw.C6361k) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0169, code lost:
    
        if (r11.f30756b != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r11 = (k2.v0) r11.f30755a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0175, code lost:
    
        r4 = r17.f20519b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0178, code lost:
    
        rw.AbstractC6663m.m12765x(r17.f20527j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017e, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        if (((qw.C6361k) r11).f30756b == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019c, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
    
        r10 = r3;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m8655z(java.util.List r18, e1.k0 r19) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.q1.m8655z(java.util.List, e1.k0):java.util.List");
    }

    @Override // k2.AbstractC3969r
    /* renamed from: k */
    public final void mo8566k(Set set) {
    }
}
