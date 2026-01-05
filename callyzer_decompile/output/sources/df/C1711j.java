package df;

import a1.C0005d;
import cf.C0967e;
import ef.InterfaceC2044d;
import ff.InterfaceC2283b;
import java.util.concurrent.Executor;
import pw.InterfaceC6043a;
import wj.C8090p;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: df.j */
/* loaded from: classes.dex */
public final class C1711j implements InterfaceC8945b {

    /* renamed from: a */
    public final InterfaceC6043a f8336a;

    /* renamed from: b */
    public final InterfaceC6043a f8337b;

    /* renamed from: c */
    public final C0967e f8338c;

    /* renamed from: d */
    public final InterfaceC6043a f8339d;

    public C1711j(InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, C0967e c0967e, InterfaceC6043a interfaceC6043a3) {
        this.f8336a = interfaceC6043a;
        this.f8337b = interfaceC6043a2;
        this.f8338c = c0967e;
        this.f8339d = interfaceC6043a3;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        Executor executor = (Executor) this.f8336a.get();
        InterfaceC2044d interfaceC2044d = (InterfaceC2044d) this.f8337b.get();
        C0005d c0005d = (C0005d) this.f8338c.get();
        InterfaceC2283b interfaceC2283b = (InterfaceC2283b) this.f8339d.get();
        C8090p c8090p = new C8090p();
        c8090p.f38723a = executor;
        c8090p.f38724b = interfaceC2044d;
        c8090p.f38725c = c0005d;
        c8090p.f38726d = interfaceC2283b;
        return c8090p;
    }
}
