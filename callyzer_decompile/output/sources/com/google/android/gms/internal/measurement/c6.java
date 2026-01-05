package com.google.android.gms.internal.measurement;

import a2.AbstractC0030c;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c6 implements i6 {

    /* renamed from: a */
    public final t4 f6098a;

    /* renamed from: b */
    public final g5 f6099b;

    public c6(g5 g5Var, t4 t4Var) {
        g5 g5Var2 = c5.f6097a;
        this.f6099b = g5Var;
        this.f6098a = t4Var;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: b */
    public final boolean mo3164b(Object obj) {
        throw i0.m0.m7376i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: c */
    public final void mo3165c(Object obj, Object obj2) {
        j6.m3407b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: d */
    public final int mo3166d(t4 t4Var) {
        m6 m6Var = ((i5) t4Var).zzc;
        int i10 = m6Var.f6299d;
        if (i10 != -1) {
            return i10;
        }
        int iM9725C = 0;
        for (int i11 = 0; i11 < m6Var.f6296a; i11++) {
            int i12 = m6Var.f6297b[i11] >>> 3;
            z4 z4Var = (z4) m6Var.f6298c[i11];
            int iM3113r = a5.m3113r(8);
            int iM3113r2 = a5.m3113r(i12) + a5.m3113r(16);
            int iM3113r3 = a5.m3113r(24);
            int iMo3794c = z4Var.mo3794c();
            iM9725C = AbstractC4801l.m9725C(iM3113r + iM3113r, iM3113r2, AbstractC0030c.m111b(iMo3794c, iMo3794c, iM3113r3), iM9725C);
        }
        m6Var.f6299d = iM9725C;
        return iM9725C;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: e */
    public final void mo3167e(Object obj, v5 v5Var) {
        throw i0.m0.m7376i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: f */
    public final boolean mo3168f(i5 i5Var, i5 i5Var2) {
        return i5Var.zzc.equals(i5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: g */
    public final void mo3169g(Object obj) {
        this.f6099b.getClass();
        m6 m6Var = ((i5) obj).zzc;
        if (m6Var.f6300e) {
            m6Var.f6300e = false;
        }
        g5 g5Var = c5.f6097a;
        throw i0.m0.m7376i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: h */
    public final void mo3170h(Object obj, byte[] bArr, int i10, int i11, w4 w4Var) {
        i5 i5Var = (i5) obj;
        if (i5Var.zzc == m6.f6295f) {
            i5Var.zzc = m6.m3494a();
        }
        throw i0.m0.m7376i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    /* renamed from: i */
    public final int mo3171i(i5 i5Var) {
        return i5Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final i5 zza() {
        t4 t4Var = this.f6098a;
        return t4Var instanceof i5 ? (i5) ((i5) t4Var).mo3102o(4) : ((h5) ((i5) t4Var).mo3102o(5)).m3305d();
    }
}
