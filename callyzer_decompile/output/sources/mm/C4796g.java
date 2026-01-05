package mm;

import a2.AbstractC0030c;
import java.util.EnumSet;
import kotlin.jvm.internal.AbstractC4154l;
import zm.EnumC8991a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.g */
/* loaded from: classes3.dex */
public final class C4796g {

    /* renamed from: a */
    public final int f23871a;

    /* renamed from: b */
    public final C4792c f23872b;

    /* renamed from: c */
    public final String f23873c;

    /* renamed from: d */
    public final String f23874d;

    public C4796g(int i10, C4792c c4792c, String str, String str2) {
        this.f23871a = i10;
        this.f23872b = c4792c;
        this.f23873c = str;
        this.f23874d = str2;
    }

    /* renamed from: a */
    public final C4803n m9722a() {
        EnumSet enumSetOf = EnumSet.of(EnumC8991a.SYNC_NEW);
        AbstractC4154l.m8922e(enumSetOf, "of(...)");
        C4803n c4803n = new C4803n(0, this.f23872b, enumSetOf, null);
        c4803n.f23917f = this.f23873c;
        c4803n.f23918g = this.f23874d;
        return c4803n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4796g)) {
            return false;
        }
        C4796g c4796g = (C4796g) obj;
        return this.f23871a == c4796g.f23871a && AbstractC4154l.m8918a(this.f23872b, c4796g.f23872b) && AbstractC4154l.m8918a(this.f23873c, c4796g.f23873c) && AbstractC4154l.m8918a(this.f23874d, c4796g.f23874d);
    }

    public final int hashCode() {
        int iHashCode = (this.f23872b.hashCode() + (Integer.hashCode(this.f23871a) * 31)) * 31;
        String str = this.f23873c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23874d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CorruptCallLog(id=");
        sb2.append(this.f23871a);
        sb2.append(", callLogDetails=");
        sb2.append(this.f23872b);
        sb2.append(", phoneAccountId=");
        return AbstractC0030c.m124o(sb2, this.f23873c, ", inCompleteReason=", this.f23874d, ")");
    }
}
