package rx;

import d6.C1615e;
import e1.x0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import mq.C4833a;
import o2.AbstractC5268a;
import og.ag;
import og.re;
import oj.C5392d;
import qx.InterfaceC6379c;
import rw.AbstractC6656f;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.d */
/* loaded from: classes3.dex */
public final class C6680d extends AbstractC6656f implements InterfaceC6379c {

    /* renamed from: a */
    public int f31958a;

    /* renamed from: b */
    public AbstractC6677a f31959b;

    /* renamed from: c */
    public C5392d f31960c;

    /* renamed from: d */
    public Object[] f31961d;

    /* renamed from: e */
    public Object[] f31962e;

    /* renamed from: f */
    public int f31963f;

    public C6680d(AbstractC6677a abstractC6677a, Object[] objArr, Object[] vectorTail, int i10) {
        AbstractC4154l.m8923f(vectorTail, "vectorTail");
        this.f31958a = i10;
        this.f31959b = abstractC6677a;
        this.f31960c = new C5392d(27);
        this.f31961d = objArr;
        this.f31962e = vectorTail;
        this.f31963f = abstractC6677a.mo1628b();
    }

    /* renamed from: q */
    public static void m12788q(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    /* renamed from: A */
    public final Object[] m12789A(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f31960c;
        return objArr;
    }

    /* renamed from: B */
    public final Object[] m12790B(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iM10879c = re.m10879c(i10, i11);
        Object obj = objArr[iM10879c];
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM12790B = m12790B((Object[]) obj, i10, i11 - 5);
        if (iM10879c < 31) {
            int i12 = iM10879c + 1;
            if (objArr[i12] != null) {
                if (m12813v(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrM12817z = m12817z();
                AbstractC6662l.m12715e(0, 0, i12, objArr, objArrM12817z);
                objArr = objArrM12817z;
            }
        }
        if (objM12790B == objArr[iM10879c]) {
            return objArr;
        }
        Object[] objArrM12815x = m12815x(objArr);
        objArrM12815x[iM10879c] = objM12790B;
        return objArrM12815x;
    }

    /* renamed from: C */
    public final Object[] m12791C(Object[] objArr, int i10, int i11, C1615e c1615e) {
        Object[] objArrM12791C;
        int iM10879c = re.m10879c(i11 - 1, i10);
        if (i10 == 5) {
            c1615e.f8059a = objArr[iM10879c];
            objArrM12791C = null;
        } else {
            Object obj = objArr[iM10879c];
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM12791C = m12791C((Object[]) obj, i10 - 5, i11, c1615e);
        }
        if (objArrM12791C == null && iM10879c == 0) {
            return null;
        }
        Object[] objArrM12815x = m12815x(objArr);
        objArrM12815x[iM10879c] = objArrM12791C;
        return objArrM12815x;
    }

    /* renamed from: D */
    public final void m12792D(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            m12804P(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            m12805Q(objArr);
            this.f31963f = i10;
            this.f31958a = i11;
            return;
        }
        C1615e c1615e = new C1615e(null);
        AbstractC4154l.m8920c(objArr);
        Object[] objArrM12791C = m12791C(objArr, i11, i10, c1615e);
        AbstractC4154l.m8920c(objArrM12791C);
        Object obj = c1615e.f8059a;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m12805Q((Object[]) obj);
        this.f31963f = i10;
        if (objArrM12791C[1] == null) {
            m12804P((Object[]) objArrM12791C[0]);
            this.f31958a = i11 - 5;
        } else {
            m12804P(objArrM12791C);
            this.f31958a = i11;
        }
    }

    /* renamed from: E */
    public final Object[] m12793E(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM12815x = m12815x(objArr);
        int iM10879c = re.m10879c(i10, i11);
        int i12 = i11 - 5;
        objArrM12815x[iM10879c] = m12793E((Object[]) objArrM12815x[iM10879c], i10, i12, it);
        while (true) {
            iM10879c++;
            if (iM10879c >= 32 || !it.hasNext()) {
                break;
            }
            objArrM12815x[iM10879c] = m12793E((Object[]) objArrM12815x[iM10879c], 0, i12, it);
        }
        return objArrM12815x;
    }

    /* renamed from: F */
    public final Object[] m12794F(Object[] objArr, int i10, Object[][] objArr2) {
        x0 x0VarM8925h = AbstractC4154l.m8925h(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f31958a;
        Object[] objArrM12793E = i11 < (1 << i12) ? m12793E(objArr, i10, i12, x0VarM8925h) : m12815x(objArr);
        while (x0VarM8925h.hasNext()) {
            this.f31958a += 5;
            objArrM12793E = m12789A(objArrM12793E);
            int i13 = this.f31958a;
            m12793E(objArrM12793E, 1 << i13, i13, x0VarM8925h);
        }
        return objArrM12793E;
    }

    /* renamed from: G */
    public final void m12795G(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f31963f >> 5;
        int i11 = this.f31958a;
        if (i10 > (1 << i11)) {
            m12804P(m12796H(this.f31958a + 5, m12789A(objArr), objArr2));
            m12805Q(objArr3);
            this.f31958a += 5;
            this.f31963f++;
            return;
        }
        if (objArr == null) {
            m12804P(objArr2);
            m12805Q(objArr3);
            this.f31963f++;
        } else {
            m12804P(m12796H(i11, objArr, objArr2));
            m12805Q(objArr3);
            this.f31963f++;
        }
    }

    /* renamed from: H */
    public final Object[] m12796H(int i10, Object[] objArr, Object[] objArr2) {
        int iM10879c = re.m10879c(mo10411b() - 1, i10);
        Object[] objArrM12815x = m12815x(objArr);
        if (i10 == 5) {
            objArrM12815x[iM10879c] = objArr2;
            return objArrM12815x;
        }
        objArrM12815x[iM10879c] = m12796H(i10 - 5, (Object[]) objArrM12815x[iM10879c], objArr2);
        return objArrM12815x;
    }

    /* renamed from: I */
    public final int m12797I(C4833a c4833a, Object[] objArr, int i10, int i11, C1615e c1615e, ArrayList arrayList, ArrayList arrayList2) {
        if (m12813v(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c1615e.f8059a;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM12817z = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) c4833a.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrM12817z = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m12817z();
                    i11 = 0;
                }
                objArrM12817z[i11] = obj2;
                i11++;
            }
        }
        c1615e.f8059a = objArrM12817z;
        if (objArr2 != objArrM12817z) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    /* renamed from: J */
    public final int m12798J(C4833a c4833a, Object[] objArr, int i10, C1615e c1615e) {
        Object[] objArrM12815x = objArr;
        int i11 = i10;
        boolean z6 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) c4833a.invoke(obj)).booleanValue()) {
                if (!z6) {
                    objArrM12815x = m12815x(objArr);
                    z6 = true;
                    i11 = i12;
                }
            } else if (z6) {
                objArrM12815x[i11] = obj;
                i11++;
            }
        }
        c1615e.f8059a = objArrM12815x;
        return i11;
    }

    /* renamed from: K */
    public final int m12799K(C4833a c4833a, int i10, C1615e c1615e) {
        int iM12798J = m12798J(c4833a, this.f31962e, i10, c1615e);
        if (iM12798J == i10) {
            return i10;
        }
        Object obj = c1615e.f8059a;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM12798J, i10, (Object) null);
        m12805Q(objArr);
        this.f31963f -= i10 - iM12798J;
        return iM12798J;
    }

    /* renamed from: L */
    public final Object[] m12800L(Object[] objArr, int i10, int i11, C1615e c1615e) {
        int iM10879c = re.m10879c(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iM10879c];
            Object[] objArrM12815x = m12815x(objArr);
            AbstractC6662l.m12715e(iM10879c, iM10879c + 1, 32, objArr, objArrM12815x);
            objArrM12815x[31] = c1615e.f8059a;
            c1615e.f8059a = obj;
            return objArrM12815x;
        }
        int iM10879c2 = objArr[31] == null ? re.m10879c(m12802N() - 1, i10) : 31;
        Object[] objArrM12815x2 = m12815x(objArr);
        int i12 = i10 - 5;
        int i13 = iM10879c + 1;
        if (i13 <= iM10879c2) {
            while (true) {
                Object obj2 = objArrM12815x2[iM10879c2];
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrM12815x2[iM10879c2] = m12800L((Object[]) obj2, i12, 0, c1615e);
                if (iM10879c2 == i13) {
                    break;
                }
                iM10879c2--;
            }
        }
        Object obj3 = objArrM12815x2[iM10879c];
        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM12815x2[iM10879c] = m12800L((Object[]) obj3, i12, i11, c1615e);
        return objArrM12815x2;
    }

    /* renamed from: M */
    public final Object m12801M(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f31963f - i10;
        if (i13 == 1) {
            Object obj = this.f31962e[0];
            m12792D(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f31962e;
        Object obj2 = objArr2[i12];
        Object[] objArrM12815x = m12815x(objArr2);
        AbstractC6662l.m12715e(i12, i12 + 1, i13, objArr2, objArrM12815x);
        objArrM12815x[i13 - 1] = null;
        m12804P(objArr);
        m12805Q(objArrM12815x);
        this.f31963f = (i10 + i13) - 1;
        this.f31958a = i11;
        return obj2;
    }

    /* renamed from: N */
    public final int m12802N() {
        int i10 = this.f31963f;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    /* renamed from: O */
    public final Object[] m12803O(Object[] objArr, int i10, int i11, Object obj, C1615e c1615e) {
        int iM10879c = re.m10879c(i11, i10);
        Object[] objArrM12815x = m12815x(objArr);
        if (i10 != 0) {
            Object obj2 = objArrM12815x[iM10879c];
            AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM12815x[iM10879c] = m12803O((Object[]) obj2, i10 - 5, i11, obj, c1615e);
            return objArrM12815x;
        }
        if (objArrM12815x != objArr) {
            ((AbstractList) this).modCount++;
        }
        c1615e.f8059a = objArrM12815x[iM10879c];
        objArrM12815x[iM10879c] = obj;
        return objArrM12815x;
    }

    /* renamed from: P */
    public final void m12804P(Object[] objArr) {
        if (objArr != this.f31961d) {
            this.f31959b = null;
            this.f31961d = objArr;
        }
    }

    /* renamed from: Q */
    public final void m12805Q(Object[] objArr) {
        if (objArr != this.f31962e) {
            this.f31959b = null;
            this.f31962e = objArr;
        }
    }

    /* renamed from: R */
    public final void m12806R(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrM12817z;
        if (i12 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArrM12815x = m12815x(objArr);
        objArr2[0] = objArrM12815x;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC6662l.m12715e(size + 1, i13, i11, objArrM12815x, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrM12817z = objArrM12815x;
            } else {
                objArrM12817z = m12817z();
                i12--;
                objArr2[i12] = objArrM12817z;
            }
            int i16 = i11 - i15;
            AbstractC6662l.m12715e(0, i16, i11, objArrM12815x, objArr3);
            AbstractC6662l.m12715e(size + 1, i13, i16, objArrM12815x, objArrM12817z);
            objArr3 = objArrM12817z;
        }
        Iterator it = collection.iterator();
        m12788q(objArrM12815x, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrM12817z2 = m12817z();
            m12788q(objArrM12817z2, 0, it);
            objArr2[i17] = objArrM12817z2;
        }
        m12788q(objArr3, 0, it);
    }

    /* renamed from: S */
    public final int m12807S() {
        int i10 = this.f31963f;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        ag.m10537b(i10, mo10411b());
        if (i10 == mo10411b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM12802N = m12802N();
        if (i10 >= iM12802N) {
            m12812u(i10 - iM12802N, obj, this.f31961d);
            return;
        }
        C1615e c1615e = new C1615e(null);
        Object[] objArr = this.f31961d;
        AbstractC4154l.m8920c(objArr);
        m12812u(0, c1615e.f8059a, m12810s(objArr, this.f31958a, i10, obj, c1615e));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        Collection collection;
        C6680d c6680d;
        Object[] objArrM12817z;
        AbstractC4154l.m8923f(elements, "elements");
        ag.m10537b(i10, this.f31963f);
        if (i10 == this.f31963f) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((elements.size() + (this.f31963f - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((elements.size() + i10) - 1) & 31;
            Object[] objArr = this.f31962e;
            Object[] objArrM12815x = m12815x(objArr);
            AbstractC6662l.m12715e(size2 + 1, i12, m12807S(), objArr, objArrM12815x);
            m12788q(objArrM12815x, i12, elements.iterator());
            m12805Q(objArrM12815x);
            this.f31963f = elements.size() + this.f31963f;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM12807S = m12807S();
        int size3 = elements.size() + this.f31963f;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= m12802N()) {
            objArrM12817z = m12817z();
            collection = elements;
            m12806R(collection, i10, this.f31962e, iM12807S, objArr2, size, objArrM12817z);
            c6680d = this;
            objArr2 = objArr2;
        } else {
            collection = elements;
            c6680d = this;
            if (size3 > iM12807S) {
                int i13 = size3 - iM12807S;
                Object[] objArrM12816y = m12816y(i13, c6680d.f31962e);
                c6680d.m12811t(collection, i10, i13, objArr2, size, objArrM12816y);
                objArr2 = objArr2;
                objArrM12817z = objArrM12816y;
            } else {
                Object[] objArr3 = c6680d.f31962e;
                objArrM12817z = m12817z();
                int i14 = iM12807S - size3;
                AbstractC6662l.m12715e(0, i14, iM12807S, objArr3, objArrM12817z);
                int i15 = 32 - i14;
                Object[] objArrM12816y2 = m12816y(i15, c6680d.f31962e);
                int i16 = size - 1;
                objArr2[i16] = objArrM12816y2;
                c6680d.m12811t(collection, i10, i15, objArr2, i16, objArrM12816y2);
                collection = collection;
            }
        }
        m12804P(m12794F(c6680d.f31961d, i11, objArr2));
        m12805Q(objArrM12817z);
        c6680d.f31963f = collection.size() + c6680d.f31963f;
        return true;
    }

    @Override // rw.AbstractC6656f
    /* renamed from: b */
    public final int mo10411b() {
        return this.f31963f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        ag.m10536a(i10, mo10411b());
        if (m12802N() <= i10) {
            objArr = this.f31962e;
        } else {
            objArr = this.f31961d;
            AbstractC4154l.m8920c(objArr);
            for (int i11 = this.f31958a; i11 > 0; i11 -= 5) {
                Object obj = objArr[re.m10879c(i10, i11)];
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // rw.AbstractC6656f
    /* renamed from: h */
    public final Object mo10412h(int i10) {
        ag.m10536a(i10, mo10411b());
        ((AbstractList) this).modCount++;
        int iM12802N = m12802N();
        if (i10 >= iM12802N) {
            return m12801M(this.f31961d, iM12802N, this.f31958a, i10 - iM12802N);
        }
        C1615e c1615e = new C1615e(this.f31962e[0]);
        Object[] objArr = this.f31961d;
        AbstractC4154l.m8920c(objArr);
        m12801M(m12800L(objArr, this.f31958a, i10, c1615e), iM12802N, this.f31958a, 0);
        return c1615e.f8059a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final AbstractC6677a m12808j() {
        AbstractC6677a c6679c = this.f31959b;
        if (c6679c == null) {
            Object[] objArr = this.f31961d;
            Object[] objArr2 = this.f31962e;
            this.f31960c = new C5392d(27);
            if (objArr != null) {
                c6679c = new C6679c(objArr, objArr2, this.f31963f, this.f31958a);
            } else if (objArr2.length == 0) {
                c6679c = C6683g.f31970b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f31963f);
                AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
                c6679c = new C6683g(objArrCopyOf);
            }
            this.f31959b = c6679c;
        }
        return c6679c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        ag.m10537b(i10, this.f31963f);
        return new C6682f(this, i10);
    }

    /* renamed from: r */
    public final int m12809r() {
        return ((AbstractList) this).modCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r0 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (m12799K(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.C6680d.removeAll(java.util.Collection):boolean");
    }

    /* renamed from: s */
    public final Object[] m12810s(Object[] objArr, int i10, int i11, Object obj, C1615e c1615e) {
        Object obj2;
        int iM10879c = re.m10879c(i11, i10);
        if (i10 == 0) {
            c1615e.f8059a = objArr[31];
            Object[] objArrM12815x = m12815x(objArr);
            AbstractC6662l.m12715e(iM10879c + 1, iM10879c, 31, objArr, objArrM12815x);
            objArrM12815x[iM10879c] = obj;
            return objArrM12815x;
        }
        Object[] objArrM12815x2 = m12815x(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrM12815x2[iM10879c];
        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM12815x2[iM10879c] = m12810s((Object[]) obj3, i12, i11, obj, c1615e);
        while (true) {
            iM10879c++;
            if (iM10879c >= 32 || (obj2 = objArrM12815x2[iM10879c]) == null) {
                break;
            }
            objArrM12815x2[iM10879c] = m12810s((Object[]) obj2, i12, 0, c1615e.f8059a, c1615e);
        }
        return objArrM12815x2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        ag.m10536a(i10, mo10411b());
        if (m12802N() > i10) {
            C1615e c1615e = new C1615e(null);
            Object[] objArr = this.f31961d;
            AbstractC4154l.m8920c(objArr);
            m12804P(m12803O(objArr, this.f31958a, i10, obj, c1615e));
            return c1615e.f8059a;
        }
        Object[] objArrM12815x = m12815x(this.f31962e);
        if (objArrM12815x != this.f31962e) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrM12815x[i11];
        objArrM12815x[i11] = obj;
        m12805Q(objArrM12815x);
        return obj2;
    }

    /* renamed from: t */
    public final void m12811t(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f31961d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i13 = i10 >> 5;
        AbstractC5268a abstractC5268aM12814w = m12814w(m12802N() >> 5);
        int i14 = i12;
        Object[] objArrM12816y = objArr2;
        while (abstractC5268aM12814w.f25900b - 1 != i13) {
            Object[] objArr3 = (Object[]) abstractC5268aM12814w.previous();
            AbstractC6662l.m12715e(0, 32 - i11, 32, objArr3, objArrM12816y);
            objArrM12816y = m12816y(i11, objArr3);
            i14--;
            objArr[i14] = objArrM12816y;
        }
        Object[] objArr4 = (Object[]) abstractC5268aM12814w.previous();
        int iM12802N = i12 - (((m12802N() >> 5) - 1) - i13);
        if (iM12802N < i12) {
            objArr2 = objArr[iM12802N];
            AbstractC4154l.m8920c(objArr2);
        }
        m12806R(collection, i10, objArr4, 32, objArr, iM12802N, objArr2);
    }

    /* renamed from: u */
    public final void m12812u(int i10, Object obj, Object[] objArr) {
        int iM12807S = m12807S();
        Object[] objArrM12815x = m12815x(this.f31962e);
        if (iM12807S >= 32) {
            Object[] objArr2 = this.f31962e;
            Object obj2 = objArr2[31];
            AbstractC6662l.m12715e(i10 + 1, i10, 31, objArr2, objArrM12815x);
            objArrM12815x[i10] = obj;
            m12795G(objArr, objArrM12815x, m12789A(obj2));
            return;
        }
        AbstractC6662l.m12715e(i10 + 1, i10, iM12807S, this.f31962e, objArrM12815x);
        objArrM12815x[i10] = obj;
        m12804P(objArr);
        m12805Q(objArrM12815x);
        this.f31963f++;
    }

    /* renamed from: v */
    public final boolean m12813v(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f31960c;
    }

    /* renamed from: w */
    public final AbstractC5268a m12814w(int i10) {
        if (this.f31961d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iM12802N = m12802N() >> 5;
        ag.m10537b(i10, iM12802N);
        int i11 = this.f31958a;
        if (i11 == 0) {
            Object[] objArr = this.f31961d;
            AbstractC4154l.m8920c(objArr);
            return new C6678b(i10, objArr);
        }
        Object[] objArr2 = this.f31961d;
        AbstractC4154l.m8920c(objArr2);
        return new C6684h(objArr2, i10, iM12802N, i11 / 5);
    }

    /* renamed from: x */
    public final Object[] m12815x(Object[] objArr) {
        if (objArr == null) {
            return m12817z();
        }
        if (m12813v(objArr)) {
            return objArr;
        }
        Object[] objArrM12817z = m12817z();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC6662l.m12720j(0, length, 6, objArr, objArrM12817z);
        return objArrM12817z;
    }

    /* renamed from: y */
    public final Object[] m12816y(int i10, Object[] objArr) {
        if (m12813v(objArr)) {
            AbstractC6662l.m12715e(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrM12817z = m12817z();
        AbstractC6662l.m12715e(i10, 0, 32 - i10, objArr, objArrM12817z);
        return objArrM12817z;
    }

    /* renamed from: z */
    public final Object[] m12817z() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f31960c;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM12807S = m12807S();
        if (iM12807S < 32) {
            Object[] objArrM12815x = m12815x(this.f31962e);
            objArrM12815x[iM12807S] = obj;
            m12805Q(objArrM12815x);
            this.f31963f = mo10411b() + 1;
        } else {
            m12795G(this.f31961d, this.f31962e, m12789A(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM12807S = m12807S();
        Iterator it = elements.iterator();
        if (32 - iM12807S >= elements.size()) {
            Object[] objArrM12815x = m12815x(this.f31962e);
            m12788q(objArrM12815x, iM12807S, it);
            m12805Q(objArrM12815x);
            this.f31963f = elements.size() + this.f31963f;
            return true;
        }
        int size = ((elements.size() + iM12807S) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM12815x2 = m12815x(this.f31962e);
        m12788q(objArrM12815x2, iM12807S, it);
        objArr[0] = objArrM12815x2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrM12817z = m12817z();
            m12788q(objArrM12817z, 0, it);
            objArr[i10] = objArrM12817z;
        }
        m12804P(m12794F(this.f31961d, m12802N(), objArr));
        Object[] objArrM12817z2 = m12817z();
        m12788q(objArrM12817z2, 0, it);
        m12805Q(objArrM12817z2);
        this.f31963f = elements.size() + this.f31963f;
        return true;
    }
}
