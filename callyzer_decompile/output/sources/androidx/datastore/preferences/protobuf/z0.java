package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public final AbstractC0306a f2430a;

    /* renamed from: b */
    public final String f2431b;

    /* renamed from: c */
    public final Object[] f2432c;

    /* renamed from: d */
    public final int f2433d;

    public z0(AbstractC0335z abstractC0335z, String str, Object[] objArr) {
        this.f2430a = abstractC0335z;
        this.f2431b = str;
        this.f2432c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2433d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f2433d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    /* renamed from: a */
    public final w0 m1085a() {
        int i10 = this.f2433d;
        return (i10 & 1) != 0 ? w0.PROTO2 : (i10 & 4) == 4 ? w0.EDITIONS : w0.PROTO3;
    }
}
