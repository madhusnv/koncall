package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a3 extends i5 {
    private static final a3 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        a3 a3Var = new a3();
        zzf = a3Var;
        i5.m3332m(a3.class, a3Var);
    }

    /* renamed from: t */
    public static z2 m3104t() {
        return (z2) zzf.m3339h();
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new a3();
        }
        if (i11 == 4) {
            return new z2(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3105p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final int m3106q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final boolean m3107r() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: s */
    public final long m3108s() {
        return this.zze;
    }

    /* renamed from: u */
    public final /* synthetic */ void m3109u(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    /* renamed from: v */
    public final /* synthetic */ void m3110v(long j6) {
        this.zzb |= 2;
        this.zze = j6;
    }
}
