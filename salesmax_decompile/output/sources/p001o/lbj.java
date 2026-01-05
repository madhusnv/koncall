package p001o;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class lbj implements ls6 {

    /* renamed from: a */
    public final Provider f33582a;

    /* renamed from: b */
    public final Provider f33583b;

    /* renamed from: c */
    public final Provider f33584c;

    /* renamed from: d */
    public final Provider f33585d;

    public lbj(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f33582a = provider;
        this.f33583b = provider2;
        this.f33584c = provider3;
        this.f33585d = provider4;
    }

    /* renamed from: a */
    public static lbj m36877a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new lbj(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static kbj m36878c(Executor executor, nk6 nk6Var, qbj qbjVar, sgg sggVar) {
        return new kbj(executor, nk6Var, qbjVar, sggVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public kbj get() {
        return m36878c((Executor) this.f33582a.get(), (nk6) this.f33583b.get(), (qbj) this.f33584c.get(), (sgg) this.f33585d.get());
    }
}
