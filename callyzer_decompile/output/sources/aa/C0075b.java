package aa;

import c9.C0914i;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aa.b */
/* loaded from: classes.dex */
public final class C0075b {

    /* renamed from: a */
    public final C0079f f275a;

    /* renamed from: b */
    public final C0080g f276b;

    /* renamed from: c */
    public final Integer f277c;

    /* renamed from: d */
    public final String f278d;

    public C0075b(C0914i c0914i) {
        this.f275a = (C0079f) c0914i.f5585a;
        this.f276b = (C0080g) c0914i.f5586b;
        this.f277c = (Integer) c0914i.f5587c;
        this.f278d = (String) c0914i.f5588d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0075b.class != obj.getClass()) {
            return false;
        }
        C0075b c0075b = (C0075b) obj;
        return AbstractC4154l.m8918a(this.f275a, c0075b.f275a) && AbstractC4154l.m8918a(this.f276b, c0075b.f276b) && AbstractC4154l.m8918a(this.f277c, c0075b.f277c) && AbstractC4154l.m8918a(this.f278d, c0075b.f278d);
    }

    public final int hashCode() {
        C0079f c0079f = this.f275a;
        int iHashCode = (c0079f != null ? c0079f.hashCode() : 0) * 31;
        C0080g c0080g = this.f276b;
        int iHashCode2 = (iHashCode + (c0080g != null ? c0080g.hashCode() : 0)) * 31;
        Integer num = this.f277c;
        int iIntValue = (iHashCode2 + (num != null ? num.intValue() : 0)) * 31;
        String str = this.f278d;
        return iIntValue + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssumeRoleResponse(");
        sb2.append("assumedRoleUser=" + this.f275a + ',');
        sb2.append("credentials=" + this.f276b + ',');
        sb2.append("packedPolicySize=" + this.f277c + ',');
        return AbstractC4801l.m9737k(new StringBuilder("sourceIdentity="), this.f278d, sb2, ")");
    }
}
