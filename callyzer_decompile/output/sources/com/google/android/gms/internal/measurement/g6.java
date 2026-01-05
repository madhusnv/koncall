package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g6 extends u4 implements RandomAccess {

    /* renamed from: d */
    public static final Object[] f6215d;

    /* renamed from: e */
    public static final g6 f6216e;

    /* renamed from: b */
    public Object[] f6217b;

    /* renamed from: c */
    public int f6218c;

    static {
        Object[] objArr = new Object[0];
        f6215d = objArr;
        f6216e = new g6(objArr, 0, false);
    }

    public g6(Object[] objArr, int i10, boolean z6) {
        super(z6);
        this.f6217b = objArr;
        this.f6218c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m3717a();
        if (i10 < 0 || i10 > (i11 = this.f6218c)) {
            throw new IndexOutOfBoundsException(w4.m3745a(this.f6218c, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f6217b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6217b, 0, objArr2, 0, i10);
            System.arraycopy(this.f6217b, i10, objArr2, i12, this.f6218c - i10);
            this.f6217b = objArr2;
        }
        this.f6217b[i10] = obj;
        this.f6218c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: b */
    public final void m3297b(int i10) {
        if (i10 < 0 || i10 >= this.f6218c) {
            throw new IndexOutOfBoundsException(w4.m3745a(this.f6218c, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m3297b(i10);
        return this.f6217b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.o5
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ o5 mo3298o(int i10) {
        if (i10 >= this.f6218c) {
            return new g6(i10 == 0 ? f6215d : Arrays.copyOf(this.f6217b, i10), this.f6218c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.u4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3717a();
        m3297b(i10);
        Object[] objArr = this.f6217b;
        Object obj = objArr[i10];
        if (i10 < this.f6218c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f6218c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m3717a();
        m3297b(i10);
        Object[] objArr = this.f6217b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6218c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3717a();
        int i10 = this.f6218c;
        int length = this.f6217b.length;
        if (i10 == length) {
            this.f6217b = Arrays.copyOf(this.f6217b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f6217b;
        int i11 = this.f6218c;
        this.f6218c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
