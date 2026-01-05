package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import a2.AbstractC0030c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z1 extends k0 implements RandomAccess {

    /* renamed from: d */
    public static final z1 f6706d = new z1(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f6707b;

    /* renamed from: c */
    public int f6708c;

    public z1(Object[] objArr, int i10, boolean z6) {
        super(z6);
        this.f6707b = objArr;
        this.f6708c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m3907a();
        if (i10 < 0 || i10 > (i11 = this.f6708c)) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Index:", i10, this.f6708c, ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f6707b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[AbstractC0030c.m112c(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f6707b, i10, objArr2, i12, this.f6708c - i10);
            this.f6707b = objArr2;
        }
        this.f6707b[i10] = obj;
        this.f6708c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: b */
    public final void m4011b(int i10) {
        if (i10 < 0 || i10 >= this.f6708c) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Index:", i10, this.f6708c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ k1 mo3854f(int i10) {
        if (i10 >= this.f6708c) {
            return new z1(Arrays.copyOf(this.f6707b, i10), this.f6708c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m4011b(i10);
        return this.f6707b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3907a();
        m4011b(i10);
        Object[] objArr = this.f6707b;
        Object obj = objArr[i10];
        if (i10 < this.f6708c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f6708c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m3907a();
        m4011b(i10);
        Object[] objArr = this.f6707b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6708c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3907a();
        int i10 = this.f6708c;
        Object[] objArr = this.f6707b;
        if (i10 == objArr.length) {
            this.f6707b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6707b;
        int i11 = this.f6708c;
        this.f6708c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
