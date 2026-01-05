package pv;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pv.a */
/* loaded from: classes3.dex */
public final class C6041a {

    /* renamed from: a */
    public final String f29496a;

    /* renamed from: b */
    public final int f29497b;

    /* renamed from: c */
    public final String f29498c;

    /* renamed from: d */
    public final LocalDateTime f29499d;

    public C6041a(String number, int i10, String str, LocalDateTime callDateTime) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(callDateTime, "callDateTime");
        this.f29496a = number;
        this.f29497b = i10;
        this.f29498c = str;
        this.f29499d = callDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6041a)) {
            return false;
        }
        C6041a c6041a = (C6041a) obj;
        return AbstractC4154l.m8918a(this.f29496a, c6041a.f29496a) && this.f29497b == c6041a.f29497b && AbstractC4154l.m8918a(this.f29498c, c6041a.f29498c) && AbstractC4154l.m8918a(this.f29499d, c6041a.f29499d);
    }

    public final int hashCode() {
        return this.f29499d.hashCode() + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f29497b, this.f29496a.hashCode() * 31, 31), 31, this.f29498c);
    }

    public final String toString() {
        StringBuilder sbM125p = AbstractC0030c.m125p(this.f29497b, "PhoneStateCursorCallLog(number=", this.f29496a, ", countryCode=", ", countryCodeIso=");
        sbM125p.append(this.f29498c);
        sbM125p.append(", callDateTime=");
        sbM125p.append(this.f29499d);
        sbM125p.append(")");
        return sbM125p.toString();
    }
}
