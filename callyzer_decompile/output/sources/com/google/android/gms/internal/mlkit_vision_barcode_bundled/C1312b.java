package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b */
/* loaded from: classes.dex */
public final class C1312b extends e1 implements t1 {
    private static final C1312b zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        C1312b c1312b = new C1312b();
        zzb = c1312b;
        e1.m3833h(C1312b.class, c1312b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C1313c.f6509x, "zzf"});
        }
        if (i11 == 3) {
            return new C1312b();
        }
        if (i11 == 4) {
            return new q3(1, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
