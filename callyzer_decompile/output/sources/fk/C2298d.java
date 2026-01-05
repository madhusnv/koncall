package fk;

import android.os.Build;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.d */
/* loaded from: classes.dex */
public final class C2298d implements InterfaceC3778c {

    /* renamed from: a */
    public static final C2298d f10358a = new C2298d();

    /* renamed from: b */
    public static final C3777b f10359b = C3777b.m8300c("appId");

    /* renamed from: c */
    public static final C3777b f10360c = C3777b.m8300c("deviceModel");

    /* renamed from: d */
    public static final C3777b f10361d = C3777b.m8300c("sessionSdkVersion");

    /* renamed from: e */
    public static final C3777b f10362e = C3777b.m8300c("osVersion");

    /* renamed from: f */
    public static final C3777b f10363f = C3777b.m8300c("logEnvironment");

    /* renamed from: g */
    public static final C3777b f10364g = C3777b.m8300c("androidAppInfo");

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        C2296b c2296b = (C2296b) obj;
        InterfaceC3779d interfaceC3779d = (InterfaceC3779d) obj2;
        interfaceC3779d.mo8302a(f10359b, c2296b.f10339a);
        interfaceC3779d.mo8302a(f10360c, Build.MODEL);
        interfaceC3779d.mo8302a(f10361d, "3.0.0");
        interfaceC3779d.mo8302a(f10362e, Build.VERSION.RELEASE);
        interfaceC3779d.mo8302a(f10363f, c2296b.f10340b);
        interfaceC3779d.mo8302a(f10364g, c2296b.f10341c);
    }
}
