package androidx.media3.exoplayer;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.ac0;
import p001o.bta;
import p001o.crf;
import p001o.cta;
import p001o.d7;
import p001o.e9b;
import p001o.g9b;
import p001o.jbd;
import p001o.juh;
import p001o.lmh;
import p001o.mz5;
import p001o.ob0;
import p001o.op0;
import p001o.ria;
import p001o.s2b;
import p001o.sbd;
import p001o.sqi;
import p001o.tga;
import p001o.u2b;
import p001o.uw7;
import p001o.x4b;
import p001o.x8b;

/* renamed from: androidx.media3.exoplayer.m */
/* loaded from: classes2.dex */
public final class C2216m {

    /* renamed from: a */
    public final jbd f8458a;

    /* renamed from: e */
    public final d f8462e;

    /* renamed from: h */
    public final ac0 f8465h;

    /* renamed from: i */
    public final uw7 f8466i;

    /* renamed from: k */
    public boolean f8468k;

    /* renamed from: l */
    public juh f8469l;

    /* renamed from: j */
    public crf f8467j = new crf.C12730a(0);

    /* renamed from: c */
    public final IdentityHashMap f8460c = new IdentityHashMap();

    /* renamed from: d */
    public final Map f8461d = new HashMap();

    /* renamed from: b */
    public final List f8459b = new ArrayList();

    /* renamed from: f */
    public final HashMap f8463f = new HashMap();

    /* renamed from: g */
    public final Set f8464g = new HashSet();

    /* renamed from: androidx.media3.exoplayer.m$a */
    public final class a implements e9b, mz5 {

        /* renamed from: a */
        public final c f8470a;

