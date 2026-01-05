package ug;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.s4;
import pg.p8;
import yh.AbstractC8660d;
import yh.C8658b;
import yh.C8664h;
import yh.C8669m;
import yh.C8671o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v3 {

    /* renamed from: a */
    public static final C8664h f35871a;

    static {
        C8658b c8658b = AbstractC8660d.f41962b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        p8.m11824a(24, objArr);
        f35871a = AbstractC8660d.m16000h(24, objArr);
    }

    /* renamed from: a */
    public static String m14166a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static final boolean m14167b(r4 r4Var, C8669m c8669m, C8669m c8669m2, C8671o c8671o, char[] cArr, int i10, int i11, int i12, String str, String str2, String str3, boolean z6, boolean z10) {
        u3 u3Var;
        char c2;
        int iM14168c = m14168c(r4Var);
        if (iM14168c > 0 && (i11 != 1 || i10 != 1)) {
            cArr[iM14168c] = '2';
        }
        if (m14172g(r4Var, c8669m2) == s4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c2 = '3';
        } else {
            if (r4Var == r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i12 == 1 && c8671o.f41996d.equals(str)) {
                if (iM14168c > 0 && cArr[iM14168c] != '2') {
                    cArr[iM14168c] = '1';
                }
                return true;
            }
            if (c8669m.containsKey(r4Var) && (u3Var = (u3) c8669m.get(r4Var)) != null) {
                int iOrdinal = u3Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return m14172g(r4Var, c8669m2) == s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? m14171f(r4Var, cArr, str3, z10) : m14170e(r4Var, cArr, str2, z6);
                        }
                        if (iOrdinal == 3) {
                            return m14172g(r4Var, c8669m2) == s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? m14170e(r4Var, cArr, str2, z6) : m14171f(r4Var, cArr, str3, z10);
                        }
                        c2 = '0';
                    } else if (m14172g(r4Var, c8669m2) != s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return m14171f(r4Var, cArr, str3, z10);
                    }
                } else if (m14172g(r4Var, c8669m2) != s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return m14170e(r4Var, cArr, str2, z6);
                }
                c2 = '8';
            } else {
                c2 = '0';
            }
        }
        if (iM14168c <= 0 || cArr[iM14168c] == '2') {
            return false;
        }
        cArr[iM14168c] = c2;
        return false;
    }

    /* renamed from: c */
    public static final int m14168c(r4 r4Var) {
        if (r4Var == r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (r4Var == r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (r4Var == r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return r4Var == r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    /* renamed from: d */
    public static final String m14169d(r4 r4Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < r4Var.zza()) ? "0" : String.valueOf(str.charAt(r4Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= r4Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(r4Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* renamed from: e */
    public static final boolean m14170e(r4 r4Var, char[] cArr, String str, boolean z6) {
        char c2;
        int iM14168c = m14168c(r4Var);
        if (!z6) {
            c2 = '4';
        } else {
            if (str.length() >= r4Var.zza()) {
                char cCharAt = str.charAt(r4Var.zza() - 1);
                boolean z10 = cCharAt == '1';
                if (iM14168c > 0 && cArr[iM14168c] != '2') {
                    cArr[iM14168c] = cCharAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c2 = '0';
        }
        if (iM14168c > 0 && cArr[iM14168c] != '2') {
            cArr[iM14168c] = c2;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m14171f(r4 r4Var, char[] cArr, String str, boolean z6) {
        char c2;
        int iM14168c = m14168c(r4Var);
        if (!z6) {
            c2 = '5';
        } else {
            if (str.length() >= r4Var.zza()) {
                char cCharAt = str.charAt(r4Var.zza() - 1);
                boolean z10 = cCharAt == '1';
                if (iM14168c > 0 && cArr[iM14168c] != '2') {
                    cArr[iM14168c] = cCharAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c2 = '0';
        }
        if (iM14168c > 0 && cArr[iM14168c] != '2') {
            cArr[iM14168c] = c2;
        }
        return false;
    }

    /* renamed from: g */
    public static final s4 m14172g(r4 r4Var, C8669m c8669m) {
        Object obj = s4.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = c8669m.get(r4Var);
        if (obj2 != null) {
            obj = obj2;
        }
        return (s4) obj;
    }
}
