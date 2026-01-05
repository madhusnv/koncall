package p001o;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class k5f implements ls6 {

    /* renamed from: a */
    public final Provider f31498a;

    public k5f(Provider provider) {
        this.f31498a = provider;
    }

    /* renamed from: a */
    public static e5f m35013a(ib3 ib3Var) {
        return (e5f) cgd.m21197c(j5f.m33279a(ib3Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static k5f m35014b(Provider provider) {
        return new k5f(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e5f get() {
        return m35013a((ib3) this.f31498a.get());
    }
}
