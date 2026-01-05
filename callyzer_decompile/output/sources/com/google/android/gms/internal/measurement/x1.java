package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x1 extends i5 {
    private static final x1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private o5 zzg = g6.f6216e;

    static {
        x1 x1Var = new x1();
        zzh = x1Var;
        i5.m3332m(x1.class, x1Var);
    }

    /* renamed from: w */
    public static x1 m3757w() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", t1.f6379c, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new x1();
        }
        if (i11 == 4) {
            return new s1(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3758p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final boolean m3759q() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: r */
    public final String m3760r() {
        return this.zze;
    }

    /* renamed from: s */
    public final boolean m3761s() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: t */
    public final boolean m3762t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final o5 m3763u() {
        return this.zzg;
    }

    /* renamed from: v */
    public final int m3764v() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final int m3765x() {
        int i10;
        switch (this.zzd) {
            case 0:
                i10 = 1;
                break;
            case 1:
                i10 = 2;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
