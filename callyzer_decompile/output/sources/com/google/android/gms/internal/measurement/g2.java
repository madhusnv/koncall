package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 extends i5 {
    private static final g2 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private o5 zzg;
    private o5 zzh;
    private o5 zzi;
    private String zzj;
    private boolean zzk;
    private o5 zzl;
    private o5 zzm;
    private String zzn;
    private String zzo;
    private b2 zzp;
    private i2 zzq;
    private l2 zzr;
    private j2 zzs;
    private h2 zzt;

    static {
        g2 g2Var = new g2();
        zzu = g2Var;
        i5.m3332m(g2.class, g2Var);
    }

    public g2() {
        g6 g6Var = g6.f6216e;
        this.zzg = g6Var;
        this.zzh = g6Var;
        this.zzi = g6Var;
        this.zzj = "";
        this.zzl = g6Var;
        this.zzm = g6Var;
        this.zzn = "";
        this.zzo = "";
    }

    /* renamed from: F */
    public static f2 m3270F() {
        return (f2) zzu.m3339h();
    }

    /* renamed from: G */
    public static g2 m3271G() {
        return zzu;
    }

    /* renamed from: A */
    public final String m3272A() {
        return this.zzn;
    }

    /* renamed from: B */
    public final boolean m3273B() {
        return (this.zzb & 128) != 0;
    }

    /* renamed from: C */
    public final b2 m3274C() {
        b2 b2Var = this.zzp;
        return b2Var == null ? b2.m3134v() : b2Var;
    }

    /* renamed from: D */
    public final boolean m3275D() {
        return (this.zzb & 512) != 0;
    }

    /* renamed from: E */
    public final l2 m3276E() {
        l2 l2Var = this.zzr;
        return l2Var == null ? l2.m3485r() : l2Var;
    }

    /* renamed from: H */
    public final void m3277H(int i10, e2 e2Var) {
        o5 o5Var = this.zzh;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzh = o5Var.mo3298o(size + size);
        }
        this.zzh.set(i10, e2Var);
    }

    /* renamed from: I */
    public final void m3278I() {
        this.zzi = g6.f6216e;
    }

    /* renamed from: J */
    public final void m3279J() {
        this.zzl = g6.f6216e;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", k2.class, "zzh", e2.class, "zzi", n1.class, "zzj", "zzk", "zzl", x3.class, "zzm", c2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new g2();
        }
        if (i11 == 4) {
            return new f2(zzu);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3280p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final long m3281q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final boolean m3282r() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: s */
    public final String m3283s() {
        return this.zze;
    }

    /* renamed from: t */
    public final o5 m3284t() {
        return this.zzg;
    }

    /* renamed from: u */
    public final int m3285u() {
        return this.zzh.size();
    }

    /* renamed from: v */
    public final e2 m3286v(int i10) {
        return (e2) this.zzh.get(i10);
    }

    /* renamed from: w */
    public final o5 m3287w() {
        return this.zzi;
    }

    /* renamed from: x */
    public final o5 m3288x() {
        return this.zzl;
    }

    /* renamed from: y */
    public final int m3289y() {
        return this.zzl.size();
    }

    /* renamed from: z */
    public final List m3290z() {
        return this.zzm;
    }
}
