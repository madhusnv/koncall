package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h6 {

    /* renamed from: a */
    public final t4 f6232a;

    /* renamed from: b */
    public final String f6233b;

    /* renamed from: c */
    public final Object[] f6234c;

    /* renamed from: d */
    public final int f6235d;

    public h6(t4 t4Var, String str, Object[] objArr) {
        this.f6232a = t4Var;
        this.f6233b = str;
        this.f6234c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6235d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f6235d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    /* renamed from: a */
    public final int m3309a() {
        int i10 = this.f6235d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
