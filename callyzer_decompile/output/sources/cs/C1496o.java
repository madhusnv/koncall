package cs;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import js.C3850f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.o */
/* loaded from: classes3.dex */
public final class C1496o extends AbstractC1500s {

    /* renamed from: a */
    public final String f7579a;

    /* renamed from: b */
    public final String f7580b;

    /* renamed from: c */
    public final int f7581c;

    /* renamed from: d */
    public final C3850f f7582d;

    public C1496o(String countryCode, String number, int i10, C3850f c3850f) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(number, "number");
        this.f7579a = countryCode;
        this.f7580b = number;
        this.f7581c = i10;
        this.f7582d = c3850f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1496o)) {
            return false;
        }
        C1496o c1496o = (C1496o) obj;
        return AbstractC4154l.m8918a(this.f7579a, c1496o.f7579a) && AbstractC4154l.m8918a(this.f7580b, c1496o.f7580b) && this.f7581c == c1496o.f7581c && AbstractC4154l.m8918a(this.f7582d, c1496o.f7582d);
    }

    public final int hashCode() {
        return this.f7582d.hashCode() + AbstractC1452a.m4556c(this.f7581c, AbstractC0030c.m113d(this.f7579a.hashCode() * 31, 31, this.f7580b), 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("PlaceCall(countryCode=", this.f7579a, ", number=", this.f7580b, ", index=");
        sbM127r.append(this.f7581c);
        sbM127r.append(", item=");
        sbM127r.append(this.f7582d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
