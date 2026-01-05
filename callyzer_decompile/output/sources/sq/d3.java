package sq;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d3 {

    /* renamed from: a */
    public final float f32821a;

    /* renamed from: b */
    public final long f32822b;

    /* renamed from: c */
    public final String f32823c;

    public d3(float f6, long j6, String label) {
        AbstractC4154l.m8923f(label, "label");
        this.f32821a = f6;
        this.f32822b = j6;
        this.f32823c = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return Float.compare(this.f32821a, d3Var.f32821a) == 0 && C1565s.m5187c(this.f32822b, d3Var.f32822b) && AbstractC4154l.m8918a(this.f32823c, d3Var.f32823c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f32821a) * 31;
        int i10 = C1565s.f7818k;
        return this.f32823c.hashCode() + AbstractC1452a.m4557d(iHashCode, 31, this.f32822b);
    }

    public final String toString() {
        String strM5193i = C1565s.m5193i(this.f32822b);
        StringBuilder sb2 = new StringBuilder("PieChartItem(value=");
        sb2.append(this.f32821a);
        sb2.append(", color=");
        sb2.append(strM5193i);
        sb2.append(", label=");
        return AbstractC1452a.m4564k(sb2, this.f32823c, ")");
    }
}
