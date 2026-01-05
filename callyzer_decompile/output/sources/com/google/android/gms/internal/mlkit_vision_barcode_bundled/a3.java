package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a3 extends e1 implements t1 {
    private static final a3 zzb;
    private int zzd;
    private int zze;
    private y2 zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private k1 zzf = z1.f6706d;
    private int zzg = -1;
    private String zzi = "";
    private j1 zzl = f1.f6530d;
    private String zzm = "";

    static {
        a3 a3Var = new a3();
        zzb = a3Var;
        e1.m3833h(a3.class, a3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", C1313c.f6495j, "zzf", z2.class, "zzg", "zzh", "zzi", "zzj", C1313c.f6496k, "zzk", C1313c.f6497l, "zzl", "zzm", "zzn", C1313c.f6498m});
        }
        if (i11 == 3) {
            return new a3();
        }
        if (i11 == 4) {
            return new q3(17, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
