package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p6 extends q6 {
    @Override // com.google.android.gms.internal.measurement.q6
    /* renamed from: a */
    public final void mo3531a(Object obj, long j6, byte b10) {
        if (r6.f6359g) {
            r6.m3618c(obj, j6, b10);
        } else {
            r6.m3619d(obj, j6, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    /* renamed from: b */
    public final boolean mo3532b(long j6, Object obj) {
        return r6.f6359g ? r6.m3629n(j6, obj) : r6.m3630o(j6, obj);
    }

    @Override // com.google.android.gms.internal.measurement.q6
    /* renamed from: c */
    public final void mo3533c(Object obj, long j6, boolean z6) {
        if (r6.f6359g) {
            r6.m3618c(obj, j6, z6 ? (byte) 1 : (byte) 0);
        } else {
            r6.m3619d(obj, j6, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    /* renamed from: d */
    public final float mo3534d(long j6, Object obj) {
        return Float.intBitsToFloat(this.f6349a.getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.measurement.q6
    /* renamed from: e */
    public final void mo3535e(Object obj, long j6, float f6) {
        this.f6349a.putInt(obj, j6, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.measurement.q6
    /* renamed from: f */
    public final double mo3536f(long j6, Object obj) {
        return Double.longBitsToDouble(this.f6349a.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.measurement.q6
    /* renamed from: g */
    public final void mo3537g(Object obj, long j6, double d2) {
        this.f6349a.putLong(obj, j6, Double.doubleToLongBits(d2));
    }
}
