package zi;

import com.sun.mail.imap.IMAPStore;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.o */
/* loaded from: classes.dex */
public final class C8972o implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8972o f43217a = new C8972o();

    /* renamed from: b */
    public static final C3777b f43218b = C3777b.m8300c(IMAPStore.ID_NAME);

    /* renamed from: c */
    public static final C3777b f43219c = C3777b.m8300c("code");

    /* renamed from: d */
    public static final C3777b f43220d = C3777b.m8300c(IMAPStore.ID_ADDRESS);

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        u0 u0Var = (u0) ((y1) obj);
        interfaceC3779d.mo8302a(f43218b, u0Var.f43286a);
        interfaceC3779d.mo8302a(f43219c, u0Var.f43287b);
        interfaceC3779d.mo8305d(f43220d, u0Var.f43288c);
    }
}
