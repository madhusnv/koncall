package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.e */
/* loaded from: classes3.dex */
public final class C5403e {

    /* renamed from: a */
    public final String f27119a;

    /* renamed from: b */
    public final String f27120b;

    /* renamed from: c */
    public final long f27121c;

    /* renamed from: d */
    public final LocalDateTime f27122d;

    /* renamed from: e */
    public final EnumC8994d f27123e;

    /* renamed from: f */
    public final int f27124f;

    /* renamed from: g */
    public final String f27125g;

    /* renamed from: h */
    public final int f27126h;

    /* renamed from: i */
    public final String f27127i;

    public C5403e(String name, String number, EnumC8994d enumC8994d, String simNumber, long j6, int i10, String str, LocalDateTime localDateTime, int i11) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f27119a = name;
        this.f27120b = number;
        this.f27121c = j6;
        this.f27122d = localDateTime;
        this.f27123e = enumC8994d;
        this.f27124f = i10;
        this.f27125g = simNumber;
        this.f27126h = i11;
        this.f27127i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5403e)) {
            return false;
        }
        C5403e c5403e = (C5403e) obj;
        return AbstractC4154l.m8918a(this.f27119a, c5403e.f27119a) && AbstractC4154l.m8918a(this.f27120b, c5403e.f27120b) && this.f27121c == c5403e.f27121c && AbstractC4154l.m8918a(this.f27122d, c5403e.f27122d) && this.f27123e == c5403e.f27123e && this.f27124f == c5403e.f27124f && AbstractC4154l.m8918a(this.f27125g, c5403e.f27125g) && this.f27126h == c5403e.f27126h && AbstractC4154l.m8918a(this.f27127i, c5403e.f27127i);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f27126h, AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f27124f, (this.f27123e.hashCode() + m0.m7370c(this.f27122d, AbstractC1452a.m4557d(AbstractC0030c.m113d(this.f27119a.hashCode() * 31, 31, this.f27120b), 31, this.f27121c), 31)) * 31, 31), 31, this.f27125g), 31);
        String str = this.f27127i;
        return iM4556c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("CallLogVerification(name=", this.f27119a, ", number=", this.f27120b, ", duration=");
        sbM127r.append(this.f27121c);
        sbM127r.append(", datetime=");
        sbM127r.append(this.f27122d);
        sbM127r.append(", callType=");
        sbM127r.append(this.f27123e);
        sbM127r.append(", slot=");
        sbM127r.append(this.f27124f);
        sbM127r.append(", simNumber=");
        sbM127r.append(this.f27125g);
        sbM127r.append(", id=");
        sbM127r.append(this.f27126h);
        return a1.m14335o(sbM127r, ", note=", this.f27127i, ")");
    }
}
