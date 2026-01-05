package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.u */
/* loaded from: classes3.dex */
public final class C5419u {

    /* renamed from: a */
    public final String f27232a;

    /* renamed from: b */
    public final String f27233b;

    /* renamed from: c */
    public final int f27234c;

    /* renamed from: d */
    public final String f27235d;

    /* renamed from: e */
    public final Long f27236e;

    public C5419u(String name, String number, int i10, String str, Long l9) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        this.f27232a = name;
        this.f27233b = number;
        this.f27234c = i10;
        this.f27235d = str;
        this.f27236e = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5419u)) {
            return false;
        }
        C5419u c5419u = (C5419u) obj;
        return AbstractC4154l.m8918a(this.f27232a, c5419u.f27232a) && AbstractC4154l.m8918a(this.f27233b, c5419u.f27233b) && this.f27234c == c5419u.f27234c && AbstractC4154l.m8918a(this.f27235d, c5419u.f27235d) && AbstractC4154l.m8918a(this.f27236e, c5419u.f27236e);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f27234c, AbstractC0030c.m113d(this.f27232a.hashCode() * 31, 31, this.f27233b), 31);
        String str = this.f27235d;
        int iHashCode = (iM4556c + (str == null ? 0 : str.hashCode())) * 31;
        Long l9 = this.f27236e;
        return iHashCode + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("UniqueCallsSummaryData(name=", this.f27232a, ", number=", this.f27233b, ", countryCode=");
        AbstractC1452a.m4550A(sbM127r, this.f27234c, ", totalCalls=", this.f27235d, ", totalDuration=");
        sbM127r.append(this.f27236e);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
