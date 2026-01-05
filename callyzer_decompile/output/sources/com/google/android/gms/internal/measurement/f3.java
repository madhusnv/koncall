package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f3 extends i5 {
    private static final f3 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private o5 zzi = g6.f6216e;

    static {
        f3 f3Var = new f3();
        zzj = f3Var;
        i5.m3332m(f3.class, f3Var);
    }

    /* renamed from: B */
    public static e3 m3244B() {
        return (e3) zzj.m3339h();
    }

    /* renamed from: A */
    public final int m3245A() {
        return this.zzi.size();
    }

    /* renamed from: C */
    public final /* synthetic */ void m3246C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    /* renamed from: D */
    public final /* synthetic */ void m3247D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    /* renamed from: E */
    public final /* synthetic */ void m3248E() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    /* renamed from: F */
    public final /* synthetic */ void m3249F(long j6) {
        this.zzb |= 4;
        this.zzf = j6;
    }

    /* renamed from: G */
    public final /* synthetic */ void m3250G() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    /* renamed from: H */
    public final /* synthetic */ void m3251H(double d2) {
        this.zzb |= 16;
        this.zzh = d2;
    }

    /* renamed from: I */
    public final /* synthetic */ void m3252I() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    /* renamed from: J */
    public final void m3253J(f3 f3Var) {
        o5 o5Var = this.zzi;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzi = o5Var.mo3298o(size + size);
        }
        this.zzi.add(f3Var);
    }

    /* renamed from: K */
    public final void m3254K(ArrayList arrayList) {
        o5 o5Var = this.zzi;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzi = o5Var.mo3298o(size + size);
        }
        t4.m3668c(arrayList, this.zzi);
    }

    /* renamed from: L */
    public final void m3255L() {
        this.zzi = g6.f6216e;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", f3.class});
        }
        if (i11 == 3) {
            return new f3();
        }
        if (i11 == 4) {
            return new e3(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* renamed from: p */
    public final boolean m3256p() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: q */
    public final String m3257q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final boolean m3258r() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: s */
    public final String m3259s() {
        return this.zze;
    }

    /* renamed from: t */
    public final boolean m3260t() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: u */
    public final long m3261u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final boolean m3262v() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: w */
    public final float m3263w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final boolean m3264x() {
        return (this.zzb & 16) != 0;
    }

    /* renamed from: y */
    public final double m3265y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final List m3266z() {
        return this.zzi;
    }
}
