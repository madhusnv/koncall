package zi;

import com.sun.mail.imap.IMAPStore;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zi.p */
/* loaded from: classes.dex */
public final class C8973p implements InterfaceC3778c {

    /* renamed from: a */
    public static final C8973p f43228a = new C8973p();

    /* renamed from: b */
    public static final C3777b f43229b = C3777b.m8300c(IMAPStore.ID_NAME);

    /* renamed from: c */
    public static final C3777b f43230c = C3777b.m8300c("importance");

    /* renamed from: d */
    public static final C3777b f43231d = C3777b.m8300c("frames");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        v0 v0Var = (v0) ((a2) obj);
        interfaceC3779d.mo8302a(f43229b, v0Var.f43294a);
        interfaceC3779d.mo8306e(f43230c, v0Var.f43295b);
        interfaceC3779d.mo8302a(f43231d, v0Var.f43296c);
    }
}
