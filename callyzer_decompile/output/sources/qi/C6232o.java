package qi;

import a1.C0004c;
import ak.C0169h;
import mk.C4764c;
import qj.InterfaceC6236a;
import qj.InterfaceC6237b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.o */
/* loaded from: classes.dex */
public final class C6232o implements InterfaceC6237b {

    /* renamed from: c */
    public static final C4764c f30249c = new C4764c(3);

    /* renamed from: d */
    public static final C0169h f30250d = new C0169h(2);

    /* renamed from: a */
    public InterfaceC6236a f30251a;

    /* renamed from: b */
    public volatile InterfaceC6237b f30252b;

    public C6232o(C4764c c4764c, InterfaceC6237b interfaceC6237b) {
        this.f30251a = c4764c;
        this.f30252b = interfaceC6237b;
    }

    /* renamed from: a */
    public final void m12249a(InterfaceC6236a interfaceC6236a) {
        InterfaceC6237b interfaceC6237b;
        InterfaceC6237b interfaceC6237b2;
        InterfaceC6237b interfaceC6237b3 = this.f30252b;
        C0169h c0169h = f30250d;
        if (interfaceC6237b3 != c0169h) {
            interfaceC6236a.mo19e(interfaceC6237b3);
            return;
        }
        synchronized (this) {
            interfaceC6237b = this.f30252b;
            if (interfaceC6237b != c0169h) {
                interfaceC6237b2 = interfaceC6237b;
            } else {
                this.f30251a = new C0004c(17, this.f30251a, interfaceC6236a);
                interfaceC6237b2 = null;
            }
        }
        if (interfaceC6237b2 != null) {
            interfaceC6236a.mo19e(interfaceC6237b);
        }
    }

    @Override // qj.InterfaceC6237b
    public final Object get() {
        return this.f30252b.get();
    }
}
