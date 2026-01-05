package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.s */
/* loaded from: classes3.dex */
public final class C5417s {

    /* renamed from: a */
    public final String f27215a;

    /* renamed from: b */
    public final String f27216b;

    /* renamed from: c */
    public final int f27217c;

    /* renamed from: d */
    public final String f27218d;

    /* renamed from: e */
    public Long f27219e;

    /* renamed from: f */
    public Long f27220f;

    /* renamed from: g */
    public Integer f27221g;

    /* renamed from: h */
    public Integer f27222h;

    /* renamed from: i */
    public Integer f27223i;

    /* renamed from: j */
    public Integer f27224j;

    public C5417s(String name, String number, int i10, String str) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        this.f27215a = name;
        this.f27216b = number;
        this.f27217c = i10;
        this.f27218d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5417s)) {
            return false;
        }
        C5417s c5417s = (C5417s) obj;
        return AbstractC4154l.m8918a(this.f27215a, c5417s.f27215a) && AbstractC4154l.m8918a(this.f27216b, c5417s.f27216b) && this.f27217c == c5417s.f27217c && AbstractC4154l.m8918a(this.f27218d, c5417s.f27218d);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f27217c, AbstractC0030c.m113d(this.f27215a.hashCode() * 31, 31, this.f27216b), 31);
        String str = this.f27218d;
        return iM4556c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("TopCallsData(name=", this.f27215a, ", number=", this.f27216b, ", countryCode=");
        sbM127r.append(this.f27217c);
        sbM127r.append(", photoUri=");
        sbM127r.append(this.f27218d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
