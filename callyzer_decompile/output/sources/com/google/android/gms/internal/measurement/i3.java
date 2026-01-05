package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i3 extends i5 {
    private static final i3 zzh;
    private int zzb;
    private o5 zzd = g6.f6216e;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        i3 i3Var = new i3();
        zzh = i3Var;
        i5.m3332m(i3.class, i3Var);
    }

    /* renamed from: w */
    public static h3 m3315w() {
        return (h3) zzh.m3339h();
    }

    /* renamed from: x */
    public static h3 m3316x(i3 i3Var) {
        h5 h5VarM3339h = zzh.m3339h();
        h5VarM3339h.m3307f(i3Var);
        return (h3) h5VarM3339h;
    }

    /* renamed from: A */
    public final /* synthetic */ void m3317A(ArrayList arrayList) {
        m3321E();
        t4.m3668c(arrayList, this.zzd);
    }

    /* renamed from: B */
    public final void m3318B() {
        this.zzd = g6.f6216e;
    }

    /* renamed from: C */
    public final /* synthetic */ void m3319C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* renamed from: D */
    public final /* synthetic */ void m3320D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* renamed from: E */
    public final void m3321E() {
        o5 o5Var = this.zzd;
        if (((u4) o5Var).f6407a) {
            return;
        }
        int size = o5Var.size();
        this.zzd = o5Var.mo3298o(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", k3.class, "zze", "zzf", "zzg", t1.f6386j});
        }
        if (i11 == 3) {
            return new i3();
        }
        if (i11 == 4) {
            return new h3(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* renamed from: p */
    public final List m3322p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final int m3323q() {
        return this.zzd.size();
    }

    /* renamed from: r */
    public final k3 m3324r(int i10) {
        return (k3) this.zzd.get(i10);
    }

    /* renamed from: s */
    public final boolean m3325s() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: t */
    public final String m3326t() {
        return this.zze;
    }

    /* renamed from: u */
    public final boolean m3327u() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: v */
    public final String m3328v() {
        return this.zzf;
    }

    /* renamed from: y */
    public final /* synthetic */ void m3329y(int i10, k3 k3Var) {
        m3321E();
        this.zzd.set(i10, k3Var);
    }

    /* renamed from: z */
    public final /* synthetic */ void m3330z(k3 k3Var) {
        m3321E();
        this.zzd.add(k3Var);
    }
}
