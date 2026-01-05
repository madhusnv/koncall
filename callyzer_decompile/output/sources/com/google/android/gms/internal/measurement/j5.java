package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j5 extends u4 implements RandomAccess, m5, e6 {

    /* renamed from: d */
    public static final int[] f6254d;

    /* renamed from: e */
    public static final j5 f6255e;

    /* renamed from: b */
    public int[] f6256b;

    /* renamed from: c */
    public int f6257c;

    static {
        int[] iArr = new int[0];
        f6254d = iArr;
        f6255e = new j5(iArr, 0, false);
    }

    public j5(int[] iArr, int i10, boolean z6) {
        super(z6);
        this.f6256b = iArr;
        this.f6257c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m3717a();
        if (i10 < 0 || i10 > (i11 = this.f6257c)) {
            throw new IndexOutOfBoundsException(w4.m3745a(this.f6257c, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f6256b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6256b, 0, iArr2, 0, i10);
            System.arraycopy(this.f6256b, i10, iArr2, i12, this.f6257c - i10);
            this.f6256b = iArr2;
        }
        this.f6256b[i10] = iIntValue;
        this.f6257c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3717a();
        Charset charset = p5.f6342a;
        collection.getClass();
        if (!(collection instanceof j5)) {
            return super.addAll(collection);
        }
        j5 j5Var = (j5) collection;
        int i10 = j5Var.f6257c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6257c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f6256b;
        if (i12 > iArr.length) {
            this.f6256b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(j5Var.f6256b, 0, this.f6256b, this.f6257c, j5Var.f6257c);
        this.f6257c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j5 mo3298o(int i10) {
        if (i10 >= this.f6257c) {
            return new j5(i10 == 0 ? f6254d : Arrays.copyOf(this.f6256b, i10), this.f6257c, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final int m3403c(int i10) {
        m3405g(i10);
        return this.f6256b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m3404e(int i10) {
        m3717a();
        int i11 = this.f6257c;
        int length = this.f6256b.length;
        if (i11 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6256b, 0, iArr, 0, this.f6257c);
            this.f6256b = iArr;
        }
        int[] iArr2 = this.f6256b;
        int i12 = this.f6257c;
        this.f6257c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return super.equals(obj);
        }
        j5 j5Var = (j5) obj;
        if (this.f6257c != j5Var.f6257c) {
            return false;
        }
        int[] iArr = j5Var.f6256b;
        for (int i10 = 0; i10 < this.f6257c; i10++) {
            if (this.f6256b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m3405g(int i10) {
        if (i10 < 0 || i10 >= this.f6257c) {
            throw new IndexOutOfBoundsException(w4.m3745a(this.f6257c, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m3405g(i10);
        return Integer.valueOf(this.f6256b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6257c; i11++) {
            i10 = (i10 * 31) + this.f6256b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f6257c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6256b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m3717a();
        m3405g(i10);
        int[] iArr = this.f6256b;
        int i11 = iArr[i10];
        if (i10 < this.f6257c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f6257c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m3717a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6256b;
        System.arraycopy(iArr, i11, iArr, i10, this.f6257c - i11);
        this.f6257c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m3717a();
        m3405g(i10);
        int[] iArr = this.f6256b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6257c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m3404e(((Integer) obj).intValue());
        return true;
    }
}
