package fk;

import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.e */
/* loaded from: classes.dex */
public final class C2299e implements InterfaceC3778c {

    /* renamed from: a */
    public static final C2299e f10367a = new C2299e();

    /* renamed from: b */
    public static final C3777b f10368b = C3777b.m8300c("performance");

    /* renamed from: c */
    public static final C3777b f10369c = C3777b.m8300c("crashlytics");

    /* renamed from: d */
    public static final C3777b f10370d = C3777b.m8300c("sessionSamplingRate");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        C2305k c2305k = (C2305k) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f10368b, c2305k.f10444a);
        interfaceC3779d.mo8302a(f10369c, c2305k.f10445b);
        interfaceC3779d.mo8304c(f10370d, c2305k.f10446c);
    }
}
