package zp;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import om.C5417s;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import yv.C8789d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.l */
/* loaded from: classes3.dex */
public final class C9012l {

    /* renamed from: a */
    public final C5417s f43413a;

    /* renamed from: b */
    public final String f43414b;

    /* renamed from: c */
    public final String f43415c;

    /* renamed from: d */
    public final String f43416d;

    /* renamed from: e */
    public final List f43417e;

    public C9012l(C5417s c5417s) {
        String strM16160g;
        String strM16160g2;
        this.f43413a = c5417s;
        this.f43414b = c5417s.f27215a;
        String strM11232c = AbstractC5601a.m11232c(c5417s.f27217c, "+", c5417s.f27216b);
        this.f43415c = strM11232c;
        this.f43416d = c5417s.f27218d;
        C9011k c9011k = new C9011k("PhoneNumber", strM11232c);
        C9011k c9011k2 = new C9011k("Top 10 Call Duration", m16477c());
        Long l9 = c5417s.f27219e;
        String str = "0s";
        C9011k c9011k3 = new C9011k("Incoming", (l9 == null || (strM16160g2 = C8789d.m16160g(false, l9.longValue())) == null) ? "0s" : strM16160g2);
        Long l10 = c5417s.f27220f;
        if (l10 != null && (strM16160g = C8789d.m16160g(false, l10.longValue())) != null) {
            str = strM16160g;
        }
        this.f43417e = pe.m10834i(c9011k, c9011k2, c9011k3, new C9011k("Outgoing", str), new C9011k("Total Phone Calls", m16476b()));
    }

    /* renamed from: a */
    public final ArrayList m16475a() {
        C9011k c9011k = new C9011k("PhoneNumber", this.f43415c);
        C9011k c9011k2 = new C9011k("Total Phone Calls", m16476b());
        C5417s c5417s = this.f43413a;
        Integer num = c5417s.f27221g;
        C9011k c9011k3 = new C9011k("Incoming", String.valueOf(num != null ? num.intValue() : 0));
        Integer num2 = c5417s.f27222h;
        C9011k c9011k4 = new C9011k("Outgoing", String.valueOf(num2 != null ? num2.intValue() : 0));
        Integer num3 = c5417s.f27223i;
        C9011k c9011k5 = new C9011k("Missed", String.valueOf(num3 != null ? num3.intValue() : 0));
        Integer num4 = c5417s.f27224j;
        return pe.m10835j(c9011k, c9011k2, c9011k3, c9011k4, c9011k5, new C9011k("Rejected", String.valueOf(num4 != null ? num4.intValue() : 0)), new C9011k("Top 10 Call Duration", m16477c()));
    }

    /* renamed from: b */
    public final String m16476b() {
        C5417s c5417s = this.f43413a;
        Integer num = c5417s.f27221g;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = c5417s.f27222h;
        int iIntValue2 = iIntValue + (num2 != null ? num2.intValue() : 0);
        Integer num3 = c5417s.f27223i;
        int iIntValue3 = iIntValue2 + (num3 != null ? num3.intValue() : 0);
        Integer num4 = c5417s.f27224j;
        return String.valueOf(iIntValue3 + (num4 != null ? num4.intValue() : 0));
    }

    /* renamed from: c */
    public final String m16477c() {
        C5417s c5417s = this.f43413a;
        Long l9 = c5417s.f27220f;
        long jLongValue = l9 != null ? l9.longValue() : 0L;
        Long l10 = c5417s.f27219e;
        return C8789d.m16160g(false, jLongValue + (l10 != null ? l10.longValue() : 0L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9012l) && AbstractC4154l.m8918a(this.f43413a, ((C9012l) obj).f43413a);
    }

    public final int hashCode() {
        return this.f43413a.hashCode();
    }

    public final String toString() {
        return "TopCallerUIModel(topCallerData=" + this.f43413a + ")";
    }
}
