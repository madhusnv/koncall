package g1;

import ex.InterfaceC2139c;
import h1.InterfaceC2794y;
import kotlin.jvm.internal.AbstractC4154l;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.z */
/* loaded from: classes.dex */
public final class C2446z {

    /* renamed from: a */
    public final InterfaceC7866e f11120a;

    /* renamed from: b */
    public final InterfaceC2139c f11121b;

    /* renamed from: c */
    public final InterfaceC2794y f11122c;

    public C2446z(InterfaceC2139c interfaceC2139c, InterfaceC2794y interfaceC2794y, InterfaceC7866e interfaceC7866e) {
        this.f11120a = interfaceC7866e;
        this.f11121b = interfaceC2139c;
        this.f11122c = interfaceC2794y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2446z)) {
            return false;
        }
        C2446z c2446z = (C2446z) obj;
        return AbstractC4154l.m8918a(this.f11120a, c2446z.f11120a) && AbstractC4154l.m8918a(this.f11121b, c2446z.f11121b) && AbstractC4154l.m8918a(this.f11122c, c2446z.f11122c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f11122c.hashCode() + ((this.f11121b.hashCode() + (this.f11120a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f11120a + ", size=" + this.f11121b + ", animationSpec=" + this.f11122c + ", clip=true)";
    }
}
