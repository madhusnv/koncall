package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a */
/* loaded from: classes.dex */
public final class C1311a extends e1 implements t1 {
    private static final C1311a zzb;
    private int zzd;
    private C1312b zze;
    private boolean zzf;

    static {
        C1311a c1311a = new C1311a();
        zzb = c1311a;
        e1.m3833h(C1311a.class, c1311a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C1311a();
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
