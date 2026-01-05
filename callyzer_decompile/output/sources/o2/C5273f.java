package o2;

import androidx.fragment.app.C0351p;
import e1.x0;
import ex.InterfaceC2139c;
import fx.InterfaceC2396b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import k2.j1;
import kotlin.jvm.internal.AbstractC4154l;
import og.ja;
import og.ud;
import r2.C6443b;
import rw.AbstractC6656f;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.f */
/* loaded from: classes.dex */
public final class C5273f extends AbstractC6656f implements Collection, InterfaceC2396b {

    /* renamed from: a */
    public AbstractC5269b f25910a;

    /* renamed from: b */
    public Object[] f25911b;

    /* renamed from: c */
    public Object[] f25912c;

    /* renamed from: d */
    public int f25913d;

    /* renamed from: e */
    public C6443b f25914e = new C6443b();

    /* renamed from: f */
    public Object[] f25915f;

    /* renamed from: g */
    public Object[] f25916g;

    /* renamed from: h */
    public int f25917h;

    public C5273f(AbstractC5269b abstractC5269b, Object[] objArr, Object[] objArr2, int i10) {
        this.f25910a = abstractC5269b;
        this.f25911b = objArr;
        this.f25912c = objArr2;
        this.f25913d = i10;
        this.f25915f = objArr;
        this.f25916g = objArr2;
        this.f25917h = abstractC5269b.mo1628b();
    }

