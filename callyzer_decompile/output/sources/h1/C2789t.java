package h1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.t */
/* loaded from: classes.dex */
public final class C2789t implements InterfaceC2775f {

    /* renamed from: a */
    public final d2 f15600a;

    /* renamed from: b */
    public final x1 f15601b;

    /* renamed from: c */
    public final Object f15602c;

    /* renamed from: d */
    public final AbstractC2785p f15603d;

    /* renamed from: e */
    public final AbstractC2785p f15604e;

    /* renamed from: f */
    public final AbstractC2785p f15605f;

    /* renamed from: g */
    public final Object f15606g;

    /* renamed from: h */
    public final long f15607h;

    public C2789t(C2790u c2790u, x1 x1Var, Object obj, AbstractC2785p abstractC2785p) {
        d2 d2Var = new d2(c2790u.f15616a);
        this.f15600a = d2Var;
        this.f15601b = x1Var;
        this.f15602c = obj;
        AbstractC2785p abstractC2785p2 = (AbstractC2785p) x1Var.f15661a.invoke(obj);
        this.f15603d = abstractC2785p2;
        this.f15604e = AbstractC2773d.m6788k(abstractC2785p);
        InterfaceC2139c interfaceC2139c = x1Var.f15662b;
        if (d2Var.f15392d == null) {
            d2Var.f15392d = abstractC2785p2.mo6833c();
        }
        AbstractC2785p abstractC2785p3 = d2Var.f15392d;
        if (abstractC2785p3 == null) {
            AbstractC4154l.m8928k("targetVector");
            throw null;
        }
        int iMo6832b = abstractC2785p3.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            AbstractC2785p abstractC2785p4 = d2Var.f15392d;
            if (abstractC2785p4 == null) {
                AbstractC4154l.m8928k("targetVector");
                throw null;
            }
            abstractC2785p4.mo6835e(d2Var.f15389a.mo6104U(abstractC2785p2.mo6831a(i10), abstractC2785p.mo6831a(i10)), i10);
        }
        AbstractC2785p abstractC2785p5 = d2Var.f15392d;
        if (abstractC2785p5 == null) {
            AbstractC4154l.m8928k("targetVector");
            throw null;
        }
        this.f15606g = interfaceC2139c.invoke(abstractC2785p5);
        if (d2Var.f15391c == null) {
            d2Var.f15391c = abstractC2785p2.mo6833c();
        }
        AbstractC2785p abstractC2785p6 = d2Var.f15391c;
        if (abstractC2785p6 == null) {
            AbstractC4154l.m8928k("velocityVector");
            throw null;
        }
        int iMo6832b2 = abstractC2785p6.mo6832b();
        long jMax = 0;
        for (int i11 = 0; i11 < iMo6832b2; i11++) {
            abstractC2785p2.getClass();
            jMax = Math.max(jMax, d2Var.f15389a.mo6103O(abstractC2785p.mo6831a(i11)));
        }
        this.f15607h = jMax;
        AbstractC2785p abstractC2785pM6788k = AbstractC2773d.m6788k(this.f15600a.m6797a(jMax, this.f15603d, abstractC2785p));
        this.f15605f = abstractC2785pM6788k;
        int iMo6832b3 = abstractC2785pM6788k.mo6832b();
        for (int i12 = 0; i12 < iMo6832b3; i12++) {
            AbstractC2785p abstractC2785p7 = this.f15605f;
            float fMo6831a = abstractC2785p7.mo6831a(i12);
            float f6 = this.f15600a.f15393e;
            abstractC2785p7.mo6835e(w9.m11911b(fMo6831a, -f6, f6), i12);
        }
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: b */
    public final boolean mo6804b() {
        return false;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: c */
    public final long mo6805c() {
        return this.f15607h;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: d */
    public final x1 mo6806d() {
        return this.f15601b;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: e */
    public final AbstractC2785p mo6807e(long j6) {
        if (m6808f(j6)) {
            return this.f15605f;
        }
        return this.f15600a.m6797a(j6, this.f15603d, this.f15604e);
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: g */
    public final Object mo6809g(long j6) {
        if (m6808f(j6)) {
            return this.f15606g;
        }
        InterfaceC2139c interfaceC2139c = this.f15601b.f15662b;
        d2 d2Var = this.f15600a;
        AbstractC2785p abstractC2785p = d2Var.f15390b;
        AbstractC2785p abstractC2785p2 = this.f15603d;
        if (abstractC2785p == null) {
            d2Var.f15390b = abstractC2785p2.mo6833c();
        }
        AbstractC2785p abstractC2785p3 = d2Var.f15390b;
        if (abstractC2785p3 == null) {
            AbstractC4154l.m8928k("valueVector");
            throw null;
        }
        int iMo6832b = abstractC2785p3.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            AbstractC2785p abstractC2785p4 = d2Var.f15390b;
            if (abstractC2785p4 == null) {
                AbstractC4154l.m8928k("valueVector");
                throw null;
            }
            abstractC2785p4.mo6835e(d2Var.f15389a.mo6109y(abstractC2785p2.mo6831a(i10), this.f15604e.mo6831a(i10), j6), i10);
        }
        AbstractC2785p abstractC2785p5 = d2Var.f15390b;
        if (abstractC2785p5 != null) {
            return interfaceC2139c.invoke(abstractC2785p5);
        }
        AbstractC4154l.m8928k("valueVector");
        throw null;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: h */
    public final Object mo6810h() {
        return this.f15606g;
    }
}
