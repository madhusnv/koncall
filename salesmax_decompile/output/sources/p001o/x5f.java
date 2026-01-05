package p001o;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class x5f implements ls6 {

    /* renamed from: a */
    public final Provider f53245a;

    /* renamed from: b */
    public final Provider f53246b;

    /* renamed from: c */
    public final Provider f53247c;

    public x5f(Provider provider, Provider provider2, Provider provider3) {
        this.f53245a = provider;
        this.f53246b = provider2;
        this.f53247c = provider3;
    }

    /* renamed from: a */
    public static x5f m55660a(Provider provider, Provider provider2, Provider provider3) {
        return new x5f(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static w5f m55661c(Context context, String str, int i) {
        return new w5f(context, str, i);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w5f get() {
        return m55661c((Context) this.f53245a.get(), (String) this.f53246b.get(), ((Integer) this.f53247c.get()).intValue());
    }
}
