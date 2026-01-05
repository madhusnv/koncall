package e1;

import f1.AbstractC2176a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.q */
/* loaded from: classes.dex */
public final class C1915q implements Cloneable {

    /* renamed from: a */
    public /* synthetic */ boolean f9037a;

    /* renamed from: b */
    public /* synthetic */ long[] f9038b;

    /* renamed from: c */
    public /* synthetic */ Object[] f9039c;

    /* renamed from: d */
    public /* synthetic */ int f9040d;

    public C1915q(int i10) {
        if (i10 == 0) {
            this.f9038b = AbstractC2176a.f10049b;
            this.f9039c = AbstractC2176a.f10050c;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f9038b = new long[i14];
        this.f9039c = new Object[i14];
    }

    /* renamed from: a */
    public final void m5597a() {
        int i10 = this.f9040d;
        Object[] objArr = this.f9039c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f9040d = 0;
        this.f9037a = false;
    }

    /* renamed from: b */
    public final Object m5598b(long j6) {
        Object obj;
        int iM5861b = AbstractC2176a.m5861b(this.f9038b, this.f9040d, j6);
        if (iM5861b < 0 || (obj = this.f9039c[iM5861b]) == AbstractC1916r.f9042a) {
            return null;
        }
        return obj;
    }

    /* renamed from: c */
    public final int m5599c(long j6) {
        if (this.f9037a) {
            int i10 = this.f9040d;
            long[] jArr = this.f9038b;
            Object[] objArr = this.f9039c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1916r.f9042a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f9037a = false;
            this.f9040d = i11;
        }
        return AbstractC2176a.m5861b(this.f9038b, this.f9040d, j6);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC4154l.m8921d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1915q c1915q = (C1915q) objClone;
        c1915q.f9038b = (long[]) this.f9038b.clone();
        c1915q.f9039c = (Object[]) this.f9039c.clone();
        return c1915q;
    }

    /* renamed from: d */
    public final long m5600d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f9040d)) {
            AbstractC2176a.m5862c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f9037a) {
            long[] jArr = this.f9038b;
            Object[] objArr = this.f9039c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC1916r.f9042a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f9037a = false;
            this.f9040d = i12;
        }
        return this.f9038b[i10];
    }

    /* renamed from: e */
    public final void m5601e(long j6, Object obj) {
        Object obj2 = AbstractC1916r.f9042a;
        int iM5861b = AbstractC2176a.m5861b(this.f9038b, this.f9040d, j6);
        if (iM5861b >= 0) {
            this.f9039c[iM5861b] = obj;
            return;
        }
        int i10 = ~iM5861b;
        int i11 = this.f9040d;
        if (i10 < i11) {
            Object[] objArr = this.f9039c;
            if (objArr[i10] == obj2) {
                this.f9038b[i10] = j6;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f9037a) {
            long[] jArr = this.f9038b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f9039c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f9037a = false;
                this.f9040d = i12;
                i10 = ~AbstractC2176a.m5861b(this.f9038b, i12, j6);
            }
        }
        int i14 = this.f9040d;
        if (i14 >= this.f9038b.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f9038b, i18);
            AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
            this.f9038b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9039c, i18);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            this.f9039c = objArrCopyOf;
        }
        int i19 = this.f9040d;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f9038b;
            int i20 = i10 + 1;
            AbstractC6662l.m12718h(i20, jArr2, i10, jArr2, i19);
            Object[] objArr3 = this.f9039c;
            AbstractC6662l.m12715e(i20, i10, this.f9040d, objArr3, objArr3);
        }
        this.f9038b[i10] = j6;
        this.f9039c[i10] = obj;
        this.f9040d++;
    }

    /* renamed from: f */
    public final void m5602f(long j6) {
        int iM5861b = AbstractC2176a.m5861b(this.f9038b, this.f9040d, j6);
        if (iM5861b >= 0) {
            Object[] objArr = this.f9039c;
            Object obj = objArr[iM5861b];
            Object obj2 = AbstractC1916r.f9042a;
            if (obj != obj2) {
                objArr[iM5861b] = obj2;
                this.f9037a = true;
            }
        }
    }

    /* renamed from: g */
    public final int m5603g() {
        if (this.f9037a) {
            int i10 = this.f9040d;
            long[] jArr = this.f9038b;
            Object[] objArr = this.f9039c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1916r.f9042a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f9037a = false;
            this.f9040d = i11;
        }
        return this.f9040d;
    }

    /* renamed from: i */
    public final Object m5604i(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f9040d)) {
            AbstractC2176a.m5862c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f9037a) {
            long[] jArr = this.f9038b;
            Object[] objArr = this.f9039c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC1916r.f9042a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f9037a = false;
            this.f9040d = i12;
        }
        return this.f9039c[i10];
    }

    public final String toString() {
        if (m5603g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f9040d * 28);
        sb2.append('{');
        int i10 = this.f9040d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m5600d(i11));
            sb2.append('=');
            Object objM5604i = m5604i(i11);
            if (objM5604i != sb2) {
                sb2.append(objM5604i);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C1915q(Object obj) {
        this(10);
    }
}
