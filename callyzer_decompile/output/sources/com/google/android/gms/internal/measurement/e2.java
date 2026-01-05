package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e2 extends i5 {
    private static final e2 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        e2 e2Var = new e2();
        zzh = e2Var;
        i5.m3332m(e2.class, e2Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new e2();
        }
        if (i11 == 4) {
            return new d2(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* renamed from: p */
    public final String m3233p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final boolean m3234q() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: r */
    public final boolean m3235r() {
        return this.zze;
    }

    /* renamed from: s */
    public final boolean m3236s() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: t */
    public final boolean m3237t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final boolean m3238u() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: v */
    public final int m3239v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final /* synthetic */ void m3240w(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
