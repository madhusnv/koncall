package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v3 extends i5 {
    private static final v3 zzd;
    private o5 zzb = g6.f6216e;

    static {
        v3 v3Var = new v3();
        zzd = v3Var;
        i5.m3332m(v3.class, v3Var);
    }

    /* renamed from: r */
    public static v3 m3724r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", w3.class});
        }
        if (i11 == 3) {
            return new v3();
        }
        if (i11 == 4) {
            return new s1(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    /* renamed from: p */
    public final List m3725p() {
        return this.zzb;
    }

    /* renamed from: q */
    public final int m3726q() {
        return this.zzb.size();
    }
}
