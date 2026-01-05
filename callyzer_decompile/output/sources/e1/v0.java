package e1;

import f1.AbstractC2176a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements Cloneable {

    /* renamed from: a */
    public /* synthetic */ boolean f9072a;

    /* renamed from: b */
    public /* synthetic */ int[] f9073b;

    /* renamed from: c */
    public /* synthetic */ Object[] f9074c;

    /* renamed from: d */
    public /* synthetic */ int f9075d;

    public v0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f9073b = new int[i14];
        this.f9074c = new Object[i14];
    }

    /* renamed from: a */
    public final void m5644a(int i10, Object obj) {
        int i11 = this.f9075d;
        if (i11 != 0 && i10 <= this.f9073b[i11 - 1]) {
            m5648e(i10, obj);
            return;
        }
        if (this.f9072a && i11 >= this.f9073b.length) {
            AbstractC1916r.m5605a(this);
        }
        int i12 = this.f9075d;
        if (i12 >= this.f9073b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f9073b, i16);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f9073b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9074c, i16);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            this.f9074c = objArrCopyOf;
        }
        this.f9073b[i12] = i10;
        this.f9074c[i12] = obj;
        this.f9075d = i12 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC4154l.m8921d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        v0 v0Var = (v0) objClone;
        v0Var.f9073b = (int[]) this.f9073b.clone();
        v0Var.f9074c = (Object[]) this.f9074c.clone();
        return v0Var;
    }

    /* renamed from: c */
    public final Object m5646c(int i10) {
        Object obj;
        int iM5860a = AbstractC2176a.m5860a(this.f9075d, i10, this.f9073b);
        if (iM5860a < 0 || (obj = this.f9074c[iM5860a]) == AbstractC1916r.f9044c) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public final int m5647d(int i10) {
        if (this.f9072a) {
            AbstractC1916r.m5605a(this);
        }
        return this.f9073b[i10];
    }

    /* renamed from: e */
    public final void m5648e(int i10, Object obj) {
        int iM5860a = AbstractC2176a.m5860a(this.f9075d, i10, this.f9073b);
        if (iM5860a >= 0) {
            this.f9074c[iM5860a] = obj;
            return;
        }
        int i11 = ~iM5860a;
        int i12 = this.f9075d;
        if (i11 < i12) {
            Object[] objArr = this.f9074c;
            if (objArr[i11] == AbstractC1916r.f9044c) {
                this.f9073b[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f9072a && i12 >= this.f9073b.length) {
            AbstractC1916r.m5605a(this);
            i11 = ~AbstractC2176a.m5860a(this.f9075d, i10, this.f9073b);
        }
        int i13 = this.f9075d;
        if (i13 >= this.f9073b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f9073b, i17);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f9073b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9074c, i17);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            this.f9074c = objArrCopyOf;
        }
        int i18 = this.f9075d;
        if (i18 - i11 != 0) {
            int[] iArr = this.f9073b;
            int i19 = i11 + 1;
            AbstractC6662l.m12717g(i19, iArr, i11, i18, iArr);
            Object[] objArr2 = this.f9074c;
            AbstractC6662l.m12715e(i19, i11, this.f9075d, objArr2, objArr2);
        }
        this.f9073b[i11] = i10;
        this.f9074c[i11] = obj;
        this.f9075d++;
    }

    /* renamed from: f */
    public final int m5649f() {
        if (this.f9072a) {
            AbstractC1916r.m5605a(this);
        }
        return this.f9075d;
    }

    /* renamed from: g */
    public final Object m5650g(int i10) {
        if (this.f9072a) {
            AbstractC1916r.m5605a(this);
        }
        Object[] objArr = this.f9074c;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (m5649f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f9075d * 28);
        sb2.append('{');
        int i10 = this.f9075d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m5647d(i11));
            sb2.append('=');
            Object objM5650g = m5650g(i11);
            if (objM5650g != this) {
                sb2.append(objM5650g);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
