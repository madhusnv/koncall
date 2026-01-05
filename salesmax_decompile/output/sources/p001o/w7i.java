package p001o;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class w7i implements ls6 {

    /* renamed from: a */
    public final Provider f51583a;

    /* renamed from: b */
    public final Provider f51584b;

    /* renamed from: c */
    public final Provider f51585c;

    /* renamed from: d */
    public final Provider f51586d;

    /* renamed from: e */
    public final Provider f51587e;

    /* renamed from: f */
    public final Provider f51588f;

    /* renamed from: g */
    public final Provider f51589g;

    /* renamed from: h */
    public final Provider f51590h;

    /* renamed from: i */
    public final Provider f51591i;

    public w7i(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f51583a = provider;
        this.f51584b = provider2;
        this.f51585c = provider3;
        this.f51586d = provider4;
        this.f51587e = provider5;
        this.f51588f = provider6;
        this.f51589g = provider7;
        this.f51590h = provider8;
        this.f51591i = provider9;
    }

    /* renamed from: a */
    public static w7i m54046a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new w7i(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static v7i m54047c(Context context, n91 n91Var, nk6 nk6Var, qbj qbjVar, Executor executor, sgg sggVar, ib3 ib3Var, ib3 ib3Var2, za3 za3Var) {
        return new v7i(context, n91Var, nk6Var, qbjVar, executor, sggVar, ib3Var, ib3Var2, za3Var);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v7i get() {
        return m54047c((Context) this.f51583a.get(), (n91) this.f51584b.get(), (nk6) this.f51585c.get(), (qbj) this.f51586d.get(), (Executor) this.f51587e.get(), (sgg) this.f51588f.get(), (ib3) this.f51589g.get(), (ib3) this.f51590h.get(), (za3) this.f51591i.get());
    }
}
