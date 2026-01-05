package zp;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import om.C5410l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.f9;
import yv.AbstractC8788c;
import yv.C8789d;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.f */
/* loaded from: classes3.dex */
public final class C9006f {

    /* renamed from: a */
    public final C5410l f43384a;

    /* renamed from: b */
    public final Context f43385b;

    /* renamed from: c */
    public final String f43386c;

    /* renamed from: d */
    public final String f43387d;

    /* renamed from: e */
    public final List f43388e;

    public C9006f(C5410l c5410l, Context context) {
        String strM16216y;
        String strM16186J;
        String strM16160g;
        String strM11628b;
        EnumC8994d enumC8994d = c5410l.f27167e;
        this.f43384a = c5410l;
        this.f43385b = context;
        this.f43386c = c5410l.f27163a;
        String strM11232c = AbstractC5601a.m11232c(c5410l.f27165c, "+", c5410l.f27164b);
        this.f43387d = c5410l.f27166d;
        C9011k c9011k = new C9011k("PhoneNumber", strM11232c);
        LocalDateTime localDateTime = c5410l.f27168f;
        if (localDateTime != null) {
            C8800o c8800o = C8800o.f42459a;
            strM16216y = C8800o.m16216y(localDateTime);
        } else {
            strM16216y = null;
        }
        C9011k c9011k2 = new C9011k("Date", String.valueOf(strM16216y));
        String str = "0s";
        if (localDateTime != null) {
            C8800o c8800o2 = C8800o.f42459a;
            strM16186J = C8800o.m16186J(localDateTime);
        } else {
            strM16186J = "0s";
        }
        C9011k c9011k3 = new C9011k("CallTime", strM16186J);
        String str2 = "";
        String typeName = (enumC8994d == null || (typeName = enumC8994d.getTypeName()) == null) ? "" : typeName;
        if (enumC8994d != null) {
            int i10 = AbstractC8788c.f42452a[enumC8994d.ordinal()];
            if (i10 == 1) {
                strM11628b = f9.m11628b(context, R.string.incoming);
            } else if (i10 == 2) {
                strM11628b = f9.m11628b(context, R.string.outgoing);
            } else if (i10 == 3) {
                strM11628b = f9.m11628b(context, R.string.missed);
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                strM11628b = f9.m11628b(context, R.string.rejected);
            }
            str2 = strM11628b;
        }
        C9011k c9011k4 = new C9011k(typeName, str2);
        Long l9 = c5410l.f27169g;
        if (l9 != null && (strM16160g = C8789d.m16160g(false, l9.longValue())) != null) {
            str = strM16160g;
        }
        this.f43388e = pe.m10834i(c9011k, c9011k2, c9011k3, c9011k4, new C9011k("Top 10 Call Duration", str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9006f)) {
            return false;
        }
        C9006f c9006f = (C9006f) obj;
        return AbstractC4154l.m8918a(this.f43384a, c9006f.f43384a) && AbstractC4154l.m8918a(this.f43385b, c9006f.f43385b);
    }

    public final int hashCode() {
        return this.f43385b.hashCode() + (this.f43384a.hashCode() * 31);
    }

    public final String toString() {
        return "LongestCallUIModel(longestCallDetail=" + this.f43384a + ", context=" + this.f43385b + ")";
    }
}
