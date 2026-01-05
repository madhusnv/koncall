package com.google.crypto.tink.shaded.protobuf;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractC1375b implements RandomAccess {

    /* renamed from: d */
    public static final c1 f7024d;

    /* renamed from: b */
    public Object[] f7025b;

    /* renamed from: c */
    public int f7026c;

    static {
        c1 c1Var = new c1(0, new Object[0]);
        f7024d = c1Var;
        c1Var.f7018a = false;
    }

    public c1(int i10, Object[] objArr) {
        this.f7025b = objArr;
        this.f7026c = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1375b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4167a();
        int i10 = this.f7026c;
        Object[] objArr = this.f7025b;
        if (i10 == objArr.length) {
            this.f7025b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7025b;
        int i11 = this.f7026c;
        this.f7026c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m4172b(int i10) {
        if (i10 < 0 || i10 >= this.f7026c) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index:", ", Size:");
            sbM4567n.append(this.f7026c);
            throw new IndexOutOfBoundsException(sbM4567n.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m4172b(i10);
        return this.f7025b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /* renamed from: i */
    public final f0 mo4173i(int i10) {
        if (i10 < this.f7026c) {
            throw new IllegalArgumentException();
        }
        return new c1(this.f7026c, Arrays.copyOf(this.f7025b, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m4167a();
        m4172b(i10);
        Object[] objArr = this.f7025b;
        Object obj = objArr[i10];
        if (i10 < this.f7026c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f7026c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m4167a();
        m4172b(i10);
        Object[] objArr = this.f7025b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7026c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m4167a();
        if (i10 >= 0 && i10 <= (i11 = this.f7026c)) {
            Object[] objArr = this.f7025b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[AbstractC0030c.m112c(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f7025b, i10, objArr2, i10 + 1, this.f7026c - i10);
                this.f7025b = objArr2;
            }
            this.f7025b[i10] = obj;
            this.f7026c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index:", ", Size:");
        sbM4567n.append(this.f7026c);
        throw new IndexOutOfBoundsException(sbM4567n.toString());
    }
}
