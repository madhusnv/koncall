package p001o;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class rk6 implements ls6 {

    /* renamed from: a */
    public final Provider f43724a;

    public rk6(Provider provider) {
        this.f43724a = provider;
    }

    /* renamed from: a */
    public static rk6 m46872a(Provider provider) {
        return new rk6(provider);
    }

    /* renamed from: c */
    public static String m46873c(Context context) {
        return (String) cgd.m21197c(pk6.m43800b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m46873c((Context) this.f43724a.get());
    }
}
