package gl;

import a9.C0073l;
import al.AbstractC0180h;
import al.EnumC0185m;
import b2.C0554l;
import c6.b1;
import cl.C0982b;
import cl.InterfaceC0981a;
import il.AbstractC3294b;
import java.util.concurrent.Executor;
import og.dc;
import og.fc;
import og.qc;
import og.yg;
import p020v.x0;
import pf.C5904d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gl.c */
/* loaded from: classes.dex */
public final class C2627c extends AbstractC3294b implements InterfaceC0981a {

    /* renamed from: g */
    public static final C0982b f14206g = new C0982b();

    /* renamed from: f */
    public final boolean f14207f;

    public C2627c(C2629e c2629e, Executor executor, yg ygVar) {
        super(c2629e, executor);
        boolean zM6599c = AbstractC2625a.m6599c();
        this.f14207f = zM6599c;
        C0073l c0073l = new C0073l();
        c0073l.f265b = AbstractC2625a.m6597a(f14206g);
        qc qcVar = new qc(c0073l);
        x0 x0Var = new x0(8, false);
        x0Var.f36756d = zM6599c ? dc.TYPE_THICK : dc.TYPE_THIN;
        x0Var.f36757e = qcVar;
        EnumC0185m.INSTANCE.execute(new b1(ygVar, new C0554l(x0Var, 1), fc.ON_DEVICE_BARCODE_CREATE, ygVar.m11076c(), 2));
    }

    @Override // il.AbstractC3294b, java.io.Closeable, java.lang.AutoCloseable, cl.InterfaceC0981a
    public final synchronized void close() {
        super.close();
    }

    @Override // qf.InterfaceC6210i
    /* renamed from: h */
    public final C5904d[] mo433h() {
        return this.f14207f ? AbstractC0180h.f548a : new C5904d[]{AbstractC0180h.f549b};
    }
}
