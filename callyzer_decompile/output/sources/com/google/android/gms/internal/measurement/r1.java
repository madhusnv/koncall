package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r1 extends i5 {
    private static final r1 zzh;
    private int zzb;
    private x1 zzd;
    private u1 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        r1 r1Var = new r1();
        zzh = r1Var;
        i5.m3332m(r1.class, r1Var);
    }

    /* renamed from: x */
    public static r1 m3599x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new r1();
        }
        if (i11 == 4) {
            return new q1(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3600p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final x1 m3601q() {
        x1 x1Var = this.zzd;
        return x1Var == null ? x1.m3757w() : x1Var;
    }

    /* renamed from: r */
    public final boolean m3602r() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: s */
    public final u1 m3603s() {
        u1 u1Var = this.zze;
        return u1Var == null ? u1.m3674y() : u1Var;
    }

    /* renamed from: t */
    public final boolean m3604t() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: u */
    public final boolean m3605u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final boolean m3606v() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: w */
    public final String m3607w() {
        return this.zzg;
    }

    /* renamed from: y */
    public final /* synthetic */ void m3608y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
