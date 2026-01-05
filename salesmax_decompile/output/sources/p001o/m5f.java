package p001o;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class m5f implements ls6 {

    /* renamed from: a */
    public final Provider f34840a;

    /* renamed from: b */
    public final Provider f34841b;

    /* renamed from: c */
    public final Provider f34842c;

    /* renamed from: d */
    public final Provider f34843d;

    public m5f(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f34840a = provider;
        this.f34841b = provider2;
        this.f34842c = provider3;
        this.f34843d = provider4;
    }

    /* renamed from: a */
    public static m5f m38401a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new m5f(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static qbj m38402c(Context context, nk6 nk6Var, e5f e5fVar, ib3 ib3Var) {
        return (qbj) cgd.m21197c(l5f.m36596a(context, nk6Var, e5fVar, ib3Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public qbj get() {
        return m38402c((Context) this.f34840a.get(), (nk6) this.f34841b.get(), (e5f) this.f34842c.get(), (ib3) this.f34843d.get());
    }
}
