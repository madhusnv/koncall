package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i3 extends e1 implements t1 {
    private static final i3 zzb;
    private int zzd;
    private k1 zze = z1.f6706d;
    private j3 zzf;
    private t2 zzg;

    static {
        i3 i3Var = new i3();
        zzb = i3Var;
        e1.m3833h(i3.class, i3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", n3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new i3();
        }
        if (i11 == 4) {
            return new q3(24, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
