package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c3 extends e1 implements t1 {
    private static final c3 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        c3 c3Var = new c3();
        zzb = c3Var;
        e1.m3833h(c3.class, c3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            C1313c c1313c = C1313c.f6502q;
            C1313c c1313c2 = C1313c.f6500o;
            C1313c c1313c3 = C1313c.f6501p;
            return new a2(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", c1313c, "zzg", "zzh", c1313c2, "zzi", c1313c3, "zzj", c1313c3, "zzk", c1313c3, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new c3();
        }
        if (i11 == 4) {
            return new q3(19, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
