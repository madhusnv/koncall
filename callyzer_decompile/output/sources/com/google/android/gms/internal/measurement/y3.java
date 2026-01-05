package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y3 extends i5 {
    private static final y3 zzj;
    private int zzb;
    private int zzd;
    private o5 zze = g6.f6216e;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        y3 y3Var = new y3();
        zzj = y3Var;
        i5.m3332m(y3.class, y3Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", t1.f6391o, "zze", y3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new y3();
        }
        if (i11 == 4) {
            return new s1(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* renamed from: p */
    public final List m3783p() {
        return this.zze;
    }

    /* renamed from: q */
    public final String m3784q() {
        return this.zzf;
    }

    /* renamed from: r */
    public final boolean m3785r() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: s */
    public final String m3786s() {
        return this.zzg;
    }

    /* renamed from: t */
    public final boolean m3787t() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: u */
    public final boolean m3788u() {
        return this.zzh;
    }

    /* renamed from: v */
    public final boolean m3789v() {
        return (this.zzb & 16) != 0;
    }

    /* renamed from: w */
    public final double m3790w() {
        return this.zzi;
    }

    /* renamed from: x */
    public final int m3791x() {
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
