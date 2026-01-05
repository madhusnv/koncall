package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s2 extends i5 {
    private static final s2 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        s2 s2Var = new s2();
        zzk = s2Var;
        i5.m3332m(s2.class, s2Var);
    }

    /* renamed from: w */
    public static r2 m3640w() {
        return (r2) zzk.m3339h();
    }

    /* renamed from: x */
    public static s2 m3641x() {
        return zzk;
    }

    /* renamed from: A */
    public final /* synthetic */ void m3642A(boolean z6) {
        this.zzb |= 4;
        this.zzf = z6;
    }

    /* renamed from: B */
    public final /* synthetic */ void m3643B(boolean z6) {
        this.zzb |= 8;
        this.zzg = z6;
    }

    /* renamed from: C */
    public final /* synthetic */ void m3644C(boolean z6) {
        this.zzb |= 16;
        this.zzh = z6;
    }

    /* renamed from: D */
    public final /* synthetic */ void m3645D(boolean z6) {
        this.zzb |= 32;
        this.zzi = z6;
    }

    /* renamed from: E */
    public final /* synthetic */ void m3646E(boolean z6) {
        this.zzb |= 64;
        this.zzj = z6;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new s2();
        }
        if (i11 == 4) {
            return new r2(zzk);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3647p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final boolean m3648q() {
        return this.zze;
    }

    /* renamed from: r */
    public final boolean m3649r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final boolean m3650s() {
        return this.zzg;
    }

    /* renamed from: t */
    public final boolean m3651t() {
        return this.zzh;
    }

    /* renamed from: u */
    public final boolean m3652u() {
        return this.zzi;
    }

    /* renamed from: v */
    public final boolean m3653v() {
        return this.zzj;
    }

    /* renamed from: y */
    public final /* synthetic */ void m3654y(boolean z6) {
        this.zzb |= 1;
        this.zzd = z6;
    }

    /* renamed from: z */
    public final /* synthetic */ void m3655z(boolean z6) {
        this.zzb |= 2;
        this.zze = z6;
    }
}
