package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k2 extends m2 {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2
    /* renamed from: a */
    public final double mo3908a(long j6, Object obj) {
        return Double.longBitsToDouble(this.f6603a.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2
    /* renamed from: b */
    public final float mo3909b(long j6, Object obj) {
        return Float.intBitsToFloat(this.f6603a.getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2
    /* renamed from: c */
    public final void mo3910c(Object obj, long j6, boolean z6) {
        if (n2.f6620g) {
            n2.m3917c(obj, j6, z6 ? (byte) 1 : (byte) 0);
        } else {
            n2.m3918d(obj, j6, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2
    /* renamed from: d */
    public final void mo3911d(Object obj, long j6, byte b10) {
        if (n2.f6620g) {
            n2.m3917c(obj, j6, b10);
        } else {
            n2.m3918d(obj, j6, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2
    /* renamed from: e */
    public final void mo3912e(Object obj, long j6, double d2) {
        this.f6603a.putLong(obj, j6, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2
    /* renamed from: f */
    public final void mo3913f(Object obj, long j6, float f6) {
        this.f6603a.putInt(obj, j6, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2
    /* renamed from: g */
    public final boolean mo3914g(long j6, Object obj) {
        return n2.f6620g ? n2.m3927m(j6, obj) : n2.m3928n(j6, obj);
    }
}
