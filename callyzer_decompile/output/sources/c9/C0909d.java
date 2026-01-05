package c9;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.d */
/* loaded from: classes.dex */
public final class C0909d {

    /* renamed from: a */
    public final String f5576a;

    /* renamed from: b */
    public final Long f5577b;

    public C0909d(String str, Long l9) {
        this.f5576a = str;
        this.f5577b = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0909d)) {
            return false;
        }
        C0909d c0909d = (C0909d) obj;
        return AbstractC4154l.m8918a(this.f5576a, c0909d.f5576a) && AbstractC4154l.m8918a(this.f5577b, c0909d.f5577b);
    }

    public final int hashCode() {
        int iHashCode = this.f5576a.hashCode() * 31;
        Long l9 = this.f5577b;
        return iHashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f5576a + ", value=" + this.f5577b + ')';
    }
}
