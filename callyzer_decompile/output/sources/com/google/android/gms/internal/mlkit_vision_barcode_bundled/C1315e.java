package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e */
/* loaded from: classes.dex */
public final class C1315e extends e1 implements t1 {
    private static final C1315e zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C1315e c1315e = new C1315e();
        zzb = c1315e;
        e1.m3833h(C1315e.class, c1315e);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C1315e();
        }
        if (i11 == 4) {
            return new q3(3, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
