package zi;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.n */
/* loaded from: classes.dex */
public final class C8971n implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8971n f43200a = new C8971n();

    /* renamed from: b */
    public static final C3777b f43201b = C3777b.m8300c(TransferTable.COLUMN_TYPE);

    /* renamed from: c */
    public static final C3777b f43202c = C3777b.m8300c("reason");

    /* renamed from: d */
    public static final C3777b f43203d = C3777b.m8300c("frames");

    /* renamed from: e */
    public static final C3777b f43204e = C3777b.m8300c("causedBy");

    /* renamed from: f */
    public static final C3777b f43205f = C3777b.m8300c("overflowCount");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        t0 t0Var = (t0) ((x1) obj);
        interfaceC3779d.mo8302a(f43201b, t0Var.f43279a);
        interfaceC3779d.mo8302a(f43202c, t0Var.f43280b);
        interfaceC3779d.mo8302a(f43203d, t0Var.f43281c);
        interfaceC3779d.mo8302a(f43204e, t0Var.f43282d);
        interfaceC3779d.mo8306e(f43205f, t0Var.f43283e);
    }
}
