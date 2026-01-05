package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a */
    public final j0 f6476a;

    /* renamed from: b */
    public final String f6477b;

    /* renamed from: c */
    public final Object[] f6478c;

    /* renamed from: d */
    public final int f6479d;

    public a2(j0 j0Var, String str, Object[] objArr) {
        this.f6476a = j0Var;
        this.f6477b = str;
        this.f6478c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6479d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f6479d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    /* renamed from: a */
    public final int m3810a() {
        int i10 = this.f6479d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
