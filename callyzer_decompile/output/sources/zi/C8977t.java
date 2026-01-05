package zi;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.t */
/* loaded from: classes.dex */
public final class C8977t implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8977t f43272a = new C8977t();

    /* renamed from: b */
    public static final C3777b f43273b = C3777b.m8300c("timestamp");

    /* renamed from: c */
    public static final C3777b f43274c = C3777b.m8300c(TransferTable.COLUMN_TYPE);

    /* renamed from: d */
    public static final C3777b f43275d = C3777b.m8300c("app");

    /* renamed from: e */
    public static final C3777b f43276e = C3777b.m8300c("device");

    /* renamed from: f */
    public static final C3777b f43277f = C3777b.m8300c("log");

    /* renamed from: g */
    public static final C3777b f43278g = C3777b.m8300c("rollouts");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        p0 p0Var = (p0) ((j2) obj);
        interfaceC3779d.mo8305d(f43273b, p0Var.f43232a);
        interfaceC3779d.mo8302a(f43274c, p0Var.f43233b);
        interfaceC3779d.mo8302a(f43275d, p0Var.f43234c);
        interfaceC3779d.mo8302a(f43276e, p0Var.f43235d);
        interfaceC3779d.mo8302a(f43277f, p0Var.f43236e);
        interfaceC3779d.mo8302a(f43278g, p0Var.f43237f);
    }
}
