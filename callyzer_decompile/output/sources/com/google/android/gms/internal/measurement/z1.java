package com.google.android.gms.internal.measurement;

import og.ra;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z1 extends i5 {
    private static final z1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        z1 z1Var = new z1();
        zzf = z1Var;
        i5.m3332m(z1.class, z1Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            t1 t1Var = t1.f6381e;
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", t1Var, "zze", t1Var});
        }
        if (i11 == 3) {
            return new z1();
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
    public final int m3799p() {
        int iM10869a = ra.m10869a(this.zzd);
        if (iM10869a == 0) {
            return 1;
        }
        return iM10869a;
    }

    /* renamed from: q */
    public final int m3800q() {
        int iM10869a = ra.m10869a(this.zze);
        if (iM10869a == 0) {
            return 1;
        }
        return iM10869a;
    }
}
