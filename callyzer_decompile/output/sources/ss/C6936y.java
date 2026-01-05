package ss;

import kotlin.jvm.internal.AbstractC4154l;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.y */
/* loaded from: classes3.dex */
public final class C6936y extends a0 {

    /* renamed from: a */
    public final EnumC7204p f33525a;

    /* renamed from: b */
    public final String f33526b;

    public C6936y(EnumC7204p simSelectionMode, String str) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f33525a = simSelectionMode;
        this.f33526b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6936y)) {
            return false;
        }
        C6936y c6936y = (C6936y) obj;
        return this.f33525a == c6936y.f33525a && AbstractC4154l.m8918a(this.f33526b, c6936y.f33526b);
    }

    public final int hashCode() {
        return this.f33526b.hashCode() + (this.f33525a.hashCode() * 31);
    }

    public final String toString() {
        return "SimOptionChanged(simSelectionMode=" + this.f33525a + ", screen=" + this.f33526b + ")";
    }
}
