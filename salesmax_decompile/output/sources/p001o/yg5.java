package p001o;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class yg5 implements ls6 {

    /* renamed from: a */
    public final Provider f55481a;

    /* renamed from: b */
    public final Provider f55482b;

    /* renamed from: c */
    public final Provider f55483c;

    /* renamed from: d */
    public final Provider f55484d;

    /* renamed from: e */
    public final Provider f55485e;

    public yg5(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f55481a = provider;
        this.f55482b = provider2;
        this.f55483c = provider3;
        this.f55484d = provider4;
        this.f55485e = provider5;
    }

    /* renamed from: a */
    public static yg5 m57775a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new yg5(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static xg5 m57776c(Executor executor, n91 n91Var, qbj qbjVar, nk6 nk6Var, sgg sggVar) {
        return new xg5(executor, n91Var, qbjVar, nk6Var, sggVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public xg5 get() {
        return m57776c((Executor) this.f55481a.get(), (n91) this.f55482b.get(), (qbj) this.f55483c.get(), (nk6) this.f55484d.get(), (sgg) this.f55485e.get());
    }
}
