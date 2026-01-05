package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y2 extends e1 implements t1 {
    private static final y2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private k1 zzg = z1.f6706d;
    private int zzh;

    static {
        y2 y2Var = new y2();
        zzb = y2Var;
        e1.m3833h(y2.class, y2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", C1313c.f6493h, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new y2();
        }
        if (i11 == 4) {
            return new q3(15, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
