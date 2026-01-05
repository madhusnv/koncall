package fk;

import android.os.Build;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.c */
/* loaded from: classes.dex */
public final class C2297c implements InterfaceC3778c {

    /* renamed from: a */
    public static final C2297c f10348a = new C2297c();

    /* renamed from: b */
    public static final C3777b f10349b = C3777b.m8300c("packageName");

    /* renamed from: c */
    public static final C3777b f10350c = C3777b.m8300c("versionName");

    /* renamed from: d */
    public static final C3777b f10351d = C3777b.m8300c("appBuildVersion");

    /* renamed from: e */
    public static final C3777b f10352e = C3777b.m8300c("deviceManufacturer");

    /* renamed from: f */
    public static final C3777b f10353f = C3777b.m8300c("currentProcessDetails");

    /* renamed from: g */
    public static final C3777b f10354g = C3777b.m8300c("appProcessDetails");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        C2295a c2295a = (C2295a) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f10349b, c2295a.f10333a);
        interfaceC3779d.mo8302a(f10350c, c2295a.f10334b);
        interfaceC3779d.mo8302a(f10351d, c2295a.f10335c);
        interfaceC3779d.mo8302a(f10352e, Build.MANUFACTURER);
        interfaceC3779d.mo8302a(f10353f, c2295a.f10336d);
        interfaceC3779d.mo8302a(f10354g, c2295a.f10337e);
    }
}
