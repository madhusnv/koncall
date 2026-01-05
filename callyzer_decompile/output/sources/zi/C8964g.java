package zi;

import com.sun.mail.imap.IMAPStore;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.g */
/* loaded from: classes.dex */
public final class C8964g implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8964g f43078a = new C8964g();

    /* renamed from: b */
    public static final C3777b f43079b = C3777b.m8300c("identifier");

    /* renamed from: c */
    public static final C3777b f43080c = C3777b.m8300c(IMAPStore.ID_VERSION);

    /* renamed from: d */
    public static final C3777b f43081d = C3777b.m8300c("displayVersion");

    /* renamed from: e */
    public static final C3777b f43082e = C3777b.m8300c("organization");

    /* renamed from: f */
    public static final C3777b f43083f = C3777b.m8300c("installationUuid");

    /* renamed from: g */
    public static final C3777b f43084g = C3777b.m8300c("developmentPlatform");

    /* renamed from: h */
    public static final C3777b f43085h = C3777b.m8300c("developmentPlatformVersion");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        k0 k0Var = (k0) ((u1) obj);
        interfaceC3779d.mo8302a(f43079b, k0Var.f43158a);
        interfaceC3779d.mo8302a(f43080c, k0Var.f43159b);
        interfaceC3779d.mo8302a(f43081d, k0Var.f43160c);
        interfaceC3779d.mo8302a(f43082e, null);
        interfaceC3779d.mo8302a(f43083f, k0Var.f43161d);
        interfaceC3779d.mo8302a(f43084g, k0Var.f43162e);
        interfaceC3779d.mo8302a(f43085h, k0Var.f43163f);
    }
}
