package p001o;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class fdb implements ls6 {

    /* renamed from: a */
    public final Provider f23154a;

    /* renamed from: b */
    public final Provider f23155b;

    public fdb(Provider provider, Provider provider2) {
        this.f23154a = provider;
        this.f23155b = provider2;
    }

    /* renamed from: a */
    public static fdb m26463a(Provider provider, Provider provider2) {
        return new fdb(provider, provider2);
    }

    /* renamed from: c */
    public static edb m26464c(Context context, Object obj) {
        return new edb(context, (wa4) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public edb get() {
        return m26464c((Context) this.f23154a.get(), this.f23155b.get());
    }
}
