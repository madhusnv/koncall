package y7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a */
    public int f41578a;

    /* renamed from: b */
    public int f41579b;

    /* renamed from: c */
    public int f41580c;

    /* renamed from: d */
    public int f41581d;

    /* renamed from: e */
    public int f41582e;

    /* renamed from: a */
    public final boolean m15834a() {
        int i10 = this.f41578a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f41581d;
            int i13 = this.f41579b;
            if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f41581d;
            int i15 = this.f41580c;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f41582e;
            int i17 = this.f41579b;
            if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f41582e;
            int i19 = this.f41580c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
