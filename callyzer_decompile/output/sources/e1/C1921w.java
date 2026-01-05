package e1;

import f1.AbstractC2176a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import pg.w9;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.w */
/* loaded from: classes.dex */
public final class C1921w {

    /* renamed from: a */
    public int[] f9076a;

    /* renamed from: b */
    public int f9077b;

    public C1921w(int i10) {
        this.f9076a = i10 == 0 ? AbstractC1912n.f9030a : new int[i10];
    }

    /* renamed from: a */
    public final void m5651a(int i10) {
        m5652b(this.f9077b + 1);
        int[] iArr = this.f9076a;
        int i11 = this.f9077b;
        iArr[i11] = i10;
        this.f9077b = i11 + 1;
    }

    /* renamed from: b */
    public final void m5652b(int i10) {
        int[] iArr = this.f9076a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f9076a = iArrCopyOf;
        }
    }

    /* renamed from: c */
    public final int m5653c(int i10) {
        if (i10 >= 0 && i10 < this.f9077b) {
            return this.f9076a[i10];
        }
        AbstractC2176a.m5863d("Index must be between 0 and size");
        throw null;
    }

    /* renamed from: d */
    public final int m5654d() {
        int i10 = this.f9077b;
        if (i10 != 0) {
            return this.f9076a[i10 - 1];
        }
        AbstractC2176a.m5864e("IntList is empty.");
        throw null;
    }

    /* renamed from: e */
    public final void m5655e(int i10) {
        int[] iArr = this.f9076a;
        int i11 = this.f9077b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            } else if (i10 == iArr[i12]) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            m5656f(i12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1921w) {
            C1921w c1921w = (C1921w) obj;
            int i10 = c1921w.f9077b;
            int i11 = this.f9077b;
            if (i10 == i11) {
                int[] iArr = this.f9076a;
                int[] iArr2 = c1921w.f9076a;
                C4266h c4266hM11919j = w9.m11919j(0, i11);
                int i12 = c4266hM11919j.f21646a;
                int i13 = c4266hM11919j.f21647b;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m5656f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f9077b)) {
            AbstractC2176a.m5863d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f9076a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            AbstractC6662l.m12717g(i10, iArr, i10 + 1, i11, iArr);
        }
        this.f9077b--;
        return i12;
    }

    /* renamed from: g */
    public final void m5657g(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f9077b) {
            AbstractC2176a.m5863d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f9076a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f9076a;
        int i10 = this.f9077b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f9076a;
        int i10 = this.f9077b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i12);
            i11++;
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C1921w() {
        this(16);
    }
}
