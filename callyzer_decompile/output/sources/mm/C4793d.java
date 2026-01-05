package mm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.d */
/* loaded from: classes3.dex */
public final class C4793d {

    /* renamed from: a */
    public final int f23855a;

    /* renamed from: b */
    public final String f23856b;

    /* renamed from: c */
    public final String f23857c;

    /* renamed from: d */
    public final int f23858d;

    /* renamed from: e */
    public final EnumC8994d f23859e;

    /* renamed from: f */
    public final LocalDateTime f23860f;

    /* renamed from: g */
    public final Long f23861g;

    /* renamed from: h */
    public final String f23862h;

    /* renamed from: i */
    public final Integer f23863i;

    /* renamed from: j */
    public final String f23864j;

    public C4793d(int i10, String name, String number, int i11, EnumC8994d callType, LocalDateTime localDateTime, Long l9, String str, Integer num, String simNumber) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f23855a = i10;
        this.f23856b = name;
        this.f23857c = number;
        this.f23858d = i11;
        this.f23859e = callType;
        this.f23860f = localDateTime;
        this.f23861g = l9;
        this.f23862h = str;
        this.f23863i = num;
        this.f23864j = simNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4793d)) {
            return false;
        }
        C4793d c4793d = (C4793d) obj;
        return this.f23855a == c4793d.f23855a && AbstractC4154l.m8918a(this.f23856b, c4793d.f23856b) && AbstractC4154l.m8918a(this.f23857c, c4793d.f23857c) && this.f23858d == c4793d.f23858d && this.f23859e == c4793d.f23859e && AbstractC4154l.m8918a(this.f23860f, c4793d.f23860f) && AbstractC4154l.m8918a(this.f23861g, c4793d.f23861g) && AbstractC4154l.m8918a(this.f23862h, c4793d.f23862h) && AbstractC4154l.m8918a(this.f23863i, c4793d.f23863i) && AbstractC4154l.m8918a(this.f23864j, c4793d.f23864j);
    }

    public final int hashCode() {
        int iM7370c = m0.m7370c(this.f23860f, (this.f23859e.hashCode() + AbstractC1452a.m4556c(this.f23858d, AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f23855a) * 31, 31, this.f23856b), 31, this.f23857c), 31)) * 31, 31);
        Long l9 = this.f23861g;
        int iHashCode = (iM7370c + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str = this.f23862h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f23863i;
        return this.f23864j.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f23855a, "CallTypesSummaryData(id=", ", name=", this.f23856b, ", number=");
        AbstractC1452a.m4551B(sbM14337q, this.f23857c, ", countryCode=", this.f23858d, ", callType=");
        sbM14337q.append(this.f23859e);
        sbM14337q.append(", datetime=");
        sbM14337q.append(this.f23860f);
        sbM14337q.append(", duration=");
        sbM14337q.append(this.f23861g);
        sbM14337q.append(", note=");
        sbM14337q.append(this.f23862h);
        sbM14337q.append(", simPosition=");
        sbM14337q.append(this.f23863i);
        sbM14337q.append(", simNumber=");
        sbM14337q.append(this.f23864j);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
