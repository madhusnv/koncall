package nm;

import a2.AbstractC0030c;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nm.a */
/* loaded from: classes3.dex */
public final class C5106a {

    /* renamed from: a */
    public final String f25006a;

    /* renamed from: b */
    public final String f25007b;

    /* renamed from: c */
    public final EnumC8994d f25008c;

    /* renamed from: d */
    public final LocalDateTime f25009d;

    public C5106a(String phoneNumber, String simNUmber, EnumC8994d enumC8994d, LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        AbstractC4154l.m8923f(simNUmber, "simNUmber");
        this.f25006a = phoneNumber;
        this.f25007b = simNUmber;
        this.f25008c = enumC8994d;
        this.f25009d = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5106a)) {
            return false;
        }
        C5106a c5106a = (C5106a) obj;
        return AbstractC4154l.m8918a(this.f25006a, c5106a.f25006a) && AbstractC4154l.m8918a(this.f25007b, c5106a.f25007b) && this.f25008c == c5106a.f25008c && AbstractC4154l.m8918a(this.f25009d, c5106a.f25009d);
    }

    public final int hashCode() {
        return this.f25009d.hashCode() + ((this.f25008c.hashCode() + AbstractC0030c.m113d(this.f25006a.hashCode() * 31, 31, this.f25007b)) * 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("CallLogData(phoneNumber=", this.f25006a, ", simNUmber=", this.f25007b, ", callType=");
        sbM127r.append(this.f25008c);
        sbM127r.append(", dateTime=");
        sbM127r.append(this.f25009d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
