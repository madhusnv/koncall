package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p2 extends i5 {
    private static final p2 zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private x5 zzl;
    private x5 zzm;

    static {
        p2 p2Var = new p2();
        zzn = p2Var;
        i5.m3332m(p2.class, p2Var);
    }

    public p2() {
        x5 x5Var = x5.f6446b;
        this.zzl = x5Var;
        this.zzm = x5Var;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    /* renamed from: O */
    public static m2 m3553O() {
        return (m2) zzn.m3339h();
    }

    /* renamed from: P */
    public static p2 m3554P() {
        return zzn;
    }

    /* renamed from: A */
    public final boolean m3555A() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: B */
    public final String m3556B() {
        return this.zze;
    }

    /* renamed from: C */
    public final boolean m3557C() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: D */
    public final String m3558D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final boolean m3559E() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: F */
    public final long m3560F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m3561G() {
        return (this.zzb & 16) != 0;
    }

    /* renamed from: H */
    public final String m3562H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean m3563I() {
        return (this.zzb & 32) != 0;
    }

    /* renamed from: J */
    public final String m3564J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final boolean m3565K() {
        return (this.zzb & 64) != 0;
    }

    /* renamed from: L */
    public final String m3566L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final boolean m3567M() {
        return (this.zzb & 128) != 0;
    }

    /* renamed from: N */
    public final long m3568N() {
        return this.zzk;
    }

    /* renamed from: Q */
    public final /* synthetic */ void m3569Q(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    /* renamed from: R */
    public final /* synthetic */ void m3570R() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    /* renamed from: S */
    public final /* synthetic */ void m3571S(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    /* renamed from: T */
    public final /* synthetic */ void m3572T() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    /* renamed from: U */
    public final /* synthetic */ void m3573U(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    /* renamed from: V */
    public final /* synthetic */ void m3574V() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    /* renamed from: W */
    public final /* synthetic */ void m3575W(long j6) {
        this.zzb |= 8;
        this.zzg = j6;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", n2.f6312a, "zzm", o2.f6320a});
        }
        if (i11 == 3) {
            return new p2();
        }
        if (i11 == 4) {
            return new m2(zzn);
        }
        if (i11 == 5) {
            return zzn;
        }
        throw null;
    }

    /* renamed from: p */
    public final /* synthetic */ void m3576p(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    /* renamed from: q */
    public final /* synthetic */ void m3577q() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    /* renamed from: r */
    public final /* synthetic */ void m3578r(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    /* renamed from: s */
    public final /* synthetic */ void m3579s() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    /* renamed from: t */
    public final /* synthetic */ void m3580t(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    /* renamed from: u */
    public final /* synthetic */ void m3581u() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    /* renamed from: v */
    public final /* synthetic */ void m3582v(long j6) {
        this.zzb |= 128;
        this.zzk = j6;
    }

    /* renamed from: w */
    public final x5 m3583w() {
        x5 x5Var = this.zzl;
        if (!x5Var.f6447a) {
            this.zzl = x5Var.m3774b();
        }
        return this.zzl;
    }

    /* renamed from: x */
    public final x5 m3584x() {
        x5 x5Var = this.zzm;
        if (!x5Var.f6447a) {
            this.zzm = x5Var.m3774b();
        }
        return this.zzm;
    }

    /* renamed from: y */
    public final boolean m3585y() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: z */
    public final String m3586z() {
        return this.zzd;
    }
}
