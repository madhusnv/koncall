package df;

import a1.C0005d;
import android.content.Context;
import cf.C0967e;
import ef.InterfaceC2043c;
import ef.InterfaceC2044d;
import ff.InterfaceC2283b;
import io.C3328c;
import java.util.concurrent.Executor;
import ph.C5950e;
import pw.InterfaceC6043a;
import ye.C8641f;
import yk.C8687a;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: df.i */
/* loaded from: classes.dex */
public final class C1710i implements InterfaceC8945b {

    /* renamed from: a */
    public final InterfaceC6043a f8329a;

    /* renamed from: b */
    public final InterfaceC6043a f8330b;

    /* renamed from: c */
    public final InterfaceC6043a f8331c;

    /* renamed from: d */
    public final C0967e f8332d;

    /* renamed from: e */
    public final InterfaceC6043a f8333e;

    /* renamed from: f */
    public final InterfaceC6043a f8334f;

    /* renamed from: g */
    public final InterfaceC6043a f8335g;

    public C1710i(InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, InterfaceC6043a interfaceC6043a3, C0967e c0967e, InterfaceC6043a interfaceC6043a4, InterfaceC6043a interfaceC6043a5, InterfaceC6043a interfaceC6043a6) {
        this.f8329a = interfaceC6043a;
        this.f8330b = interfaceC6043a2;
        this.f8331c = interfaceC6043a3;
        this.f8332d = c0967e;
        this.f8333e = interfaceC6043a4;
        this.f8334f = interfaceC6043a5;
        this.f8335g = interfaceC6043a6;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        Context context = (Context) this.f8329a.get();
        C8641f c8641f = (C8641f) this.f8330b.get();
        InterfaceC2044d interfaceC2044d = (InterfaceC2044d) this.f8331c.get();
        C0005d c0005d = (C0005d) this.f8332d.get();
        Executor executor = (Executor) this.f8333e.get();
        InterfaceC2283b interfaceC2283b = (InterfaceC2283b) this.f8334f.get();
        C8687a c8687a = new C8687a(14);
        C5950e c5950e = new C5950e(14);
        InterfaceC2043c interfaceC2043c = (InterfaceC2043c) this.f8335g.get();
        C3328c c3328c = new C3328c();
        c3328c.f17609a = context;
        c3328c.f17610b = c8641f;
        c3328c.f17611c = interfaceC2044d;
        c3328c.f17612d = c0005d;
        c3328c.f17613e = executor;
        c3328c.f17614f = interfaceC2283b;
        c3328c.f17615g = c8687a;
        c3328c.f17616h = c5950e;
        c3328c.f17617i = interfaceC2043c;
        return c3328c;
    }
}
