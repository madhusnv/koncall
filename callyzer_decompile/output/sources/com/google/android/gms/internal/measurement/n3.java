package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n3 extends i5 {
    private static final n3 zzg;
    private n5 zzb;
    private n5 zzd;
    private o5 zze;
    private o5 zzf;

    static {
        n3 n3Var = new n3();
        zzg = n3Var;
        i5.m3332m(n3.class, n3Var);
    }

    public n3() {
        u5 u5Var = u5.f6409e;
        this.zzb = u5Var;
        this.zzd = u5Var;
        g6 g6Var = g6.f6216e;
        this.zze = g6Var;
        this.zzf = g6Var;
    }

    /* renamed from: x */
    public static m3 m3510x() {
        return (m3) zzg.m3339h();
    }

    /* renamed from: y */
    public static n3 m3511y() {
        return zzg;
    }

    /* renamed from: A */
    public final void m3512A() {
        this.zzb = u5.f6409e;
    }

    /* renamed from: B */
    public final void m3513B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((u4) randomAccess).f6407a) {
            u5 u5Var = (u5) randomAccess;
            int i10 = u5Var.f6411c;
            this.zzd = u5Var.mo3298o(i10 + i10);
        }
        t4.m3668c(list, this.zzd);
    }

    /* renamed from: C */
    public final void m3514C() {
        this.zzd = u5.f6409e;
    }

    /* renamed from: D */
    public final void m3515D(ArrayList arrayList) {
        o5 o5Var = this.zze;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zze = o5Var.mo3298o(size + size);
        }
        t4.m3668c(arrayList, this.zze);
    }

    /* renamed from: E */
    public final void m3516E() {
        this.zze = g6.f6216e;
    }

    /* renamed from: F */
    public final void m3517F(Iterable iterable) {
        o5 o5Var = this.zzf;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzf = o5Var.mo3298o(size + size);
        }
        t4.m3668c(iterable, this.zzf);
    }

    /* renamed from: G */
    public final void m3518G() {
        this.zzf = g6.f6216e;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", a3.class, "zzf", p3.class});
        }
        if (i11 == 3) {
            return new n3();
        }
        if (i11 == 4) {
            return new m3(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    /* renamed from: p */
    public final List m3519p() {
        return this.zzb;
    }

    /* renamed from: q */
    public final int m3520q() {
        return ((u5) this.zzb).size();
    }

    /* renamed from: r */
    public final List m3521r() {
        return this.zzd;
    }

    /* renamed from: s */
    public final int m3522s() {
        return ((u5) this.zzd).size();
    }

    /* renamed from: t */
    public final o5 m3523t() {
        return this.zze;
    }

    /* renamed from: u */
    public final int m3524u() {
        return this.zze.size();
    }

    /* renamed from: v */
    public final List m3525v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final int m3526w() {
        return this.zzf.size();
    }

    /* renamed from: z */
    public final void m3527z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((u4) randomAccess).f6407a) {
            u5 u5Var = (u5) randomAccess;
            int i10 = u5Var.f6411c;
            this.zzb = u5Var.mo3298o(i10 + i10);
        }
        t4.m3668c(iterable, this.zzb);
    }
}
