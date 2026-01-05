package h1;

import e1.C1921w;
import e1.C1922x;
import ee.C2039g;
import f1.AbstractC2176a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements InterfaceC2791v {

    /* renamed from: a */
    public final C2039g f15462a;

    public i0(C2039g c2039g) {
        this.f15462a = c2039g;
    }

    @Override // h1.InterfaceC2779j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final g2 mo6766a(x1 x1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i10;
        C2039g c2039g = this.f15462a;
        C1922x c1922x = (C1922x) c2039g.f9606c;
        C1921w c1921w = new C1921w(c1922x.f9014e + 2);
        C1922x c1922x2 = new C1922x(c1922x.f9014e);
        int[] iArr3 = c1922x.f9011b;
        Object[] objArr3 = c1922x.f9012c;
        long[] jArr = c1922x.f9010a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j6 = jArr[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j6 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            i10 = i12;
                            h0 h0Var = (h0) objArr3[i15];
                            c1921w.m5651a(i16);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c1922x2.m5663h(i16, new f2((AbstractC2785p) x1Var.f15661a.invoke(h0Var.f15445a), h0Var.f15446b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i10 = i12;
                        }
                        j6 >>= i10;
                        i14++;
                        iArr3 = iArr2;
                        i12 = i10;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c1922x.m5594a(0)) {
            int i17 = c1921w.f9077b;
            if (i17 < 0) {
                AbstractC2176a.m5863d("Index must be between 0 and size");
                throw null;
            }
            c1921w.m5652b(i17 + 1);
            int[] iArr4 = c1921w.f9076a;
            int i18 = c1921w.f9077b;
            if (i18 != 0) {
                AbstractC6662l.m12717g(1, iArr4, 0, i18, iArr4);
            }
            iArr4[0] = 0;
            c1921w.f9077b++;
        }
        if (!c1922x.m5594a(c2039g.f9605b)) {
            c1921w.m5651a(c2039g.f9605b);
        }
        int i19 = c1921w.f9077b;
        if (i19 != 0) {
            int[] iArr5 = c1921w.f9076a;
            AbstractC4154l.m8923f(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i19);
        }
        return new g2(c1921w, c1922x2, c2039g.f9605b, AbstractC2793x.f15642d);
    }
}
