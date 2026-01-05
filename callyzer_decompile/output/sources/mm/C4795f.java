package mm;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.f */
/* loaded from: classes3.dex */
public final class C4795f {

    /* renamed from: a */
    public final String f23867a;

    /* renamed from: b */
    public final String f23868b;

    /* renamed from: c */
    public final Integer f23869c;

    /* renamed from: d */
    public final String f23870d;

    public C4795f(String number, String name, Integer num, String str) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(name, "name");
        this.f23867a = name;
        this.f23868b = number;
        this.f23869c = num;
        this.f23870d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4795f)) {
            return false;
        }
        C4795f c4795f = (C4795f) obj;
        return AbstractC4154l.m8918a(this.f23867a, c4795f.f23867a) && AbstractC4154l.m8918a(this.f23868b, c4795f.f23868b) && this.f23869c.equals(c4795f.f23869c) && AbstractC4154l.m8918a(this.f23870d, c4795f.f23870d);
    }

    public final int hashCode() {
        int iHashCode = (this.f23869c.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(0) * 31, 31, this.f23867a), 31, this.f23868b)) * 31;
        String str = this.f23870d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("Contact(id=0, name=", this.f23867a, ", number=", this.f23868b, ", countryCode=");
        sbM127r.append(this.f23869c);
        sbM127r.append(", photoUri=");
        sbM127r.append(this.f23870d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
