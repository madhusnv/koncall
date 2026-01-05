package p001o;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ex5 implements Provider {

    /* renamed from: c */
    public static final Object f22293c = new Object();

    /* renamed from: a */
    public volatile Provider f22294a;

    /* renamed from: b */
    public volatile Object f22295b = f22293c;

    public ex5(Provider provider) {
        this.f22294a = provider;
    }

    /* renamed from: a */
    public static Provider m25717a(Provider provider) {
        cgd.m21196b(provider);
        return provider instanceof ex5 ? provider : new ex5(provider);
    }

    /* renamed from: b */
    public static Object m25718b(Object obj, Object obj2) {
        if (!(obj != f22293c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f22295b;
        Object obj2 = f22293c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f22295b;
                if (obj == obj2) {
                    obj = this.f22294a.get();
                    this.f22295b = m25718b(this.f22295b, obj);
                    this.f22294a = null;
                }
            }
        }
        return obj;
    }
}
