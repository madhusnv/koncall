package p001o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p001o.if8;

/* loaded from: classes3.dex */
public abstract class nf8 extends if8 implements List, RandomAccess {

    /* renamed from: b */
    public static final t4i f36777b = new C15567b(fhe.f23343e, 0);

    /* renamed from: o.nf8$a */
    public static final class C15566a extends if8.AbstractC14276a {
        public C15566a() {
            this(4);
        }

        @Override // p001o.if8.AbstractC14277b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C15566a mo32056a(Object obj) {
            super.m32051d(obj);
            return this;
        }

        /* renamed from: i */
        public C15566a m40518i(Object... objArr) {
            super.m32052e(objArr);
            return this;
        }

        /* renamed from: j */
        public C15566a m40519j(Iterable iterable) {
            super.mo32050b(iterable);
            return this;
        }

        /* renamed from: k */
        public nf8 m40520k() {
            this.f28598c = true;
            return nf8.m40507p(this.f28596a, this.f28597b);
        }

        public C15566a(int i) {
            super(i);
        }
    }

    /* renamed from: o.nf8$b */
    public static class C15567b extends v7 {

        /* renamed from: c */
        public final nf8 f36778c;

        public C15567b(nf8 nf8Var, int i) {
            super(nf8Var.size(), i);
            this.f36778c = nf8Var;
        }

        @Override // p001o.v7
        /* renamed from: a */
        public Object mo40521a(int i) {
            return this.f36778c.get(i);
        }
    }

    /* renamed from: o.nf8$c */
    public static class C15568c implements Serializable {

        /* renamed from: a */
        public final Object[] f36779a;

        public C15568c(Object[] objArr) {
            this.f36779a = objArr;
        }

        public Object readResolve() {
            return nf8.m40512z(this.f36779a);
        }
    }

    /* renamed from: o.nf8$d */
    public class C15569d extends nf8 {

        /* renamed from: c */
        public final transient int f36780c;

        /* renamed from: d */
        public final transient int f36781d;

        public C15569d(int i, int i2) {
            this.f36780c = i;
            this.f36781d = i2;
        }

        @Override // p001o.nf8, java.util.List
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public nf8 subList(int i, int i2) {
            dgd.m23067t(i, i2, this.f36781d);
            nf8 nf8Var = nf8.this;
            int i3 = this.f36780c;
            return nf8Var.subList(i + i3, i2 + i3);
        }

        @Override // p001o.if8
        /* renamed from: e */
        public Object[] mo26704e() {
            return nf8.this.mo26704e();
        }

        @Override // java.util.List
        public Object get(int i) {
            dgd.m23060m(i, this.f36781d);
            return nf8.this.get(i + this.f36780c);
        }

        @Override // p001o.if8
        /* renamed from: i */
        public int mo26705i() {
            return nf8.this.mo26706j() + this.f36780c + this.f36781d;
        }

        @Override // p001o.nf8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p001o.if8
        /* renamed from: j */
        public int mo26706j() {
            return nf8.this.mo26706j() + this.f36780c;
        }

        @Override // p001o.if8
        /* renamed from: l */
        public boolean mo21883l() {
            return true;
        }

        @Override // p001o.nf8, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36781d;
        }

        @Override // p001o.nf8, p001o.if8
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // p001o.nf8, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* renamed from: E */
    public static nf8 m40499E() {
        return fhe.f23343e;
    }

    /* renamed from: F */
    public static nf8 m40500F(Object obj) {
        return m40510x(obj);
    }

    /* renamed from: G */
    public static nf8 m40501G(Object obj, Object obj2) {
        return m40510x(obj, obj2);
    }

    /* renamed from: I */
    public static nf8 m40502I(Object obj, Object obj2, Object obj3) {
        return m40510x(obj, obj2, obj3);
    }

    /* renamed from: J */
    public static nf8 m40503J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m40510x(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: L */
    public static nf8 m40504L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        dgd.m23052e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return m40510x(objArr2);
    }

    /* renamed from: M */
    public static nf8 m40505M(Comparator comparator, Iterable iterable) {
        dgd.m23062o(comparator);
        Object[] objArrM58779j = z59.m58779j(iterable);
        g6c.m28096b(objArrM58779j);
        Arrays.sort(objArrM58779j, comparator);
        return m40506o(objArrM58779j);
    }

    /* renamed from: o */
    public static nf8 m40506o(Object[] objArr) {
        return m40507p(objArr, objArr.length);
    }

    /* renamed from: p */
    public static nf8 m40507p(Object[] objArr, int i) {
        return i == 0 ? m40499E() : new fhe(objArr, i);
    }

    /* renamed from: q */
    public static C15566a m40508q() {
        return new C15566a();
    }

    /* renamed from: r */
    public static C15566a m40509r(int i) {
        rg3.m46690b(i, "expectedSize");
        return new C15566a(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: x */
    public static nf8 m40510x(Object... objArr) {
        return m40506o(g6c.m28096b(objArr));
    }

    /* renamed from: y */
    public static nf8 m40511y(Collection collection) {
        if (!(collection instanceof if8)) {
            return m40510x(collection.toArray());
        }
        nf8 nf8VarMo21881b = ((if8) collection).mo21881b();
        return nf8VarMo21881b.mo21883l() ? m40506o(nf8VarMo21881b.toArray()) : nf8VarMo21881b;
    }

    /* renamed from: z */
    public static nf8 m40512z(Object[] objArr) {
        return objArr.length == 0 ? m40499E() : m40510x((Object[]) objArr.clone());
    }

    @Override // java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public t4i listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public t4i listIterator(int i) {
        dgd.m23065r(i, size());
        return isEmpty() ? f36777b : new C15567b(this, i);
    }

    @Override // java.util.List
    /* renamed from: N */
    public nf8 subList(int i, int i2) {
        dgd.m23067t(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? m40499E() : m40516O(i, i2);
    }

    /* renamed from: O */
    public nf8 m40516O(int i, int i2) {
        return new C15569d(i, i2 - i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.if8
    /* renamed from: b */
    public final nf8 mo21881b() {
        return this;
    }

    @Override // p001o.if8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p001o.if8
    /* renamed from: d */
    public int mo21882d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return fga.m26646b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return fga.m26647c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return fga.m26649e(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public q4i iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.if8
    public Object writeReplace() {
        return new C15568c(toArray());
    }
}
