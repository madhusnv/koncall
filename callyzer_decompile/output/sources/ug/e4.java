package ug;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e4 extends y3 {
    /* renamed from: P */
    public static final boolean m13874P(String str) {
        String str2 = (String) f0.f35425t.m13872a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.m3276E().m3486p()) goto L24;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.d4 m13875N(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.e4.m13875N(java.lang.String):ug.d4");
    }

    /* renamed from: O */
    public final String m13876O(String str) {
        i1 i1Var = this.f35959b.f35486a;
        h4.m13944U(i1Var);
        String strM13994Z = i1Var.m13994Z(str);
        if (TextUtils.isEmpty(strM13994Z)) {
            return (String) f0.f35423r.m13872a(null);
        }
        Uri uri = Uri.parse((String) f0.f35423r.m13872a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strM13994Z).length() + 1 + String.valueOf(authority).length());
        sb2.append(strM13994Z);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
