package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.t */
/* loaded from: classes3.dex */
public final class C5418t {

    /* renamed from: a */
    public final String f27225a;

    /* renamed from: b */
    public final String f27226b;

    /* renamed from: c */
    public final int f27227c;

    /* renamed from: d */
    public final EnumC8994d f27228d;

    /* renamed from: e */
    public final LocalDateTime f27229e;

    /* renamed from: f */
    public final Long f27230f;

    /* renamed from: g */
    public final Integer f27231g;

    public C5418t(String name, String number, int i10, EnumC8994d enumC8994d, LocalDateTime localDateTime, Long l9, Integer num) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        this.f27225a = name;
        this.f27226b = number;
        this.f27227c = i10;
        this.f27228d = enumC8994d;
        this.f27229e = localDateTime;
        this.f27230f = l9;
        this.f27231g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5418t)) {
            return false;
        }
        C5418t c5418t = (C5418t) obj;
        return AbstractC4154l.m8918a(this.f27225a, c5418t.f27225a) && AbstractC4154l.m8918a(this.f27226b, c5418t.f27226b) && this.f27227c == c5418t.f27227c && this.f27228d == c5418t.f27228d && AbstractC4154l.m8918a(this.f27229e, c5418t.f27229e) && AbstractC4154l.m8918a(this.f27230f, c5418t.f27230f) && AbstractC4154l.m8918a(this.f27231g, c5418t.f27231g);
    }

    public final int hashCode() {
        int iM7370c = m0.m7370c(this.f27229e, (this.f27228d.hashCode() + AbstractC1452a.m4556c(this.f27227c, AbstractC0030c.m113d(this.f27225a.hashCode() * 31, 31, this.f27226b), 31)) * 31, 31);
        Long l9 = this.f27230f;
        int iHashCode = (iM7370c + (l9 == null ? 0 : l9.hashCode())) * 31;
        Integer num = this.f27231g;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("TopFrequentCalls(name=", this.f27225a, ", number=", this.f27226b, ", countryCode=");
        sbM127r.append(this.f27227c);
        sbM127r.append(", callType=");
        sbM127r.append(this.f27228d);
        sbM127r.append(", datetime=");
        sbM127r.append(this.f27229e);
        sbM127r.append(", duration=");
        sbM127r.append(this.f27230f);
        sbM127r.append(", callCount=");
        sbM127r.append(this.f27231g);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
