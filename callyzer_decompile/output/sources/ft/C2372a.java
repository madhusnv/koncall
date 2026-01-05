package ft;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ft.a */
/* loaded from: classes3.dex */
public final class C2372a {

    /* renamed from: a */
    public final int f10799a;

    /* renamed from: b */
    public final String f10800b;

    /* renamed from: c */
    public final String f10801c;

    /* renamed from: d */
    public final int f10802d;

    public C2372a(String str, int i10, int i11, String str2) {
        this.f10799a = i10;
        this.f10800b = str;
        this.f10801c = str2;
        this.f10802d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2372a)) {
            return false;
        }
        C2372a c2372a = (C2372a) obj;
        return this.f10799a == c2372a.f10799a && AbstractC4154l.m8918a(this.f10800b, c2372a.f10800b) && AbstractC4154l.m8918a(this.f10801c, c2372a.f10801c) && this.f10802d == c2372a.f10802d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10802d) + AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f10799a) * 31, 31, this.f10800b), 31, this.f10801c);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f10799a, "SimUiData(slot=", ", username=", this.f10800b, ", number=");
        sbM14337q.append(this.f10801c);
        sbM14337q.append(", simCountryCode=");
        sbM14337q.append(this.f10802d);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
