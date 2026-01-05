package com.google.android.gms.internal.measurement;

import og.ra;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y1 extends i5 {
    private static final y1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        y1 y1Var = new y1();
        zzg = y1Var;
        i5.m3332m(y1.class, y1Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", t1.f6381e, "zze", t1.f6380d, "zzf", t1.f6382f});
        }
        if (i11 == 3) {
            return new y1();
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
    public final int m3776p() {
        int iM10869a = ra.m10869a(this.zzd);
        if (iM10869a == 0) {
            return 1;
        }
        return iM10869a;
    }

    /* renamed from: q */
    public final int m3777q() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    /* renamed from: r */
    public final int m3778r() {
        int i10;
        int i11 = this.zzf;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
