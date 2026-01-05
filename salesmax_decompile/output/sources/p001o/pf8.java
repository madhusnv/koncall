package p001o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p001o.if8;

/* loaded from: classes3.dex */
public abstract class pf8 extends if8 implements Set {

    /* renamed from: b */
    public transient nf8 f39994b;

    /* renamed from: o.pf8$a */
    public static class C16101a extends if8.AbstractC14276a {

        /* renamed from: d */
        public Object[] f39995d;

        /* renamed from: e */
        public int f39996e;

        public C16101a() {
            super(4);
        }

        @Override // p001o.if8.AbstractC14277b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C16101a mo32056a(Object obj) {
            dgd.m23062o(obj);
            if (this.f39995d != null && pf8.m43580q(this.f28597b) <= this.f39995d.length) {
                m43587k(obj);
                return this;
            }
            this.f39995d = null;
            super.m32051d(obj);
            return this;
        }

        /* renamed from: i */
        public C16101a m43585i(Object... objArr) {
            if (this.f39995d != null) {
                for (Object obj : objArr) {
                    mo32056a(obj);
                }
            } else {
                super.m32052e(objArr);
            }
            return this;
        }

        /* renamed from: j */
        public C16101a m43586j(Iterable iterable) {
            dgd.m23062o(iterable);
            if (this.f39995d != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    mo32056a(it.next());
                }
            } else {
                super.mo32050b(iterable);
            }
            return this;
        }

        /* renamed from: k */
        public final void m43587k(Object obj) {
            Objects.requireNonNull(this.f39995d);
            int length = this.f39995d.length - 1;
            int iHashCode = obj.hashCode();
            int iM27710b = fx7.m27710b(iHashCode);
            while (true) {
                int i = iM27710b & length;
                Object[] objArr = this.f39995d;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    objArr[i] = obj;
                    this.f39996e += iHashCode;
                    super.m32051d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iM27710b = i + 1;
                }
            }
        }

        /* renamed from: l */
        public pf8 m43588l() {
            pf8 pf8VarM43581r;
            int i = this.f28597b;
            if (i == 0) {
                return pf8.m43571B();
            }
            if (i == 1) {
                Object obj = this.f28596a[0];
                Objects.requireNonNull(obj);
                return pf8.m43572E(obj);
            }
            if (this.f39995d == null || pf8.m43580q(i) != this.f39995d.length) {
                pf8VarM43581r = pf8.m43581r(this.f28597b, this.f28596a);
                this.f28597b = pf8VarM43581r.size();
            } else {
                Object[] objArrCopyOf = pf8.m43577L(this.f28597b, this.f28596a.length) ? Arrays.copyOf(this.f28596a, this.f28597b) : this.f28596a;
                pf8VarM43581r = new hhe(objArrCopyOf, this.f39996e, this.f39995d, r5.length - 1, this.f28597b);
            }
            this.f28598c = true;
            this.f39995d = null;
            return pf8VarM43581r;
        }
    }

    /* renamed from: o.pf8$b */
    public static class C16102b implements Serializable {

        /* renamed from: a */
        public final Object[] f39997a;

        public C16102b(Object[] objArr) {
            this.f39997a = objArr;
        }

        public Object readResolve() {
            return pf8.m43583y(this.f39997a);
        }
    }

    /* renamed from: B */
    public static pf8 m43571B() {
        return hhe.f26989q;
    }

    /* renamed from: E */
    public static pf8 m43572E(Object obj) {
        return new cvf(obj);
    }

    /* renamed from: F */
    public static pf8 m43573F(Object obj, Object obj2) {
        return m43581r(2, obj, obj2);
    }

    /* renamed from: G */
    public static pf8 m43574G(Object obj, Object obj2, Object obj3) {
        return m43581r(3, obj, obj2, obj3);
    }

    /* renamed from: I */
    public static pf8 m43575I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m43581r(5, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: J */
    public static pf8 m43576J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        dgd.m23052e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m43581r(length, objArr2);
    }

    /* renamed from: L */
    public static boolean m43577L(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: q */
    public static int m43580q(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            dgd.m23052e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* renamed from: r */
    public static pf8 m43581r(int i, Object... objArr) {
        if (i == 0) {
            return m43571B();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m43572E(obj);
        }
        int iM43580q = m43580q(i);
        Object[] objArr2 = new Object[iM43580q];
        int i2 = iM43580q - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objM28095a = g6c.m28095a(objArr[i5], i5);
            int iHashCode = objM28095a.hashCode();
            int iM27710b = fx7.m27710b(iHashCode);
            while (true) {
                int i6 = iM27710b & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = objM28095a;
                    objArr2[i6] = objM28095a;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(objM28095a)) {
                    break;
                }
                iM27710b++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new cvf(obj3);
        }
        if (m43580q(i4) < iM43580q / 2) {
            return m43581r(i4, objArr);
        }
        if (m43577L(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new hhe(objArr, i3, objArr2, i2, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: x */
    public static pf8 m43582x(Collection collection) {
        if ((collection instanceof pf8) && !(collection instanceof SortedSet)) {
            pf8 pf8Var = (pf8) collection;
            if (!pf8Var.mo21883l()) {
                return pf8Var;
            }
        }
        Object[] array = collection.toArray();
        return m43581r(array.length, array);
    }

    /* renamed from: y */
    public static pf8 m43583y(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? m43581r(objArr.length, (Object[]) objArr.clone()) : m43572E(objArr[0]) : m43571B();
    }

    /* renamed from: A */
    public boolean mo30588A() {
        return false;
    }

    @Override // p001o.if8
    /* renamed from: b */
    public nf8 mo21881b() {
        nf8 nf8Var = this.f39994b;
        if (nf8Var != null) {
            return nf8Var;
        }
        nf8 nf8VarMo28716z = mo28716z();
        this.f39994b = nf8VarMo28716z;
        return nf8VarMo28716z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof pf8) && mo30588A() && ((pf8) obj).mo30588A() && hashCode() != obj.hashCode()) {
            return false;
        }
        return lif.m37321a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return lif.m37324d(this);
    }

    @Override // p001o.if8
    /* renamed from: m */
    public abstract q4i iterator();

    @Override // p001o.if8
    public Object writeReplace() {
        return new C16102b(toArray());
    }

    /* renamed from: z */
    public nf8 mo28716z() {
        return nf8.m40506o(toArray());
    }
}
