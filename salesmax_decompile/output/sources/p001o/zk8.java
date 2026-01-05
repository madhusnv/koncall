package p001o;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class zk8 extends g9 implements yn8.InterfaceC18443g, RandomAccess, whd {

    /* renamed from: d */
    public static final zk8 f57311d;

    /* renamed from: b */
    public int[] f57312b;

    /* renamed from: c */
    public int f57313c;

    static {
        zk8 zk8Var = new zk8(new int[0], 0);
        f57311d = zk8Var;
        zk8Var.mo28211f();
    }

    public zk8() {
        this(new int[10], 0);
    }

    /* renamed from: j */
    public static zk8 m59527j() {
        return f57311d;
    }

    @Override // p001o.yn8.InterfaceC18443g
    /* renamed from: H */
    public int mo58022H(int i, int i2) {
        m28210b();
        m59531l(i);
        int[] iArr = this.f57312b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // p001o.yn8.InterfaceC18443g
    public void R1(int i) {
        m28210b();
        int i2 = this.f57313c;
        int[] iArr = this.f57312b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f57312b = iArr2;
        }
        int[] iArr3 = this.f57312b;
        int i3 = this.f57313c;
        this.f57313c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m28210b();
        yn8.m58012a(collection);
        if (!(collection instanceof zk8)) {
            return super.addAll(collection);
        }
        zk8 zk8Var = (zk8) collection;
        int i = zk8Var.f57313c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57313c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f57312b;
        if (i3 > iArr.length) {
            this.f57312b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zk8Var.f57312b, 0, this.f57312b, this.f57313c, zk8Var.f57313c);
        this.f57313c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        m59530i(i, num.intValue());
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        R1(num.intValue());
        return true;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk8)) {
            return super.equals(obj);
        }
        zk8 zk8Var = (zk8) obj;
        if (this.f57313c != zk8Var.f57313c) {
            return false;
        }
        int[] iArr = zk8Var.f57312b;
        for (int i = 0; i < this.f57313c; i++) {
            if (this.f57312b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.yn8.InterfaceC18443g
    public int getInt(int i) {
        m59531l(i);
        return this.f57312b[i];
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57313c; i2++) {
            i = (i * 31) + this.f57312b[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void m59530i(int i, int i2) {
        int i3;
        m28210b();
        if (i < 0 || i > (i3 = this.f57313c)) {
            throw new IndexOutOfBoundsException(m59533n(i));
        }
        int[] iArr = this.f57312b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f57312b, i, iArr2, i + 1, this.f57313c - i);
            this.f57312b = iArr2;
        }
        this.f57312b[i] = i2;
        this.f57313c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f57312b[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void m59531l(int i) {
        if (i < 0 || i >= this.f57313c) {
            throw new IndexOutOfBoundsException(m59533n(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    /* renamed from: n */
    public final String m59533n(int i) {
        return "Index:" + i + ", Size:" + this.f57313c;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        m28210b();
        m59531l(i);
        int[] iArr = this.f57312b;
        int i2 = iArr[i];
        if (i < this.f57313c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f57313c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo58022H(i, num.intValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m28210b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f57312b;
        System.arraycopy(iArr, i2, iArr, i, this.f57313c - i2);
        this.f57313c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57313c;
    }

    public zk8(int[] iArr, int i) {
        this.f57312b = iArr;
        this.f57313c = i;
    }

    @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
    /* renamed from: a */
    public yn8.InterfaceC18443g mo17923a(int i) {
        if (i >= this.f57313c) {
            return new zk8(Arrays.copyOf(this.f57312b, i), this.f57313c);
        }
        throw new IllegalArgumentException();
    }
}
