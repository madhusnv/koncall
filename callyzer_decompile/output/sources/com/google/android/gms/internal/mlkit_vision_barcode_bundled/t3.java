package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t3 extends e1 implements t1 {
    private static final t3 zzb;
    private int zzd;
    private r3 zzj;
    private byte zzk = 2;
    private j1 zze = f1.f6530d;
    private i1 zzf = y0.f6698d;
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        e1.m3833h(t3.class, t3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new t3();
        }
        if (i11 == 4) {
            return new o3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzk = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
