package zi;

import com.sun.mail.imap.IMAPStore;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.y */
/* loaded from: classes.dex */
public final class C8982y implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8982y f43313a = new C8982y();

    /* renamed from: b */
    public static final C3777b f43314b = C3777b.m8300c("platform");

    /* renamed from: c */
    public static final C3777b f43315c = C3777b.m8300c(IMAPStore.ID_VERSION);

    /* renamed from: d */
    public static final C3777b f43316d = C3777b.m8300c("buildVersion");

    /* renamed from: e */
    public static final C3777b f43317e = C3777b.m8300c("jailbroken");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        i1 i1Var = (i1) ((k2) obj);
        interfaceC3779d.mo8306e(f43314b, i1Var.f43120a);
        interfaceC3779d.mo8302a(f43315c, i1Var.f43121b);
        interfaceC3779d.mo8302a(f43316d, i1Var.f43122c);
        interfaceC3779d.mo8303b(f43317e, i1Var.f43123d);
    }
}
