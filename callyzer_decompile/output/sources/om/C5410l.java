package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.l */
/* loaded from: classes3.dex */
public final class C5410l {

    /* renamed from: a */
    public final String f27163a;

    /* renamed from: b */
    public final String f27164b;

    /* renamed from: c */
    public final int f27165c;

    /* renamed from: d */
    public final String f27166d;

    /* renamed from: e */
    public final EnumC8994d f27167e;

    /* renamed from: f */
    public final LocalDateTime f27168f;

    /* renamed from: g */
    public final Long f27169g;

    public C5410l(String name, String number, int i10, String str, EnumC8994d enumC8994d, LocalDateTime localDateTime, Long l9) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        this.f27163a = name;
        this.f27164b = number;
        this.f27165c = i10;
        this.f27166d = str;
        this.f27167e = enumC8994d;
        this.f27168f = localDateTime;
        this.f27169g = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5410l)) {
            return false;
        }
        C5410l c5410l = (C5410l) obj;
        return AbstractC4154l.m8918a(this.f27163a, c5410l.f27163a) && AbstractC4154l.m8918a(this.f27164b, c5410l.f27164b) && this.f27165c == c5410l.f27165c && AbstractC4154l.m8918a(this.f27166d, c5410l.f27166d) && this.f27167e == c5410l.f27167e && AbstractC4154l.m8918a(this.f27168f, c5410l.f27168f) && AbstractC4154l.m8918a(this.f27169g, c5410l.f27169g);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f27165c, AbstractC0030c.m113d(this.f27163a.hashCode() * 31, 31, this.f27164b), 31);
        String str = this.f27166d;
        int iHashCode = (iM4556c + (str == null ? 0 : str.hashCode())) * 31;
        EnumC8994d enumC8994d = this.f27167e;
        int iHashCode2 = (iHashCode + (enumC8994d == null ? 0 : enumC8994d.hashCode())) * 31;
        LocalDateTime localDateTime = this.f27168f;
        int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        Long l9 = this.f27169g;
        return iHashCode3 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("LongestCall(name=", this.f27163a, ", number=", this.f27164b, ", countryCode=");
        AbstractC1452a.m4550A(sbM127r, this.f27165c, ", photoUri=", this.f27166d, ", callType=");
        sbM127r.append(this.f27167e);
        sbM127r.append(", callTime=");
        sbM127r.append(this.f27168f);
        sbM127r.append(", callDuration=");
        sbM127r.append(this.f27169g);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
