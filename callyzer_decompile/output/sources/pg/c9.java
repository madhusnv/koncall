package pg;

import android.net.Uri;
import kb.C4041e;
import kotlin.jvm.internal.AbstractC4154l;
import og.db;
import og.pe;
import ox.AbstractC5773d;
import ox.C5770a;
import ox.C5774e;
import ox.EnumC5772c;
import rw.AbstractC6663m;
import sw.C6959c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c9 {
    /* renamed from: a */
    public static final String m11572a(String str, String str2, String str3, String str4, boolean z6) {
        C6959c c6959cM10829d = pe.m10829d();
        String strEncode = Uri.encode(str);
        if (strEncode != null) {
            c6959cM10829d.add("phoneNumber=".concat(strEncode));
        }
        String strEncode2 = Uri.encode(str2);
        if (strEncode2 != null) {
            c6959cM10829d.add("SIMNumber=".concat(strEncode2));
        }
        c6959cM10829d.add("isLeadAdded=" + z6);
        String strEncode3 = Uri.encode(str3);
        if (strEncode3 != null) {
            c6959cM10829d.add("previousScreen=".concat(strEncode3));
        }
        String strEncode4 = Uri.encode(str4);
        if (strEncode4 != null) {
            c6959cM10829d.add("leadNamePrefilled=".concat(strEncode4));
        }
        String strM12748L = AbstractC6663m.m12748L(pe.m10828c(c6959cM10829d), "&", null, null, null, 62);
        return strM12748L.length() == 0 ? "add_lead" : "add_lead?".concat(strM12748L);
    }

    /* renamed from: b */
    public static /* synthetic */ String m11573b(String str, String str2, int i10, String str3, boolean z6) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return m11572a(str, str2, str3, null, z6);
    }

    /* renamed from: c */
    public static final String m11574c(int i10, String name, String number) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        C6959c c6959cM10829d = pe.m10829d();
        c6959cM10829d.add("name=" + Uri.encode(name));
        c6959cM10829d.add("country_code=" + Uri.encode(String.valueOf(i10)));
        c6959cM10829d.add("number=" + Uri.encode(number));
        return i0.m0.m7378k("contact_details?", AbstractC6663m.m12748L(pe.m10828c(c6959cM10829d), "&", null, null, null, 62));
    }

    /* renamed from: d */
    public static final String m11575d(EnumC8994d callType) {
        AbstractC4154l.m8923f(callType, "callType");
        return "call_types_summary?callType=" + callType;
    }

    /* renamed from: e */
    public static final boolean m11576e(C4041e isExpiringWithin, long j6) {
        AbstractC4154l.m8923f(isExpiringWithin, "$this$isExpiringWithin");
        long j10 = isExpiringWithin.f20878b.f28340a;
        int i10 = AbstractC5773d.f28339b;
        return !C5770a.m11298i(C5774e.m11306a(db.m10606b(j10, C5770a.m11304o(j6), EnumC5772c.NANOSECONDS)));
    }
}
