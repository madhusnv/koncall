package cs;

import kotlin.jvm.internal.AbstractC4154l;
import og.hb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.h */
/* loaded from: classes3.dex */
public final class C1489h extends hb {

    /* renamed from: a */
    public final String f7569a;

    /* renamed from: b */
    public final int f7570b;

    public C1489h(String number, int i10) {
        AbstractC4154l.m8923f(number, "number");
        this.f7569a = number;
        this.f7570b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1489h)) {
            return false;
        }
        C1489h c1489h = (C1489h) obj;
        return AbstractC4154l.m8918a(this.f7569a, c1489h.f7569a) && this.f7570b == c1489h.f7570b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7570b) + (this.f7569a.hashCode() * 31);
    }

    public final String toString() {
        return "SetCallLogData(number=" + this.f7569a + ", selectedIndex=" + this.f7570b + ")";
    }
}
