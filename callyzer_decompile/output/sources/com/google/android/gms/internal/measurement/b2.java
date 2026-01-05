package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 extends i5 {
    private static final b2 zzi;
    private int zzb;
    private o5 zzd;
    private o5 zze;
    private o5 zzf;
    private boolean zzg;
    private o5 zzh;

    static {
        b2 b2Var = new b2();
        zzi = b2Var;
        i5.m3332m(b2.class, b2Var);
    }

    public b2() {
        g6 g6Var = g6.f6216e;
        this.zzd = g6Var;
        this.zze = g6Var;
        this.zzf = g6Var;
        this.zzh = g6Var;
    }

    /* renamed from: v */
    public static b2 m3134v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", y1.class, "zze", z1.class, "zzf", a2.class, "zzg", "zzh", y1.class});
        }
        if (i11 == 3) {
            return new b2();
        }
        if (i11 == 4) {
            return new s1(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    /* renamed from: p */
    public final List m3135p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final List m3136q() {
        return this.zze;
    }

    /* renamed from: r */
    public final List m3137r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final boolean m3138s() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: t */
    public final boolean m3139t() {
        return this.zzg;
    }

    /* renamed from: u */
    public final o5 m3140u() {
        return this.zzh;
    }
}
