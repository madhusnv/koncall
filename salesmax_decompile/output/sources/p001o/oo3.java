package p001o;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p001o.e9b;
import p001o.mz5;
import p001o.x8b;

/* loaded from: classes2.dex */
public abstract class oo3 extends be1 {

    /* renamed from: h */
    public final HashMap f38647h = new HashMap();

    /* renamed from: q */
    public Handler f38648q;

    /* renamed from: s */
    public juh f38649s;

    /* renamed from: o.oo3$a */
    public final class C15851a implements e9b, mz5 {

        /* renamed from: a */
        public final Object f38650a;

        /* renamed from: b */
        public e9b.C13130a f38651b;

        /* renamed from: c */
        public mz5.C15451a f38652c;

        public C15851a(Object obj) {
            this.f38651b = oo3.this.m18741w(null);
            this.f38652c = oo3.this.m18739u(null);
            this.f38650a = obj;
        }

        @Override // p001o.mz5
        /* renamed from: E */
        public void mo7404E(int i, x8b.C18076b c18076b) {
            if (m42494c(i, c18076b)) {
                this.f38652c.m39904i();
            }
        }

        @Override // p001o.e9b
        /* renamed from: L */
        public void mo7406L(int i, x8b.C18076b c18076b, u2b u2bVar) {
            if (m42494c(i, c18076b)) {
                this.f38651b.m24549D(m42495d(u2bVar, c18076b));
            }
        }

        @Override // p001o.mz5
        /* renamed from: R */
        public void mo7407R(int i, x8b.C18076b c18076b, int i2) {
            if (m42494c(i, c18076b)) {
                this.f38652c.m39906k(i2);
            }
        }

        @Override // p001o.mz5
        /* renamed from: T */
        public void mo7408T(int i, x8b.C18076b c18076b, Exception exc) {
            if (m42494c(i, c18076b)) {
                this.f38652c.m39907l(exc);
            }
        }

        @Override // p001o.e9b
        /* renamed from: U */
        public void mo7409U(int i, x8b.C18076b c18076b, u2b u2bVar) {
            if (m42494c(i, c18076b)) {
                this.f38651b.m24553i(m42495d(u2bVar, c18076b));
            }
        }

        @Override // p001o.e9b
        /* renamed from: Y */
        public void mo7410Y(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar) {
            if (m42494c(i, c18076b)) {
                this.f38651b.m24559u(tgaVar, m42495d(u2bVar, c18076b));
            }
        }

        @Override // p001o.mz5
        /* renamed from: Z */
        public void mo7411Z(int i, x8b.C18076b c18076b) {
            if (m42494c(i, c18076b)) {
                this.f38652c.m39903h();
            }
        }

        @Override // p001o.e9b
        public void b0(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar) {
            if (m42494c(i, c18076b)) {
                this.f38651b.m24546A(tgaVar, m42495d(u2bVar, c18076b));
            }
        }

        /* renamed from: c */
        public final boolean m42494c(int i, x8b.C18076b c18076b) {
            x8b.C18076b c18076bMo38678F;
            if (c18076b != null) {
                c18076bMo38678F = oo3.this.mo38678F(this.f38650a, c18076b);
                if (c18076bMo38678F == null) {
                    return false;
                }
            } else {
                c18076bMo38678F = null;
            }
            int iMo42492H = oo3.this.mo42492H(this.f38650a, i);
            e9b.C13130a c13130a = this.f38651b;
            if (c13130a.f21185a != iMo42492H || !sqi.m48724c(c13130a.f21186b, c18076bMo38678F)) {
                this.f38651b = oo3.this.m18740v(iMo42492H, c18076bMo38678F);
            }
            mz5.C15451a c15451a = this.f38652c;
            if (c15451a.f36120a == iMo42492H && sqi.m48724c(c15451a.f36121b, c18076bMo38678F)) {
                return true;
            }
            this.f38652c = oo3.this.m18738t(iMo42492H, c18076bMo38678F);
            return true;
        }

        /* renamed from: d */
        public final u2b m42495d(u2b u2bVar, x8b.C18076b c18076b) {
            long jMo42491G = oo3.this.mo42491G(this.f38650a, u2bVar.f48214f, c18076b);
            long jMo42491G2 = oo3.this.mo42491G(this.f38650a, u2bVar.f48215g, c18076b);
            return (jMo42491G == u2bVar.f48214f && jMo42491G2 == u2bVar.f48215g) ? u2bVar : new u2b(u2bVar.f48209a, u2bVar.f48210b, u2bVar.f48211c, u2bVar.f48212d, u2bVar.f48213e, jMo42491G, jMo42491G2);
        }

