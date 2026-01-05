package p001o;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p001o.of8;

/* loaded from: classes3.dex */
public final class ghe extends of8 {

    /* renamed from: h */
    public static final of8 f25205h = new ghe(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object f25206e;

    /* renamed from: f */
    public final transient Object[] f25207f;

    /* renamed from: g */
    public final transient int f25208g;

    /* renamed from: o.ghe$a */
    public static class C13720a extends pf8 {

        /* renamed from: c */
        public final transient of8 f25209c;

        /* renamed from: d */
        public final transient Object[] f25210d;

        /* renamed from: e */
        public final transient int f25211e;

        /* renamed from: f */
        public final transient int f25212f;

        /* renamed from: o.ghe$a$a */
        public class a extends nf8 {
            public a() {
            }

            @Override // java.util.List
            /* renamed from: P, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i) {
                dgd.m23060m(i, C13720a.this.f25212f);
                int i2 = i * 2;
                Object obj = C13720a.this.f25210d[C13720a.this.f25211e + i2];
                Objects.requireNonNull(obj);
                Object obj2 = C13720a.this.f25210d[i2 + (C13720a.this.f25211e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // p001o.if8
            /* renamed from: l */
            public boolean mo21883l() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C13720a.this.f25212f;
            }

            @Override // p001o.nf8, p001o.if8
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public C13720a(of8 of8Var, Object[] objArr, int i, int i2) {
            this.f25209c = of8Var;
            this.f25210d = objArr;
            this.f25211e = i;
            this.f25212f = i2;
        }

        @Override // p001o.if8, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f25209c.get(key));
        }

        @Override // p001o.if8
        /* renamed from: d */
        public int mo21882d(Object[] objArr, int i) {
            return mo21881b().mo21882d(objArr, i);
        }

        @Override // p001o.if8
        /* renamed from: l */
        public boolean mo21883l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public q4i iterator() {
            return mo21881b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f25212f;
        }

        @Override // p001o.pf8, p001o.if8
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // p001o.pf8
        /* renamed from: z */
        public nf8 mo28716z() {
            return new a();
        }
    }

    /* renamed from: o.ghe$b */
    public static final class C13721b extends pf8 {

        /* renamed from: c */
        public final transient of8 f25214c;

        /* renamed from: d */
        public final transient nf8 f25215d;

        public C13721b(of8 of8Var, nf8 nf8Var) {
            this.f25214c = of8Var;
            this.f25215d = nf8Var;
        }

        @Override // p001o.pf8, p001o.if8
        /* renamed from: b */
        public nf8 mo21881b() {
            return this.f25215d;
        }

        @Override // p001o.if8, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f25214c.get(obj) != null;
        }

        @Override // p001o.if8
        /* renamed from: d */
        public int mo21882d(Object[] objArr, int i) {
            return mo21881b().mo21882d(objArr, i);
        }

        @Override // p001o.if8
        /* renamed from: l */
        public boolean mo21883l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public q4i iterator() {
            return mo21881b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f25214c.size();
        }

        @Override // p001o.pf8, p001o.if8
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* renamed from: o.ghe$c */
    public static final class C13722c extends nf8 {

        /* renamed from: c */
        public final transient Object[] f25216c;

        /* renamed from: d */
        public final transient int f25217d;

        /* renamed from: e */
        public final transient int f25218e;

