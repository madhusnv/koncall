package p001o;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class dla extends g9 implements yn8.InterfaceC18445i, RandomAccess, whd {

    /* renamed from: d */
    public static final dla f20182d;

    /* renamed from: b */
    public long[] f20183b;

    /* renamed from: c */
    public int f20184c;

    static {
        dla dlaVar = new dla(new long[0], 0);
        f20182d = dlaVar;
        dlaVar.mo28211f();
    }

    public dla() {
        this(new long[10], 0);
    }

    /* renamed from: j */
    public static dla m23413j() {
        return f20182d;
    }

    @Override // p001o.yn8.InterfaceC18445i
    public long G2(int i, long j) {
        m28210b();
        m23417l(i);
        long[] jArr = this.f20183b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // p001o.yn8.InterfaceC18445i
    public void Z1(long j) {
        m28210b();
        int i = this.f20184c;
        long[] jArr = this.f20183b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f20183b = jArr2;
        }
        long[] jArr3 = this.f20183b;
        int i2 = this.f20184c;
        this.f20184c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m28210b();
        yn8.m58012a(collection);
        if (!(collection instanceof dla)) {
            return super.addAll(collection);
        }
        dla dlaVar = (dla) collection;
        int i = dlaVar.f20184c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20184c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f20183b;
        if (i3 > jArr.length) {
            this.f20183b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(dlaVar.f20183b, 0, this.f20183b, this.f20184c, dlaVar.f20184c);
        this.f20184c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l) {
        m23416i(i, l.longValue());
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        Z1(l.longValue());
        return true;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dla)) {
            return super.equals(obj);
        }
        dla dlaVar = (dla) obj;
        if (this.f20184c != dlaVar.f20184c) {
            return false;
        }
        long[] jArr = dlaVar.f20183b;
        for (int i = 0; i < this.f20184c; i++) {
            if (this.f20183b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.yn8.InterfaceC18445i
    public long getLong(int i) {
        m23417l(i);
        return this.f20183b[i];
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM58017f = 1;
        for (int i = 0; i < this.f20184c; i++) {
            iM58017f = (iM58017f * 31) + yn8.m58017f(this.f20183b[i]);
        }
        return iM58017f;
    }

    /* renamed from: i */
    public final void m23416i(int i, long j) {
        int i2;
        m28210b();
        if (i < 0 || i > (i2 = this.f20184c)) {
            throw new IndexOutOfBoundsException(m23419n(i));
        }
        long[] jArr = this.f20183b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f20183b, i, jArr2, i + 1, this.f20184c - i);
            this.f20183b = jArr2;
        }
        this.f20183b[i] = j;
        this.f20184c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f20183b[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final void m23417l(int i) {
        if (i < 0 || i >= this.f20184c) {
            throw new IndexOutOfBoundsException(m23419n(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    /* renamed from: n */
    public final String m23419n(int i) {
        return "Index:" + i + ", Size:" + this.f20184c;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        m28210b();
        m23417l(i);
        long[] jArr = this.f20183b;
        long j = jArr[i];
        if (i < this.f20184c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f20184c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(G2(i, l.longValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m28210b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f20183b;
        System.arraycopy(jArr, i2, jArr, i, this.f20184c - i2);
        this.f20184c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20184c;
    }

    public dla(long[] jArr, int i) {
        this.f20183b = jArr;
        this.f20184c = i;
    }

    @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
    /* renamed from: a */
    public yn8.InterfaceC18445i mo17923a(int i) {
        if (i >= this.f20184c) {
            return new dla(Arrays.copyOf(this.f20183b, i), this.f20184c);
        }
        throw new IllegalArgumentException();
    }
}
