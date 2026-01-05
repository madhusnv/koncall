package k2;

import a2.C0036i;
import e1.C1922x;
import java.util.ArrayList;
import og.nd;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a */
    public final ArrayList f20399a;

    /* renamed from: b */
    public final int f20400b;

    /* renamed from: c */
    public int f20401c;

    /* renamed from: d */
    public final ArrayList f20402d;

    /* renamed from: e */
    public final C1922x f20403e;

    /* renamed from: f */
    public final C6366p f20404f;

    public h1(int i10, ArrayList arrayList) {
        this.f20399a = arrayList;
        this.f20400b = i10;
        if (i10 < 0) {
            j1.m8542a("Invalid start index");
        }
        this.f20402d = new ArrayList();
        C1922x c1922x = new C1922x();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            p0 p0Var = (p0) this.f20399a.get(i12);
            int i13 = p0Var.f20500c;
            int i14 = p0Var.f20501d;
            c1922x.m5663h(i13, new i0(i12, i11, i14));
            i11 += i14;
        }
        this.f20403e = c1922x;
        this.f20404f = nd.m10782c(new C0036i(24, this));
    }

    /* renamed from: a */
    public final boolean m8537a(int i10, int i11) {
        int i12;
        C1922x c1922x = this.f20403e;
        i0 i0Var = (i0) c1922x.m5595b(i10);
        if (i0Var == null) {
            return false;
        }
        int i13 = i0Var.f20406b;
        int i14 = i11 - i0Var.f20407c;
        i0Var.f20407c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = c1922x.f9012c;
        long[] jArr = c1922x.f9010a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j6 = jArr[i15];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j6) < 128) {
                        i0 i0Var2 = (i0) objArr[(i15 << 3) + i17];
                        if (i0Var2.f20406b >= i13 && !i0Var2.equals(i0Var) && (i12 = i0Var2.f20406b + i14) >= 0) {
                            i0Var2.f20406b = i12;
                        }
                    }
                    j6 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
