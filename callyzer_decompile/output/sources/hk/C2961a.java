package hk;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hk.a */
/* loaded from: classes.dex */
public final class C2961a implements InterfaceC2963c {

    /* renamed from: c */
    public static final Object f16020c = new Object();

    /* renamed from: a */
    public volatile InterfaceC2962b f16021a;

    /* renamed from: b */
    public volatile Object f16022b;

    /* renamed from: a */
    public static InterfaceC2963c m7243a(InterfaceC2962b interfaceC2962b) {
        if (interfaceC2962b instanceof C2961a) {
            return interfaceC2962b;
        }
        C2961a c2961a = new C2961a();
        c2961a.f16022b = f16020c;
        c2961a.f16021a = interfaceC2962b;
        return c2961a;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        Object obj;
        Object obj2 = this.f16022b;
        Object obj3 = f16020c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f16022b;
                if (obj == obj3) {
                    obj = this.f16021a.get();
                    Object obj4 = this.f16022b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16022b = obj;
                    this.f16021a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