        public C13722c(Object[] objArr, int i, int i2) {
            this.f25216c = objArr;
            this.f25217d = i;
            this.f25218e = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            dgd.m23060m(i, this.f25218e);
            Object obj = this.f25216c[(i * 2) + this.f25217d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // p001o.if8
        /* renamed from: l */
        public boolean mo21883l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f25218e;
        }

        @Override // p001o.nf8, p001o.if8
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ghe(Object obj, Object[] objArr, int i) {
        this.f25206e = obj;
        this.f25207f = objArr;
        this.f25208g = i;
    }

    /* renamed from: t */
    public static ghe m28706t(int i, Object[] objArr, of8.C15793a c15793a) {
        if (i == 0) {
            return (ghe) f25205h;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            rg3.m46689a(obj, obj2);
            return new ghe(null, objArr, 1);
        }
        dgd.m23065r(i, objArr.length >> 1);
        Object objM28707u = m28707u(objArr, i, pf8.m43580q(i), 0);
        if (objM28707u instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM28707u;
            of8.C15793a.a aVar = (of8.C15793a.a) objArr2[2];
            if (c15793a == null) {
                throw aVar.m42193a();
            }
            c15793a.f38294e = aVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM28707u = obj3;
            i = iIntValue;
        }
        return new ghe(objM28707u, objArr, i);
    }

    /* renamed from: u */
    public static Object m28707u(Object[] objArr, int i, int i2, int i3) {
        of8.C15793a.a aVar = null;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            rg3.m46689a(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj3 = objArr[i7];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj4);
                rg3.m46689a(obj3, obj4);
                int iM27710b = fx7.m27710b(obj3.hashCode());
                while (true) {
                    int i9 = iM27710b & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj3;
                            objArr[i8 ^ 1] = obj4;
                        }
                        i6++;
                    } else {
                        if (obj3.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj5 = objArr[i11];
                            Objects.requireNonNull(obj5);
                            aVar = new of8.C15793a.a(obj3, obj4, obj5);
                            objArr[i11] = obj4;
                            break;
                        }
                        iM27710b = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), aVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj6 = objArr[i13];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj7);
                rg3.m46689a(obj6, obj7);
                int iM27710b2 = fx7.m27710b(obj6.hashCode());
                while (true) {
                    int i15 = iM27710b2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj6;
                            objArr[i14 ^ 1] = obj7;
                        }
                        i12++;
                    } else {
                        if (obj6.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj8 = objArr[i17];
                            Objects.requireNonNull(obj8);
                            aVar = new of8.C15793a.a(obj6, obj7, obj8);
                            objArr[i17] = obj7;
                            break;
                        }
                        iM27710b2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), aVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj9 = objArr[i19];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj10);
            rg3.m46689a(obj9, obj10);
            int iM27710b3 = fx7.m27710b(obj9.hashCode());
            while (true) {
                int i21 = iM27710b3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj9;
                        objArr[i20 ^ 1] = obj10;
                    }
                    i18++;
                } else {
                    if (obj9.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj11 = objArr[i23];
                        Objects.requireNonNull(obj11);
                        aVar = new of8.C15793a.a(obj9, obj10, obj11);
                        objArr[i23] = obj10;
                        break;
                    }
                    iM27710b3 = i21 + 1;
                }
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), aVar};
    }

    /* renamed from: y */
    public static Object m28708y(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM27710b = fx7.m27710b(obj2.hashCode());
            while (true) {
                int i3 = iM27710b & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iM27710b = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM27710b2 = fx7.m27710b(obj2.hashCode());
            while (true) {
                int i5 = iM27710b2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iM27710b2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM27710b3 = fx7.m27710b(obj2.hashCode());
            while (true) {
                int i7 = iM27710b3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iM27710b3 = i7 + 1;
            }
        }
    }

    @Override // p001o.of8
    /* renamed from: e */
    public pf8 mo28709e() {
        return new C13720a(this, this.f25207f, 0, this.f25208g);
    }

    @Override // p001o.of8
    /* renamed from: f */
    public pf8 mo28710f() {
        return new C13721b(this, new C13722c(this.f25207f, 0, this.f25208g));
    }

    @Override // p001o.of8
    /* renamed from: g */
    public if8 mo28711g() {
        return new C13722c(this.f25207f, 1, this.f25208g);
    }

    @Override // p001o.of8, java.util.Map
    public Object get(Object obj) {
        Object objM28708y = m28708y(this.f25206e, this.f25207f, this.f25208g, 0, obj);
        if (objM28708y == null) {
            return null;
        }
        return objM28708y;
    }

    @Override // p001o.of8
    /* renamed from: k */
    public boolean mo28712k() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f25208g;
    }

    @Override // p001o.of8
    public Object writeReplace() {
        return super.writeReplace();
    }
}
