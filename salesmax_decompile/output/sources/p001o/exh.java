package p001o;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class exh implements ls6 {

    /* renamed from: a */
    public final Provider f22357a;

    /* renamed from: b */
    public final Provider f22358b;

    /* renamed from: c */
    public final Provider f22359c;

    /* renamed from: d */
    public final Provider f22360d;

    /* renamed from: e */
    public final Provider f22361e;

    public exh(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f22357a = provider;
        this.f22358b = provider2;
        this.f22359c = provider3;
        this.f22360d = provider4;
        this.f22361e = provider5;
    }

    /* renamed from: a */
    public static exh m25824a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new exh(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static cxh m25825c(ib3 ib3Var, ib3 ib3Var2, d5f d5fVar, v7i v7iVar, kbj kbjVar) {
        return new cxh(ib3Var, ib3Var2, d5fVar, v7iVar, kbjVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public cxh get() {
        return m25825c((ib3) this.f22357a.get(), (ib3) this.f22358b.get(), (d5f) this.f22359c.get(), (v7i) this.f22360d.get(), (kbj) this.f22361e.get());
    }
}
