package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u3 extends i5 {
    private static final u3 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        u3 u3Var = new u3();
        zzj = u3Var;
        i5.m3332m(u3.class, u3Var);
    }

    /* renamed from: A */
    public static t3 m3697A() {
        return (t3) zzj.m3339h();
    }

    /* renamed from: B */
    public final /* synthetic */ void m3698B(long j6) {
        this.zzb |= 1;
        this.zzd = j6;
    }

    /* renamed from: C */
    public final /* synthetic */ void m3699C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    /* renamed from: D */
    public final /* synthetic */ void m3700D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    /* renamed from: E */
    public final /* synthetic */ void m3701E() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    /* renamed from: F */
    public final /* synthetic */ void m3702F(long j6) {
        this.zzb |= 8;
        this.zzg = j6;
    }

    /* renamed from: G */
    public final /* synthetic */ void m3703G() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    /* renamed from: H */
    public final /* synthetic */ void m3704H(double d2) {
        this.zzb |= 32;
        this.zzi = d2;
    }

    /* renamed from: I */
    public final /* synthetic */ void m3705I() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new u3();
        }
        if (i11 == 4) {
            return new t3(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3706p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final long m3707q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final String m3708r() {
        return this.zze;
    }

    /* renamed from: s */
    public final boolean m3709s() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: t */
    public final String m3710t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final boolean m3711u() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: v */
    public final long m3712v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final boolean m3713w() {
        return (this.zzb & 16) != 0;
    }

    /* renamed from: x */
    public final float m3714x() {
        return this.zzh;
    }

    /* renamed from: y */
    public final boolean m3715y() {
        return (this.zzb & 32) != 0;
    }

    /* renamed from: z */
    public final double m3716z() {
        return this.zzi;
    }
}
