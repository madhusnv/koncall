package p001o;

import ai.salesmax.SuperfoneApplication;
import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.Optional;
import p001o.t6d;

/* loaded from: classes2.dex */
public abstract class e7d {

    /* renamed from: a */
    public static final t6d f21126a = t6d.m49450p();

    /* renamed from: a */
    public static String m24488a(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso();
    }

    /* renamed from: b */
    public static String m24489b() {
        return (String) Optional.ofNullable(SuperfoneApplication.f225c.m126b()).orElse("IN");
    }

    /* renamed from: c */
    public static boolean m24490c(String str) {
        return m24491d(str, m24489b());
    }

    /* renamed from: d */
    public static boolean m24491d(String str, String str2) {
        try {
            String str3 = (String) Optional.ofNullable(str2).map(new uqd()).orElse("IN");
            t6d t6dVar = f21126a;
            return t6dVar.m49452B(t6dVar.m49460O(str, str3));
        } catch (h5c e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public static String m24492e(String str) {
        return m24493f(str, m24489b());
    }

    /* renamed from: f */
    public static String m24493f(String str, String str2) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }
        String strReplaceAll = str.trim().replaceFirst("(?i)^tel:", "").replaceFirst("(?i)^sip:", "").replaceAll("[,;\\s]", "");
        String country = (str2 == null || u49.m50930a(str2)) ? Locale.getDefault().getCountry() : str2.toUpperCase(Locale.ROOT);
        try {
            t6d t6dVar = f21126a;
            n7d n7dVarM49460O = t6dVar.m49460O(strReplaceAll, country);
            if (t6dVar.m49452B(n7dVarM49460O)) {
                return t6dVar.m49471j(n7dVarM49460O, t6d.EnumC17006b.E164);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid number: ");
            sb.append(strReplaceAll);
            sb.append(" (ISO=");
            sb.append(country);
            sb.append(")");
            return strReplaceAll;
        } catch (h5c unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unparseable number: ");
            sb2.append(strReplaceAll);
            sb2.append(" (ISO=");
            sb2.append(country);
            sb2.append(")");
            return strReplaceAll;
        } catch (Exception unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Critical error while normalising: ");
            sb3.append(strReplaceAll);
            return strReplaceAll;
        }
    }
}
