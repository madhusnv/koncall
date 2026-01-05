package ou;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ou.c */
/* loaded from: classes3.dex */
public final class C5746c extends AbstractC5748e {

    /* renamed from: a */
    public final List f28303a;

    /* renamed from: b */
    public final int f28304b;

    public C5746c(List list, int i10) {
        this.f28303a = list;
        this.f28304b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5746c)) {
            return false;
        }
        C5746c c5746c = (C5746c) obj;
        return AbstractC4154l.m8918a(this.f28303a, c5746c.f28303a) && this.f28304b == c5746c.f28304b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28304b) + (this.f28303a.hashCode() * 31);
    }

    public final String toString() {
        return "Failed(steps=" + this.f28303a + ", failedPosition=" + this.f28304b + ")";
    }
}
