package p001o;

import com.google.android.gms.common.api.Api;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p001o.nf8;

/* loaded from: classes3.dex */
public abstract class if8 extends AbstractCollection implements Serializable {

    /* renamed from: a */
    public static final Object[] f28595a = new Object[0];

    /* renamed from: o.if8$a */
    public static abstract class AbstractC14276a extends AbstractC14277b {

        /* renamed from: a */
        public Object[] f28596a;

        /* renamed from: b */
        public int f28597b;

        /* renamed from: c */
        public boolean f28598c;

        public AbstractC14276a(int i) {
            rg3.m46690b(i, "initialCapacity");
            this.f28596a = new Object[i];
            this.f28597b = 0;
        }

        @Override // p001o.if8.AbstractC14277b
        /* renamed from: b */
        public AbstractC14277b mo32050b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m32054g(this.f28597b + collection.size());
                if (collection instanceof if8) {
                    this.f28597b = ((if8) collection).mo21882d(this.f28596a, this.f28597b);
                    return this;
                }
            }
            super.mo32050b(iterable);
            return this;
        }

        /* renamed from: d */
        public AbstractC14276a m32051d(Object obj) {
            dgd.m23062o(obj);
            m32054g(this.f28597b + 1);
            Object[] objArr = this.f28596a;
            int i = this.f28597b;
            this.f28597b = i + 1;
            objArr[i] = obj;
            return this;
        }

        /* renamed from: e */
        public AbstractC14277b m32052e(Object... objArr) {
            m32053f(objArr, objArr.length);
            return this;
        }

        /* renamed from: f */
        public final void m32053f(Object[] objArr, int i) {
            g6c.m28097c(objArr, i);
            m32054g(this.f28597b + i);
            System.arraycopy(objArr, 0, this.f28596a, this.f28597b, i);
            this.f28597b += i;
        }

        /* renamed from: g */
        public final void m32054g(int i) {
            Object[] objArr = this.f28596a;
            if (objArr.length < i) {
                this.f28596a = Arrays.copyOf(objArr, AbstractC14277b.m32055c(objArr.length, i));
                this.f28598c = false;
            } else if (this.f28598c) {
                this.f28596a = (Object[]) objArr.clone();
                this.f28598c = false;
            }
        }
    }

    /* renamed from: o.if8$b */
    public static abstract class AbstractC14277b {
        /* renamed from: c */
        public static int m32055c(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            return iHighestOneBit < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iHighestOneBit;
        }

        /* renamed from: a */
        public abstract AbstractC14277b mo32056a(Object obj);

        /* renamed from: b */
        public AbstractC14277b mo32050b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo32056a(it.next());
            }
            return this;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract nf8 mo21881b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    public abstract int mo21882d(Object[] objArr, int i);

    /* renamed from: e */
    public Object[] mo26704e() {
        return null;
    }

    /* renamed from: i */
    public int mo26705i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public int mo26706j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    abstract boolean mo21883l();

    /* renamed from: m */
    public abstract q4i iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f28595a);
    }

    Object writeReplace() {
        return new nf8.C15568c(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        dgd.m23062o(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo26704e = mo26704e();
            if (objArrMo26704e != null) {
                return c9d.m20511a(objArrMo26704e, mo26706j(), mo26705i(), objArr);
            }
            objArr = g6c.m28098d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo21882d(objArr, 0);
        return objArr;
    }
}
