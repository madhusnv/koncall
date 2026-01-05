package fk;

import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.h */
/* loaded from: classes.dex */
public final class C2302h implements InterfaceC3778c {

    /* renamed from: a */
    public static final C2302h f10401a = new C2302h();

    /* renamed from: b */
    public static final C3777b f10402b = C3777b.m8300c("sessionId");

    /* renamed from: c */
    public static final C3777b f10403c = C3777b.m8300c("firstSessionId");

    /* renamed from: d */
    public static final C3777b f10404d = C3777b.m8300c("sessionIndex");

    /* renamed from: e */
    public static final C3777b f10405e = C3777b.m8300c("eventTimestampUs");

    /* renamed from: f */
    public static final C3777b f10406f = C3777b.m8300c("dataCollectionStatus");

    /* renamed from: g */
    public static final C3777b f10407g = C3777b.m8300c("firebaseInstallationId");

    /* renamed from: h */
    public static final C3777b f10408h = C3777b.m8300c("firebaseAuthenticationToken");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        z0 z0Var = (z0) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f10402b, z0Var.f10529a);
        interfaceC3779d.mo8302a(f10403c, z0Var.f10530b);
        interfaceC3779d.mo8306e(f10404d, z0Var.f10531c);
        interfaceC3779d.mo8305d(f10405e, z0Var.f10532d);
        interfaceC3779d.mo8302a(f10406f, z0Var.f10533e);
        interfaceC3779d.mo8302a(f10407g, z0Var.f10534f);
        interfaceC3779d.mo8302a(f10408h, z0Var.f10535g);
    }
}
