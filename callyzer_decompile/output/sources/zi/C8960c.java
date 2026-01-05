package zi;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.c */
/* loaded from: classes.dex */
public final class C8960c implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8960c f43020a = new C8960c();

    /* renamed from: b */
    public static final C3777b f43021b = C3777b.m8300c(TransferTable.COLUMN_KEY);

    /* renamed from: c */
    public static final C3777b f43022c = C3777b.m8300c("value");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        f0 f0Var = (f0) ((q1) obj);
        interfaceC3779d.mo8302a(f43021b, f0Var.f43074a);
        interfaceC3779d.mo8302a(f43022c, f0Var.f43075b);
    }
}
