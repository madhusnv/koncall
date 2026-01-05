package zi;

import com.sun.mail.imap.IMAPStore;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.l */
/* loaded from: classes.dex */
public final class C8969l implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8969l f43167a = new C8969l();

    /* renamed from: b */
    public static final C3777b f43168b = C3777b.m8300c("baseAddress");

    /* renamed from: c */
    public static final C3777b f43169c = C3777b.m8300c("size");

    /* renamed from: d */
    public static final C3777b f43170d = C3777b.m8300c(IMAPStore.ID_NAME);

    /* renamed from: e */
    public static final C3777b f43171e = C3777b.m8300c("uuid");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        s0 s0Var = (s0) ((w1) obj);
        interfaceC3779d.mo8305d(f43168b, s0Var.f43268a);
        interfaceC3779d.mo8305d(f43169c, s0Var.f43269b);
        interfaceC3779d.mo8302a(f43170d, s0Var.f43270c);
        String str = s0Var.f43271d;
        interfaceC3779d.mo8302a(f43171e, str != null ? str.getBytes(n2.f43216a) : null);
    }
}