    /* renamed from: q */
    public static void m10392q(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    /* renamed from: A */
    public final Object[] m10393A(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f25914e;
        return objArr;
    }

    /* renamed from: B */
    public final Object[] m10394B(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            j1.m8542a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iM10707b = ja.m10707b(i10, i11);
        Object obj = objArr[iM10707b];
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM10394B = m10394B((Object[]) obj, i10, i11 - 5);
        if (iM10707b < 31) {
            int i12 = iM10707b + 1;
            if (objArr[i12] != null) {
                if (m10418v(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrM10422z = m10422z();
                AbstractC6662l.m12715e(0, 0, i12, objArr, objArrM10422z);
                objArr = objArrM10422z;
            }
        }
        if (objM10394B == objArr[iM10707b]) {
            return objArr;
        }
        Object[] objArrM10420x = m10420x(objArr);
        objArrM10420x[iM10707b] = objM10394B;
        return objArrM10420x;
    }

    /* renamed from: C */
    public final Object[] m10395C(Object[] objArr, int i10, int i11, C5271d c5271d) {
        Object[] objArrM10395C;
        int iM10707b = ja.m10707b(i11 - 1, i10);
        if (i10 == 5) {
            c5271d.f25905a = objArr[iM10707b];
            objArrM10395C = null;
        } else {
            Object obj = objArr[iM10707b];
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM10395C = m10395C((Object[]) obj, i10 - 5, i11, c5271d);
        }
        if (objArrM10395C == null && iM10707b == 0) {
            return null;
        }
        Object[] objArrM10420x = m10420x(objArr);
        objArrM10420x[iM10707b] = objArrM10395C;
        return objArrM10420x;
    }

    /* renamed from: D */
    public final void m10396D(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f25915f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f25916g = objArr;
            this.f25917h = i10;
            this.f25913d = i11;
            return;
        }
        C5271d c5271d = new C5271d((Object) null);
        AbstractC4154l.m8920c(objArr);
        Object[] objArrM10395C = m10395C(objArr, i11, i10, c5271d);
        AbstractC4154l.m8920c(objArrM10395C);
        Object obj = c5271d.f25905a;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f25916g = (Object[]) obj;
        this.f25917h = i10;
        if (objArrM10395C[1] == null) {
            this.f25915f = (Object[]) objArrM10395C[0];
            this.f25913d = i11 - 5;
        } else {
            this.f25915f = objArrM10395C;
            this.f25913d = i11;
        }
    }

    /* renamed from: E */
    public final Object[] m10397E(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            j1.m8542a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            j1.m8542a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM10420x = m10420x(objArr);
        int iM10707b = ja.m10707b(i10, i11);
        int i12 = i11 - 5;
        objArrM10420x[iM10707b] = m10397E((Object[]) objArrM10420x[iM10707b], i10, i12, it);
        while (true) {
            iM10707b++;
            if (iM10707b >= 32 || !it.hasNext()) {
                break;
            }
            objArrM10420x[iM10707b] = m10397E((Object[]) objArrM10420x[iM10707b], 0, i12, it);
        }
        return objArrM10420x;
    }

    /* renamed from: F */
    public final Object[] m10398F(Object[] objArr, int i10, Object[][] objArr2) {
        x0 x0VarM8925h = AbstractC4154l.m8925h(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f25913d;
        Object[] objArrM10397E = i11 < (1 << i12) ? m10397E(objArr, i10, i12, x0VarM8925h) : m10420x(objArr);
        while (x0VarM8925h.hasNext()) {
            this.f25913d += 5;
            objArrM10397E = m10393A(objArrM10397E);
            int i13 = this.f25913d;
            m10397E(objArrM10397E, 1 << i13, i13, x0VarM8925h);
        }
        return objArrM10397E;
    }

    /* renamed from: G */
    public final void m10399G(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f25917h;
        int i11 = i10 >> 5;
        int i12 = this.f25913d;
        if (i11 > (1 << i12)) {
            this.f25915f = m10400H(this.f25913d + 5, m10393A(objArr), objArr2);
            this.f25916g = objArr3;
            this.f25913d += 5;
            this.f25917h++;
            return;
        }
        if (objArr == null) {
            this.f25915f = objArr2;
            this.f25916g = objArr3;
            this.f25917h = i10 + 1;
        } else {
            this.f25915f = m10400H(i12, objArr, objArr2);
            this.f25916g = objArr3;
            this.f25917h++;
        }
    }

    /* renamed from: H */
    public final Object[] m10400H(int i10, Object[] objArr, Object[] objArr2) {
        int iM10707b = ja.m10707b(mo10411b() - 1, i10);
        Object[] objArrM10420x = m10420x(objArr);
        if (i10 == 5) {
            objArrM10420x[iM10707b] = objArr2;
            return objArrM10420x;
        }
        objArrM10420x[iM10707b] = m10400H(i10 - 5, (Object[]) objArrM10420x[iM10707b], objArr2);
        return objArrM10420x;
    }

    /* renamed from: I */
    public final int m10401I(InterfaceC2139c interfaceC2139c, Object[] objArr, int i10, int i11, C5271d c5271d, ArrayList arrayList, ArrayList arrayList2) {
        if (m10418v(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c5271d.f25905a;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM10422z = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) interfaceC2139c.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrM10422z = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m10422z();
                    i11 = 0;
                }
                objArrM10422z[i11] = obj2;
                i11++;
            }
        }
        c5271d.f25905a = objArrM10422z;
        if (objArr2 != objArrM10422z) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    /* renamed from: J */
    public final int m10402J(InterfaceC2139c interfaceC2139c, Object[] objArr, int i10, C5271d c5271d) {
        Object[] objArrM10420x = objArr;
        int i11 = i10;
        boolean z6 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) interfaceC2139c.invoke(obj)).booleanValue()) {
                if (!z6) {
                    objArrM10420x = m10420x(objArr);
                    z6 = true;
                    i11 = i12;
                }
            } else if (z6) {
                objArrM10420x[i11] = obj;
                i11++;
            }
        }
        c5271d.f25905a = objArrM10420x;
        return i11;
    }

    /* renamed from: K */
    public final int m10403K(InterfaceC2139c interfaceC2139c, int i10, C5271d c5271d) {
        int iM10402J = m10402J(interfaceC2139c, this.f25916g, i10, c5271d);
        if (iM10402J == i10) {
            return i10;
        }
        Object obj = c5271d.f25905a;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM10402J, i10, (Object) null);
        this.f25916g = objArr;
        this.f25917h -= i10 - iM10402J;
        return iM10402J;
    }

    /* renamed from: L */
    public final boolean m10404L(InterfaceC2139c interfaceC2139c) {
        Object[] objArrM10397E;
        int i10;
        InterfaceC2139c interfaceC2139c2 = interfaceC2139c;
        int iM10410R = m10410R();
        Object[] objArrM10394B = null;
        C5271d c5271d = new C5271d((Object) null);
        boolean z6 = false;
        if (this.f25915f != null) {
            AbstractC5268a abstractC5268aM10419w = m10419w(0);
            int iM10402J = 32;
            while (iM10402J == 32 && abstractC5268aM10419w.hasNext()) {
                iM10402J = m10402J(interfaceC2139c2, (Object[]) abstractC5268aM10419w.next(), 32, c5271d);
            }
            if (iM10402J == 32) {
                int iM10403K = m10403K(interfaceC2139c2, iM10410R, c5271d);
                if (iM10403K == 0) {
                    m10396D(this.f25915f, this.f25917h, this.f25913d);
                }
                if (iM10403K != iM10410R) {
                }
            } else {
                int i11 = (abstractC5268aM10419w.f25900b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM10401I = iM10402J;
                while (abstractC5268aM10419w.hasNext()) {
                    iM10401I = m10401I(interfaceC2139c2, (Object[]) abstractC5268aM10419w.next(), 32, iM10401I, c5271d, arrayList2, arrayList);
                    interfaceC2139c2 = interfaceC2139c;
                }
                int iM10401I2 = m10401I(interfaceC2139c, this.f25916g, iM10410R, iM10401I, c5271d, arrayList2, arrayList);
                Object obj = c5271d.f25905a;
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM10401I2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM10397E = this.f25915f;
                    AbstractC4154l.m8920c(objArrM10397E);
                } else {
                    objArrM10397E = m10397E(this.f25915f, i11, this.f25913d, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    j1.m8542a("invalid size");
                }
                if (size == 0) {
                    this.f25913d = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.f25913d;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.f25913d = i10 - 5;
                        Object[] objArr2 = objArrM10397E[0];
                        AbstractC4154l.m8921d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrM10397E = objArr2;
                    }
                    objArrM10394B = m10394B(objArrM10397E, i12, i10);
                }
                this.f25915f = objArrM10394B;
                this.f25916g = objArr;
                this.f25917h = size + iM10401I2;
            }
            z6 = true;
        } else if (m10403K(interfaceC2139c2, iM10410R, c5271d) != iM10410R) {
            z6 = true;
        }
        if (z6) {
            ((AbstractList) this).modCount++;
        }
        return z6;
    }

    /* renamed from: M */
    public final Object[] m10405M(Object[] objArr, int i10, int i11, C5271d c5271d) {
        int iM10707b = ja.m10707b(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iM10707b];
            Object[] objArrM10420x = m10420x(objArr);
            AbstractC6662l.m12715e(iM10707b, iM10707b + 1, 32, objArr, objArrM10420x);
            objArrM10420x[31] = c5271d.f25905a;
            c5271d.f25905a = obj;
            return objArrM10420x;
        }
        int iM10707b2 = objArr[31] == null ? ja.m10707b(m10407O() - 1, i10) : 31;
        Object[] objArrM10420x2 = m10420x(objArr);
        int i12 = i10 - 5;
        int i13 = iM10707b + 1;
        if (i13 <= iM10707b2) {
            while (true) {
                Object obj2 = objArrM10420x2[iM10707b2];
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrM10420x2[iM10707b2] = m10405M((Object[]) obj2, i12, 0, c5271d);
                if (iM10707b2 == i13) {
                    break;
                }
                iM10707b2--;
            }
        }
        Object obj3 = objArrM10420x2[iM10707b];
        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM10420x2[iM10707b] = m10405M((Object[]) obj3, i12, i11, c5271d);
        return objArrM10420x2;
    }

    /* renamed from: N */
    public final Object m10406N(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f25917h - i10;
        if (i13 == 1) {
            Object obj = this.f25916g[0];
            m10396D(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f25916g;
        Object obj2 = objArr2[i12];
        Object[] objArrM10420x = m10420x(objArr2);
        AbstractC6662l.m12715e(i12, i12 + 1, i13, objArr2, objArrM10420x);
        objArrM10420x[i13 - 1] = null;
        this.f25915f = objArr;
        this.f25916g = objArrM10420x;
        this.f25917h = (i10 + i13) - 1;
        this.f25913d = i11;
        return obj2;
    }

    /* renamed from: O */
    public final int m10407O() {
        int i10 = this.f25917h;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    /* renamed from: P */
    public final Object[] m10408P(Object[] objArr, int i10, int i11, Object obj, C5271d c5271d) {
        int iM10707b = ja.m10707b(i11, i10);
        Object[] objArrM10420x = m10420x(objArr);
        if (i10 != 0) {
            Object obj2 = objArrM10420x[iM10707b];
            AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM10420x[iM10707b] = m10408P((Object[]) obj2, i10 - 5, i11, obj, c5271d);
            return objArrM10420x;
        }
        if (objArrM10420x != objArr) {
            ((AbstractList) this).modCount++;
        }
        c5271d.f25905a = objArrM10420x[iM10707b];
        objArrM10420x[iM10707b] = obj;
        return objArrM10420x;
    }

    /* renamed from: Q */
    public final void m10409Q(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrM10422z;
        if (i12 < 1) {
            j1.m8542a("requires at least one nullBuffer");
        }
        Object[] objArrM10420x = m10420x(objArr);
        objArr2[0] = objArrM10420x;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC6662l.m12715e(size + 1, i13, i11, objArrM10420x, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrM10422z = objArrM10420x;
            } else {
                objArrM10422z = m10422z();
                i12--;
                objArr2[i12] = objArrM10422z;
            }
            int i16 = i11 - i15;
            AbstractC6662l.m12715e(0, i16, i11, objArrM10420x, objArr3);
            AbstractC6662l.m12715e(size + 1, i13, i16, objArrM10420x, objArrM10422z);
            objArr3 = objArrM10422z;
        }
        Iterator it = collection.iterator();
        m10392q(objArrM10420x, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrM10422z2 = m10422z();
            m10392q(objArrM10422z2, 0, it);
            objArr2[i17] = objArrM10422z2;
        }
        m10392q(objArr3, 0, it);
    }

    /* renamed from: R */
    public final int m10410R() {
        int i10 = this.f25917h;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        ud.m10976b(i10, mo10411b());
        if (i10 == mo10411b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM10407O = m10407O();
        if (i10 >= iM10407O) {
            m10417u(i10 - iM10407O, obj, this.f25915f);
            return;
        }
        C5271d c5271d = new C5271d((Object) null);
        Object[] objArr = this.f25915f;
        AbstractC4154l.m8920c(objArr);
        m10417u(0, c5271d.f25905a, m10416t(objArr, this.f25913d, i10, obj, c5271d));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        C5273f c5273f;
        Object[] objArrM10422z;
        ud.m10976b(i10, this.f25917h);
        if (i10 == this.f25917h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f25917h - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f25916g;
            Object[] objArrM10420x = m10420x(objArr);
            AbstractC6662l.m12715e(size2 + 1, i12, m10410R(), objArr, objArrM10420x);
            m10392q(objArrM10420x, i12, collection.iterator());
            this.f25916g = objArrM10420x;
            this.f25917h = collection.size() + this.f25917h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM10410R = m10410R();
        int size3 = collection.size() + this.f25917h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= m10407O()) {
            objArrM10422z = m10422z();
            collection2 = collection;
            m10409Q(collection2, i10, this.f25916g, iM10410R, objArr2, size, objArrM10422z);
            c5273f = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c5273f = this;
            if (size3 > iM10410R) {
                int i13 = size3 - iM10410R;
                Object[] objArrM10421y = m10421y(i13, c5273f.f25916g);
                c5273f.m10415s(collection2, i10, i13, objArr2, size, objArrM10421y);
                objArr2 = objArr2;
                objArrM10422z = objArrM10421y;
            } else {
                Object[] objArr3 = c5273f.f25916g;
                objArrM10422z = m10422z();
                int i14 = iM10410R - size3;
                AbstractC6662l.m12715e(0, i14, iM10410R, objArr3, objArrM10422z);
                int i15 = 32 - i14;
                Object[] objArrM10421y2 = m10421y(i15, c5273f.f25916g);
                int i16 = size - 1;
                objArr2[i16] = objArrM10421y2;
                c5273f.m10415s(collection2, i10, i15, objArr2, i16, objArrM10421y2);
                collection2 = collection2;
            }
        }
        c5273f.f25915f = m10398F(c5273f.f25915f, i11, objArr2);
        c5273f.f25916g = objArrM10422z;
        c5273f.f25917h = collection2.size() + c5273f.f25917h;
        return true;
    }

    @Override // rw.AbstractC6656f
    /* renamed from: b */
    public final int mo10411b() {
        return this.f25917h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        ud.m10975a(i10, mo10411b());
        if (m10407O() <= i10) {
            objArr = this.f25916g;
        } else {
            objArr = this.f25915f;
            AbstractC4154l.m8920c(objArr);
            for (int i11 = this.f25913d; i11 > 0; i11 -= 5) {
                Object obj = objArr[ja.m10707b(i10, i11)];
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // rw.AbstractC6656f
    /* renamed from: h */
    public final Object mo10412h(int i10) {
        ud.m10975a(i10, mo10411b());
        ((AbstractList) this).modCount++;
        int iM10407O = m10407O();
        if (i10 >= iM10407O) {
            return m10406N(this.f25915f, iM10407O, this.f25913d, i10 - iM10407O);
        }
        C5271d c5271d = new C5271d(this.f25916g[0]);
        Object[] objArr = this.f25915f;
        AbstractC4154l.m8920c(objArr);
        m10406N(m10405M(objArr, this.f25913d, i10, c5271d), iM10407O, this.f25913d, 0);
        return c5271d.f25905a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final AbstractC5269b m10413j() {
        AbstractC5269b c5272e;
        Object[] objArr = this.f25915f;
        if (objArr == this.f25911b && this.f25916g == this.f25912c) {
            c5272e = this.f25910a;
        } else {
            this.f25914e = new C6443b();
            this.f25911b = objArr;
            Object[] objArr2 = this.f25916g;
            this.f25912c = objArr2;
            if (objArr != null) {
                c5272e = new C5272e(objArr, objArr2, this.f25917h, this.f25913d);
            } else if (objArr2.length == 0) {
                c5272e = C5276i.f25924b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f25917h);
                AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
                c5272e = new C5276i(objArrCopyOf);
            }
        }
        this.f25910a = c5272e;
        return c5272e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        ud.m10976b(i10, this.f25917h);
        return new C5275h(this, i10);
    }

    /* renamed from: r */
    public final int m10414r() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m10404L(new C0351p(2, collection));
    }

    /* renamed from: s */
    public final void m10415s(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f25915f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        AbstractC5268a abstractC5268aM10419w = m10419w(m10407O() >> 5);
        int i14 = i12;
        Object[] objArrM10421y = objArr2;
        while (abstractC5268aM10419w.f25900b - 1 != i13) {
            Object[] objArr3 = (Object[]) abstractC5268aM10419w.previous();
            AbstractC6662l.m12715e(0, 32 - i11, 32, objArr3, objArrM10421y);
            objArrM10421y = m10421y(i11, objArr3);
            i14--;
            objArr[i14] = objArrM10421y;
        }
        Object[] objArr4 = (Object[]) abstractC5268aM10419w.previous();
        int iM10407O = i12 - (((m10407O() >> 5) - 1) - i13);
        if (iM10407O < i12) {
            objArr2 = objArr[iM10407O];
            AbstractC4154l.m8920c(objArr2);
        }
        m10409Q(collection, i10, objArr4, 32, objArr, iM10407O, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        ud.m10975a(i10, mo10411b());
        if (m10407O() > i10) {
            C5271d c5271d = new C5271d((Object) null);
            Object[] objArr = this.f25915f;
            AbstractC4154l.m8920c(objArr);
            this.f25915f = m10408P(objArr, this.f25913d, i10, obj, c5271d);
            return c5271d.f25905a;
        }
        Object[] objArrM10420x = m10420x(this.f25916g);
        if (objArrM10420x != this.f25916g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrM10420x[i11];
        objArrM10420x[i11] = obj;
        this.f25916g = objArrM10420x;
        return obj2;
    }

    /* renamed from: t */
    public final Object[] m10416t(Object[] objArr, int i10, int i11, Object obj, C5271d c5271d) {
        Object obj2;
        int iM10707b = ja.m10707b(i11, i10);
        if (i10 == 0) {
            c5271d.f25905a = objArr[31];
            Object[] objArrM10420x = m10420x(objArr);
            AbstractC6662l.m12715e(iM10707b + 1, iM10707b, 31, objArr, objArrM10420x);
            objArrM10420x[iM10707b] = obj;
            return objArrM10420x;
        }
        Object[] objArrM10420x2 = m10420x(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrM10420x2[iM10707b];
        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM10420x2[iM10707b] = m10416t((Object[]) obj3, i12, i11, obj, c5271d);
        while (true) {
            iM10707b++;
            if (iM10707b >= 32 || (obj2 = objArrM10420x2[iM10707b]) == null) {
                break;
            }
            objArrM10420x2[iM10707b] = m10416t((Object[]) obj2, i12, 0, c5271d.f25905a, c5271d);
        }
        return objArrM10420x2;
    }

    /* renamed from: u */
    public final void m10417u(int i10, Object obj, Object[] objArr) {
        int iM10410R = m10410R();
        Object[] objArrM10420x = m10420x(this.f25916g);
        if (iM10410R >= 32) {
            Object[] objArr2 = this.f25916g;
            Object obj2 = objArr2[31];
            AbstractC6662l.m12715e(i10 + 1, i10, 31, objArr2, objArrM10420x);
            objArrM10420x[i10] = obj;
            m10399G(objArr, objArrM10420x, m10393A(obj2));
            return;
        }
        AbstractC6662l.m12715e(i10 + 1, i10, iM10410R, this.f25916g, objArrM10420x);
        objArrM10420x[i10] = obj;
        this.f25915f = objArr;
        this.f25916g = objArrM10420x;
        this.f25917h++;
    }

    /* renamed from: v */
    public final boolean m10418v(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f25914e;
    }

    /* renamed from: w */
    public final AbstractC5268a m10419w(int i10) {
        Object[] objArr = this.f25915f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM10407O = m10407O() >> 5;
        ud.m10976b(i10, iM10407O);
        int i11 = this.f25913d;
        return i11 == 0 ? new C5270c(i10, objArr) : new C5277j(objArr, i10, iM10407O, i11 / 5);
    }

    /* renamed from: x */
    public final Object[] m10420x(Object[] objArr) {
        if (objArr == null) {
            return m10422z();
        }
        if (m10418v(objArr)) {
            return objArr;
        }
        Object[] objArrM10422z = m10422z();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC6662l.m12720j(0, length, 6, objArr, objArrM10422z);
        return objArrM10422z;
    }

    /* renamed from: y */
    public final Object[] m10421y(int i10, Object[] objArr) {
        if (m10418v(objArr)) {
            AbstractC6662l.m12715e(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrM10422z = m10422z();
        AbstractC6662l.m12715e(i10, 0, 32 - i10, objArr, objArrM10422z);
        return objArrM10422z;
    }

    /* renamed from: z */
    public final Object[] m10422z() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f25914e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM10410R = m10410R();
        if (iM10410R < 32) {
            Object[] objArrM10420x = m10420x(this.f25916g);
            objArrM10420x[iM10410R] = obj;
            this.f25916g = objArrM10420x;
            this.f25917h = mo10411b() + 1;
        } else {
            m10399G(this.f25915f, this.f25916g, m10393A(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM10410R = m10410R();
        Iterator it = collection.iterator();
        if (32 - iM10410R >= collection.size()) {
            Object[] objArrM10420x = m10420x(this.f25916g);
            m10392q(objArrM10420x, iM10410R, it);
            this.f25916g = objArrM10420x;
            this.f25917h = collection.size() + this.f25917h;
            return true;
        }
        int size = ((collection.size() + iM10410R) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM10420x2 = m10420x(this.f25916g);
        m10392q(objArrM10420x2, iM10410R, it);
        objArr[0] = objArrM10420x2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrM10422z = m10422z();
            m10392q(objArrM10422z, 0, it);
            objArr[i10] = objArrM10422z;
        }
        this.f25915f = m10398F(this.f25915f, m10407O(), objArr);
        Object[] objArrM10422z2 = m10422z();
        m10392q(objArrM10422z2, 0, it);
        this.f25916g = objArrM10422z2;
        this.f25917h = collection.size() + this.f25917h;
        return true;
    }
}
