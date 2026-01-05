package jw;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jw.b */
/* loaded from: classes3.dex */
public final class C3859b implements InterfaceC3861d {

    /* renamed from: c */
    public static final Object f19861c = new Object();

    /* renamed from: a */
    public volatile InterfaceC3861d f19862a;

    /* renamed from: b */
    public volatile Object f19863b;

    /* renamed from: a */
    public static InterfaceC3861d m8404a(InterfaceC3861d interfaceC3861d) {
        if (interfaceC3861d instanceof C3859b) {
            return interfaceC3861d;
        }
        C3859b c3859b = new C3859b();
        c3859b.f19863b = f19861c;
        c3859b.f19862a = interfaceC3861d;
        return c3859b;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        Object obj;
        Object obj2 = this.f19863b;
        Object obj3 = f19861c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f19863b;
            if (obj == obj3) {
                obj = this.f19862a.get();
                Object obj4 = this.f19863b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f19863b = obj;
                this.f19862a = null;
            }
        }
        return obj;
    }
}
