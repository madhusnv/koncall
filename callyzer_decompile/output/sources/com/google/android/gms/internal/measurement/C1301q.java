package com.google.android.gms.internal.measurement;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.q */
/* loaded from: classes.dex */
public final class C1301q implements Iterable, InterfaceC1298n {

    /* renamed from: a */
    public final String f6347a;

    public C1301q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f6347a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        return Boolean.valueOf(!this.f6347a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() {
        return this.f6347a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return new C1300p(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        String str = this.f6347a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1301q) {
            return this.f6347a.equals(((C1301q) obj).f6347a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6347a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1300p(this, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ec A[PHI: r7
      0x02ec: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02d8, B:101:0x02da, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f6 A[LOOP:0: B:108:0x02f4->B:109:0x02f6, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1298n mo3214j(java.lang.String r28, c9.C0919n r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1301q.mo3214j(java.lang.String, c9.n, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        return new C1301q(this.f6347a);
    }

    public final String toString() {
        String str = this.f6347a;
        return p020v.a1.m14335o(new StringBuilder(str.length() + 2), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }
}
