package f3;

import c3.C0850e;
import d3.InterfaceC1563q;
import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f3.a */
/* loaded from: classes.dex */
public final class C2195a {

    /* renamed from: a */
    public InterfaceC6747c f10119a;

    /* renamed from: b */
    public EnumC6757m f10120b;

    /* renamed from: c */
    public InterfaceC1563q f10121c;

    /* renamed from: d */
    public long f10122d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2195a)) {
            return false;
        }
        C2195a c2195a = (C2195a) obj;
        return AbstractC4154l.m8918a(this.f10119a, c2195a.f10119a) && this.f10120b == c2195a.f10120b && AbstractC4154l.m8918a(this.f10121c, c2195a.f10121c) && C0850e.m2290a(this.f10122d, c2195a.f10122d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f10122d) + ((this.f10121c.hashCode() + ((this.f10120b.hashCode() + (this.f10119a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f10119a + ", layoutDirection=" + this.f10120b + ", canvas=" + this.f10121c + ", size=" + ((Object) C0850e.m2295f(this.f10122d)) + ')';
    }
}
