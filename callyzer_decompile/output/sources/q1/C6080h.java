package q1;

import b2.C0554l;
import e1.C1921w;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import g1.C2425e;
import o4.C5287c;
import s1.AbstractC6731z;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.h */
/* loaded from: classes.dex */
public final class C6080h extends AbstractC6731z {

    /* renamed from: b */
    public final C0554l f29652b = new C0554l((byte) 0, 9);

    /* renamed from: c */
    public C1921w f29653c;

    public C6080h(InterfaceC2139c interfaceC2139c) {
        interfaceC2139c.invoke(this);
    }

    @Override // s1.AbstractC6731z
    /* renamed from: k */
    public final C0554l mo12097k() {
        return this.f29652b;
    }

    /* renamed from: n */
    public final void m12098n(Object obj, Object obj2, InterfaceC2142f interfaceC2142f) {
        this.f29652b.m1632a(1, new C6078f(obj != null ? new C2425e(1, obj) : null, new C2425e(2, obj2), new C6734c(new C5287c(1, interfaceC2142f), true, -1010194746)));
    }

    /* renamed from: p */
    public final void m12099p(int i10, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, C6734c c6734c) {
        this.f29652b.m1632a(i10, new C6078f(interfaceC2139c, interfaceC2139c2, c6734c));
    }

    /* renamed from: r */
    public final void m12100r(String str, Object obj, C6734c c6734c) {
        C1921w c1921w = this.f29653c;
        if (c1921w == null) {
            c1921w = new C1921w();
            this.f29653c = c1921w;
        }
        C0554l c0554l = this.f29652b;
        c1921w.m5651a(c0554l.f3778b);
        m12098n(str, obj, new C6734c(new C6079g(c6734c, c0554l.f3778b), true, 1491981087));
    }
}
