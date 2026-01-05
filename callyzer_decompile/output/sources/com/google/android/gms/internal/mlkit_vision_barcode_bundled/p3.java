package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p3 extends e1 implements t1 {
    private static final p3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        p3 p3Var = new p3();
        zzb = p3Var;
        e1.m3833h(p3.class, p3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", C1313c.f6508w, "zzg"});
        }
        if (i11 == 3) {
            return new p3();
        }
        if (i11 == 4) {
            return new o3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
