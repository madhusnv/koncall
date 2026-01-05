package g2;

import ex.InterfaceC2139c;
import h1.AbstractC2773d;
import h1.C2772c;
import u2.AbstractC7311h;
import u2.AbstractC7321r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.n */
/* loaded from: classes.dex */
public final class C2460n implements rd {

    /* renamed from: a */
    public final rd f12146a;

    /* renamed from: b */
    public float f12147b;

    /* renamed from: c */
    public float f12148c;

    /* renamed from: d */
    public C2772c f12149d;

    /* renamed from: e */
    public final i1.b1 f12150e = new i1.b1();

    public C2460n(rd rdVar) {
        this.f12146a = rdVar;
        this.f12147b = ((rdVar.mo6214h() % 12) * 0.5235988f) - 1.5707964f;
        this.f12148c = (rdVar.mo6210d() * 0.10471976f) - 1.5707964f;
        this.f12149d = AbstractC2773d.m6778a(this.f12147b);
    }

    /* renamed from: k */
    public static float m6206k(float f6) {
        double d2 = f6 % 6.283185307179586d;
        if (d2 < 0.0d) {
            d2 += 6.283185307179586d;
        }
        return (float) d2;
    }

    @Override // g2.rd
    /* renamed from: a */
    public final void mo6207a(boolean z6) {
        this.f12146a.mo6207a(z6);
    }

    @Override // g2.rd
    /* renamed from: b */
    public final void mo6208b(int i10) {
        this.f12147b = ((i10 % 12) * 0.5235988f) - 1.5707964f;
        rd rdVar = this.f12146a;
        rdVar.mo6208b(i10);
        if (rdVar.mo6212f() == 0) {
            this.f12149d = AbstractC2773d.m6778a(this.f12147b);
        }
    }

    @Override // g2.rd
    /* renamed from: c */
    public final void mo6209c(int i10) {
        this.f12148c = (i10 * 0.10471976f) - 1.5707964f;
        rd rdVar = this.f12146a;
        rdVar.mo6209c(i10);
        if (rdVar.mo6212f() == 1) {
            this.f12149d = AbstractC2773d.m6778a(this.f12148c);
        }
        AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
        InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
        AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
        try {
            rdVar.mo6209c(rdVar.mo6210d());
        } finally {
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
        }
    }

    @Override // g2.rd
    /* renamed from: d */
    public final int mo6210d() {
        return this.f12146a.mo6210d();
    }

    @Override // g2.rd
    /* renamed from: e */
    public final void mo6211e(int i10) {
        this.f12146a.mo6211e(i10);
    }

    @Override // g2.rd
    /* renamed from: f */
    public final int mo6212f() {
        return this.f12146a.mo6212f();
    }

    @Override // g2.rd
    /* renamed from: g */
    public final boolean mo6213g() {
        return this.f12146a.mo6213g();
    }

    @Override // g2.rd
    /* renamed from: h */
    public final int mo6214h() {
        return this.f12146a.mo6214h();
    }

    @Override // g2.rd
    /* renamed from: i */
    public final boolean mo6215i() {
        return this.f12146a.mo6215i();
    }

    /* renamed from: j */
    public final float m6216j(float f6) {
        float fFloatValue = ((Number) this.f12149d.m6775d()).floatValue() - f6;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.f12149d.m6775d()).floatValue() - fFloatValue;
    }
}
