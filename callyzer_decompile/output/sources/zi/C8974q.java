package zi;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.q */
/* loaded from: classes.dex */
public final class C8974q implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8974q f43238a = new C8974q();

    /* renamed from: b */
    public static final C3777b f43239b = C3777b.m8300c("pc");

    /* renamed from: c */
    public static final C3777b f43240c = C3777b.m8300c("symbol");

    /* renamed from: d */
    public static final C3777b f43241d = C3777b.m8300c(TransferTable.COLUMN_FILE);

    /* renamed from: e */
    public static final C3777b f43242e = C3777b.m8300c("offset");

    /* renamed from: f */
    public static final C3777b f43243f = C3777b.m8300c("importance");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        x0 x0Var = (x0) ((z1) obj);
        interfaceC3779d.mo8305d(f43239b, x0Var.f43308a);
        interfaceC3779d.mo8302a(f43240c, x0Var.f43309b);
        interfaceC3779d.mo8302a(f43241d, x0Var.f43310c);
        interfaceC3779d.mo8305d(f43242e, x0Var.f43311d);
        interfaceC3779d.mo8306e(f43243f, x0Var.f43312e);
    }
}