        @Override // p001o.e9b
        public void d0(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar, IOException iOException, boolean z) {
            if (m42494c(i, c18076b)) {
                this.f38651b.m24562x(tgaVar, m42495d(u2bVar, c18076b), iOException, z);
            }
        }

        @Override // p001o.e9b
        public void h0(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar) {
            if (m42494c(i, c18076b)) {
                this.f38651b.m24556r(tgaVar, m42495d(u2bVar, c18076b));
            }
        }

        @Override // p001o.mz5
        public void i0(int i, x8b.C18076b c18076b) {
            if (m42494c(i, c18076b)) {
                this.f38652c.m39908m();
            }
        }

        @Override // p001o.mz5
        public void n0(int i, x8b.C18076b c18076b) {
            if (m42494c(i, c18076b)) {
                this.f38652c.m39905j();
            }
        }
    }

    /* renamed from: o.oo3$b */
    public static final class C15852b {

        /* renamed from: a */
        public final x8b f38654a;

        /* renamed from: b */
        public final x8b.InterfaceC18077c f38655b;

        /* renamed from: c */
        public final C15851a f38656c;

        public C15852b(x8b x8bVar, x8b.InterfaceC18077c interfaceC18077c, C15851a c15851a) {
            this.f38654a = x8bVar;
            this.f38655b = interfaceC18077c;
            this.f38656c = c15851a;
        }
    }

    @Override // p001o.be1
    /* renamed from: B */
    public void mo6919B(juh juhVar) {
        this.f38649s = juhVar;
        this.f38648q = sqi.m48747z();
    }

    @Override // p001o.be1
    /* renamed from: D */
    public void mo6920D() {
        for (C15852b c15852b : this.f38647h.values()) {
            c15852b.f38654a.mo18732f(c15852b.f38655b);
            c15852b.f38654a.mo18736r(c15852b.f38656c);
            c15852b.f38654a.mo18731d(c15852b.f38656c);
        }
        this.f38647h.clear();
    }

    /* renamed from: F */
    public abstract x8b.C18076b mo38678F(Object obj, x8b.C18076b c18076b);

    /* renamed from: G */
    public long mo42491G(Object obj, long j, x8b.C18076b c18076b) {
        return j;
    }

    /* renamed from: H */
    public int mo42492H(Object obj, int i) {
        return i;
    }

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract void m42490I(Object obj, x8b x8bVar, lmh lmhVar);

    /* renamed from: K */
    public final void m42493K(final Object obj, x8b x8bVar) {
        op0.m42511a(!this.f38647h.containsKey(obj));
        x8b.InterfaceC18077c interfaceC18077c = new x8b.InterfaceC18077c() { // from class: o.no3
            @Override // p001o.x8b.InterfaceC18077c
            /* renamed from: a */
            public final void mo30023a(x8b x8bVar2, lmh lmhVar) {
                this.f37091a.m42490I(obj, x8bVar2, lmhVar);
            }
        };
        C15851a c15851a = new C15851a(obj);
        this.f38647h.put(obj, new C15852b(x8bVar, interfaceC18077c, c15851a));
        x8bVar.mo18737s((Handler) op0.m42515e(this.f38648q), c15851a);
        x8bVar.mo18730c((Handler) op0.m42515e(this.f38648q), c15851a);
        x8bVar.mo18734h(interfaceC18077c, this.f38649s, m18744z());
        if (m18728A()) {
            return;
        }
        x8bVar.mo18735q(interfaceC18077c);
    }

    @Override // p001o.x8b
    /* renamed from: j */
    public void mo6934j() {
        Iterator it = this.f38647h.values().iterator();
        while (it.hasNext()) {
            ((C15852b) it.next()).f38654a.mo6934j();
        }
    }

    @Override // p001o.be1
    /* renamed from: x */
    public void mo18742x() {
        for (C15852b c15852b : this.f38647h.values()) {
            c15852b.f38654a.mo18735q(c15852b.f38655b);
        }
    }

    @Override // p001o.be1
    /* renamed from: y */
    public void mo18743y() {
        for (C15852b c15852b : this.f38647h.values()) {
            c15852b.f38654a.mo18733g(c15852b.f38655b);
        }
    }
}
