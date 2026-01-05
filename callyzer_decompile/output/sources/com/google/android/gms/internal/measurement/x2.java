package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x2 extends i5 {
    private static final x2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        x2 x2Var = new x2();
        zzf = x2Var;
        i5.m3332m(x2.class, x2Var);
    }

    /* renamed from: p */
    public static w2 m3766p() {
        return (w2) zzf.m3339h();
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", t1.f6384h, "zze", t1.f6385i});
        }
        if (i11 == 3) {
            return new x2();
        }
        if (i11 == 4) {
            return new w2(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* renamed from: q */
    public final int m3767q() {
        int i10;
        int i11 = this.zzd;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
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
    public final int m3768r() {
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

    /* renamed from: s */
    public final /* synthetic */ void m3769s(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    /* renamed from: t */
    public final /* synthetic */ void m3770t(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
