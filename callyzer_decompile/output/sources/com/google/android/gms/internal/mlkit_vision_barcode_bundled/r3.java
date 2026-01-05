package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r3 extends b1 {
    private static final r3 zzd;
    private byte zze;

    static {
        r3 r3Var = new r3();
        zzd = r3Var;
        e1.m3833h(r3.class, r3Var);
    }

    public r3() {
        this.zzb = w0.f6690c;
        this.zze = (byte) 2;
    }

    /* renamed from: n */
    public static r3 m3950n() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return new a2(zzd, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new r3();
        }
        if (i11 == 4) {
            return new q3(0, zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zze = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
