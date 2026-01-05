package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x3 extends i5 {
    private static final x3 zzf;
    private int zzb;
    private o5 zzd = g6.f6216e;
    private v3 zze;

    static {
        x3 x3Var = new x3();
        zzf = x3Var;
        i5.m3332m(x3.class, x3Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", y3.class, "zze"});
        }
        if (i11 == 3) {
            return new x3();
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
    public final List m3771p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final v3 m3772q() {
        v3 v3Var = this.zze;
        return v3Var == null ? v3.m3724r() : v3Var;
    }
}
