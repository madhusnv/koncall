package cm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cm.a */
/* loaded from: classes.dex */
public final class C0983a {

    /* renamed from: a */
    public final String f5812a;

    /* renamed from: b */
    public final String f5813b;

    /* renamed from: c */
    public final String f5814c;

    /* renamed from: d */
    public final String f5815d;

    public C0983a(String str, int i10, String str2, String str3) {
        str2 = (i10 & 2) != 0 ? "+90" : str2;
        str3 = (i10 & 4) != 0 ? "tr" : str3;
        this.f5812a = str;
        this.f5813b = str2;
        this.f5814c = str3;
        Locale locale = Locale.getDefault();
        AbstractC4154l.m8922e(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        this.f5815d = lowerCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0983a)) {
            return false;
        }
        C0983a c0983a = (C0983a) obj;
        return this.f5812a.equals(c0983a.f5812a) && this.f5813b.equals(c0983a.f5813b) && this.f5814c.equals(c0983a.f5814c);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.tr) + AbstractC0030c.m113d(AbstractC0030c.m113d(this.f5812a.hashCode() * 31, 31, this.f5813b), 31, this.f5814c);
    }

    public final String toString() {
        return AbstractC1452a.m4564k(AbstractC0030c.m127r("CountryData(cCodes=", this.f5812a, ", countryPhoneCode=", this.f5813b, ", cNames="), this.f5814c, ", flagResID=2131231340)");
    }
}
