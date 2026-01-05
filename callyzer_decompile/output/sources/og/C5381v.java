package og;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.v */
/* loaded from: classes.dex */
public final class C5381v extends AbstractMap implements Serializable {

    /* renamed from: k */
    public static final Object f26832k = new Object();

    /* renamed from: a */
    public transient Object f26833a;

    /* renamed from: b */
    public transient int[] f26834b;

    /* renamed from: c */
    public transient Object[] f26835c;

    /* renamed from: d */
    public transient Object[] f26836d;

    /* renamed from: e */
    public transient int f26837e = Math.min(Math.max(12, 1), 1073741823);

    /* renamed from: f */
    public transient int f26838f;

    /* renamed from: g */
    public transient C5378s f26839g;

    /* renamed from: h */
    public transient C5378s f26840h;

    /* renamed from: j */
    public transient C5380u f26841j;

    /* renamed from: b */
    public final int[] m10998b() {
        int[] iArr = this.f26834b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m11003j()) {
            return;
        }
        this.f26837e += 32;
        Map mapM11001h = m11001h();
        if (mapM11001h != null) {
            this.f26837e = Math.min(Math.max(size(), 3), 1073741823);
            mapM11001h.clear();
            this.f26833a = null;
            this.f26838f = 0;
            return;
        }
        Arrays.fill(m10999d(), 0, this.f26838f, (Object) null);
        Arrays.fill(m11000f(), 0, this.f26838f, (Object) null);
        Object obj = this.f26833a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m10998b(), 0, this.f26838f, 0);
        this.f26838f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM11001h = m11001h();
        return mapM11001h != null ? mapM11001h.containsKey(obj) : m11005n(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM11001h = m11001h();
        if (mapM11001h != null) {
            return mapM11001h.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f26838f; i10++) {
            if (pa.m10818e(obj, m11000f()[i10])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Object[] m10999d() {
        Object[] objArr = this.f26835c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C5378s c5378s = this.f26840h;
        if (c5378s != null) {
            return c5378s;
        }
        C5378s c5378s2 = new C5378s(this, 0);
        this.f26840h = c5378s2;
        return c5378s2;
    }

    /* renamed from: f */
    public final Object[] m11000f() {
        Object[] objArr = this.f26836d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM11001h = m11001h();
        if (mapM11001h != null) {
            return mapM11001h.get(obj);
        }
        int iM11005n = m11005n(obj);
        if (iM11005n == -1) {
            return null;
        }
        return m11000f()[iM11005n];
    }

    /* renamed from: h */
    public final Map m11001h() {
        Object obj = this.f26833a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: i */
    public final void m11002i(int i10, int i11) {
        Object obj = this.f26833a;
        Objects.requireNonNull(obj);
        int[] iArrM10998b = m10998b();
        Object[] objArrM10999d = m10999d();
        Object[] objArrM11000f = m11000f();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrM10999d[i10] = null;
            objArrM11000f[i10] = null;
            iArrM10998b[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrM10999d[i12];
        objArrM10999d[i10] = obj2;
        objArrM11000f[i10] = objArrM11000f[i12];
        objArrM10999d[i12] = null;
        objArrM11000f[i12] = null;
        iArrM10998b[i10] = iArrM10998b[i12];
        iArrM10998b[i12] = 0;
        int iM10925a = ta.m10925a(obj2) & i11;
        int iM10891d = sa.m10891d(iM10925a, obj);
        if (iM10891d == size) {
            sa.m10896i(iM10925a, obj, i13);
            return;
        }
        while (true) {
            int i14 = iM10891d - 1;
            int i15 = iArrM10998b[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrM10998b[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iM10891d = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final boolean m11003j() {
        return this.f26833a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C5378s c5378s = this.f26839g;
        if (c5378s != null) {
            return c5378s;
        }
        C5378s c5378s2 = new C5378s(this, 1);
        this.f26839g = c5378s2;
        return c5378s2;
    }

    /* renamed from: l */
    public final int m11004l() {
        return (1 << (this.f26837e & 31)) - 1;
    }

    /* renamed from: n */
    public final int m11005n(Object obj) {
        if (m11003j()) {
            return -1;
        }
        int iM10925a = ta.m10925a(obj);
        int iM11004l = m11004l();
        Object obj2 = this.f26833a;
        Objects.requireNonNull(obj2);
        int iM10891d = sa.m10891d(iM10925a & iM11004l, obj2);
        if (iM10891d != 0) {
            int i10 = ~iM11004l;
            int i11 = iM10925a & i10;
            do {
                int i12 = iM10891d - 1;
                int i13 = m10998b()[i12];
                if ((i13 & i10) == i11 && pa.m10818e(obj, m10999d()[i12])) {
                    return i12;
                }
                iM10891d = i13 & iM11004l;
            } while (iM10891d != 0);
        }
        return -1;
    }

    /* renamed from: o */
    public final int m11006o(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objM10893f = sa.m10893f(i11);
        if (i13 != 0) {
            sa.m10896i(i12 & i14, objM10893f, i13 + 1);
        }
        Object obj = this.f26833a;
        Objects.requireNonNull(obj);
        int[] iArrM10998b = m10998b();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM10891d = sa.m10891d(i15, obj);
            while (iM10891d != 0) {
                int i16 = iM10891d - 1;
                int i17 = iArrM10998b[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iM10891d2 = sa.m10891d(i19, objM10893f);
                sa.m10896i(i19, objM10893f, iM10891d);
                iArrM10998b[i16] = ((~i14) & i18) | (iM10891d2 & i14);
                iM10891d = i17 & i10;
            }
        }
        this.f26833a = objM10893f;
        this.f26837e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f26837e & (-32));
        return i14;
    }

    /* renamed from: p */
    public final Object m11007p(Object obj) {
        if (!m11003j()) {
            int iM11004l = m11004l();
            Object obj2 = this.f26833a;
            Objects.requireNonNull(obj2);
            int iM10889b = sa.m10889b(obj, null, iM11004l, obj2, m10998b(), m10999d(), null);
            if (iM10889b != -1) {
                Object obj3 = m11000f()[iM10889b];
                m11002i(iM10889b, iM11004l);
                this.f26838f--;
                this.f26837e += 32;
                return obj3;
            }
        }
        return f26832k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        int i11 = 32;
        if (m11003j()) {
            qa.m10850e("Arrays already allocated", m11003j());
            int i12 = this.f26837e;
            int iMax = Math.max(i12 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f26833a = sa.m10893f(iMax2);
            this.f26837e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f26837e & (-32));
            this.f26834b = new int[i12];
            this.f26835c = new Object[i12];
            this.f26836d = new Object[i12];
        }
        Map mapM11001h = m11001h();
        if (mapM11001h != null) {
            return mapM11001h.put(obj, obj2);
        }
        int[] iArrM10998b = m10998b();
        Object[] objArrM10999d = m10999d();
        Object[] objArrM11000f = m11000f();
        int i13 = this.f26838f;
        int i14 = i13 + 1;
        int iM10925a = ta.m10925a(obj);
        int iM11004l = m11004l();
        int i15 = iM10925a & iM11004l;
        Object obj3 = this.f26833a;
        Objects.requireNonNull(obj3);
        int iM10891d = sa.m10891d(i15, obj3);
        if (iM10891d == 0) {
            if (i14 > iM11004l) {
                iM11004l = m11006o(iM11004l, (iM11004l + 1) * (iM11004l < 32 ? 4 : 2), iM10925a, i13);
            } else {
                Object obj4 = this.f26833a;
                Objects.requireNonNull(obj4);
                sa.m10896i(i15, obj4, i14);
            }
            i10 = 1;
        } else {
            int i16 = ~iM11004l;
            int i17 = iM10925a & i16;
            int i18 = 0;
            while (true) {
                int i19 = iM10891d - 1;
                int i20 = iArrM10998b[i19];
                i10 = 1;
                int i21 = i20 & i16;
                int i22 = i11;
                if (i21 == i17 && pa.m10818e(obj, objArrM10999d[i19])) {
                    Object obj5 = objArrM11000f[i19];
                    objArrM11000f[i19] = obj2;
                    return obj5;
                }
                int i23 = i20 & iM11004l;
                int i24 = i18 + 1;
                if (i23 != 0) {
                    i18 = i24;
                    iM10891d = i23;
                    i11 = i22;
                } else {
                    if (i24 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m11004l() + 1, 1.0f);
                        int i25 = isEmpty() ? -1 : 0;
                        while (i25 >= 0) {
                            linkedHashMap.put(m10999d()[i25], m11000f()[i25]);
                            int i26 = i25 + 1;
                            i25 = i26 < this.f26838f ? i26 : -1;
                        }
                        this.f26833a = linkedHashMap;
                        this.f26834b = null;
                        this.f26835c = null;
                        this.f26836d = null;
                        this.f26837e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i14 > iM11004l) {
                        iM11004l = m11006o(iM11004l, (iM11004l + 1) * (iM11004l < i22 ? 4 : 2), iM10925a, i13);
                    } else {
                        iArrM10998b[i19] = (i14 & iM11004l) | i21;
                    }
                }
            }
        }
        int length = m10998b().length;
        if (i14 > length) {
            int i27 = i10;
            int iMin = Math.min(1073741823, (Math.max(i27, length >>> 1) + length) | i27);
            if (iMin != length) {
                this.f26834b = Arrays.copyOf(m10998b(), iMin);
                this.f26835c = Arrays.copyOf(m10999d(), iMin);
                this.f26836d = Arrays.copyOf(m11000f(), iMin);
            }
        }
        m10998b()[i13] = (~iM11004l) & iM10925a;
        m10999d()[i13] = obj;
        m11000f()[i13] = obj2;
        this.f26838f = i14;
        this.f26837e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM11001h = m11001h();
        if (mapM11001h != null) {
            return mapM11001h.remove(obj);
        }
        Object objM11007p = m11007p(obj);
        if (objM11007p == f26832k) {
            return null;
        }
        return objM11007p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM11001h = m11001h();
        return mapM11001h != null ? mapM11001h.size() : this.f26838f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C5380u c5380u = this.f26841j;
        if (c5380u != null) {
            return c5380u;
        }
        C5380u c5380u2 = new C5380u(this);
        this.f26841j = c5380u2;
        return c5380u2;
    }
}
