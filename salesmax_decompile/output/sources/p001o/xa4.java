package p001o;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class xa4 implements ls6 {

    /* renamed from: a */
    public final Provider f53414a;

    /* renamed from: b */
    public final Provider f53415b;

    /* renamed from: c */
    public final Provider f53416c;

    public xa4(Provider provider, Provider provider2, Provider provider3) {
        this.f53414a = provider;
        this.f53415b = provider2;
        this.f53416c = provider3;
    }

    /* renamed from: a */
    public static xa4 m55887a(Provider provider, Provider provider2, Provider provider3) {
        return new xa4(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static wa4 m55888c(Context context, ib3 ib3Var, ib3 ib3Var2) {
        return new wa4(context, ib3Var, ib3Var2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wa4 get() {
        return m55888c((Context) this.f53414a.get(), (ib3) this.f53415b.get(), (ib3) this.f53416c.get());
    }
}
