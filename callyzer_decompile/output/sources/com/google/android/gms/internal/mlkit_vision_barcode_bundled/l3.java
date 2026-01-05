package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l3 extends e1 implements t1 {
    private static final l3 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private int zzi;
    private b3 zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        e1.m3833h(l3.class, l3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဂ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C1313c.f6506u, "zzi", "zzj", "zzk", "zzl", C1313c.f6507v, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new l3();
        }
        if (i11 == 4) {
            return new q3(27, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
