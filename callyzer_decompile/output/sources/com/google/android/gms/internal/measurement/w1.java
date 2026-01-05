package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 extends i5 {
    private static final w1 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private r1 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        w1 w1Var = new w1();
        zzj = w1Var;
        i5.m3332m(w1.class, w1Var);
    }

    /* renamed from: x */
    public static v1 m3731x() {
        return (v1) zzj.m3339h();
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new w1();
        }
        if (i11 == 4) {
            return new v1(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3732p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final int m3733q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final String m3734r() {
        return this.zze;
    }

    /* renamed from: s */
    public final r1 m3735s() {
        r1 r1Var = this.zzf;
        return r1Var == null ? r1.m3599x() : r1Var;
    }

    /* renamed from: t */
    public final boolean m3736t() {
        return this.zzg;
    }

    /* renamed from: u */
    public final boolean m3737u() {
        return this.zzh;
    }

    /* renamed from: v */
    public final boolean m3738v() {
        return (this.zzb & 32) != 0;
    }

    /* renamed from: w */
    public final boolean m3739w() {
        return this.zzi;
    }

    /* renamed from: y */
    public final /* synthetic */ void m3740y(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
