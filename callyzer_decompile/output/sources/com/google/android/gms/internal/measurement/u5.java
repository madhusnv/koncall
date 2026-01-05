package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u5 extends u4 implements RandomAccess, n5, e6 {

    /* renamed from: d */
    public static final long[] f6408d;

    /* renamed from: e */
    public static final u5 f6409e;

    /* renamed from: b */
    public long[] f6410b;

    /* renamed from: c */
    public int f6411c;

    static {
        long[] jArr = new long[0];
        f6408d = jArr;
        f6409e = new u5(jArr, 0, false);
    }

    public u5(long[] jArr, int i10, boolean z6) {
        super(z6);
        this.f6410b = jArr;
        this.f6411c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        m3717a();
        if (i10 < 0 || i10 > (i11 = this.f6411c)) {
            throw new IndexOutOfBoundsException(w4.m3745a(this.f6411c, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f6410b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6410b, 0, jArr2, 0, i10);
            System.arraycopy(this.f6410b, i10, jArr2, i12, this.f6411c - i10);
            this.f6410b = jArr2;
        }
        this.f6410b[i10] = jLongValue;
        this.f6411c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3717a();
        Charset charset = p5.f6342a;
        collection.getClass();
        if (!(collection instanceof u5)) {
            return super.addAll(collection);
        }
        u5 u5Var = (u5) collection;
        int i10 = u5Var.f6411c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6411c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f6410b;
        if (i12 > jArr.length) {
            this.f6410b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(u5Var.f6410b, 0, this.f6410b, this.f6411c, u5Var.f6411c);
        this.f6411c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final long m3718b(int i10) {
        m3721g(i10);
        return this.f6410b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.o5
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final u5 mo3298o(int i10) {
        if (i10 >= this.f6411c) {
            return new u5(i10 == 0 ? f6408d : Arrays.copyOf(this.f6410b, i10), this.f6411c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m3720e(long j6) {
        m3717a();
        int i10 = this.f6411c;
        int length = this.f6410b.length;
        if (i10 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6410b, 0, jArr, 0, this.f6411c);
            this.f6410b = jArr;
        }
        long[] jArr2 = this.f6410b;
        int i11 = this.f6411c;
        this.f6411c = i11 + 1;
        jArr2[i11] = j6;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return super.equals(obj);
        }
        u5 u5Var = (u5) obj;
        if (this.f6411c != u5Var.f6411c) {
            return false;
        }
        long[] jArr = u5Var.f6410b;
        for (int i10 = 0; i10 < this.f6411c; i10++) {
            if (this.f6410b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m3721g(int i10) {
        if (i10 < 0 || i10 >= this.f6411c) {
            throw new IndexOutOfBoundsException(w4.m3745a(this.f6411c, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m3721g(i10);
        return Long.valueOf(this.f6410b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6411c; i11++) {
            long j6 = this.f6410b[i11];
            Charset charset = p5.f6342a;
            i10 = (i10 * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f6411c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6410b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m3717a();
        m3721g(i10);
        long[] jArr = this.f6410b;
        long j6 = jArr[i10];
        if (i10 < this.f6411c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f6411c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m3717a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6410b;
        System.arraycopy(jArr, i11, jArr, i10, this.f6411c - i11);
        this.f6411c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m3717a();
        m3721g(i10);
        long[] jArr = this.f6410b;
        long j6 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6411c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m3720e(((Long) obj).longValue());
        return true;
    }
}
