package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g3 extends e1 implements t1 {
    private static final g3 zzb;
    private int zzd;
    private k1 zzf;
    private int zzg;
    private v3 zzh;
    private t3 zzi;
    private r3 zzj;
    private int zzk;
    private k1 zzl;
    private byte zzm = 2;
    private int zze = 17;

    static {
        g3 g3Var = new g3();
        zzb = g3Var;
        e1.m3833h(g3.class, g3Var);
    }

    public g3() {
        z1 z1Var = z1.f6706d;
        this.zzf = z1Var;
        this.zzl = z1Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C1313c.f6494i, "zzf", C1314d.class, "zzg", "zzh", "zzi", "zzk", "zzl", C1315e.class, "zzj"});
        }
        if (i11 == 3) {
            return new g3();
        }
        if (i11 == 4) {
            return new q3(8, zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzm = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
