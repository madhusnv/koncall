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
public final class y0 extends k0 implements RandomAccess, i1 {

    /* renamed from: d */
    public static final y0 f6698d = new y0(new float[0], 0, false);

    /* renamed from: b */
    public float[] f6699b;

    /* renamed from: c */
    public int f6700c;

    public y0(float[] fArr, int i10, boolean z6) {
        super(z6);
        this.f6699b = fArr;
        this.f6700c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        m3907a();
        if (i10 < 0 || i10 > (i11 = this.f6700c)) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Index:", i10, this.f6700c, ", Size:"));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f6699b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[AbstractC0030c.m112c(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f6699b, i10, fArr2, i12, this.f6700c - i10);
            this.f6699b = fArr2;
        }
        this.f6699b[i10] = fFloatValue;
        this.f6700c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3907a();
        Charset charset = l1.f6594a;
        collection.getClass();
        if (!(collection instanceof y0)) {
            return super.addAll(collection);
        }
        y0 y0Var = (y0) collection;
        int i10 = y0Var.f6700c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6700c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f6699b;
        if (i12 > fArr.length) {
            this.f6699b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(y0Var.f6699b, 0, this.f6699b, this.f6700c, y0Var.f6700c);
        this.f6700c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m4005b(float f6) {
        m3907a();
        int i10 = this.f6700c;
        float[] fArr = this.f6699b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[AbstractC0030c.m112c(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f6699b = fArr2;
        }
        float[] fArr3 = this.f6699b;
        int i11 = this.f6700c;
        this.f6700c = i11 + 1;
        fArr3[i11] = f6;
    }

    /* renamed from: c */
    public final void m4006c(int i10) {
        if (i10 < 0 || i10 >= this.f6700c) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Index:", i10, this.f6700c, ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return super.equals(obj);
        }
        y0 y0Var = (y0) obj;
        if (this.f6700c != y0Var.f6700c) {
            return false;
        }
        float[] fArr = y0Var.f6699b;
        for (int i10 = 0; i10 < this.f6700c; i10++) {
            if (Float.floatToIntBits(this.f6699b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1
    /* renamed from: f */
    public final k1 mo3854f(int i10) {
        if (i10 >= this.f6700c) {
            return new y0(Arrays.copyOf(this.f6699b, i10), this.f6700c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m4006c(i10);
        return Float.valueOf(this.f6699b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f6700c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f6699b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f6700c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6699b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m3907a();
        m4006c(i10);
        float[] fArr = this.f6699b;
        float f6 = fArr[i10];
        if (i10 < this.f6700c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f6700c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m3907a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f6699b;
        System.arraycopy(fArr, i11, fArr, i10, this.f6700c - i11);
        this.f6700c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m3907a();
        m4006c(i10);
        float[] fArr = this.f6699b;
        float f6 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6700c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m4005b(((Float) obj).floatValue());
        return true;
    }
}
