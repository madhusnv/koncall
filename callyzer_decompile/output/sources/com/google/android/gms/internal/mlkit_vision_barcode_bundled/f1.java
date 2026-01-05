package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import a2.AbstractC0030c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends k0 implements RandomAccess, j1 {

    /* renamed from: d */
    public static final f1 f6530d = new f1(new int[0], 0, false);

    /* renamed from: b */
    public int[] f6531b;

    /* renamed from: c */
    public int f6532c;

    public f1(int[] iArr, int i10, boolean z6) {
        super(z6);
        this.f6531b = iArr;
        this.f6532c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m3907a();
        if (i10 < 0 || i10 > (i11 = this.f6532c)) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Index:", i10, this.f6532c, ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f6531b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[AbstractC0030c.m112c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f6531b, i10, iArr2, i12, this.f6532c - i10);
            this.f6531b = iArr2;
        }
        this.f6531b[i10] = iIntValue;
        this.f6532c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3907a();
        Charset charset = l1.f6594a;
        collection.getClass();
        if (!(collection instanceof f1)) {
            return super.addAll(collection);
        }
        f1 f1Var = (f1) collection;
        int i10 = f1Var.f6532c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6532c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f6531b;
        if (i12 > iArr.length) {
            this.f6531b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(f1Var.f6531b, 0, this.f6531b, this.f6532c, f1Var.f6532c);
        this.f6532c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final int m3851b(int i10) {
        m3853e(i10);
        return this.f6531b[i10];
    }

    /* renamed from: c */
    public final void m3852c(int i10) {
        m3907a();
        int i11 = this.f6532c;
        int[] iArr = this.f6531b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[AbstractC0030c.m112c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f6531b = iArr2;
        }
        int[] iArr3 = this.f6531b;
        int i12 = this.f6532c;
        this.f6532c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m3853e(int i10) {
        if (i10 < 0 || i10 >= this.f6532c) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Index:", i10, this.f6532c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return super.equals(obj);
        }
        f1 f1Var = (f1) obj;
        if (this.f6532c != f1Var.f6532c) {
            return false;
        }
        int[] iArr = f1Var.f6531b;
        for (int i10 = 0; i10 < this.f6532c; i10++) {
            if (this.f6531b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ k1 mo3854f(int i10) {
        if (i10 >= this.f6532c) {
            return new f1(Arrays.copyOf(this.f6531b, i10), this.f6532c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m3853e(i10);
        return Integer.valueOf(this.f6531b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6532c; i11++) {
            i10 = (i10 * 31) + this.f6531b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f6532c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6531b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m3907a();
        m3853e(i10);
        int[] iArr = this.f6531b;
        int i11 = iArr[i10];
        if (i10 < this.f6532c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f6532c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m3907a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6531b;
        System.arraycopy(iArr, i11, iArr, i10, this.f6532c - i11);
        this.f6532c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m3907a();
        m3853e(i10);
        int[] iArr = this.f6531b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6532c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m3852c(((Integer) obj).intValue());
        return true;
    }
}
