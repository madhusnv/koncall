package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 extends i5 {
    private static final p1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private o5 zzf = g6.f6216e;
    private boolean zzg;
    private u1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        p1 p1Var = new p1();
        zzl = p1Var;
        i5.m3332m(p1.class, p1Var);
    }

    /* renamed from: B */
    public static o1 m3538B() {
        return (o1) zzl.m3339h();
    }

    /* renamed from: A */
    public final boolean m3539A() {
        return this.zzk;
    }

    /* renamed from: C */
    public final /* synthetic */ void m3540C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    /* renamed from: D */
    public final void m3541D(int i10, r1 r1Var) {
        o5 o5Var = this.zzf;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzf = o5Var.mo3298o(size + size);
        }
        this.zzf.set(i10, r1Var);
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", r1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new p1();
        }
        if (i11 == 4) {
            return new o1(zzl);
        }
        if (i11 == 5) {
            return zzl;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3542p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final int m3543q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final String m3544r() {
        return this.zze;
    }

    /* renamed from: s */
    public final List m3545s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final int m3546t() {
        return this.zzf.size();
    }

    /* renamed from: u */
    public final r1 m3547u(int i10) {
        return (r1) this.zzf.get(i10);
    }

    /* renamed from: v */
    public final boolean m3548v() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: w */
    public final u1 m3549w() {
        u1 u1Var = this.zzh;
        return u1Var == null ? u1.m3674y() : u1Var;
    }

    /* renamed from: x */
    public final boolean m3550x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final boolean m3551y() {
        return this.zzj;
    }

    /* renamed from: z */
    public final boolean m3552z() {
        return (this.zzb & 64) != 0;
    }
}
