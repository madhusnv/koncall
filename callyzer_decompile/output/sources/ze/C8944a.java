package ze;

import pw.InterfaceC6043a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ze.a */
/* loaded from: classes.dex */
public final class C8944a implements InterfaceC6043a {

    /* renamed from: c */
    public static final Object f42948c = new Object();

    /* renamed from: a */
    public volatile InterfaceC8945b f42949a;

    /* renamed from: b */
    public volatile Object f42950b;

    /* renamed from: a */
    public static InterfaceC6043a m16423a(InterfaceC8945b interfaceC8945b) {
        if (interfaceC8945b instanceof C8944a) {
            return interfaceC8945b;
        }
        C8944a c8944a = new C8944a();
        c8944a.f42950b = f42948c;
        c8944a.f42949a = interfaceC8945b;
        return c8944a;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        Object obj;
        Object obj2 = this.f42950b;
        Object obj3 = f42948c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f42950b;
                if (obj == obj3) {
                    obj = this.f42949a.get();
                    Object obj4 = this.f42950b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f42950b = obj;
                    this.f42949a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
