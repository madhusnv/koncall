package sw;

import fx.InterfaceC2399e;
import i0.m0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.zf;
import p2.C5796h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sw.f */
/* loaded from: classes3.dex */
public final class C6962f implements Map, Serializable, InterfaceC2399e {

    /* renamed from: p */
    public static final C6962f f33707p;

    /* renamed from: a */
    public Object[] f33708a;

    /* renamed from: b */
    public Object[] f33709b;

    /* renamed from: c */
    public int[] f33710c;

    /* renamed from: d */
    public int[] f33711d;

    /* renamed from: e */
    public int f33712e;

    /* renamed from: f */
    public int f33713f;

    /* renamed from: g */
    public int f33714g;

    /* renamed from: h */
    public int f33715h;

    /* renamed from: j */
    public int f33716j;

    /* renamed from: k */
    public C6963g f33717k;

    /* renamed from: l */
    public C5796h f33718l;

    /* renamed from: m */
    public C6963g f33719m;

    /* renamed from: n */
    public boolean f33720n;

    static {
        C6962f c6962f = new C6962f(0);
        c6962f.f33720n = true;
        f33707p = c6962f;
    }

    public C6962f() {
        this(8);
    }

    /* renamed from: b */
    public final int m13229b(Object obj) {
        m13231f();
        while (true) {
            int iM13238p = m13238p(obj);
            int i10 = this.f33712e * 2;
            int length = this.f33711d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f33711d;
                int i12 = iArr[iM13238p];
                if (i12 <= 0) {
                    int i13 = this.f33713f;
                    Object[] objArr = this.f33708a;
                    if (i13 < objArr.length) {
                        int i14 = i13 + 1;
                        this.f33713f = i14;
                        objArr[i13] = obj;
                        this.f33710c[i13] = iM13238p;
                        iArr[iM13238p] = i14;
                        this.f33716j++;
                        this.f33715h++;
                        if (i11 > this.f33712e) {
                            this.f33712e = i11;
                        }
                        return i13;
                    }
                    m13235l(1);
                } else {
                    if (AbstractC4154l.m8918a(this.f33708a[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        m13239q(this.f33711d.length * 2);
                        break;
                    }
                    iM13238p = iM13238p == 0 ? this.f33711d.length - 1 : iM13238p - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m13231f();
        int i10 = this.f33713f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f33710c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f33711d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        zf.m11100b(this.f33708a, 0, this.f33713f);
        Object[] objArr = this.f33709b;
        if (objArr != null) {
            zf.m11100b(objArr, 0, this.f33713f);
        }
        this.f33716j = 0;
        this.f33713f = 0;
        this.f33715h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m13236n(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m13237o(obj) >= 0;
    }

    /* renamed from: d */
    public final C6962f m13230d() {
        m13231f();
        this.f33720n = true;
        if (this.f33716j > 0) {
            return this;
        }
        C6962f c6962f = f33707p;
        AbstractC4154l.m8921d(c6962f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c6962f;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C6963g c6963g = this.f33719m;
        if (c6963g != null) {
            return c6963g;
        }
        C6963g c6963g2 = new C6963g(this, 0);
        this.f33719m = c6963g2;
        return c6963g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f33716j == map.size() && m13233i(map.entrySet());
    }

    /* renamed from: f */
    public final void m13231f() {
        if (this.f33720n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM13236n = m13236n(obj);
        if (iM13236n < 0) {
            return null;
        }
        Object[] objArr = this.f33709b;
        AbstractC4154l.m8920c(objArr);
        return objArr[iM13236n];
    }

    /* renamed from: h */
    public final void m13232h(boolean z6) {
        int i10;
        Object[] objArr = this.f33709b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f33713f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f33710c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f33708a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z6) {
                    iArr[i12] = i13;
                    this.f33711d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        zf.m11100b(this.f33708a, i12, i10);
        if (objArr != null) {
            zf.m11100b(objArr, i12, this.f33713f);
        }
        this.f33713f = i12;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C6960d c6960d = new C6960d(this, 0);
        int i10 = 0;
        while (c6960d.hasNext()) {
            int i11 = c6960d.f5478a;
            C6962f c6962f = (C6962f) c6960d.f5481d;
            if (i11 >= c6962f.f33713f) {
                throw new NoSuchElementException();
            }
            c6960d.f5478a = i11 + 1;
            c6960d.f5479b = i11;
            Object obj = c6962f.f33708a[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c6962f.f33709b;
            AbstractC4154l.m8920c(objArr);
            Object obj2 = objArr[c6960d.f5479b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c6960d.m2434h();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    /* renamed from: i */
    public final boolean m13233i(Collection m10) {
        AbstractC4154l.m8923f(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!m13234j((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f33716j == 0;
    }

    /* renamed from: j */
    public final boolean m13234j(Map.Entry entry) {
        AbstractC4154l.m8923f(entry, "entry");
        int iM13236n = m13236n(entry.getKey());
        if (iM13236n < 0) {
            return false;
        }
        Object[] objArr = this.f33709b;
        AbstractC4154l.m8920c(objArr);
        return AbstractC4154l.m8918a(objArr[iM13236n], entry.getValue());
    }

    @Override // java.util.Map
    public final Set keySet() {
        C6963g c6963g = this.f33717k;
        if (c6963g != null) {
            return c6963g;
        }
        C6963g c6963g2 = new C6963g(this, 1);
        this.f33717k = c6963g2;
        return c6963g2;
    }

    /* renamed from: l */
    public final void m13235l(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f33708a;
        int length = objArr.length;
        int i11 = this.f33713f;
        int i12 = length - i11;
        int i13 = i11 - this.f33716j;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            m13232h(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            AbstractC4154l.m8922e(objArrCopyOf2, "copyOf(...)");
            this.f33708a = objArrCopyOf2;
            Object[] objArr2 = this.f33709b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f33709b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f33710c, i15);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f33710c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f33711d.length) {
                m13239q(iHighestOneBit);
            }
        }
    }

    /* renamed from: n */
    public final int m13236n(Object obj) {
        int iM13238p = m13238p(obj);
        int i10 = this.f33712e;
        while (true) {
            int i11 = this.f33711d[iM13238p];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC4154l.m8918a(this.f33708a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iM13238p = iM13238p == 0 ? this.f33711d.length - 1 : iM13238p - 1;
        }
    }

    /* renamed from: o */
    public final int m13237o(Object obj) {
        int i10 = this.f33713f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f33710c[i10] >= 0) {
                Object[] objArr = this.f33709b;
                AbstractC4154l.m8920c(objArr);
                if (AbstractC4154l.m8918a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    /* renamed from: p */
    public final int m13238p(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f33714g;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m13231f();
        int iM13229b = m13229b(obj);
        Object[] objArr = this.f33709b;
        if (objArr == null) {
            int length = this.f33708a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f33709b = objArr;
        }
        if (iM13229b >= 0) {
            objArr[iM13229b] = obj2;
            return null;
        }
        int i10 = (-iM13229b) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC4154l.m8923f(from, "from");
        m13231f();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m13235l(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM13229b = m13229b(entry.getKey());
            Object[] objArr = this.f33709b;
            if (objArr == null) {
                int length = this.f33708a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f33709b = objArr;
            }
            if (iM13229b >= 0) {
                objArr[iM13229b] = entry.getValue();
            } else {
                int i10 = (-iM13229b) - 1;
                if (!AbstractC4154l.m8918a(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f33710c[r2] = r0;
        r2 = r6;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13239q(int r6) {
        /*
            r5 = this;
            int r0 = r5.f33715h
            int r0 = r0 + 1
            r5.f33715h = r0
            int r0 = r5.f33713f
            int r1 = r5.f33716j
            r2 = 0
            if (r0 <= r1) goto L10
            r5.m13232h(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f33711d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f33714g = r6
        L1c:
            int r6 = r5.f33713f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f33708a
            r0 = r0[r2]
            int r0 = r5.m13238p(r0)
            int r1 = r5.f33712e
        L2c:
            int[] r3 = r5.f33711d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f33710c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sw.C6962f.m13239q(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13240r(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f33708a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f33709b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f33710c
            r0 = r0[r12]
            int r1 = r11.f33712e
            int r1 = r1 * 2
            int[] r2 = r11.f33711d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f33711d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f33712e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f33711d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f33711d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f33708a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.m13238p(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f33711d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f33710c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f33711d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f33710c
            r0[r12] = r6
            int r12 = r11.f33716j
            int r12 = r12 + r6
            r11.f33716j = r12
            int r12 = r11.f33715h
            int r12 = r12 + 1
            r11.f33715h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sw.C6962f.m13240r(int):void");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m13231f();
        int iM13236n = m13236n(obj);
        if (iM13236n < 0) {
            return null;
        }
        Object[] objArr = this.f33709b;
        AbstractC4154l.m8920c(objArr);
        Object obj2 = objArr[iM13236n];
        m13240r(iM13236n);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f33716j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f33716j * 3) + 2);
        sb2.append("{");
        int i10 = 0;
        C6960d c6960d = new C6960d(this, i10);
        while (c6960d.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = c6960d.f5478a;
            C6962f c6962f = (C6962f) c6960d.f5481d;
            if (i11 >= c6962f.f33713f) {
                throw new NoSuchElementException();
            }
            c6960d.f5478a = i11 + 1;
            c6960d.f5479b = i11;
            Object obj = c6962f.f33708a[i11];
            if (obj == c6962f) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = c6962f.f33709b;
            AbstractC4154l.m8920c(objArr);
            Object obj2 = objArr[c6960d.f5479b];
            if (obj2 == c6962f) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            c6960d.m2434h();
            i10++;
        }
        return m0.m7381n(sb2, "}", "toString(...)");
    }

    @Override // java.util.Map
    public final Collection values() {
        C5796h c5796h = this.f33718l;
        if (c5796h != null) {
            return c5796h;
        }
        C5796h c5796h2 = new C5796h(1, this);
        this.f33718l = c5796h2;
        return c5796h2;
    }

    public C6962f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f33708a = objArr;
        this.f33709b = null;
        this.f33710c = iArr;
        this.f33711d = new int[iHighestOneBit];
        this.f33712e = 2;
        this.f33713f = 0;
        this.f33714g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
