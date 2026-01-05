package om;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.a */
/* loaded from: classes3.dex */
public final class C5399a {

    /* renamed from: a */
    public final C5416r f27090a;

    /* renamed from: b */
    public final List f27091b;

    public C5399a(C5416r averageDay, List averageCall) {
        AbstractC4154l.m8923f(averageDay, "averageDay");
        AbstractC4154l.m8923f(averageCall, "averageCall");
        this.f27090a = averageDay;
        this.f27091b = averageCall;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5399a)) {
            return false;
        }
        C5399a c5399a = (C5399a) obj;
        return AbstractC4154l.m8918a(this.f27090a, c5399a.f27090a) && AbstractC4154l.m8918a(this.f27091b, c5399a.f27091b);
    }

    public final int hashCode() {
        return this.f27091b.hashCode() + (this.f27090a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsAverage(averageDay=" + this.f27090a + ", averageCall=" + this.f27091b + ")";
    }
}
