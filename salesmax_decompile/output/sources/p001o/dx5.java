package p001o;

import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class dx5 implements Provider {

    /* renamed from: c */
    public static final Object f20616c = new Object();

    /* renamed from: a */
    public volatile Provider f20617a;

    /* renamed from: b */
    public volatile Object f20618b = f20616c;

    public dx5(Provider provider) {
        this.f20617a = provider;
    }

    /* renamed from: a */
    public static Provider m23919a(Provider provider) {
        egd.m24973b(provider);
        return provider instanceof dx5 ? provider : new dx5(provider);
    }

    /* renamed from: b */
    public static Object m23920b(Object obj, Object obj2) {
        if (!(obj != f20616c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f20618b;
        Object obj2 = f20616c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f20618b;
                if (obj == obj2) {
                    obj = this.f20617a.get();
                    this.f20618b = m23920b(this.f20618b, obj);
                    this.f20617a = null;
                }
            }
        }
        return obj;
    }
}
