package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a2 extends i5 {
    private static final a2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        a2 a2Var = new a2();
        zzf = a2Var;
        i5.m3332m(a2.class, a2Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new a2();
        }
        if (i11 == 4) {
            return new s1(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* renamed from: p */
    public final String m3103p() {
        return this.zzd;
    }
}
