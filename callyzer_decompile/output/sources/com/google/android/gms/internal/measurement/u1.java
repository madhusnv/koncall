package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u1 extends i5 {
    private static final u1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        u1 u1Var = new u1();
        zzi = u1Var;
        i5.m3332m(u1.class, u1Var);
    }

    /* renamed from: y */
    public static u1 m3674y() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", t1.f6378b, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new u1();
        }
        if (i11 == 4) {
            return new s1(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3675p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final boolean m3676q() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: r */
    public final boolean m3677r() {
        return this.zze;
    }

    /* renamed from: s */
    public final boolean m3678s() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: t */
    public final String m3679t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final boolean m3680u() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: v */
    public final String m3681v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final boolean m3682w() {
        return (this.zzb & 16) != 0;
    }

    /* renamed from: x */
    public final String m3683x() {
        return this.zzh;
    }

    /* renamed from: z */
    public final int m3684z() {
        int i10;
        int i11 = this.zzd;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
