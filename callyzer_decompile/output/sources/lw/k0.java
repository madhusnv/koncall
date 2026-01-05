package lw;

import kotlin.jvm.internal.AbstractC4154l;
import mw.C4896d;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a */
    public final int f22597a;

    /* renamed from: b */
    public final g0 f22598b;

    /* renamed from: c */
    public final w0 f22599c;

    /* renamed from: d */
    public final C4896d f22600d;

    public k0(int i10, g0 pieSliceData, w0 labelPlaceable, C4896d c4896d) {
        AbstractC4154l.m8923f(pieSliceData, "pieSliceData");
        AbstractC4154l.m8923f(labelPlaceable, "labelPlaceable");
        this.f22597a = i10;
        this.f22598b = pieSliceData;
        this.f22599c = labelPlaceable;
        this.f22600d = c4896d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f22597a == k0Var.f22597a && AbstractC4154l.m8918a(this.f22598b, k0Var.f22598b) && AbstractC4154l.m8918a(this.f22599c, k0Var.f22599c) && this.f22600d.equals(k0Var.f22600d);
    }

    public final int hashCode() {
        return Double.hashCode(this.f22600d.f24423a) + ((this.f22599c.hashCode() + ((this.f22598b.hashCode() + (Integer.hashCode(this.f22597a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SliceLabelData(index=" + this.f22597a + ", pieSliceData=" + this.f22598b + ", labelPlaceable=" + this.f22599c + ", centerAngle=" + this.f22600d + ")";
    }
}
