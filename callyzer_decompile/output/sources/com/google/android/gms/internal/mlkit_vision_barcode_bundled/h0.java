package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends e1 implements t1 {
    private static final h0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        h0 h0Var = new h0();
        zzb = h0Var;
        e1.m3833h(h0.class, h0Var);
    }

    /* renamed from: n */
    public static h0 m3891n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new h0();
        }
        if (i11 == 4) {
            return new q3(5, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: o */
    public final String m3892o() {
        return this.zzh;
    }

    /* renamed from: p */
    public final String m3893p() {
        return this.zze;
    }

    /* renamed from: q */
    public final String m3894q() {
        return this.zzj;
    }

    /* renamed from: r */
    public final String m3895r() {
        return this.zzi;
    }

    /* renamed from: s */
    public final String m3896s() {
        return this.zzg;
    }

    /* renamed from: t */
    public final String m3897t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final String m3898u() {
        return this.zzk;
    }
}
