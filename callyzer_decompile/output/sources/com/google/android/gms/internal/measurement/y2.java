package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y2 extends i5 {
    private static final y2 zzd;
    private o5 zzb = g6.f6216e;

    static {
        y2 y2Var = new y2();
        zzd = y2Var;
        i5.m3332m(y2.class, y2Var);
    }

    /* renamed from: q */
    public static v2 m3779q() {
        return (v2) zzd.m3339h();
    }

    /* renamed from: r */
    public static y2 m3780r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", x2.class});
        }
        if (i11 == 3) {
            return new y2();
        }
        if (i11 == 4) {
            return new v2(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    /* renamed from: p */
    public final List m3781p() {
        return this.zzb;
    }

    /* renamed from: s */
    public final void m3782s(ArrayList arrayList) {
        o5 o5Var = this.zzb;
        if (!((u4) o5Var).f6407a) {
            int size = o5Var.size();
            this.zzb = o5Var.mo3298o(size + size);
        }
        t4.m3668c(arrayList, this.zzb);
    }
}
