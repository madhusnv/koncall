package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 extends i5 {
    private static final n1 zzi;
    private int zzb;
    private int zzd;
    private o5 zze;
    private o5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        n1 n1Var = new n1();
        zzi = n1Var;
        i5.m3332m(n1.class, n1Var);
    }

    public n1() {
        g6 g6Var = g6.f6216e;
        this.zze = g6Var;
        this.zzf = g6Var;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", w1.class, "zzf", p1.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new n1();
        }
        if (i11 == 4) {
            return new m1(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3500p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final int m3501q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final List m3502r() {
        return this.zze;
    }

    /* renamed from: s */
    public final int m3503s() {
        return this.zze.size();
    }

    /* renamed from: t */
    public final w1 m3504t(int i10) {
        return (w1) this.zze.get(i10);
    }

    /* renamed from: u */
    public final o5 m3505u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final int m3506v() {
        return this.zzf.size();
    }

    /* renamed from: w */
    public final p1 m3507w(int i10) {
        return (p1) this.zzf.get(i10);
    }

    /* renamed from: x */
    public final void m3508x(int i10, w1 w1Var) {
        o5 o5Var = this.zze;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zze = o5Var.mo3298o(size + size);
        }
        this.zze.set(i10, w1Var);
    }

    /* renamed from: y */
    public final void m3509y(int i10, p1 p1Var) {
        o5 o5Var = this.zzf;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzf = o5Var.mo3298o(size + size);
        }
        this.zzf.set(i10, p1Var);
    }
}
