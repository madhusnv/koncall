package p001o;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class ax5 extends g9 implements yn8.InterfaceC18438b, RandomAccess, whd {

    /* renamed from: d */
    public static final ax5 f15333d;

    /* renamed from: b */
    public double[] f15334b;

    /* renamed from: c */
    public int f15335c;

    static {
        ax5 ax5Var = new ax5(new double[0], 0);
        f15333d = ax5Var;
        ax5Var.mo28211f();
    }

    public ax5() {
        this(new double[10], 0);
    }

    /* renamed from: j */
    public static ax5 m17922j() {
        return f15333d;
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m28210b();
        yn8.m58012a(collection);
        if (!(collection instanceof ax5)) {
            return super.addAll(collection);
        }
        ax5 ax5Var = (ax5) collection;
        int i = ax5Var.f15335c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15335c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f15334b;
        if (i3 > dArr.length) {
            this.f15334b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(ax5Var.f15334b, 0, this.f15334b, this.f15335c, ax5Var.f15335c);
        this.f15335c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d) {
        m17926i(i, d.doubleValue());
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d) {
        m2(d.doubleValue());
        return true;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax5)) {
            return super.equals(obj);
        }
        ax5 ax5Var = (ax5) obj;
        if (this.f15335c != ax5Var.f15335c) {
            return false;
        }
        double[] dArr = ax5Var.f15334b;
        for (int i = 0; i < this.f15335c; i++) {
            if (Double.doubleToLongBits(this.f15334b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.yn8.InterfaceC18438b
    public double getDouble(int i) {
        m17927l(i);
        return this.f15334b[i];
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM58017f = 1;
        for (int i = 0; i < this.f15335c; i++) {
            iM58017f = (iM58017f * 31) + yn8.m58017f(Double.doubleToLongBits(this.f15334b[i]));
        }
        return iM58017f;
    }

    /* renamed from: i */
    public final void m17926i(int i, double d) {
        int i2;
        m28210b();
        if (i < 0 || i > (i2 = this.f15335c)) {
            throw new IndexOutOfBoundsException(m17929n(i));
        }
        double[] dArr = this.f15334b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f15334b, i, dArr2, i + 1, this.f15335c - i);
            this.f15334b = dArr2;
        }
        this.f15334b[i] = d;
        this.f15335c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f15334b[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void m17927l(int i) {
        if (i < 0 || i >= this.f15335c) {
            throw new IndexOutOfBoundsException(m17929n(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // p001o.yn8.InterfaceC18438b
    public void m2(double d) {
        m28210b();
        int i = this.f15335c;
        double[] dArr = this.f15334b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f15334b = dArr2;
        }
        double[] dArr3 = this.f15334b;
        int i2 = this.f15335c;
        this.f15335c = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: n */
    public final String m17929n(int i) {
        return "Index:" + i + ", Size:" + this.f15335c;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        m28210b();
        m17927l(i);
        double[] dArr = this.f15334b;
        double d = dArr[i];
        if (i < this.f15335c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f15335c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(w1(i, d.doubleValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m28210b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f15334b;
        System.arraycopy(dArr, i2, dArr, i, this.f15335c - i2);
        this.f15335c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15335c;
    }

    @Override // p001o.yn8.InterfaceC18438b
    public double w1(int i, double d) {
        m28210b();
        m17927l(i);
        double[] dArr = this.f15334b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public ax5(double[] dArr, int i) {
        this.f15334b = dArr;
        this.f15335c = i;
    }

    @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
    /* renamed from: a */
    public yn8.InterfaceC18438b mo17923a(int i) {
        if (i >= this.f15335c) {
            return new ax5(Arrays.copyOf(this.f15334b, i), this.f15335c);
        }
        throw new IllegalArgumentException();
    }
}
