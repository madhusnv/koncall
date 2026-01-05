package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.m */
/* loaded from: classes3.dex */
public final class C5411m {

    /* renamed from: a */
    public final String f27170a;

    /* renamed from: b */
    public final int f27171b;

    /* renamed from: c */
    public final EnumC8994d f27172c;

    /* renamed from: d */
    public final LocalDateTime f27173d;

    /* renamed from: e */
    public final String f27174e;

    /* renamed from: f */
    public final Long f27175f;

    public C5411m(String str, int i10, EnumC8994d enumC8994d, LocalDateTime localDateTime, String str2, Long l9) {
        this.f27170a = str;
        this.f27171b = i10;
        this.f27172c = enumC8994d;
        this.f27173d = localDateTime;
        this.f27174e = str2;
        this.f27175f = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5411m)) {
            return false;
        }
        C5411m c5411m = (C5411m) obj;
        return AbstractC4154l.m8918a(this.f27170a, c5411m.f27170a) && this.f27171b == c5411m.f27171b && this.f27172c == c5411m.f27172c && AbstractC4154l.m8918a(this.f27173d, c5411m.f27173d) && AbstractC4154l.m8918a(this.f27174e, c5411m.f27174e) && AbstractC4154l.m8918a(this.f27175f, c5411m.f27175f);
    }

    public final int hashCode() {
        String str = this.f27170a;
        int iM4556c = AbstractC1452a.m4556c(this.f27171b, (str == null ? 0 : str.hashCode()) * 31, 31);
        EnumC8994d enumC8994d = this.f27172c;
        int iHashCode = (iM4556c + (enumC8994d == null ? 0 : enumC8994d.hashCode())) * 31;
        LocalDateTime localDateTime = this.f27173d;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str2 = this.f27174e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l9 = this.f27175f;
        return iHashCode3 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM125p = AbstractC0030c.m125p(this.f27171b, "LongestCallForContact(number=", this.f27170a, ", countryCode=", ", callType=");
        sbM125p.append(this.f27172c);
        sbM125p.append(", datetime=");
        sbM125p.append(this.f27173d);
        sbM125p.append(", simNumber=");
        sbM125p.append(this.f27174e);
        sbM125p.append(", duration=");
        sbM125p.append(this.f27175f);
        sbM125p.append(")");
        return sbM125p.toString();
    }
}
