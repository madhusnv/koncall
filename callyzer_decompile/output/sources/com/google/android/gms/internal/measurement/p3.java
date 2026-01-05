package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p3 extends i5 {
    private static final p3 zzf;
    private int zzb;
    private int zzd;
    private n5 zze = u5.f6409e;

    static {
        p3 p3Var = new p3();
        zzf = p3Var;
        i5.m3332m(p3.class, p3Var);
    }

    /* renamed from: u */
    public static o3 m3587u() {
        return (o3) zzf.m3339h();
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new p3();
        }
        if (i11 == 4) {
            return new o3(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3588p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final int m3589q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final List m3590r() {
        return this.zze;
    }

    /* renamed from: s */
    public final int m3591s() {
        return ((u5) this.zze).size();
    }

    /* renamed from: t */
    public final long m3592t(int i10) {
        return ((u5) this.zze).m3718b(i10);
    }

    /* renamed from: v */
    public final /* synthetic */ void m3593v(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    /* renamed from: w */
    public final void m3594w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((u4) randomAccess).f6407a) {
            u5 u5Var = (u5) randomAccess;
            int i10 = u5Var.f6411c;
            this.zze = u5Var.mo3298o(i10 + i10);
        }
        t4.m3668c(list, this.zze);
    }
}