        public a(c cVar) {
            this.f8470a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J */
        public /* synthetic */ void m7387J(Pair pair, u2b u2bVar) {
            C2216m.this.f8465h.mo7409U(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K */
        public /* synthetic */ void m7388K(Pair pair) {
            C2216m.this.f8465h.mo7411Z(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M */
        public /* synthetic */ void m7389M(Pair pair) {
            C2216m.this.f8465h.mo7404E(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public /* synthetic */ void m7390O(Pair pair) {
            C2216m.this.f8465h.n0(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public /* synthetic */ void m7391P(Pair pair, int i) {
            C2216m.this.f8465h.mo7407R(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Q */
        public /* synthetic */ void m7392Q(Pair pair, Exception exc) {
            C2216m.this.f8465h.mo7408T(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S */
        public /* synthetic */ void m7393S(Pair pair) {
            C2216m.this.f8465h.i0(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: V */
        public /* synthetic */ void m7394V(Pair pair, tga tgaVar, u2b u2bVar) {
            C2216m.this.f8465h.h0(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second, tgaVar, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m7395W(Pair pair, tga tgaVar, u2b u2bVar) {
            C2216m.this.f8465h.mo7410Y(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second, tgaVar, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public /* synthetic */ void m7396X(Pair pair, tga tgaVar, u2b u2bVar, IOException iOException, boolean z) {
            C2216m.this.f8465h.d0(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second, tgaVar, u2bVar, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a0(Pair pair, tga tgaVar, u2b u2bVar) {
            C2216m.this.f8465h.b0(((Integer) pair.first).intValue(), (x8b.C18076b) pair.second, tgaVar, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c0(Pair pair, u2b u2bVar) {
            C2216m.this.f8465h.mo7406L(((Integer) pair.first).intValue(), (x8b.C18076b) op0.m42515e((x8b.C18076b) pair.second), u2bVar);
        }

        @Override // p001o.mz5
        /* renamed from: E */
        public void mo7404E(int i, x8b.C18076b c18076b) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.s9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45033a.m7389M(pairM7405I);
                    }
                });
            }
        }

        /* renamed from: I */
        public final Pair m7405I(int i, x8b.C18076b c18076b) {
            x8b.C18076b c18076b2 = null;
            if (c18076b != null) {
                x8b.C18076b c18076bM7357n = C2216m.m7357n(this.f8470a, c18076b);
                if (c18076bM7357n == null) {
                    return null;
                }
                c18076b2 = c18076bM7357n;
            }
            return Pair.create(Integer.valueOf(C2216m.m7360s(this.f8470a, i)), c18076b2);
        }

        @Override // p001o.e9b
        /* renamed from: L */
        public void mo7406L(int i, x8b.C18076b c18076b, final u2b u2bVar) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.t9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46663a.c0(pairM7405I, u2bVar);
                    }
                });
            }
        }

        @Override // p001o.mz5
        /* renamed from: R */
        public void mo7407R(int i, x8b.C18076b c18076b, final int i2) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.o9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37974a.m7391P(pairM7405I, i2);
                    }
                });
            }
        }

        @Override // p001o.mz5
        /* renamed from: T */
        public void mo7408T(int i, x8b.C18076b c18076b, final Exception exc) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.i9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28278a.m7392Q(pairM7405I, exc);
                    }
                });
            }
        }

        @Override // p001o.e9b
        /* renamed from: U */
        public void mo7409U(int i, x8b.C18076b c18076b, final u2b u2bVar) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.n9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36591a.m7387J(pairM7405I, u2bVar);
                    }
                });
            }
        }

        @Override // p001o.e9b
        /* renamed from: Y */
        public void mo7410Y(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.l9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33506a.m7395W(pairM7405I, tgaVar, u2bVar);
                    }
                });
            }
        }

        @Override // p001o.mz5
        /* renamed from: Z */
        public void mo7411Z(int i, x8b.C18076b c18076b) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.k9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31701a.m7388K(pairM7405I);
                    }
                });
            }
        }

        @Override // p001o.e9b
        public void b0(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.p9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39676a.a0(pairM7405I, tgaVar, u2bVar);
                    }
                });
            }
        }

        @Override // p001o.e9b
        public void d0(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar, final IOException iOException, final boolean z) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.r9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43240a.m7396X(pairM7405I, tgaVar, u2bVar, iOException, z);
                    }
                });
            }
        }

        @Override // p001o.e9b
        public void h0(int i, x8b.C18076b c18076b, final tga tgaVar, final u2b u2bVar) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.m9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35014a.m7394V(pairM7405I, tgaVar, u2bVar);
                    }
                });
            }
        }

        @Override // p001o.mz5
        public void i0(int i, x8b.C18076b c18076b) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.q9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41516a.m7393S(pairM7405I);
                    }
                });
            }
        }

        @Override // p001o.mz5
        public void n0(int i, x8b.C18076b c18076b) {
            final Pair pairM7405I = m7405I(i, c18076b);
            if (pairM7405I != null) {
                C2216m.this.f8466i.mo28839h(new Runnable() { // from class: o.j9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29987a.m7390O(pairM7405I);
                    }
                });
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.m$b */
    public static final class b {

        /* renamed from: a */
        public final x8b f8472a;

        /* renamed from: b */
        public final x8b.InterfaceC18077c f8473b;

        /* renamed from: c */
        public final a f8474c;

        public b(x8b x8bVar, x8b.InterfaceC18077c interfaceC18077c, a aVar) {
            this.f8472a = x8bVar;
            this.f8473b = interfaceC18077c;
            this.f8474c = aVar;
        }
    }

    /* renamed from: androidx.media3.exoplayer.m$c */
    public static final class c implements g9b {

        /* renamed from: a */
        public final cta f8475a;

        /* renamed from: d */
        public int f8478d;

        /* renamed from: e */
        public boolean f8479e;

        /* renamed from: c */
        public final List f8477c = new ArrayList();

        /* renamed from: b */
        public final Object f8476b = new Object();

        public c(x8b x8bVar, boolean z) {
            this.f8475a = new cta(x8bVar, z);
        }

        @Override // p001o.g9b
        /* renamed from: a */
        public Object mo7200a() {
            return this.f8476b;
        }

        @Override // p001o.g9b
        /* renamed from: b */
        public lmh mo7201b() {
            return this.f8475a.m21783Y();
        }

        /* renamed from: c */
        public void m7412c(int i) {
            this.f8478d = i;
            this.f8479e = false;
            this.f8477c.clear();
        }
    }

    /* renamed from: androidx.media3.exoplayer.m$d */
    public interface d {
        /* renamed from: c */
        void mo7238c();
    }

    public C2216m(d dVar, ac0 ac0Var, uw7 uw7Var, jbd jbdVar) {
        this.f8458a = jbdVar;
        this.f8462e = dVar;
        this.f8465h = ac0Var;
        this.f8466i = uw7Var;
    }

    /* renamed from: m */
    public static Object m7356m(Object obj) {
        return d7.m22370v(obj);
    }

    /* renamed from: n */
    public static x8b.C18076b m7357n(c cVar, x8b.C18076b c18076b) {
        for (int i = 0; i < cVar.f8477c.size(); i++) {
            if (((x8b.C18076b) cVar.f8477c.get(i)).f53359d == c18076b.f53359d) {
                return c18076b.m55841a(m7359p(cVar, c18076b.f53356a));
            }
        }
        return null;
    }

    /* renamed from: o */
    public static Object m7358o(Object obj) {
        return d7.m22371w(obj);
    }

    /* renamed from: p */
    public static Object m7359p(c cVar, Object obj) {
        return d7.m22372y(cVar.f8476b, obj);
    }

    /* renamed from: s */
    public static int m7360s(c cVar, int i) {
        return i + cVar.f8478d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m7361u(x8b x8bVar, lmh lmhVar) {
        this.f8462e.mo7238c();
    }

    /* renamed from: A */
    public lmh m7362A(int i, int i2, crf crfVar) {
        op0.m42511a(i >= 0 && i <= i2 && i2 <= m7375r());
        this.f8467j = crfVar;
        m7363B(i, i2);
        return m7370i();
    }

    /* renamed from: B */
    public final void m7363B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVar = (c) this.f8459b.remove(i3);
            this.f8461d.remove(cVar.f8476b);
            m7368g(i3, -cVar.f8475a.m21783Y().mo6954p());
            cVar.f8479e = true;
            if (this.f8468k) {
                m7377v(cVar);
            }
        }
    }

    /* renamed from: C */
    public lmh m7364C(List list, crf crfVar) {
        m7363B(0, this.f8459b.size());
        return m7367f(this.f8459b.size(), list, crfVar);
    }

    /* renamed from: D */
    public lmh m7365D(crf crfVar) {
        int iM7375r = m7375r();
        if (crfVar.getLength() != iM7375r) {
            crfVar = crfVar.mo21629e().mo21631g(0, iM7375r);
        }
        this.f8467j = crfVar;
        return m7370i();
    }

    /* renamed from: E */
    public lmh m7366E(int i, int i2, List list) {
        op0.m42511a(i >= 0 && i <= i2 && i2 <= m7375r());
        op0.m42511a(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((c) this.f8459b.get(i3)).f8475a.mo6935n((s2b) list.get(i3 - i));
        }
        return m7370i();
    }

    /* renamed from: f */
    public lmh m7367f(int i, List list, crf crfVar) {
        if (!list.isEmpty()) {
            this.f8467j = crfVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = (c) list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = (c) this.f8459b.get(i2 - 1);
                    cVar.m7412c(cVar2.f8478d + cVar2.f8475a.m21783Y().mo6954p());
                } else {
                    cVar.m7412c(0);
                }
                m7368g(i2, cVar.f8475a.m21783Y().mo6954p());
                this.f8459b.add(i2, cVar);
                this.f8461d.put(cVar.f8476b, cVar);
                if (this.f8468k) {
                    m7379x(cVar);
                    if (this.f8460c.isEmpty()) {
                        this.f8464g.add(cVar);
                    } else {
                        m7371j(cVar);
                    }
                }
            }
        }
        return m7370i();
    }

    /* renamed from: g */
    public final void m7368g(int i, int i2) {
        while (i < this.f8459b.size()) {
            ((c) this.f8459b.get(i)).f8478d += i2;
            i++;
        }
    }

    /* renamed from: h */
    public x4b m7369h(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        Object objM7358o = m7358o(c18076b.f53356a);
        x8b.C18076b c18076bM55841a = c18076b.m55841a(m7356m(c18076b.f53356a));
        c cVar = (c) op0.m42515e((c) this.f8461d.get(objM7358o));
        m7373l(cVar);
        cVar.f8477c.add(c18076bM55841a);
        bta btaVarMo6931a = cVar.f8475a.mo6931a(c18076bM55841a, ob0Var, j);
        this.f8460c.put(btaVarMo6931a, cVar);
        m7372k();
        return btaVarMo6931a;
    }

    /* renamed from: i */
    public lmh m7370i() {
        if (this.f8459b.isEmpty()) {
            return lmh.f34048a;
        }
        int iMo6954p = 0;
        for (int i = 0; i < this.f8459b.size(); i++) {
            c cVar = (c) this.f8459b.get(i);
            cVar.f8478d = iMo6954p;
            iMo6954p += cVar.f8475a.m21783Y().mo6954p();
        }
        return new sbd(this.f8459b, this.f8467j);
    }

    /* renamed from: j */
    public final void m7371j(c cVar) {
        b bVar = (b) this.f8463f.get(cVar);
        if (bVar != null) {
            bVar.f8472a.mo18735q(bVar.f8473b);
        }
    }

    /* renamed from: k */
    public final void m7372k() {
        Iterator it = this.f8464g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f8477c.isEmpty()) {
                m7371j(cVar);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void m7373l(c cVar) {
        this.f8464g.add(cVar);
        b bVar = (b) this.f8463f.get(cVar);
        if (bVar != null) {
            bVar.f8472a.mo18733g(bVar.f8473b);
        }
    }

    /* renamed from: q */
    public crf m7374q() {
        return this.f8467j;
    }

    /* renamed from: r */
    public int m7375r() {
        return this.f8459b.size();
    }

    /* renamed from: t */
    public boolean m7376t() {
        return this.f8468k;
    }

    /* renamed from: v */
    public final void m7377v(c cVar) {
        if (cVar.f8479e && cVar.f8477c.isEmpty()) {
            b bVar = (b) op0.m42515e((b) this.f8463f.remove(cVar));
            bVar.f8472a.mo18732f(bVar.f8473b);
            bVar.f8472a.mo18736r(bVar.f8474c);
            bVar.f8472a.mo18731d(bVar.f8474c);
            this.f8464g.remove(cVar);
        }
    }

    /* renamed from: w */
    public void m7378w(juh juhVar) {
        op0.m42517g(!this.f8468k);
        this.f8469l = juhVar;
        for (int i = 0; i < this.f8459b.size(); i++) {
            c cVar = (c) this.f8459b.get(i);
            m7379x(cVar);
            this.f8464g.add(cVar);
        }
        this.f8468k = true;
    }

    /* renamed from: x */
    public final void m7379x(c cVar) {
        cta ctaVar = cVar.f8475a;
        x8b.InterfaceC18077c interfaceC18077c = new x8b.InterfaceC18077c() { // from class: o.h9b
            @Override // p001o.x8b.InterfaceC18077c
            /* renamed from: a */
            public final void mo30023a(x8b x8bVar, lmh lmhVar) {
                this.f26451a.m7361u(x8bVar, lmhVar);
            }
        };
        a aVar = new a(cVar);
        this.f8463f.put(cVar, new b(ctaVar, interfaceC18077c, aVar));
        ctaVar.mo18737s(sqi.m48697B(), aVar);
        ctaVar.mo18730c(sqi.m48697B(), aVar);
        ctaVar.mo18734h(interfaceC18077c, this.f8469l, this.f8458a);
    }

    /* renamed from: y */
    public void m7380y() {
        for (b bVar : this.f8463f.values()) {
            try {
                bVar.f8472a.mo18732f(bVar.f8473b);
            } catch (RuntimeException e) {
                ria.m46820d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f8472a.mo18736r(bVar.f8474c);
            bVar.f8472a.mo18731d(bVar.f8474c);
        }
        this.f8463f.clear();
        this.f8464g.clear();
        this.f8468k = false;
    }

    /* renamed from: z */
    public void m7381z(x4b x4bVar) {
        c cVar = (c) op0.m42515e((c) this.f8460c.remove(x4bVar));
        cVar.f8475a.mo6933e(x4bVar);
        cVar.f8477c.remove(((bta) x4bVar).f16804a);
        if (!this.f8460c.isEmpty()) {
            m7372k();
        }
        m7377v(cVar);
    }
}
