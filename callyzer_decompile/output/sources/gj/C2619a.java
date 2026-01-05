package gj;

import an.j2;
import android.content.Context;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4162t;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4574m;
import o6.InterfaceC5304f;
import og.yd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gj.a */
/* loaded from: classes.dex */
public final class C2619a {

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC4574m[] f14182d;

    /* renamed from: a */
    public final String f14183a;

    /* renamed from: b */
    public final ThreadLocal f14184b;

    /* renamed from: c */
    public final InterfaceC5304f f14185c;

    static {
        C4162t c4162t = new C4162t(C2619a.class);
        a0.f21154a.getClass();
        f14182d = new InterfaceC4574m[]{c4162t};
    }

    public C2619a(Context context, String name) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(name, "name");
        this.f14183a = name;
        this.f14184b = new ThreadLocal();
        this.f14185c = (InterfaceC5304f) yd.m11068b(new j2(15, this), name).m12455a(context, f14182d[0]);
    }

    /* renamed from: a */
    public final void m6594a(InterfaceC2139c interfaceC2139c) {
    }
}
