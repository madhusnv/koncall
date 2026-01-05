package xm;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a3 {

    /* renamed from: a */
    public final Integer f40115a;

    /* renamed from: b */
    public final Integer f40116b;

    /* renamed from: c */
    public final Integer f40117c;

    public a3(Integer num, Integer num2, Integer num3) {
        this.f40115a = num;
        this.f40116b = num2;
        this.f40117c = num3;
    }

    /* renamed from: a */
    public static a3 m15554a(a3 a3Var, Integer num, Integer num2, Integer num3, int i10) {
        if ((i10 & 1) != 0) {
            num = a3Var.f40115a;
        }
        if ((i10 & 2) != 0) {
            num2 = a3Var.f40116b;
        }
        if ((i10 & 4) != 0) {
            num3 = a3Var.f40117c;
        }
        a3Var.getClass();
        return new a3(num, num2, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return AbstractC4154l.m8918a(this.f40115a, a3Var.f40115a) && AbstractC4154l.m8918a(this.f40116b, a3Var.f40116b) && AbstractC4154l.m8918a(this.f40117c, a3Var.f40117c);
    }

    public final int hashCode() {
        Integer num = this.f40115a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f40116b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f40117c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "LeadCount(myLeadCount=" + this.f40115a + ", scheduleLeadCount=" + this.f40116b + ", dueLeadCount=" + this.f40117c + ")";
    }
}
