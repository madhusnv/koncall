package p001o;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class dk1 extends g9 implements yn8.InterfaceC18437a, RandomAccess, whd {

    /* renamed from: d */
    public static final dk1 f20139d;

    /* renamed from: b */
    public boolean[] f20140b;

    /* renamed from: c */
    public int f20141c;

    static {
        dk1 dk1Var = new dk1(new boolean[0], 0);
        f20139d = dk1Var;
        dk1Var.mo28211f();
    }

    public dk1() {
        this(new boolean[10], 0);
    }

    /* renamed from: l */
    public static dk1 m23343l() {
        return f20139d;
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m28210b();
        yn8.m58012a(collection);
        if (!(collection instanceof dk1)) {
            return super.addAll(collection);
        }
        dk1 dk1Var = (dk1) collection;
        int i = dk1Var.f20141c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20141c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f20140b;
        if (i3 > zArr.length) {
            this.f20140b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(dk1Var.f20140b, 0, this.f20140b, this.f20141c, dk1Var.f20141c);
        this.f20141c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        m23346i(i, bool.booleanValue());
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m23347j(bool.booleanValue());
        return true;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk1)) {
            return super.equals(obj);
        }
        dk1 dk1Var = (dk1) obj;
        if (this.f20141c != dk1Var.f20141c) {
            return false;
        }
        boolean[] zArr = dk1Var.f20140b;
        for (int i = 0; i < this.f20141c; i++) {
            if (this.f20140b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM58014c = 1;
        for (int i = 0; i < this.f20141c; i++) {
            iM58014c = (iM58014c * 31) + yn8.m58014c(this.f20140b[i]);
        }
        return iM58014c;
    }

    /* renamed from: i */
    public final void m23346i(int i, boolean z) {
        int i2;
        m28210b();
        if (i < 0 || i > (i2 = this.f20141c)) {
            throw new IndexOutOfBoundsException(m23351p(i));
        }
        boolean[] zArr = this.f20140b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f20140b, i, zArr2, i + 1, this.f20141c - i);
            this.f20140b = zArr2;
        }
        this.f20140b[i] = z;
        this.f20141c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f20140b[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void m23347j(boolean z) {
        m28210b();
        int i = this.f20141c;
        boolean[] zArr = this.f20140b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f20140b = zArr2;
        }
        boolean[] zArr3 = this.f20140b;
        int i2 = this.f20141c;
        this.f20141c = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: m */
    public final void m23348m(int i) {
        if (i < 0 || i >= this.f20141c) {
            throw new IndexOutOfBoundsException(m23351p(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(m23350o(i));
    }

    /* renamed from: o */
    public boolean m23350o(int i) {
        m23348m(i);
        return this.f20140b[i];
    }

    /* renamed from: p */
    public final String m23351p(int i) {
        return "Index:" + i + ", Size:" + this.f20141c;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        m28210b();
        m23348m(i);
        boolean[] zArr = this.f20140b;
        boolean z = zArr[i];
        if (i < this.f20141c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f20141c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(m23354v(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m28210b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f20140b;
        System.arraycopy(zArr, i2, zArr, i, this.f20141c - i2);
        this.f20141c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20141c;
    }

    /* renamed from: v */
    public boolean m23354v(int i, boolean z) {
        m28210b();
        m23348m(i);
        boolean[] zArr = this.f20140b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public dk1(boolean[] zArr, int i) {
        this.f20140b = zArr;
        this.f20141c = i;
    }

    @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
    /* renamed from: a */
    public yn8.InterfaceC18437a mo17923a(int i) {
        if (i >= this.f20141c) {
            return new dk1(Arrays.copyOf(this.f20140b, i), this.f20141c);
        }
        throw new IllegalArgumentException();
    }
}
