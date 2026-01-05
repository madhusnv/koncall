package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f3 extends e1 implements t1 {
    private static final f3 zzb;
    private int zzd;
    private int zze;

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        e1.m3833h(f3.class, f3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new f3();
        }
        if (i11 == 4) {
            return new q3(22, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
