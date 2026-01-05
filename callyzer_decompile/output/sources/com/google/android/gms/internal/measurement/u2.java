package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u2 extends i5 {
    private static final u2 zzh;
    private int zzb;
    private int zzd;
    private n3 zze;
    private n3 zzf;
    private boolean zzg;

    static {
        u2 u2Var = new u2();
        zzh = u2Var;
        i5.m3332m(u2.class, u2Var);
    }

    /* renamed from: w */
    public static t2 m3685w() {
        return (t2) zzh.m3339h();
    }

    /* renamed from: A */
    public final /* synthetic */ void m3686A(boolean z6) {
        this.zzb |= 8;
        this.zzg = z6;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new u2();
        }
        if (i11 == 4) {
            return new t2(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3687p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final int m3688q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final n3 m3689r() {
        n3 n3Var = this.zze;
        return n3Var == null ? n3.m3511y() : n3Var;
    }

    /* renamed from: s */
    public final boolean m3690s() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: t */
    public final n3 m3691t() {
        n3 n3Var = this.zzf;
        return n3Var == null ? n3.m3511y() : n3Var;
    }

    /* renamed from: u */
    public final boolean m3692u() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: v */
    public final boolean m3693v() {
        return this.zzg;
    }

    /* renamed from: x */
    public final /* synthetic */ void m3694x(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    /* renamed from: y */
    public final /* synthetic */ void m3695y(n3 n3Var) {
        this.zze = n3Var;
        this.zzb |= 2;
    }

    /* renamed from: z */
    public final /* synthetic */ void m3696z(n3 n3Var) {
        this.zzf = n3Var;
        this.zzb |= 4;
    }
}
