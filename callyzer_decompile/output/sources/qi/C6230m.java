package qi;

import qj.InterfaceC6237b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.m */
/* loaded from: classes.dex */
public final class C6230m implements InterfaceC6237b {

    /* renamed from: c */
    public static final Object f30244c = new Object();

    /* renamed from: a */
    public volatile Object f30245a = f30244c;

    /* renamed from: b */
    public volatile InterfaceC6237b f30246b;

    public C6230m(InterfaceC6237b interfaceC6237b) {
        this.f30246b = interfaceC6237b;
    }

    @Override // qj.InterfaceC6237b
    public final Object get() {
        Object obj;
        Object obj2 = this.f30245a;
        Object obj3 = f30244c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f30245a;
                if (obj == obj3) {
                    obj = this.f30246b.get();
                    this.f30245a = obj;
                    this.f30246b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
