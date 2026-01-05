package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes6.dex */
public abstract class lza extends kza {
    /* renamed from: a */
    public static final int m38118a(int i) {
        return Integer.signum(i);
    }

    /* renamed from: b */
    public static final int m38119b(long j) {
        return Long.signum(j);
    }

    /* renamed from: c */
    public static final int m38120c(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    /* renamed from: d */
    public static final int m38121d(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* renamed from: e */
    public static final long m38122e(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }
}
