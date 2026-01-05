package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c2 extends i5 {
    private static final c2 zzg;
    private int zzb;
    private String zzd = "";
    private o5 zze = g6.f6216e;
    private boolean zzf;

    static {
        c2 c2Var = new c2();
        zzg = c2Var;
        i5.m3332m(c2.class, c2Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", j2.class, "zzf"});
        }
        if (i11 == 3) {
            return new c2();
        }
        if (i11 == 4) {
            return new s1(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    /* renamed from: p */
    public final String m3186p() {
        return this.zzd;
    }
}
