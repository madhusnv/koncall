package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d */
/* loaded from: classes.dex */
public final class C1314d extends e1 implements t1 {
    private static final C1314d zzb;
    private int zzd;
    private w3 zzj;
    private r3 zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private j1 zzg = f1.f6530d;
    private String zzh = "";
    private String zzi = "";

    static {
        C1314d c1314d = new C1314d();
        zzb = c1314d;
        e1.m3833h(C1314d.class, c1314d);
        r3 r3VarM3950n = r3.m3950n();
        q2 q2Var = q2.zza;
        if (r3VarM3950n == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C1313c.f6487b, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i11 == 3) {
            return new C1314d();
        }
        if (i11 == 4) {
            return new q3(2, zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
