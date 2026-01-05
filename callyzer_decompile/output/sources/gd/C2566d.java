package gd;

import c9.C0910e;
import fd.C2272j;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import kotlin.jvm.internal.AbstractC4154l;
import wc.C7985s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gd.d */
/* loaded from: classes.dex */
public final class C2566d implements InterfaceC2275m {

    /* renamed from: a */
    public final C7985s f13974a;

    /* renamed from: b */
    public final String f13975b;

    public C2566d(C7985s c7985s, String prefix) {
        AbstractC4154l.m8923f(prefix, "prefix");
        this.f13974a = c7985s;
        this.f13975b = prefix;
    }

    @Override // fd.InterfaceC2275m
    /* renamed from: b */
    public final InterfaceC2276n mo5962b(C2272j c2272j) {
        return new C0910e(this, c2272j, this.f13975b);
    }
}
