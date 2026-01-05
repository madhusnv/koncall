package zi;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.i */
/* loaded from: classes.dex */
public final class C8966i implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8966i f43097a = new C8966i();

    /* renamed from: b */
    public static final C3777b f43098b = C3777b.m8300c("arch");

    /* renamed from: c */
    public static final C3777b f43099c = C3777b.m8300c("model");

    /* renamed from: d */
    public static final C3777b f43100d = C3777b.m8300c("cores");

    /* renamed from: e */
    public static final C3777b f43101e = C3777b.m8300c("ram");

    /* renamed from: f */
    public static final C3777b f43102f = C3777b.m8300c("diskSpace");

    /* renamed from: g */
    public static final C3777b f43103g = C3777b.m8300c("simulator");

    /* renamed from: h */
    public static final C3777b f43104h = C3777b.m8300c(TransferTable.COLUMN_STATE);

    /* renamed from: i */
    public static final C3777b f43105i = C3777b.m8300c("manufacturer");

    /* renamed from: j */
    public static final C3777b f43106j = C3777b.m8300c("modelClass");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        n0 n0Var = (n0) ((v1) obj);
        interfaceC3779d.mo8306e(f43098b, n0Var.f43206a);
        interfaceC3779d.mo8302a(f43099c, n0Var.f43207b);
        interfaceC3779d.mo8306e(f43100d, n0Var.f43208c);
        interfaceC3779d.mo8305d(f43101e, n0Var.f43209d);
        interfaceC3779d.mo8305d(f43102f, n0Var.f43210e);
        interfaceC3779d.mo8303b(f43103g, n0Var.f43211f);
        interfaceC3779d.mo8306e(f43104h, n0Var.f43212g);
        interfaceC3779d.mo8302a(f43105i, n0Var.f43213h);
        interfaceC3779d.mo8302a(f43106j, n0Var.f43214i);
    }
}
