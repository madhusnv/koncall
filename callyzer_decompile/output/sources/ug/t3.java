package ug;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import yh.C8664h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a */
    public final HashMap f35836a;

    public t3(Map map) {
        HashMap map2 = new HashMap();
        this.f35836a = map2;
        map2.putAll(map);
    }

    /* renamed from: a */
    public final String m14146a() {
        StringBuilder sb2 = new StringBuilder();
        C8664h c8664h = v3.f35871a;
        int i10 = c8664h.f41972d;
        for (int i11 = 0; i11 < i10; i11++) {
            String str = (String) c8664h.get(i11);
            HashMap map = this.f35836a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public final Bundle m14147b() {
        e0 e0Var = f0.Z0;
        boolean zBooleanValue = ((Boolean) e0Var.m13872a(null)).booleanValue();
        HashMap map = this.f35836a;
        if (!zBooleanValue ? !(!"1".equals(map.get("GoogleConsent")) || !"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode")))) {
            if (!((Boolean) e0Var.m13872a(null)).booleanValue()) {
                return m14149d();
            }
            if (map.get("Version") == null) {
                return m14149d();
            }
            if (m14150e() >= 0) {
                Bundle bundle = new Bundle();
                bundle.putString(x1.AD_STORAGE.zze, true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle.putString(x1.AD_PERSONALIZATION.zze, (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (m14150e() >= 4) {
                    bundle.putString(x1.AD_USER_DATA.zze, (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    /* renamed from: c */
    public final String m14148c() throws NumberFormatException {
        HashMap map = this.f35836a;
        StringBuilder sb2 = new StringBuilder("1");
        int i10 = -1;
        try {
            String str = (String) map.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int iM14150e = m14150e();
        if (iM14150e < 0 || iM14150e > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM14150e));
        }
        int i11 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        int i12 = i11 | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    /* renamed from: d */
    public final Bundle m14149d() {
        int iM14150e;
        HashMap map = this.f35836a;
        if ("1".equals(map.get("GoogleConsent")) && (iM14150e = m14150e()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(x1.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(x1.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iM14150e >= 4) {
                    String str3 = x1.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    /* renamed from: e */
    public final int m14150e() {
        try {
            String str = (String) this.f35836a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t3) {
            return m14146a().equalsIgnoreCase(((t3) obj).m14146a());
        }
        return false;
    }

    public final int hashCode() {
        return m14146a().hashCode();
    }

    public final String toString() {
        return m14146a();
    }
}
