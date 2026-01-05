package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.o */
/* loaded from: classes3.dex */
public final class C5413o {

    /* renamed from: a */
    public final String f27179a;

    /* renamed from: b */
    public final String f27180b;

    /* renamed from: c */
    public final int f27181c;

    /* renamed from: d */
    public final EnumC8994d f27182d;

    /* renamed from: e */
    public List f27183e;

    public C5413o(String name, String number, int i10, EnumC8994d enumC8994d) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        this.f27179a = name;
        this.f27180b = number;
        this.f27181c = i10;
        this.f27182d = enumC8994d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5413o)) {
            return false;
        }
        C5413o c5413o = (C5413o) obj;
        return AbstractC4154l.m8918a(this.f27179a, c5413o.f27179a) && AbstractC4154l.m8918a(this.f27180b, c5413o.f27180b) && this.f27181c == c5413o.f27181c && this.f27182d == c5413o.f27182d;
    }

    public final int hashCode() {
        return this.f27182d.hashCode() + AbstractC1452a.m4556c(this.f27181c, AbstractC0030c.m113d(this.f27179a.hashCode() * 31, 31, this.f27180b), 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("NeverAttendCalls(name=", this.f27179a, ", number=", this.f27180b, ", countryCode=");
        sbM127r.append(this.f27181c);
        sbM127r.append(", callType=");
        sbM127r.append(this.f27182d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
