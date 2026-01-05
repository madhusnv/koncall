package o2;

import androidx.fragment.app.C0351p;
import java.util.Arrays;
import java.util.ListIterator;
import k2.j1;
import kotlin.jvm.internal.AbstractC4154l;
import og.ja;
import og.ud;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.e */
/* loaded from: classes.dex */
public final class C5272e extends AbstractC5269b {

    /* renamed from: a */
    public final Object[] f25906a;

    /* renamed from: b */
    public final Object[] f25907b;

    /* renamed from: c */
    public final int f25908c;

    /* renamed from: d */
    public final int f25909d;

    public C5272e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f25906a = objArr;
        this.f25907b = objArr2;
        this.f25908c = i10;
        this.f25909d = i11;
        if (!(mo1628b() > 32)) {
            j1.m8542a("Trie-based persistent vector should have at least 33 elements, got " + mo1628b());
        }
        int length = objArr2.length;
    }

    /* renamed from: D */
    public static Object[] m10383D(Object[] objArr, int i10, int i11, Object obj) {
        int iM10707b = ja.m10707b(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iM10707b] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM10707b];
        AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iM10707b] = m10383D((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    /* renamed from: v */
    public static Object[] m10384v(Object[] objArr, int i10, int i11, Object obj, C5271d c5271d) {
        Object[] objArrCopyOf;
        int iM10707b = ja.m10707b(i11, i10);
        if (i10 == 0) {
            if (iM10707b == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            }
            AbstractC6662l.m12715e(iM10707b + 1, iM10707b, 31, objArr, objArrCopyOf);
            c5271d.f25905a = objArr[31];
            objArrCopyOf[iM10707b] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC4154l.m8922e(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iM10707b];
        AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iM10707b] = m10384v((Object[]) obj2, i12, i11, obj, c5271d);
        while (true) {
            iM10707b++;
            if (iM10707b >= 32 || objArrCopyOf2[iM10707b] == null) {
                break;
            }
            Object obj3 = objArr[iM10707b];
            AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iM10707b] = m10384v((Object[]) obj3, i12, 0, c5271d.f25905a, c5271d);
        }
        return objArrCopyOf2;
    }

    /* renamed from: x */
    public static Object[] m10385x(Object[] objArr, int i10, int i11, C5271d c5271d) {
        Object[] objArrM10385x;
        int iM10707b = ja.m10707b(i11, i10);
        if (i10 == 5) {
            c5271d.f25905a = objArr[iM10707b];
            objArrM10385x = null;
        } else {
            Object obj = objArr[iM10707b];
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM10385x = m10385x((Object[]) obj, i10 - 5, i11, c5271d);
        }
        if (objArrM10385x == null && iM10707b == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iM10707b] = objArrM10385x;
        return objArrCopyOf;
    }

    /* renamed from: A */
    public final Object[] m10386A(Object[] objArr, int i10, int i11, C5271d c5271d) {
        Object[] objArrCopyOf;
        int iM10707b = ja.m10707b(i11, i10);
        if (i10 == 0) {
            if (iM10707b == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            }
            AbstractC6662l.m12715e(iM10707b, iM10707b + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c5271d.f25905a;
            c5271d.f25905a = objArr[iM10707b];
            return objArrCopyOf;
        }
        int iM10707b2 = objArr[31] == null ? ja.m10707b(m10388C() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC4154l.m8922e(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iM10707b + 1;
        if (i13 <= iM10707b2) {
            while (true) {
                Object obj = objArrCopyOf2[iM10707b2];
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iM10707b2] = m10386A((Object[]) obj, i12, 0, c5271d);
                if (iM10707b2 == i13) {
                    break;
                }
                iM10707b2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM10707b];
        AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iM10707b] = m10386A((Object[]) obj2, i12, i11, c5271d);
        return objArrCopyOf2;
    }

    /* renamed from: B */
    public final AbstractC5269b m10387B(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f25908c - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f25907b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                AbstractC6662l.m12715e(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new C5272e(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC4154l.m8922e(objArr, "copyOf(...)");
            }
            return new C5276i(objArr);
        }
        C5271d c5271d = new C5271d((Object) null);
        Object[] objArrM10385x = m10385x(objArr, i11, i10 - 1, c5271d);
        AbstractC4154l.m8920c(objArrM10385x);
        Object obj = c5271d.f25905a;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrM10385x[1] != null) {
            return new C5272e(objArrM10385x, objArr3, i10, i11);
        }
        Object obj2 = objArrM10385x[0];
        AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C5272e((Object[]) obj2, objArr3, i10, i11 - 5);
    }

    /* renamed from: C */
    public final int m10388C() {
        return (this.f25908c - 1) & (-32);
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f25908c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        ud.m10975a(i10, mo1628b());
        if (m10388C() <= i10) {
            objArr = this.f25907b;
        } else {
            objArr = this.f25906a;
            for (int i11 = this.f25909d; i11 > 0; i11 -= 5) {
                Object obj = objArr[ja.m10707b(i10, i11)];
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // o2.AbstractC5269b
    /* renamed from: h */
    public final AbstractC5269b mo10376h(int i10, Object obj) {
        int i11 = this.f25908c;
        ud.m10976b(i10, i11);
        if (i10 == i11) {
            return mo10377j(obj);
        }
        int iM10388C = m10388C();
        Object[] objArr = this.f25906a;
        if (i10 >= iM10388C) {
            return m10389w(i10 - iM10388C, obj, objArr);
        }
        C5271d c5271d = new C5271d((Object) null);
        return m10389w(0, c5271d.f25905a, m10384v(objArr, this.f25909d, i10, obj, c5271d));
    }

    @Override // o2.AbstractC5269b
    /* renamed from: j */
    public final AbstractC5269b mo10377j(Object obj) {
        int iM10388C = m10388C();
        int i10 = this.f25908c;
        int i11 = i10 - iM10388C;
        Object[] objArr = this.f25906a;
        Object[] objArr2 = this.f25907b;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return m10390y(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = obj;
        return new C5272e(objArr, objArrCopyOf, i10 + 1, this.f25909d);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final ListIterator listIterator(int i10) {
        ud.m10976b(i10, this.f25908c);
        return new C5274g(i10, this.f25908c, (this.f25909d / 5) + 1, this.f25906a, this.f25907b);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: r */
    public final C5273f mo10379r() {
        return new C5273f(this, this.f25906a, this.f25907b, this.f25909d);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: s */
    public final AbstractC5269b mo10380s(C0351p c0351p) {
        C5273f c5273f = new C5273f(this, this.f25906a, this.f25907b, this.f25909d);
        c5273f.m10404L(c0351p);
        return c5273f.m10413j();
    }

    @Override // o2.AbstractC5269b
    /* renamed from: t */
    public final AbstractC5269b mo10381t(int i10) {
        ud.m10975a(i10, this.f25908c);
        int iM10388C = m10388C();
        Object[] objArr = this.f25906a;
        int i11 = this.f25909d;
        return i10 >= iM10388C ? m10387B(objArr, iM10388C, i11, i10 - iM10388C) : m10387B(m10386A(objArr, i11, i10, new C5271d(this.f25907b[0])), iM10388C, i11, 0);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: u */
    public final AbstractC5269b mo10382u(int i10, Object obj) {
        int i11 = this.f25908c;
        ud.m10975a(i10, i11);
        int iM10388C = m10388C();
        Object[] objArr = this.f25906a;
        Object[] objArr2 = this.f25907b;
        int i12 = this.f25909d;
        if (iM10388C > i10) {
            return new C5272e(m10383D(objArr, i12, i10, obj), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new C5272e(objArr, objArrCopyOf, i11, i12);
    }

    /* renamed from: w */
    public final C5272e m10389w(int i10, Object obj, Object[] objArr) {
        int iM10388C = m10388C();
        int i11 = this.f25908c;
        int i12 = i11 - iM10388C;
        Object[] objArr2 = this.f25907b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            AbstractC6662l.m12715e(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new C5272e(objArr, objArrCopyOf, i11 + 1, this.f25909d);
        }
        Object obj2 = objArr2[31];
        AbstractC6662l.m12715e(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m10390y(objArr, objArrCopyOf, objArr3);
    }

    /* renamed from: y */
    public final C5272e m10390y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f25908c;
        int i11 = i10 >> 5;
        int i12 = this.f25909d;
        if (i11 <= (1 << i12)) {
            return new C5272e(m10391z(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new C5272e(m10391z(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    /* renamed from: z */
    public final Object[] m10391z(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iM10707b = ja.m10707b(mo1628b() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iM10707b] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM10707b] = m10391z(i10 - 5, (Object[]) objArrCopyOf[iM10707b], objArr2);
        return objArrCopyOf;
    }
}
