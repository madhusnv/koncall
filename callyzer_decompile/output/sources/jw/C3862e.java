package jw;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jw.e */
/* loaded from: classes3.dex */
public final class C3862e implements InterfaceC3861d {

    /* renamed from: c */
    public static final Object f19865c = new Object();

    /* renamed from: a */
    public volatile InterfaceC3861d f19866a;

    /* renamed from: b */
    public volatile Object f19867b;

    /* renamed from: a */
    public static InterfaceC3861d m8405a(InterfaceC3861d interfaceC3861d) {
        if ((interfaceC3861d instanceof C3862e) || (interfaceC3861d instanceof C3859b)) {
            return interfaceC3861d;
        }
        C3862e c3862e = new C3862e();
        c3862e.f19867b = f19865c;
        c3862e.f19866a = interfaceC3861d;
        return c3862e;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        Object obj = this.f19867b;
        if (obj != f19865c) {
            return obj;
        }
        InterfaceC3861d interfaceC3861d = this.f19866a;
        if (interfaceC3861d == null) {
            return this.f19867b;
        }
        Object obj2 = interfaceC3861d.get();
        this.f19867b = obj2;
        this.f19866a = null;
        return obj2;
    }
}
