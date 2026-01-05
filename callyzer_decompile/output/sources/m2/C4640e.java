package m2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m2.e */
/* loaded from: classes.dex */
public final class C4640e implements RandomAccess {

    /* renamed from: a */
    public Object[] f22884a;

    /* renamed from: b */
    public C4637b f22885b;

    /* renamed from: c */
    public int f22886c = 0;

    public C4640e(Object[] objArr) {
        this.f22884a = objArr;
    }

    /* renamed from: a */
    public final void m9505a(int i10, Object obj) {
        int i11 = this.f22886c + 1;
        if (this.f22884a.length < i11) {
            m9517p(i11);
        }
        Object[] objArr = this.f22884a;
        int i12 = this.f22886c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f22886c++;
    }

    /* renamed from: b */
    public final void m9506b(Object obj) {
        int i10 = this.f22886c + 1;
        if (this.f22884a.length < i10) {
            m9517p(i10);
        }
        Object[] objArr = this.f22884a;
        int i11 = this.f22886c;
        objArr[i11] = obj;
        this.f22886c = i11 + 1;
    }

    /* renamed from: c */
    public final void m9507c(int i10, C4640e c4640e) {
        int i11 = c4640e.f22886c;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f22886c + i11;
        if (this.f22884a.length < i12) {
            m9517p(i12);
        }
        Object[] objArr = this.f22884a;
        int i13 = this.f22886c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(c4640e.f22884a, 0, objArr, i10, i11);
        this.f22886c += i11;
    }

    /* renamed from: d */
    public final void m9508d(List list, int i10) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f22886c + size;
        if (this.f22884a.length < i11) {
            m9517p(i11);
        }
        Object[] objArr = this.f22884a;
        int i12 = this.f22886c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f22886c += size;
    }

    /* renamed from: e */
    public final boolean m9509e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f22886c + size;
        if (this.f22884a.length < i12) {
            m9517p(i12);
        }
        Object[] objArr = this.f22884a;
        int i13 = this.f22886c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                pe.m10842q();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f22886c += size;
        return true;
    }

    /* renamed from: g */
    public final List m9510g() {
        C4637b c4637b = this.f22885b;
        if (c4637b != null) {
            return c4637b;
        }
        C4637b c4637b2 = new C4637b(this);
        this.f22885b = c4637b2;
        return c4637b2;
    }

    /* renamed from: h */
    public final void m9511h() {
        Object[] objArr = this.f22884a;
        int i10 = this.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f22886c = 0;
    }

    /* renamed from: j */
    public final boolean m9512j(Object obj) {
        int i10 = this.f22886c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !AbstractC4154l.m8918a(this.f22884a[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final int m9513k(Object obj) {
        Object[] objArr = this.f22884a;
        int i10 = this.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (AbstractC4154l.m8918a(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final boolean m9514l(Object obj) {
        int iM9513k = m9513k(obj);
        if (iM9513k < 0) {
            return false;
        }
        m9515m(iM9513k);
        return true;
    }

    /* renamed from: m */
    public final Object m9515m(int i10) {
        Object[] objArr = this.f22884a;
        Object obj = objArr[i10];
        int i11 = this.f22886c;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(objArr, i12, objArr, i10, i11 - i12);
        }
        int i13 = this.f22886c - 1;
        this.f22886c = i13;
        objArr[i13] = null;
        return obj;
    }

    /* renamed from: n */
    public final void m9516n(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f22886c;
            if (i11 < i12) {
                Object[] objArr = this.f22884a;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f22886c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f22884a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f22886c = i14;
        }
    }

    /* renamed from: p */
    public final void m9517p(int i10) {
        Object[] objArr = this.f22884a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f22884a = objArr2;
    }

    /* renamed from: q */
    public final void m9518q(Comparator comparator) {
        Arrays.sort(this.f22884a, 0, this.f22886c, comparator);
    }
}
