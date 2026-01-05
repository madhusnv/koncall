package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c3 extends i5 {
    private static final c3 zzj;
    private int zzb;
    private o5 zzd = g6.f6216e;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        c3 c3Var = new c3();
        zzj = c3Var;
        i5.m3332m(c3.class, c3Var);
    }

    /* renamed from: z */
    public static b3 m3187z() {
        return (b3) zzj.m3339h();
    }

    /* renamed from: A */
    public final /* synthetic */ void m3188A(int i10, f3 f3Var) {
        m3197J();
        this.zzd.set(i10, f3Var);
    }

    /* renamed from: B */
    public final /* synthetic */ void m3189B(f3 f3Var) {
        f3Var.getClass();
        m3197J();
        this.zzd.add(f3Var);
    }

    /* renamed from: C */
    public final /* synthetic */ void m3190C(Iterable iterable) {
        m3197J();
        t4.m3668c(iterable, this.zzd);
    }

    /* renamed from: D */
    public final void m3191D() {
        this.zzd = g6.f6216e;
    }

    /* renamed from: E */
    public final /* synthetic */ void m3192E(int i10) {
        m3197J();
        this.zzd.remove(i10);
    }

    /* renamed from: F */
    public final /* synthetic */ void m3193F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* renamed from: G */
    public final /* synthetic */ void m3194G(long j6) {
        this.zzb |= 2;
        this.zzf = j6;
    }

    /* renamed from: H */
    public final /* synthetic */ void m3195H(long j6) {
        this.zzb |= 4;
        this.zzg = j6;
    }

    /* renamed from: I */
    public final /* synthetic */ void m3196I(long j6) {
        this.zzb |= 16;
        this.zzi = j6;
    }

    /* renamed from: J */
    public final void m3197J() {
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
            return new h6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", f3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new c3();
        }
        if (i11 == 4) {
            return new b3(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* renamed from: p */
    public final List m3198p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final int m3199q() {
        return this.zzd.size();
    }

    /* renamed from: r */
    public final f3 m3200r(int i10) {
        return (f3) this.zzd.get(i10);
    }

    /* renamed from: s */
    public final String m3201s() {
        return this.zze;
    }

    /* renamed from: t */
    public final boolean m3202t() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: u */
    public final long m3203u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final boolean m3204v() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: w */
    public final long m3205w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final boolean m3206x() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: y */
    public final int m3207y() {
        return this.zzh;
    }
}
