package mm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.i */
/* loaded from: classes3.dex */
public final class C4798i {

    /* renamed from: a */
    public final int f23876a;

    /* renamed from: b */
    public final String f23877b;

    /* renamed from: c */
    public final String f23878c;

    /* renamed from: d */
    public final int f23879d;

    /* renamed from: e */
    public final String f23880e;

    public C4798i(int i10, int i11, String name, String number, String str) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        this.f23876a = i10;
        this.f23877b = name;
        this.f23878c = number;
        this.f23879d = i11;
        this.f23880e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4798i)) {
            return false;
        }
        C4798i c4798i = (C4798i) obj;
        return this.f23876a == c4798i.f23876a && AbstractC4154l.m8918a(this.f23877b, c4798i.f23877b) && AbstractC4154l.m8918a(this.f23878c, c4798i.f23878c) && this.f23879d == c4798i.f23879d && AbstractC4154l.m8918a(this.f23880e, c4798i.f23880e);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f23879d, AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f23876a) * 31, 31, this.f23877b), 31, this.f23878c), 31);
        String str = this.f23880e;
        return iM4556c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f23876a, "FrequentCalls(count=", ", name=", this.f23877b, ", number=");
        AbstractC1452a.m4551B(sbM14337q, this.f23878c, ", countryCode=", this.f23879d, ", photoUri=");
        return AbstractC1452a.m4564k(sbM14337q, this.f23880e, ")");
    }
}
