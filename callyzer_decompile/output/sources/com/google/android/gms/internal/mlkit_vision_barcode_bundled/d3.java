package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d3 extends e1 implements t1 {
    private static final d3 zzb;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private r0 zzh = r0.f6641b;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        d3 d3Var = new d3();
        zzb = d3Var;
        e1.m3833h(d3.class, d3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            C1313c c1313c = C1313c.f6503r;
            C1313c c1313c2 = C1313c.f6504s;
            return new a2(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", c1313c, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", c1313c2, "zzn", c1313c2, "zzo"});
        }
        if (i11 == 3) {
            return new d3();
        }
        if (i11 == 4) {
            return new q3(20, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
