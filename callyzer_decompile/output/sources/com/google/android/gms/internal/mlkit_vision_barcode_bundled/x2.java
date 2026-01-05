package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x2 extends e1 implements t1 {
    private static final x2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        x2 x2Var = new x2();
        zzb = x2Var;
        e1.m3833h(x2.class, x2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C1313c.f6491f, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new x2();
        }
        if (i11 == 4) {
            return new q3(14, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
