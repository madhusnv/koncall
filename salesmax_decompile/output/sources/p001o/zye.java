package p001o;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class zye implements ls6 {

    /* renamed from: a */
    public final Provider f57915a;

    /* renamed from: b */
    public final Provider f57916b;

    /* renamed from: c */
    public final Provider f57917c;

    /* renamed from: d */
    public final Provider f57918d;

    /* renamed from: e */
    public final Provider f57919e;

    public zye(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f57915a = provider;
        this.f57916b = provider2;
        this.f57917c = provider3;
        this.f57918d = provider4;
        this.f57919e = provider5;
    }

    /* renamed from: a */
    public static zye m60139a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new zye(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static yye m60140c(ib3 ib3Var, ib3 ib3Var2, Object obj, Object obj2, Provider provider) {
        return new yye(ib3Var, ib3Var2, (ok6) obj, (w5f) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public yye get() {
        return m60140c((ib3) this.f57915a.get(), (ib3) this.f57916b.get(), this.f57917c.get(), this.f57918d.get(), this.f57919e);
    }
}
