package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a */
    public final AbstractC1374a f7030a;

    /* renamed from: b */
    public final String f7031b;

    /* renamed from: c */
    public final Object[] f7032c;

    /* renamed from: d */
    public final int f7033d;

    public d1(AbstractC1374a abstractC1374a, String str, Object[] objArr) {
        this.f7030a = abstractC1374a;
        this.f7031b = str;
        this.f7032c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f7033d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f7033d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }
}
