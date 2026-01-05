package k2;

import e1.C1921w;
import e1.C1922x;
import f1.AbstractC2176a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a */
    public final v1 f20610a;

    /* renamed from: b */
    public int[] f20611b;

    /* renamed from: c */
    public Object[] f20612c;

    /* renamed from: d */
    public ArrayList f20613d;

    /* renamed from: e */
    public HashMap f20614e;

    /* renamed from: f */
    public C1922x f20615f;

    /* renamed from: g */
    public int f20616g;

    /* renamed from: h */
    public int f20617h;

    /* renamed from: i */
    public int f20618i;

    /* renamed from: j */
    public int f20619j;

    /* renamed from: k */
    public int f20620k;

    /* renamed from: l */
    public int f20621l;

    /* renamed from: m */
    public int f20622m;

    /* renamed from: n */
    public int f20623n;

    /* renamed from: o */
    public int f20624o;

    /* renamed from: p */
    public final l0 f20625p;

    /* renamed from: q */
    public final l0 f20626q;

    /* renamed from: r */
    public final l0 f20627r;

    /* renamed from: s */
    public C1922x f20628s;

    /* renamed from: t */
    public int f20629t;

    /* renamed from: u */
    public int f20630u;

    /* renamed from: v */
    public int f20631v;

    /* renamed from: w */
    public boolean f20632w;

    /* renamed from: x */
    public C1921w f20633x;

    public y1(v1 v1Var) {
        this.f20610a = v1Var;
        int[] iArr = v1Var.f20593a;
        this.f20611b = iArr;
        Object[] objArr = v1Var.f20595c;
        this.f20612c = objArr;
        this.f20613d = v1Var.f20601j;
        this.f20614e = v1Var.f20602k;
        this.f20615f = v1Var.f20603l;
        int i10 = v1Var.f20594b;
        this.f20616g = i10;
        this.f20617h = (iArr.length / 5) - i10;
        int i11 = v1Var.f20596d;
        this.f20620k = i11;
        this.f20621l = objArr.length - i11;
        this.f20622m = i10;
        this.f20625p = new l0();
        this.f20626q = new l0();
        this.f20627r = new l0();
        this.f20630u = i10;
        this.f20631v = -1;
    }

    /* renamed from: h */
    public static int m8711h(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    /* renamed from: x */
    public static void m8712x(y1 y1Var) {
        int i10 = y1Var.f20631v;
        int iM8747q = y1Var.m8747q(i10);
        int[] iArr = y1Var.f20611b;
        int i11 = (iM8747q * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        y1Var.m8730R(y1Var.m8715C(i10, iArr));
    }

    /* renamed from: A */
    public final void m8713A(int i10, int i11) {
        int i12 = this.f20621l;
        int i13 = this.f20620k;
        int i14 = this.f20622m;
        if (i13 != i10) {
            Object[] objArr = this.f20612c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, m8744n());
        if (i14 != iMin) {
            int length = this.f20612c.length - i12;
            if (iMin < i14) {
                int iM8747q = m8747q(iMin);
                int iM8747q2 = m8747q(i14);
                int i16 = this.f20616g;
                while (iM8747q < iM8747q2) {
                    int i17 = (iM8747q * 5) + 4;
                    int i18 = this.f20611b[i17];
                    if (!(i18 >= 0)) {
                        AbstractC3967p.m8636c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f20611b[i17] = -((length - i18) + 1);
                    iM8747q++;
                    if (iM8747q == i16) {
                        iM8747q += this.f20617h;
                    }
                }
            } else {
                int iM8747q3 = m8747q(i14);
                int iM8747q4 = m8747q(iMin);
                while (iM8747q3 < iM8747q4) {
                    int i19 = (iM8747q3 * 5) + 4;
                    int i20 = this.f20611b[i19];
                    if (!(i20 < 0)) {
                        AbstractC3967p.m8636c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f20611b[i19] = i20 + length + 1;
                    iM8747q3++;
                    if (iM8747q3 == this.f20616g) {
                        iM8747q3 += this.f20617h;
                    }
                }
            }
            this.f20622m = iMin;
        }
        this.f20620k = i10;
    }

    /* renamed from: B */
    public final Object m8714B(int i10) {
        int iM8747q = m8747q(i10);
        int[] iArr = this.f20611b;
        if ((iArr[(iM8747q * 5) + 1] & 1073741824) != 0) {
            return this.f20612c[m8738g(m8737f(iM8747q, iArr))];
        }
        return null;
    }

    /* renamed from: C */
    public final int m8715C(int i10, int[] iArr) {
        int i11 = iArr[(m8747q(i10) * 5) + 2];
        return i11 > -2 ? i11 : (m8744n() + i11) - (-2);
    }

    /* renamed from: D */
    public final Object m8716D(Object obj) {
        if (this.f20623n > 0) {
            m8752v(1, this.f20631v);
        }
        Object[] objArr = this.f20612c;
        int i10 = this.f20618i;
        this.f20618i = i10 + 1;
        Object obj2 = objArr[m8738g(i10)];
        if (this.f20618i > this.f20619j) {
            AbstractC3967p.m8636c("Writing to an invalid slot");
        }
        this.f20612c[m8738g(this.f20618i - 1)] = obj;
        return obj2;
    }

    /* renamed from: E */
    public final void m8717E() {
        int i10;
        C1921w c1921w = this.f20633x;
        if (c1921w != null) {
            while (c1921w.f9077b != 0) {
                int iM8523z = C3953b.m8523z(c1921w);
                int iM8747q = m8747q(iM8523z);
                int iM8749s = iM8523z + 1;
                int iM8749s2 = m8749s(iM8523z) + iM8523z;
                while (true) {
                    if (iM8749s >= iM8749s2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f20611b[(m8747q(iM8749s) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iM8749s += m8749s(iM8749s);
                    }
                }
                int[] iArr = this.f20611b;
                int i11 = (iM8747q * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iM8715C = m8715C(iM8523z, iArr);
                    if (iM8715C >= 0) {
                        C3953b.m8506i(c1921w, iM8715C);
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final boolean m8718F() {
        C3952a c3952aM8728P;
        if (this.f20623n != 0) {
            AbstractC3967p.m8636c("Cannot remove group while inserting");
        }
        int i10 = this.f20629t;
        int i11 = this.f20618i;
        int iM8737f = m8737f(m8747q(i10), this.f20611b);
        int iM8721I = m8721I();
        int i12 = this.f20631v;
        HashMap map = this.f20614e;
        if (map != null && (c3952aM8728P = m8728P(i12)) != null) {
        }
        C1921w c1921w = this.f20633x;
        if (c1921w != null) {
            while (true) {
                int i13 = c1921w.f9077b;
                if (i13 == 0) {
                    break;
                }
                if (i13 == 0) {
                    AbstractC2176a.m5864e("IntList is empty.");
                    throw null;
                }
                if (c1921w.f9076a[0] < i10) {
                    break;
                }
                C3953b.m8523z(c1921w);
            }
        }
        boolean zM8719G = m8719G(i10, this.f20629t - i10);
        m8720H(iM8737f, this.f20618i - iM8737f, i10 - 1);
        this.f20629t = i10;
        this.f20618i = i11;
        this.f20624o -= iM8721I;
        return zM8719G;
    }

    /* renamed from: G */
    public final boolean m8719G(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f20613d;
            m8755z(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f20614e;
                int i12 = i10 + i11;
                int iM8706b = x1.m8706b(this.f20613d, i12, m8743m() - this.f20617h);
                if (iM8706b >= this.f20613d.size()) {
                    iM8706b--;
                }
                int i13 = iM8706b + 1;
                int i14 = 0;
                while (iM8706b >= 0) {
                    C3952a c3952a = (C3952a) this.f20613d.get(iM8706b);
                    int iM8734c = m8734c(c3952a);
                    if (iM8734c < i10) {
                        break;
                    }
                    if (iM8734c < i12) {
                        c3952a.f20343a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iM8706b + 1;
                        }
                        i13 = iM8706b;
                    }
                    iM8706b--;
                }
                z = i13 < i14;
                if (z) {
                    this.f20613d.subList(i13, i14).clear();
                }
            }
            this.f20616g = i10;
            this.f20617h += i11;
            int i15 = this.f20622m;
            if (i15 > i10) {
                this.f20622m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f20630u;
            if (i16 >= this.f20616g) {
                this.f20630u = i16 - i11;
            }
            int i17 = this.f20631v;
            if (i17 >= 0 && (this.f20611b[(m8747q(i17) * 5) + 1] & 67108864) != 0) {
                m8730R(i17);
            }
        }
        return z;
    }

    /* renamed from: H */
    public final void m8720H(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f20621l;
            int i14 = i10 + i11;
            m8713A(i14, i12);
            this.f20620k = i10;
            this.f20621l = i13 + i11;
            AbstractC6662l.m12726p(this.f20612c, i10, i14, null);
            int i15 = this.f20619j;
            if (i15 >= i10) {
                this.f20619j = i15 - i11;
            }
        }
    }

    /* renamed from: I */
    public final int m8721I() {
        int iM8747q = m8747q(this.f20629t);
        int iM8705a = x1.m8705a(iM8747q, this.f20611b) + this.f20629t;
        this.f20629t = iM8705a;
        this.f20618i = m8737f(m8747q(iM8705a), this.f20611b);
        int i10 = this.f20611b[(iM8747q * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    /* renamed from: J */
    public final void m8722J() {
        int i10 = this.f20630u;
        this.f20629t = i10;
        this.f20618i = m8737f(m8747q(i10), this.f20611b);
    }

    /* renamed from: K */
    public final int m8723K(int i10, int[] iArr) {
        if (i10 >= m8743m()) {
            return this.f20612c.length - this.f20621l;
        }
        int iM8707c = x1.m8707c(i10, iArr);
        return iM8707c < 0 ? (this.f20612c.length - this.f20621l) + iM8707c + 1 : iM8707c;
    }

    /* renamed from: L */
    public final int m8724L(int i10, int i11) {
        int iM8723K = m8723K(m8747q(i10), this.f20611b);
        int i12 = iM8723K + i11;
        if (!(i12 >= iM8723K && i12 < m8737f(m8747q(i10 + 1), this.f20611b))) {
            AbstractC3967p.m8636c("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    /* renamed from: M */
    public final int m8725M(int i10) {
        return m8737f(m8747q(m8749s(i10) + i10), this.f20611b);
    }

    /* renamed from: N */
    public final void m8726N() {
        if (this.f20623n != 0) {
            AbstractC3967p.m8636c("Key must be supplied when inserting");
        }
        s0 s0Var = C3961j.f20408a;
        m8727O(0, s0Var, s0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public final void m8727O(int i10, Object obj, Object obj2, boolean z6) {
        int i11;
        HashMap map;
        C3952a c3952aM8728P;
        int i12 = this.f20631v;
        Object[] objArr = this.f20623n > 0;
        this.f20627r.m8549c(this.f20624o);
        s0 s0Var = C3961j.f20408a;
        if (objArr == true) {
            int i13 = this.f20629t;
            int iM8737f = m8737f(m8747q(i13), this.f20611b);
            m8751u(1);
            this.f20618i = iM8737f;
            this.f20619j = iM8737f;
            int iM8747q = m8747q(i13);
            int i14 = obj != s0Var ? 1 : 0;
            int i15 = (z6 || obj2 == s0Var) ? 0 : 1;
            int iM8711h = m8711h(iM8737f, this.f20620k, this.f20621l, this.f20612c.length);
            if (iM8711h >= 0 && this.f20622m < i13) {
                iM8711h = -(((this.f20612c.length - this.f20621l) - iM8711h) + 1);
            }
            int[] iArr = this.f20611b;
            int i16 = this.f20631v;
            int i17 = iM8747q * 5;
            iArr[i17] = i10;
            iArr[i17 + 1] = ((z6 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = iM8711h;
            int i18 = (z6 ? 1 : 0) + i14 + i15;
            if (i18 > 0) {
                m8752v(i18, i13);
                Object[] objArr2 = this.f20612c;
                int i19 = this.f20618i;
                if (z6) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i14 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i15 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f20618i = i19;
            }
            this.f20624o = 0;
            i11 = i13 + 1;
            this.f20631v = i13;
            this.f20629t = i11;
            if (i12 >= 0 && (map = this.f20614e) != null && (c3952aM8728P = m8728P(i12)) != null) {
            }
        } else {
            this.f20625p.m8549c(i12);
            this.f20626q.m8549c((m8743m() - this.f20617h) - this.f20630u);
            int i20 = this.f20629t;
            int iM8747q2 = m8747q(i20);
            if (!AbstractC4154l.m8918a(obj2, s0Var)) {
                if (z6) {
                    m8731S(this.f20629t, obj2);
                } else {
                    m8729Q(obj2);
                }
            }
            this.f20618i = m8723K(iM8747q2, this.f20611b);
            this.f20619j = m8737f(m8747q(this.f20629t + 1), this.f20611b);
            int[] iArr2 = this.f20611b;
            int i21 = iM8747q2 * 5;
            this.f20624o = iArr2[i21 + 1] & 67108863;
            this.f20631v = i20;
            this.f20629t = i20 + 1;
            i11 = i20 + iArr2[i21 + 3];
        }
        this.f20630u = i11;
    }

    /* renamed from: P */
    public final C3952a m8728P(int i10) {
        ArrayList arrayList;
        int iM8709e;
        if (i10 < 0 || i10 >= m8744n() || (iM8709e = x1.m8709e((arrayList = this.f20613d), i10, m8744n())) < 0) {
            return null;
        }
        return (C3952a) arrayList.get(iM8709e);
    }

    /* renamed from: Q */
    public final void m8729Q(Object obj) {
        int iM8747q = m8747q(this.f20629t);
        int i10 = (iM8747q * 5) + 1;
        if ((this.f20611b[i10] & 268435456) == 0) {
            AbstractC3967p.m8636c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f20612c;
        int[] iArr = this.f20611b;
        objArr[m8738g(Integer.bitCount(iArr[i10] >> 29) + m8737f(iM8747q, iArr))] = obj;
    }

    /* renamed from: R */
    public final void m8730R(int i10) {
        if (i10 >= 0) {
            C1921w c1921w = this.f20633x;
            if (c1921w == null) {
                c1921w = new C1921w();
                this.f20633x = c1921w;
            }
            C3953b.m8506i(c1921w, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8731S(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.m8747q(r5)
            int[] r1 = r4.f20611b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            k2.AbstractC3967p.m8636c(r5)
        L2e:
            java.lang.Object[] r5 = r4.f20612c
            int[] r1 = r4.f20611b
            int r0 = r4.m8737f(r0, r1)
            int r0 = r4.m8738g(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.y1.m8731S(int, java.lang.Object):void");
    }

    /* renamed from: a */
    public final void m8732a(int i10) {
        boolean z6 = false;
        if (!(i10 >= 0)) {
            AbstractC3967p.m8636c("Cannot seek backwards");
        }
        if (!(this.f20623n <= 0)) {
            j1.m8543b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f20629t + i10;
        if (i11 >= this.f20631v && i11 <= this.f20630u) {
            z6 = true;
        }
        if (!z6) {
            AbstractC3967p.m8636c("Cannot seek outside the current group (" + this.f20631v + '-' + this.f20630u + ')');
        }
        this.f20629t = i11;
        int iM8737f = m8737f(m8747q(i11), this.f20611b);
        this.f20618i = iM8737f;
        this.f20619j = iM8737f;
    }

    /* renamed from: b */
    public final C3952a m8733b(int i10) {
        ArrayList arrayList = this.f20613d;
        int iM8709e = x1.m8709e(arrayList, i10, m8744n());
        if (iM8709e >= 0) {
            return (C3952a) arrayList.get(iM8709e);
        }
        if (i10 > this.f20616g) {
            i10 = -(m8744n() - i10);
        }
        C3952a c3952a = new C3952a(i10);
        arrayList.add(-(iM8709e + 1), c3952a);
        return c3952a;
    }

    /* renamed from: c */
    public final int m8734c(C3952a c3952a) {
        int i10 = c3952a.f20343a;
        return i10 < 0 ? m8744n() + i10 : i10;
    }

    /* renamed from: d */
    public final void m8735d() {
        int i10 = this.f20623n;
        this.f20623n = i10 + 1;
        if (i10 == 0) {
            this.f20626q.m8549c((m8743m() - this.f20617h) - this.f20630u);
        }
    }

    /* renamed from: e */
    public final void m8736e(boolean z6) {
        this.f20632w = true;
        if (z6 && this.f20625p.f20420b == 0) {
            m8755z(m8744n());
            m8713A(this.f20612c.length - this.f20621l, this.f20616g);
            int i10 = this.f20620k;
            Arrays.fill(this.f20612c, i10, this.f20621l + i10, (Object) null);
            m8717E();
        }
        int[] iArr = this.f20611b;
        int i11 = this.f20616g;
        Object[] objArr = this.f20612c;
        int i12 = this.f20620k;
        ArrayList arrayList = this.f20613d;
        HashMap map = this.f20614e;
        C1922x c1922x = this.f20615f;
        v1 v1Var = this.f20610a;
        if (!v1Var.f20599g) {
            j1.m8542a("Unexpected writer close()");
        }
        v1Var.f20599g = false;
        v1Var.f20593a = iArr;
        v1Var.f20594b = i11;
        v1Var.f20595c = objArr;
        v1Var.f20596d = i12;
        v1Var.f20601j = arrayList;
        v1Var.f20602k = map;
        v1Var.f20603l = c1922x;
    }

    /* renamed from: f */
    public final int m8737f(int i10, int[] iArr) {
        if (i10 >= m8743m()) {
            return this.f20612c.length - this.f20621l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f20612c.length - this.f20621l) + i11 + 1 : i11;
    }

    /* renamed from: g */
    public final int m8738g(int i10) {
        return (this.f20621l * (i10 < this.f20620k ? 0 : 1)) + i10;
    }

    /* renamed from: i */
    public final void m8739i() {
        e1.e0 e0Var;
        boolean z6 = this.f20623n > 0;
        int i10 = this.f20629t;
        int i11 = this.f20630u;
        int i12 = this.f20631v;
        int iM8747q = m8747q(i12);
        int i13 = this.f20624o;
        int i14 = i10 - i12;
        int i15 = iM8747q * 5;
        int i16 = i15 + 1;
        boolean z10 = (this.f20611b[i16] & 1073741824) != 0;
        l0 l0Var = this.f20627r;
        if (z6) {
            C1922x c1922x = this.f20628s;
            if (c1922x != null && (e0Var = (e1.e0) c1922x.m5595b(i12)) != null) {
                Object[] objArr = e0Var.f8956a;
                int i17 = e0Var.f8957b;
                for (int i18 = 0; i18 < i17; i18++) {
                    m8716D(objArr[i18]);
                }
            }
            int[] iArr = this.f20611b;
            iArr[i15 + 3] = i14;
            x1.m8708d(iM8747q, i13, iArr);
            int iM8548b = l0Var.m8548b();
            if (z10) {
                i13 = 1;
            }
            this.f20624o = iM8548b + i13;
            int iM8715C = m8715C(i12, this.f20611b);
            this.f20631v = iM8715C;
            int iM8744n = iM8715C < 0 ? m8744n() : m8747q(iM8715C + 1);
            int iM8737f = iM8744n >= 0 ? m8737f(iM8744n, this.f20611b) : 0;
            this.f20618i = iM8737f;
            this.f20619j = iM8737f;
            return;
        }
        if (i10 != i11) {
            AbstractC3967p.m8636c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f20611b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        x1.m8708d(iM8747q, i13, iArr2);
        int iM8548b2 = this.f20625p.m8548b();
        this.f20630u = (m8743m() - this.f20617h) - this.f20626q.m8548b();
        this.f20631v = iM8548b2;
        int iM8715C2 = m8715C(i12, this.f20611b);
        int iM8548b3 = l0Var.m8548b();
        this.f20624o = iM8548b3;
        if (iM8715C2 == iM8548b2) {
            this.f20624o = iM8548b3 + (z10 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z10 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iM8715C2 != 0 && iM8715C2 != iM8548b2 && (i23 != 0 || i22 != 0)) {
                int iM8747q2 = m8747q(iM8715C2);
                if (i22 != 0) {
                    int[] iArr3 = this.f20611b;
                    int i24 = (iM8747q2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f20611b;
                    x1.m8708d(iM8747q2, (iArr4[(iM8747q2 * 5) + 1] & 67108863) + i23, iArr4);
                }
                int[] iArr5 = this.f20611b;
                if ((iArr5[(iM8747q2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iM8715C2 = m8715C(iM8715C2, iArr5);
            }
        }
        this.f20624o += i23;
    }

    /* renamed from: j */
    public final void m8740j() {
        if (this.f20623n <= 0) {
            j1.m8543b("Unbalanced begin/end insert");
        }
        int i10 = this.f20623n - 1;
        this.f20623n = i10;
        if (i10 == 0) {
            if (this.f20627r.f20420b != this.f20625p.f20420b) {
                AbstractC3967p.m8636c("startGroup/endGroup mismatch while inserting");
            }
            this.f20630u = (m8743m() - this.f20617h) - this.f20626q.m8548b();
        }
    }

    /* renamed from: k */
    public final void m8741k(int i10) {
        boolean z6 = false;
        if (!(this.f20623n <= 0)) {
            AbstractC3967p.m8636c("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f20631v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f20630u) {
                z6 = true;
            }
            if (!z6) {
                AbstractC3967p.m8636c("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f20629t;
            int i13 = this.f20618i;
            int i14 = this.f20619j;
            this.f20629t = i10;
            m8726N();
            this.f20629t = i12;
            this.f20618i = i13;
            this.f20619j = i14;
        }
    }

    /* renamed from: l */
    public final void m8742l(int i10, int i11, int i12) {
        if (i10 >= this.f20616g) {
            i10 = -((m8744n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f20611b[(m8747q(i12) * 5) + 2] = i10;
            int i13 = this.f20611b[(m8747q(i12) * 5) + 3] + i12;
            m8742l(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    /* renamed from: m */
    public final int m8743m() {
        return this.f20611b.length / 5;
    }

    /* renamed from: n */
    public final int m8744n() {
        return m8743m() - this.f20617h;
    }

    /* renamed from: o */
    public final int m8745o() {
        return this.f20612c.length - this.f20621l;
    }

    /* renamed from: p */
    public final Object m8746p(int i10) {
        int iM8747q = m8747q(i10);
        int[] iArr = this.f20611b;
        int i11 = (iM8747q * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return C3961j.f20408a;
        }
        return this.f20612c[Integer.bitCount(iArr[i11] >> 29) + m8737f(iM8747q, iArr)];
    }

    /* renamed from: q */
    public final int m8747q(int i10) {
        return (this.f20617h * (i10 < this.f20616g ? 0 : 1)) + i10;
    }

    /* renamed from: r */
    public final Object m8748r(int i10) {
        int iM8747q = m8747q(i10);
        int[] iArr = this.f20611b;
        int i11 = iM8747q * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f20612c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    /* renamed from: s */
    public final int m8749s(int i10) {
        return x1.m8705a(m8747q(i10), this.f20611b);
    }

    /* renamed from: t */
    public final boolean m8750t(int i10, int i11) {
        int iM8743m;
        int iM8749s;
        if (i11 == this.f20631v) {
            iM8743m = this.f20630u;
        } else {
            l0 l0Var = this.f20625p;
            if (i11 > l0Var.m8547a(0)) {
                iM8749s = m8749s(i11);
            } else {
                int[] iArr = l0Var.f20419a;
                int iMin = Math.min(iArr.length, l0Var.f20420b);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iM8749s = m8749s(i11);
                } else {
                    iM8743m = (m8743m() - this.f20617h) - this.f20626q.f20419a[i12];
                }
            }
            iM8743m = iM8749s + i11;
        }
        return i10 > i11 && i10 < iM8743m;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f20629t + " end=" + this.f20630u + " size = " + m8744n() + " gap=" + this.f20616g + '-' + (this.f20616g + this.f20617h) + ')';
    }

    /* renamed from: u */
    public final void m8751u(int i10) {
        if (i10 > 0) {
            int i11 = this.f20629t;
            m8755z(i11);
            int i12 = this.f20616g;
            int i13 = this.f20617h;
            int[] iArr = this.f20611b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC6662l.m12717g(0, iArr, 0, i12 * 5, iArr2);
                AbstractC6662l.m12717g((i12 + i15) * 5, iArr, (i13 + i12) * 5, length * 5, iArr2);
                this.f20611b = iArr2;
                i13 = i15;
            }
            int i16 = this.f20630u;
            if (i16 >= i12) {
                this.f20630u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f20616g = i17;
            this.f20617h = i13 - i10;
            int iM8711h = m8711h(i14 > 0 ? m8737f(m8747q(i11 + i10), this.f20611b) : 0, this.f20622m >= i12 ? this.f20620k : 0, this.f20621l, this.f20612c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f20611b[(i18 * 5) + 4] = iM8711h;
            }
            int i19 = this.f20622m;
            if (i19 >= i12) {
                this.f20622m = i19 + i10;
            }
        }
    }

    /* renamed from: v */
    public final void m8752v(int i10, int i11) {
        if (i10 > 0) {
            m8713A(this.f20618i, i11);
            int i12 = this.f20620k;
            int i13 = this.f20621l;
            if (i13 < i10) {
                Object[] objArr = this.f20612c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f20612c = objArr2;
                i13 = i16;
            }
            int i18 = this.f20619j;
            if (i18 >= i12) {
                this.f20619j = i18 + i10;
            }
            this.f20620k = i12 + i10;
            this.f20621l = i13 - i10;
        }
    }

    /* renamed from: w */
    public final boolean m8753w(int i10) {
        return (this.f20611b[(m8747q(i10) * 5) + 1] & 1073741824) != 0;
    }

    /* renamed from: y */
    public final void m8754y(v1 v1Var, int i10) {
        if (this.f20623n <= 0) {
            AbstractC3967p.m8636c("Check failed");
        }
        if (i10 == 0 && this.f20629t == 0 && this.f20610a.f20594b == 0) {
            int[] iArr = v1Var.f20593a;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = v1Var.f20594b;
            if (i11 == i12) {
                int[] iArr2 = this.f20611b;
                Object[] objArr = this.f20612c;
                ArrayList arrayList = this.f20613d;
                HashMap map = this.f20614e;
                C1922x c1922x = this.f20615f;
                Object[] objArr2 = v1Var.f20595c;
                int i13 = v1Var.f20596d;
                HashMap map2 = v1Var.f20602k;
                C1922x c1922x2 = v1Var.f20603l;
                this.f20611b = iArr;
                this.f20612c = objArr2;
                this.f20613d = v1Var.f20601j;
                this.f20616g = i12;
                this.f20617h = (iArr.length / 5) - i12;
                this.f20620k = i13;
                this.f20621l = objArr2.length - i13;
                this.f20622m = i12;
                this.f20614e = map2;
                this.f20615f = c1922x2;
                v1Var.f20593a = iArr2;
                v1Var.f20594b = 0;
                v1Var.f20595c = objArr;
                v1Var.f20596d = 0;
                v1Var.f20601j = arrayList;
                v1Var.f20602k = map;
                v1Var.f20603l = c1922x;
                return;
            }
        }
        y1 y1VarM8703q = v1Var.m8703q();
        try {
            C3953b.m8516s(y1VarM8703q, i10, this, true, true, false);
            y1VarM8703q.m8736e(true);
        } catch (Throwable th2) {
            y1VarM8703q.m8736e(false);
            throw th2;
        }
    }

    /* renamed from: z */
    public final void m8755z(int i10) {
        C3952a c3952a;
        int i11;
        C3952a c3952a2;
        int i12;
        int i13;
        int i14 = this.f20617h;
        int i15 = this.f20616g;
        if (i15 != i10) {
            if (!this.f20613d.isEmpty()) {
                int iM8743m = m8743m() - this.f20617h;
                if (i15 < i10) {
                    for (int iM8706b = x1.m8706b(this.f20613d, i15, iM8743m); iM8706b < this.f20613d.size() && (i12 = (c3952a2 = (C3952a) this.f20613d.get(iM8706b)).f20343a) < 0 && (i13 = i12 + iM8743m) < i10; iM8706b++) {
                        c3952a2.f20343a = i13;
                    }
                } else {
                    for (int iM8706b2 = x1.m8706b(this.f20613d, i10, iM8743m); iM8706b2 < this.f20613d.size() && (i11 = (c3952a = (C3952a) this.f20613d.get(iM8706b2)).f20343a) >= 0; iM8706b2++) {
                        c3952a.f20343a = -(iM8743m - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f20611b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    AbstractC6662l.m12717g(i17 + i16, iArr, i16, i18, iArr);
                } else {
                    AbstractC6662l.m12717g(i18, iArr, i18 + i17, i16 + i17, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iM8743m2 = m8743m();
            if (i15 >= iM8743m2) {
                AbstractC3967p.m8636c("Check failed");
            }
            while (i15 < iM8743m2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f20611b[i19];
                int iM8744n = i20 > -2 ? i20 : (m8744n() + i20) - (-2);
                if (iM8744n >= i10) {
                    iM8744n = -((m8744n() - iM8744n) - (-2));
                }
                if (iM8744n != i20) {
                    this.f20611b[i19] = iM8744n;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f20616g = i10;
    }
}
