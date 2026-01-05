package p001o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class x1e extends g9 implements RandomAccess {

    /* renamed from: d */
    public static final x1e f53081d;

    /* renamed from: b */
    public Object[] f53082b;

    /* renamed from: c */
    public int f53083c;

    static {
        x1e x1eVar = new x1e(new Object[0], 0);
        f53081d = x1eVar;
        x1eVar.mo28211f();
    }

    public x1e(Object[] objArr, int i) {
        this.f53082b = objArr;
        this.f53083c = i;
    }

    /* renamed from: d */
    public static Object[] m55575d(int i) {
        return new Object[i];
    }

    /* renamed from: e */
    public static x1e m55576e() {
        return f53081d;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m28210b();
        int i = this.f53083c;
        Object[] objArr = this.f53082b;
        if (i == objArr.length) {
            this.f53082b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f53082b;
        int i2 = this.f53083c;
        this.f53083c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        m55577i(i);
        return this.f53082b[i];
    }

    /* renamed from: i */
    public final void m55577i(int i) {
        if (i < 0 || i >= this.f53083c) {
            throw new IndexOutOfBoundsException(m55578j(i));
        }
    }

    /* renamed from: j */
    public final String m55578j(int i) {
        return "Index:" + i + ", Size:" + this.f53083c;
    }

    @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public x1e mo17923a(int i) {
        if (i >= this.f53083c) {
            return new x1e(Arrays.copyOf(this.f53082b, i), this.f53083c);
        }
        throw new IllegalArgumentException();
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        m28210b();
        m55577i(i);
        Object[] objArr = this.f53082b;
        Object obj = objArr[i];
        if (i < this.f53083c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f53083c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        m28210b();
        m55577i(i);
        Object[] objArr = this.f53082b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f53083c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        m28210b();
        if (i >= 0 && i <= (i2 = this.f53083c)) {
            Object[] objArr = this.f53082b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArrM55575d = m55575d(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f53082b, 0, objArrM55575d, 0, i);
                System.arraycopy(this.f53082b, i, objArrM55575d, i + 1, this.f53083c - i);
                this.f53082b = objArrM55575d;
            }
            this.f53082b[i] = obj;
            this.f53083c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55578j(i));
    }
}
