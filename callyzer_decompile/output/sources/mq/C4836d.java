package mq;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.d */
/* loaded from: classes3.dex */
public final class C4836d extends AbstractC4854v {

    /* renamed from: a */
    public final String f24191a;

    /* renamed from: b */
    public final String f24192b;

    /* renamed from: c */
    public final int f24193c;

    /* renamed from: d */
    public final String f24194d;

    public C4836d(String simNumber, String phoneNumber, int i10, String leadNamePrefilled) {
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        AbstractC4154l.m8923f(leadNamePrefilled, "leadNamePrefilled");
        this.f24191a = simNumber;
        this.f24192b = phoneNumber;
        this.f24193c = i10;
        this.f24194d = leadNamePrefilled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4836d)) {
            return false;
        }
        C4836d c4836d = (C4836d) obj;
        return AbstractC4154l.m8918a(this.f24191a, c4836d.f24191a) && AbstractC4154l.m8918a(this.f24192b, c4836d.f24192b) && this.f24193c == c4836d.f24193c && AbstractC4154l.m8918a(this.f24194d, c4836d.f24194d);
    }

    public final int hashCode() {
        return this.f24194d.hashCode() + AbstractC1452a.m4556c(this.f24193c, AbstractC0030c.m113d(this.f24191a.hashCode() * 31, 31, this.f24192b), 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("AddLead(simNumber=", this.f24191a, ", phoneNumber=", this.f24192b, ", leadCountryCode=");
        sbM127r.append(this.f24193c);
        sbM127r.append(", leadNamePrefilled=");
        sbM127r.append(this.f24194d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
