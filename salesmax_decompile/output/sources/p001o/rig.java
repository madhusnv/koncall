package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class rig {
    /* renamed from: a */
    public static final int m46844a(String str, int i, int i2, int i3) {
        return (int) pig.m43753c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m46845b(String str, long j, long j2, long j3) {
        String strM43754d = pig.m43754d(str);
        if (strM43754d == null) {
            return j;
        }
        Long lM22640n = d9g.m22640n(strM43754d);
        if (lM22640n == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM43754d + '\'').toString());
        }
        long jLongValue = lM22640n.longValue();
        boolean z = false;
        if (j2 <= jLongValue && jLongValue <= j3) {
            z = true;
        }
        if (z) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: c */
    public static final String m46846c(String str, String str2) {
        String strM43754d = pig.m43754d(str);
        return strM43754d == null ? str2 : strM43754d;
    }

    /* renamed from: d */
    public static final boolean m46847d(String str, boolean z) {
        String strM43754d = pig.m43754d(str);
        return strM43754d != null ? Boolean.parseBoolean(strM43754d) : z;
    }

    /* renamed from: e */
    public static /* synthetic */ int m46848e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return pig.m43752b(str, i, i2, i3);
    }

    /* renamed from: f */
    public static /* synthetic */ long m46849f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return pig.m43753c(str, j, j4, j3);
    }
}
