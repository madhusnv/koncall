package p2;

import java.util.Arrays;
import k2.j1;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4264f;
import og.hb;
import pg.w9;
import r2.C6442a;
import r2.C6443b;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.k */
/* loaded from: classes.dex */
public final class C5799k {

    /* renamed from: e */
    public static final C5799k f28398e = new C5799k(0, 0, new Object[0], null);

    /* renamed from: a */
    public int f28399a;

    /* renamed from: b */
    public int f28400b;

    /* renamed from: c */
    public final C6443b f28401c;

    /* renamed from: d */
    public Object[] f28402d;

    public C5799k(int i10, int i11, Object[] objArr, C6443b c6443b) {
        this.f28399a = i10;
        this.f28400b = i11;
        this.f28401c = c6443b;
        this.f28402d = objArr;
    }

    /* renamed from: j */
    public static C5799k m11348j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, C6443b c6443b) {
        if (i12 > 30) {
            return new C5799k(0, 0, new Object[]{obj, obj2, obj3, obj4}, c6443b);
        }
        int iM10683d = hb.m10683d(i10, i12);
        int iM10683d2 = hb.m10683d(i11, i12);
        if (iM10683d != iM10683d2) {
            return new C5799k((1 << iM10683d) | (1 << iM10683d2), 0, iM10683d < iM10683d2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c6443b);
        }
        return new C5799k(0, 1 << iM10683d, new Object[]{m11348j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, c6443b)}, c6443b);
    }

    /* renamed from: a */
    public final Object[] m11349a(int i10, int i11, int i12, Object obj, Object obj2, int i13, C6443b c6443b) {
        Object obj3 = this.f28402d[i10];
        C5799k c5799kM11348j = m11348j(obj3 != null ? obj3.hashCode() : 0, obj3, m11371x(i10), i12, obj, obj2, i13 + 5, c6443b);
        int iM11367t = m11367t(i11);
        int i14 = iM11367t + 1;
        Object[] objArr = this.f28402d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC6662l.m12720j(0, i10, 6, objArr, objArr2);
        AbstractC6662l.m12715e(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iM11367t - 1] = c5799kM11348j;
        AbstractC6662l.m12715e(iM11367t, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* renamed from: b */
    public final int m11350b() {
        if (this.f28400b == 0) {
            return this.f28402d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f28399a);
        int length = this.f28402d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += m11366s(i10).m11350b();
        }
        return iBitCount;
    }

    /* renamed from: c */
    public final boolean m11351c(Object obj) {
        C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, this.f28402d.length));
        int i10 = c4264fM11917h.f21646a;
        int i11 = c4264fM11917h.f21647b;
        int i12 = c4264fM11917h.f21648c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!AbstractC4154l.m8918a(obj, this.f28402d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m11352d(int i10, Object obj, int i11) {
        int iM10683d = 1 << hb.m10683d(i10, i11);
        if (m11356h(iM10683d)) {
            return AbstractC4154l.m8918a(obj, this.f28402d[m11354f(iM10683d)]);
        }
        if (!m11357i(iM10683d)) {
            return false;
        }
        C5799k c5799kM11366s = m11366s(m11367t(iM10683d));
        return i11 == 30 ? c5799kM11366s.m11351c(obj) : c5799kM11366s.m11352d(i10, obj, i11 + 5);
    }

    /* renamed from: e */
    public final boolean m11353e(C5799k c5799k) {
        if (this == c5799k) {
            return true;
        }
        if (this.f28400b == c5799k.f28400b && this.f28399a == c5799k.f28399a) {
            int length = this.f28402d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f28402d[i10] == c5799k.f28402d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m11354f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f28399a) * 2;
    }

    /* renamed from: g */
    public final Object m11355g(int i10, Object obj, int i11) {
        int iM10683d = 1 << hb.m10683d(i10, i11);
        if (m11356h(iM10683d)) {
            int iM11354f = m11354f(iM10683d);
            if (AbstractC4154l.m8918a(obj, this.f28402d[iM11354f])) {
                return m11371x(iM11354f);
            }
            return null;
        }
        if (!m11357i(iM10683d)) {
            return null;
        }
        C5799k c5799kM11366s = m11366s(m11367t(iM10683d));
        if (i11 != 30) {
            return c5799kM11366s.m11355g(i10, obj, i11 + 5);
        }
        C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, c5799kM11366s.f28402d.length));
        int i12 = c4264fM11917h.f21646a;
        int i13 = c4264fM11917h.f21647b;
        int i14 = c4264fM11917h.f21648c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!AbstractC4154l.m8918a(obj, c5799kM11366s.f28402d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return c5799kM11366s.m11371x(i12);
    }

    /* renamed from: h */
    public final boolean m11356h(int i10) {
        return (i10 & this.f28399a) != 0;
    }

    /* renamed from: i */
    public final boolean m11357i(int i10) {
        return (i10 & this.f28400b) != 0;
    }

    /* renamed from: k */
    public final C5799k m11358k(int i10, C5792d c5792d) {
        c5792d.m11345d(c5792d.size() - 1);
        c5792d.f28385d = m11371x(i10);
        Object[] objArr = this.f28402d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f28401c != c5792d.f28383b) {
            return new C5799k(0, 0, hb.m10681b(i10, objArr), c5792d.f28383b);
        }
        this.f28402d = hb.m10681b(i10, objArr);
        return this;
    }

    /* renamed from: l */
    public final C5799k m11359l(int i10, Object obj, Object obj2, int i11, C5792d c5792d) {
        C5792d c5792d2;
        C5799k c5799kM11359l;
        int iM10683d = 1 << hb.m10683d(i10, i11);
        boolean zM11356h = m11356h(iM10683d);
        C6443b c6443b = this.f28401c;
        if (zM11356h) {
            int iM11354f = m11354f(iM10683d);
            if (!AbstractC4154l.m8918a(obj, this.f28402d[iM11354f])) {
                c5792d.m11345d(c5792d.size() + 1);
                C6443b c6443b2 = c5792d.f28383b;
                if (c6443b != c6443b2) {
                    return new C5799k(this.f28399a ^ iM10683d, this.f28400b | iM10683d, m11349a(iM11354f, iM10683d, i10, obj, obj2, i11, c6443b2), c6443b2);
                }
                this.f28402d = m11349a(iM11354f, iM10683d, i10, obj, obj2, i11, c6443b2);
                this.f28399a ^= iM10683d;
                this.f28400b |= iM10683d;
                return this;
            }
            c5792d.f28385d = m11371x(iM11354f);
            if (m11371x(iM11354f) == obj2) {
                return this;
            }
            if (c6443b == c5792d.f28383b) {
                this.f28402d[iM11354f + 1] = obj2;
                return this;
            }
            c5792d.f28386e++;
            Object[] objArr = this.f28402d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iM11354f + 1] = obj2;
            return new C5799k(this.f28399a, this.f28400b, objArrCopyOf, c5792d.f28383b);
        }
        if (!m11357i(iM10683d)) {
            c5792d.m11345d(c5792d.size() + 1);
            C6443b c6443b3 = c5792d.f28383b;
            int iM11354f2 = m11354f(iM10683d);
            if (c6443b != c6443b3) {
                return new C5799k(this.f28399a | iM10683d, this.f28400b, hb.m10680a(this.f28402d, iM11354f2, obj, obj2), c6443b3);
            }
            this.f28402d = hb.m10680a(this.f28402d, iM11354f2, obj, obj2);
            this.f28399a |= iM10683d;
            return this;
        }
        int iM11367t = m11367t(iM10683d);
        C5799k c5799kM11366s = m11366s(iM11367t);
        if (i11 == 30) {
            C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, c5799kM11366s.f28402d.length));
            int i12 = c4264fM11917h.f21646a;
            int i13 = c4264fM11917h.f21647b;
            int i14 = c4264fM11917h.f21648c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                c5792d.m11345d(c5792d.size() + 1);
                c5799kM11359l = new C5799k(0, 0, hb.m10680a(c5799kM11366s.f28402d, 0, obj, obj2), c5792d.f28383b);
                c5792d2 = c5792d;
            } else {
                while (!AbstractC4154l.m8918a(obj, c5799kM11366s.f28402d[i12])) {
                    if (i12 == i13) {
                        c5792d.m11345d(c5792d.size() + 1);
                        c5799kM11359l = new C5799k(0, 0, hb.m10680a(c5799kM11366s.f28402d, 0, obj, obj2), c5792d.f28383b);
                        break;
                    }
                    i12 += i14;
                }
                c5792d.f28385d = c5799kM11366s.m11371x(i12);
                if (c5799kM11366s.f28401c == c5792d.f28383b) {
                    c5799kM11366s.f28402d[i12 + 1] = obj2;
                    c5799kM11359l = c5799kM11366s;
                } else {
                    c5792d.f28386e++;
                    Object[] objArr2 = c5799kM11366s.f28402d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC4154l.m8922e(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i12 + 1] = obj2;
                    c5799kM11359l = new C5799k(0, 0, objArrCopyOf2, c5792d.f28383b);
                }
                c5792d2 = c5792d;
            }
        } else {
            c5792d2 = c5792d;
            c5799kM11359l = c5799kM11366s.m11359l(i10, obj, obj2, i11 + 5, c5792d2);
        }
        return c5799kM11366s == c5799kM11359l ? this : m11365r(iM11367t, c5799kM11359l, c5792d2.f28383b);
    }

    /* renamed from: m */
    public final C5799k m11360m(C5799k c5799k, int i10, C6442a c6442a, C5792d c5792d) {
        Object[] objArr;
        C5799k c5799kM11348j;
        C5792d c5792d2 = c5792d;
        if (this == c5799k) {
            c6442a.f31097a += m11350b();
            return this;
        }
        int i11 = 0;
        if (i10 > 30) {
            C6443b c6443b = c5792d2.f28383b;
            int i12 = c5799k.f28400b;
            Object[] objArr2 = this.f28402d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c5799k.f28402d.length);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            int length = this.f28402d.length;
            C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, c5799k.f28402d.length));
            int i13 = c4264fM11917h.f21646a;
            int i14 = c4264fM11917h.f21647b;
            int i15 = c4264fM11917h.f21648c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (m11351c(c5799k.f28402d[i13])) {
                        c6442a.f31097a++;
                    } else {
                        Object[] objArr3 = c5799k.f28402d;
                        objArrCopyOf[length] = objArr3[i13];
                        objArrCopyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f28402d.length) {
                if (length == c5799k.f28402d.length) {
                    return c5799k;
                }
                if (length == objArrCopyOf.length) {
                    return new C5799k(0, 0, objArrCopyOf, c6443b);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                AbstractC4154l.m8922e(objArrCopyOf2, "copyOf(...)");
                return new C5799k(0, 0, objArrCopyOf2, c6443b);
            }
        } else {
            int i16 = this.f28400b | c5799k.f28400b;
            int i17 = this.f28399a;
            int i18 = c5799k.f28399a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i20);
                if (AbstractC4154l.m8918a(this.f28402d[m11354f(iLowestOneBit)], c5799k.f28402d[c5799k.m11354f(iLowestOneBit)])) {
                    i21 |= iLowestOneBit;
                } else {
                    i16 |= iLowestOneBit;
                }
                i20 ^= iLowestOneBit;
            }
            if ((i16 & i21) != 0) {
                j1.m8543b("Check failed.");
            }
            C5799k c5799k2 = (AbstractC4154l.m8918a(this.f28401c, c5792d2.f28383b) && this.f28399a == i21 && this.f28400b == i16) ? this : new C5799k(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = c5799k2.f28402d;
                int length2 = (objArr4.length - 1) - i23;
                if (m11357i(iLowestOneBit2)) {
                    c5799kM11348j = m11366s(m11367t(iLowestOneBit2));
                    if (c5799k.m11357i(iLowestOneBit2)) {
                        c5799kM11348j = c5799kM11348j.m11360m(c5799k.m11366s(c5799k.m11367t(iLowestOneBit2)), i10 + 5, c6442a, c5792d2);
                        objArr = objArr4;
                    } else {
                        if (c5799k.m11356h(iLowestOneBit2)) {
                            int iM11354f = c5799k.m11354f(iLowestOneBit2);
                            Object obj = c5799k.f28402d[iM11354f];
                            Object objM11371x = c5799k.m11371x(iM11354f);
                            int size = c5792d2.size();
                            objArr = objArr4;
                            c5799kM11348j = c5799kM11348j.m11359l(obj != null ? obj.hashCode() : i11, obj, objM11371x, i10 + 5, c5792d2);
                            if (c5792d.size() == size) {
                                c6442a.f31097a++;
                            }
                        } else {
                            objArr = objArr4;
                        }
                        c5792d2 = c5792d;
                    }
                } else {
                    objArr = objArr4;
                    if (c5799k.m11357i(iLowestOneBit2)) {
                        C5799k c5799kM11366s = c5799k.m11366s(c5799k.m11367t(iLowestOneBit2));
                        if (m11356h(iLowestOneBit2)) {
                            int iM11354f2 = m11354f(iLowestOneBit2);
                            Object obj2 = this.f28402d[iM11354f2];
                            int i24 = i10 + 5;
                            if (c5799kM11366s.m11352d(obj2 != null ? obj2.hashCode() : 0, obj2, i24)) {
                                c6442a.f31097a++;
                                c5792d2 = c5792d;
                                c5799kM11348j = c5799kM11366s;
                            } else {
                                c5792d2 = c5792d;
                                c5799kM11348j = c5799kM11366s.m11359l(obj2 != null ? obj2.hashCode() : 0, obj2, m11371x(iM11354f2), i24, c5792d2);
                            }
                        } else {
                            c5792d2 = c5792d;
                            c5799kM11348j = c5799kM11366s;
                        }
                    } else {
                        c5792d2 = c5792d;
                        int iM11354f3 = m11354f(iLowestOneBit2);
                        Object obj3 = this.f28402d[iM11354f3];
                        Object objM11371x2 = m11371x(iM11354f3);
                        int iM11354f4 = c5799k.m11354f(iLowestOneBit2);
                        Object obj4 = c5799k.f28402d[iM11354f4];
                        c5799kM11348j = m11348j(obj3 != null ? obj3.hashCode() : 0, obj3, objM11371x2, obj4 != null ? obj4.hashCode() : 0, obj4, c5799k.m11371x(iM11354f4), i10 + 5, c5792d2.f28383b);
                    }
                }
                objArr[length2] = c5799kM11348j;
                i23++;
                i22 ^= iLowestOneBit2;
                i11 = 0;
            }
            int i25 = 0;
            while (i21 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i21);
                int i26 = i25 * 2;
                if (c5799k.m11356h(iLowestOneBit3)) {
                    int iM11354f5 = c5799k.m11354f(iLowestOneBit3);
                    Object[] objArr5 = c5799k2.f28402d;
                    objArr5[i26] = c5799k.f28402d[iM11354f5];
                    objArr5[i26 + 1] = c5799k.m11371x(iM11354f5);
                    if (m11356h(iLowestOneBit3)) {
                        c6442a.f31097a++;
                    }
                } else {
                    int iM11354f6 = m11354f(iLowestOneBit3);
                    Object[] objArr6 = c5799k2.f28402d;
                    objArr6[i26] = this.f28402d[iM11354f6];
                    objArr6[i26 + 1] = m11371x(iM11354f6);
                }
                i25++;
                i21 ^= iLowestOneBit3;
            }
            if (!m11353e(c5799k2)) {
                return c5799k.m11353e(c5799k2) ? c5799k : c5799k2;
            }
        }
        return this;
    }

    /* renamed from: n */
    public final C5799k m11361n(int i10, Object obj, int i11, C5792d c5792d) {
        C5799k c5799kM11361n;
        int iM10683d = 1 << hb.m10683d(i10, i11);
        if (m11356h(iM10683d)) {
            int iM11354f = m11354f(iM10683d);
            if (AbstractC4154l.m8918a(obj, this.f28402d[iM11354f])) {
                return m11363p(iM11354f, iM10683d, c5792d);
            }
        } else if (m11357i(iM10683d)) {
            int iM11367t = m11367t(iM10683d);
            C5799k c5799kM11366s = m11366s(iM11367t);
            if (i11 == 30) {
                C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, c5799kM11366s.f28402d.length));
                int i12 = c4264fM11917h.f21646a;
                int i13 = c4264fM11917h.f21647b;
                int i14 = c4264fM11917h.f21648c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    c5799kM11361n = c5799kM11366s;
                    break;
                }
                while (!AbstractC4154l.m8918a(obj, c5799kM11366s.f28402d[i12])) {
                    if (i12 == i13) {
                        c5799kM11361n = c5799kM11366s;
                        break;
                    }
                    i12 += i14;
                }
                c5799kM11361n = c5799kM11366s.m11358k(i12, c5792d);
            } else {
                c5799kM11361n = c5799kM11366s.m11361n(i10, obj, i11 + 5, c5792d);
            }
            return m11364q(c5799kM11366s, c5799kM11361n, iM11367t, iM10683d, c5792d.f28383b);
        }
        return this;
    }

    /* renamed from: o */
    public final C5799k m11362o(int i10, Object obj, Object obj2, int i11, C5792d c5792d) {
        C5799k c5799k;
        C5799k c5799kM11362o;
        int iM10683d = 1 << hb.m10683d(i10, i11);
        if (m11356h(iM10683d)) {
            int iM11354f = m11354f(iM10683d);
            if (AbstractC4154l.m8918a(obj, this.f28402d[iM11354f]) && AbstractC4154l.m8918a(obj2, m11371x(iM11354f))) {
                return m11363p(iM11354f, iM10683d, c5792d);
            }
        } else if (m11357i(iM10683d)) {
            int iM11367t = m11367t(iM10683d);
            C5799k c5799kM11366s = m11366s(iM11367t);
            if (i11 == 30) {
                C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, c5799kM11366s.f28402d.length));
                int i12 = c4264fM11917h.f21646a;
                int i13 = c4264fM11917h.f21647b;
                int i14 = c4264fM11917h.f21648c;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    c5799kM11362o = c5799kM11366s;
                    c5799k = c5799kM11366s;
                } else {
                    while (true) {
                        if (!AbstractC4154l.m8918a(obj, c5799kM11366s.f28402d[i12]) || !AbstractC4154l.m8918a(obj2, c5799kM11366s.m11371x(i12))) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            c5799kM11362o = c5799kM11366s.m11358k(i12, c5792d);
                            break;
                        }
                    }
                    c5799kM11362o = c5799kM11366s;
                    c5799k = c5799kM11366s;
                }
            } else {
                c5799k = c5799kM11366s;
                c5799kM11362o = c5799k.m11362o(i10, obj, obj2, i11 + 5, c5792d);
            }
            return m11364q(c5799k, c5799kM11362o, iM11367t, iM10683d, c5792d.f28383b);
        }
        return this;
    }

    /* renamed from: p */
    public final C5799k m11363p(int i10, int i11, C5792d c5792d) {
        c5792d.m11345d(c5792d.size() - 1);
        c5792d.f28385d = m11371x(i10);
        Object[] objArr = this.f28402d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f28401c != c5792d.f28383b) {
            return new C5799k(i11 ^ this.f28399a, this.f28400b, hb.m10681b(i10, objArr), c5792d.f28383b);
        }
        this.f28402d = hb.m10681b(i10, objArr);
        this.f28399a ^= i11;
        return this;
    }

    /* renamed from: q */
    public final C5799k m11364q(C5799k c5799k, C5799k c5799k2, int i10, int i11, C6443b c6443b) {
        C6443b c6443b2 = this.f28401c;
        if (c5799k2 != null) {
            return (c6443b2 == c6443b || c5799k != c5799k2) ? m11365r(i10, c5799k2, c6443b) : this;
        }
        Object[] objArr = this.f28402d;
        if (objArr.length == 1) {
            return null;
        }
        if (c6443b2 != c6443b) {
            return new C5799k(this.f28399a, i11 ^ this.f28400b, hb.m10682c(i10, objArr), c6443b);
        }
        this.f28402d = hb.m10682c(i10, objArr);
        this.f28400b ^= i11;
        return this;
    }

    /* renamed from: r */
    public final C5799k m11365r(int i10, C5799k c5799k, C6443b c6443b) {
        Object[] objArr = this.f28402d;
        if (objArr.length == 1 && c5799k.f28402d.length == 2 && c5799k.f28400b == 0) {
            c5799k.f28399a = this.f28400b;
            return c5799k;
        }
        if (this.f28401c == c6443b) {
            objArr[i10] = c5799k;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = c5799k;
        return new C5799k(this.f28399a, this.f28400b, objArrCopyOf, c6443b);
    }

    /* renamed from: s */
    public final C5799k m11366s(int i10) {
        Object obj = this.f28402d[i10];
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C5799k) obj;
    }

    /* renamed from: t */
    public final int m11367t(int i10) {
        return (this.f28402d.length - 1) - Integer.bitCount((i10 - 1) & this.f28400b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r14.f9606c = m11370w(r12, r4, (p2.C5799k) r14.f9606c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        return r14;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ee.C2039g m11368u(java.lang.Object r12, int r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C5799k.m11368u(java.lang.Object, int, java.lang.Object, int):ee.g");
    }

    /* renamed from: v */
    public final C5799k m11369v(int i10, Object obj, int i11) {
        C5799k c5799kM11369v;
        int iM10683d = 1 << hb.m10683d(i10, i11);
        if (m11356h(iM10683d)) {
            int iM11354f = m11354f(iM10683d);
            if (AbstractC4154l.m8918a(obj, this.f28402d[iM11354f])) {
                Object[] objArr = this.f28402d;
                if (objArr.length != 2) {
                    return new C5799k(this.f28399a ^ iM10683d, this.f28400b, hb.m10681b(iM11354f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (m11357i(iM10683d)) {
            int iM11367t = m11367t(iM10683d);
            C5799k c5799kM11366s = m11366s(iM11367t);
            if (i11 == 30) {
                C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, c5799kM11366s.f28402d.length));
                int i12 = c4264fM11917h.f21646a;
                int i13 = c4264fM11917h.f21647b;
                int i14 = c4264fM11917h.f21648c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!AbstractC4154l.m8918a(obj, c5799kM11366s.f28402d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = c5799kM11366s.f28402d;
                    c5799kM11369v = objArr2.length == 2 ? null : new C5799k(0, 0, hb.m10681b(i12, objArr2), null);
                }
                c5799kM11369v = c5799kM11366s;
                break;
            }
            c5799kM11369v = c5799kM11366s.m11369v(i10, obj, i11 + 5);
            if (c5799kM11369v == null) {
                Object[] objArr3 = this.f28402d;
                if (objArr3.length != 1) {
                    return new C5799k(this.f28399a, iM10683d ^ this.f28400b, hb.m10682c(iM11367t, objArr3), null);
                }
                return null;
            }
            if (c5799kM11366s != c5799kM11369v) {
                return m11370w(iM11367t, iM10683d, c5799kM11369v);
            }
        }
        return this;
    }

    /* renamed from: w */
    public final C5799k m11370w(int i10, int i11, C5799k c5799k) {
        Object[] objArr = c5799k.f28402d;
        if (objArr.length != 2 || c5799k.f28400b != 0) {
            Object[] objArr2 = this.f28402d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = c5799k;
            return new C5799k(this.f28399a, this.f28400b, objArrCopyOf, null);
        }
        if (this.f28402d.length == 1) {
            c5799k.f28399a = this.f28400b;
            return c5799k;
        }
        int iM11354f = m11354f(i11);
        Object[] objArr3 = this.f28402d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC4154l.m8922e(objArrCopyOf2, "copyOf(...)");
        AbstractC6662l.m12715e(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        AbstractC6662l.m12715e(iM11354f + 2, iM11354f, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iM11354f] = obj;
        objArrCopyOf2[iM11354f + 1] = obj2;
        return new C5799k(this.f28399a ^ i11, i11 ^ this.f28400b, objArrCopyOf2, null);
    }

    /* renamed from: x */
    public final Object m11371x(int i10) {
        return this.f28402d[i10 + 1];
    }
}
