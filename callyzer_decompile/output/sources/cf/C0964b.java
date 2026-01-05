package cf;

import a1.C0005d;
import ef.InterfaceC2044d;
import ff.InterfaceC2283b;
import java.util.concurrent.Executor;
import pw.InterfaceC6043a;
import ye.C8641f;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cf.b */
/* loaded from: classes.dex */
public final class C0964b implements InterfaceC8945b {

    /* renamed from: a */
    public final InterfaceC6043a f5770a;

    /* renamed from: b */
    public final InterfaceC6043a f5771b;

    /* renamed from: c */
    public final C0967e f5772c;

    /* renamed from: d */
    public final InterfaceC6043a f5773d;

    /* renamed from: e */
    public final InterfaceC6043a f5774e;

    public C0964b(InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, C0967e c0967e, InterfaceC6043a interfaceC6043a3, InterfaceC6043a interfaceC6043a4) {
        this.f5770a = interfaceC6043a;
        this.f5771b = interfaceC6043a2;
        this.f5772c = c0967e;
        this.f5773d = interfaceC6043a3;
        this.f5774e = interfaceC6043a4;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        return new C0963a((Executor) this.f5770a.get(), (C8641f) this.f5771b.get(), (C0005d) this.f5772c.get(), (InterfaceC2044d) this.f5773d.get(), (InterfaceC2283b) this.f5774e.get());
    }
}
