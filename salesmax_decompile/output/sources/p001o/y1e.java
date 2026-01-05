package p001o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class y1e extends h9 implements RandomAccess {

    /* renamed from: d */
    public static final y1e f54722d;

    /* renamed from: b */
    public Object[] f54723b;

    /* renamed from: c */
    public int f54724c;

    static {
        y1e y1eVar = new y1e(new Object[0], 0);
        f54722d = y1eVar;
        y1eVar.mo29975f();
    }

    public y1e(Object[] objArr, int i) {
        this.f54723b = objArr;
        this.f54724c = i;
    }

    /* renamed from: d */
    public static Object[] m57110d(int i) {
        return new Object[i];
    }

    /* renamed from: e */
    public static y1e m57111e() {
        return f54722d;
    }

    @Override // p001o.h9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m29974b();
        int i = this.f54724c;
        Object[] objArr = this.f54723b;
        if (i == objArr.length) {
            this.f54723b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f54723b;
        int i2 = this.f54724c;
        this.f54724c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        m57112i(i);
        return this.f54723b[i];
    }

    /* renamed from: i */
    public final void m57112i(int i) {
        if (i < 0 || i >= this.f54724c) {
            throw new IndexOutOfBoundsException(m57113j(i));
        }
    }

    /* renamed from: j */
    public final String m57113j(int i) {
        return "Index:" + i + ", Size:" + this.f54724c;
    }

    @Override // p001o.xn8.InterfaceC18196d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public y1e mo56352a(int i) {
        if (i >= this.f54724c) {
            return new y1e(Arrays.copyOf(this.f54723b, i), this.f54724c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        m29974b();
        m57112i(i);
        Object[] objArr = this.f54723b;
        Object obj = objArr[i];
        if (i < this.f54724c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f54724c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        m29974b();
        m57112i(i);
        Object[] objArr = this.f54723b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f54724c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        m29974b();
        if (i >= 0 && i <= (i2 = this.f54724c)) {
            Object[] objArr = this.f54723b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArrM57110d = m57110d(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f54723b, 0, objArrM57110d, 0, i);
                System.arraycopy(this.f54723b, i, objArrM57110d, i + 1, this.f54724c - i);
                this.f54723b = objArrM57110d;
            }
            this.f54723b[i] = obj;
            this.f54724c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m57113j(i));
    }
}
