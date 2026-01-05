package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class q4d {

    /* renamed from: a */
    public final InterfaceC16294d f41293a;

    /* renamed from: o.q4d$a */
    public static final class C16291a implements InterfaceC16294d {

        /* renamed from: a */
        public final Object[] f41294a;

        /* renamed from: b */
        public final Object[] f41295b;

        public C16291a(Object obj, Object obj2, Object obj3, Object obj4) {
            this(new Object[]{obj, obj3}, new Object[]{obj2, obj4});
        }

        @Override // p001o.q4d.InterfaceC16294d
        /* renamed from: a */
        public Object mo44807a(Object obj, int i, int i2) {
            int i3 = 0;
            while (true) {
                Object[] objArr = this.f41294a;
                if (i3 >= objArr.length) {
                    return null;
                }
                if (objArr[i3] == obj) {
                    return this.f41295b[i3];
                }
                i3++;
            }
        }

        @Override // p001o.q4d.InterfaceC16294d
        /* renamed from: b */
        public InterfaceC16294d mo44808b(Object obj, Object obj2, int i, int i2) {
            int iHashCode = this.f41294a[0].hashCode();
            if (iHashCode != i) {
                return C16292b.m44810c(new C16293c(obj, obj2), i, this, iHashCode, i2);
            }
            int iM44809c = m44809c(obj);
            if (iM44809c != -1) {
                Object[] objArr = this.f41294a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Object[] objArrCopyOf2 = Arrays.copyOf(this.f41295b, this.f41294a.length);
                objArrCopyOf[iM44809c] = obj;
                objArrCopyOf2[iM44809c] = obj2;
                return new C16291a(objArrCopyOf, objArrCopyOf2);
            }
            Object[] objArr2 = this.f41294a;
            Object[] objArrCopyOf3 = Arrays.copyOf(objArr2, objArr2.length + 1);
            Object[] objArrCopyOf4 = Arrays.copyOf(this.f41295b, this.f41294a.length + 1);
            Object[] objArr3 = this.f41294a;
            objArrCopyOf3[objArr3.length] = obj;
            objArrCopyOf4[objArr3.length] = obj2;
            return new C16291a(objArrCopyOf3, objArrCopyOf4);
        }

        /* renamed from: c */
        public final int m44809c(Object obj) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f41294a;
                if (i >= objArr.length) {
                    return -1;
                }
                if (objArr[i] == obj) {
                    return i;
                }
                i++;
            }
        }

        @Override // p001o.q4d.InterfaceC16294d
        public int size() {
            return this.f41295b.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollisionLeaf(");
            for (int i = 0; i < this.f41295b.length; i++) {
                sb.append("(key=");
                sb.append(this.f41294a[i]);
                sb.append(" value=");
                sb.append(this.f41295b[i]);
                sb.append(") ");
            }
            sb.append(")");
            return sb.toString();
        }

        public C16291a(Object[] objArr, Object[] objArr2) {
            this.f41294a = objArr;
            this.f41295b = objArr2;
        }
    }

    /* renamed from: o.q4d$b */
    public static final class C16292b implements InterfaceC16294d {

        /* renamed from: a */
        public final int f41296a;

        /* renamed from: b */
        public final InterfaceC16294d[] f41297b;

        /* renamed from: c */
        public final int f41298c;

        public C16292b(int i, InterfaceC16294d[] interfaceC16294dArr, int i2) {
            this.f41296a = i;
            this.f41297b = interfaceC16294dArr;
            this.f41298c = i2;
        }

        /* renamed from: c */
        public static InterfaceC16294d m44810c(InterfaceC16294d interfaceC16294d, int i, InterfaceC16294d interfaceC16294d2, int i2, int i3) {
            int iM44811e = m44811e(i, i3);
            int iM44811e2 = m44811e(i2, i3);
            if (iM44811e == iM44811e2) {
                InterfaceC16294d interfaceC16294dM44810c = m44810c(interfaceC16294d, i, interfaceC16294d2, i2, i3 + 5);
                return new C16292b(iM44811e, new InterfaceC16294d[]{interfaceC16294dM44810c}, interfaceC16294dM44810c.size());
            }
            if (m44812f(i, i3) > m44812f(i2, i3)) {
                interfaceC16294d2 = interfaceC16294d;
                interfaceC16294d = interfaceC16294d2;
            }
            return new C16292b(iM44811e | iM44811e2, new InterfaceC16294d[]{interfaceC16294d, interfaceC16294d2}, interfaceC16294d.size() + interfaceC16294d2.size());
        }

        /* renamed from: e */
        public static int m44811e(int i, int i2) {
            return 1 << m44812f(i, i2);
        }

        /* renamed from: f */
        public static int m44812f(int i, int i2) {
            return (i >>> i2) & 31;
        }

        @Override // p001o.q4d.InterfaceC16294d
        /* renamed from: a */
        public Object mo44807a(Object obj, int i, int i2) {
            int iM44811e = m44811e(i, i2);
            if ((this.f41296a & iM44811e) == 0) {
                return null;
            }
            return this.f41297b[m44813d(iM44811e)].mo44807a(obj, i, i2 + 5);
        }

        @Override // p001o.q4d.InterfaceC16294d
        /* renamed from: b */
        public InterfaceC16294d mo44808b(Object obj, Object obj2, int i, int i2) {
            int iM44811e = m44811e(i, i2);
            int iM44813d = m44813d(iM44811e);
            int i3 = this.f41296a;
            if ((i3 & iM44811e) != 0) {
                InterfaceC16294d[] interfaceC16294dArr = this.f41297b;
                InterfaceC16294d[] interfaceC16294dArr2 = (InterfaceC16294d[]) Arrays.copyOf(interfaceC16294dArr, interfaceC16294dArr.length);
                interfaceC16294dArr2[iM44813d] = this.f41297b[iM44813d].mo44808b(obj, obj2, i, i2 + 5);
                return new C16292b(this.f41296a, interfaceC16294dArr2, (size() + interfaceC16294dArr2[iM44813d].size()) - this.f41297b[iM44813d].size());
            }
            int i4 = i3 | iM44811e;
            InterfaceC16294d[] interfaceC16294dArr3 = this.f41297b;
            InterfaceC16294d[] interfaceC16294dArr4 = new InterfaceC16294d[interfaceC16294dArr3.length + 1];
            System.arraycopy(interfaceC16294dArr3, 0, interfaceC16294dArr4, 0, iM44813d);
            interfaceC16294dArr4[iM44813d] = new C16293c(obj, obj2);
            InterfaceC16294d[] interfaceC16294dArr5 = this.f41297b;
            System.arraycopy(interfaceC16294dArr5, iM44813d, interfaceC16294dArr4, iM44813d + 1, interfaceC16294dArr5.length - iM44813d);
            return new C16292b(i4, interfaceC16294dArr4, size() + 1);
        }

        /* renamed from: d */
        public final int m44813d(int i) {
            return Integer.bitCount((i - 1) & this.f41296a);
        }

        @Override // p001o.q4d.InterfaceC16294d
        public int size() {
            return this.f41298c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompressedIndex(");
            sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f41296a)));
            for (InterfaceC16294d interfaceC16294d : this.f41297b) {
                sb.append(interfaceC16294d);
                sb.append(" ");
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.q4d$c */
    public static final class C16293c implements InterfaceC16294d {

        /* renamed from: a */
        public final Object f41299a;

        /* renamed from: b */
        public final Object f41300b;

        public C16293c(Object obj, Object obj2) {
            this.f41299a = obj;
            this.f41300b = obj2;
        }

        @Override // p001o.q4d.InterfaceC16294d
        /* renamed from: a */
        public Object mo44807a(Object obj, int i, int i2) {
            if (this.f41299a == obj) {
                return this.f41300b;
            }
            return null;
        }

        @Override // p001o.q4d.InterfaceC16294d
        /* renamed from: b */
        public InterfaceC16294d mo44808b(Object obj, Object obj2, int i, int i2) {
            int iHashCode = this.f41299a.hashCode();
            return iHashCode != i ? C16292b.m44810c(new C16293c(obj, obj2), i, this, iHashCode, i2) : this.f41299a == obj ? new C16293c(obj, obj2) : new C16291a(this.f41299a, this.f41300b, obj, obj2);
        }

        @Override // p001o.q4d.InterfaceC16294d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f41299a, this.f41300b);
        }
    }

    /* renamed from: o.q4d$d */
    public interface InterfaceC16294d {
        /* renamed from: a */
        Object mo44807a(Object obj, int i, int i2);

        /* renamed from: b */
        InterfaceC16294d mo44808b(Object obj, Object obj2, int i, int i2);

        int size();
    }

    public q4d() {
        this(null);
    }

    /* renamed from: a */
    public Object m44805a(Object obj) {
        InterfaceC16294d interfaceC16294d = this.f41293a;
        if (interfaceC16294d == null) {
            return null;
        }
        return interfaceC16294d.mo44807a(obj, obj.hashCode(), 0);
    }

    /* renamed from: b */
    public q4d m44806b(Object obj, Object obj2) {
        InterfaceC16294d interfaceC16294d = this.f41293a;
        return interfaceC16294d == null ? new q4d(new C16293c(obj, obj2)) : new q4d(interfaceC16294d.mo44808b(obj, obj2, obj.hashCode(), 0));
    }

    public q4d(InterfaceC16294d interfaceC16294d) {
        this.f41293a = interfaceC16294d;
    }
}
