package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h2 extends i5 {
    private static final h2 zzd;
    private o5 zzb = g6.f6216e;

    static {
        h2 h2Var = new h2();
        zzd = h2Var;
        i5.m3332m(h2.class, h2Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new h2();
        }
        if (i11 == 4) {
            return new s1(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
