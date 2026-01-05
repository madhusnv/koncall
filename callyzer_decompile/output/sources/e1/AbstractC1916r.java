package e1;

import f1.AbstractC2176a;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.r */
/* loaded from: classes.dex */
public abstract class AbstractC1916r {

    /* renamed from: a */
    public static final Object f9042a = new Object();

    /* renamed from: b */
    public static final long[] f9043b = new long[0];

    /* renamed from: c */
    public static final Object f9044c = new Object();

    /* renamed from: a */
    public static final void m5605a(v0 v0Var) {
        int i10 = v0Var.f9075d;
        int[] iArr = v0Var.f9073b;
        Object[] objArr = v0Var.f9074c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f9044c) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        v0Var.f9072a = false;
        v0Var.f9075d = i11;
    }

    /* renamed from: b */
    public static final void m5606b(C1904f c1904f, int i10) {
        c1904f.f8958a = new int[i10];
        c1904f.f8959b = new Object[i10];
    }

    /* renamed from: c */
    public static final int m5607c(C1904f c1904f, Object obj, int i10) {
        int i11 = c1904f.f8960c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iM5860a = AbstractC2176a.m5860a(i11, i10, c1904f.f8958a);
            if (iM5860a < 0 || AbstractC4154l.m8918a(obj, c1904f.f8959b[iM5860a])) {
                return iM5860a;
            }
            int i12 = iM5860a + 1;
            while (i12 < i11 && c1904f.f8958a[i12] == i10) {
                if (AbstractC4154l.m8918a(obj, c1904f.f8959b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iM5860a - 1; i13 >= 0 && c1904f.f8958a[i13] == i10; i13--) {
                if (AbstractC4154l.m8918a(obj, c1904f.f8959b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
