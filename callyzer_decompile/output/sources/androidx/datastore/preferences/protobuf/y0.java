package androidx.datastore.preferences.protobuf;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 extends AbstractC0307b implements RandomAccess {

    /* renamed from: d */
    public static final y0 f2427d = new y0(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f2428b;

    /* renamed from: c */
    public int f2429c;

    public y0(Object[] objArr, int i10, boolean z6) {
        this.f2292a = z6;
        this.f2428b = objArr;
        this.f2429c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m819a();
        int i10 = this.f2429c;
        Object[] objArr = this.f2428b;
        if (i10 == objArr.length) {
            this.f2428b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2428b;
        int i11 = this.f2429c;
        this.f2429c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m1074b(int i10) {
        if (i10 < 0 || i10 >= this.f2429c) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index:", ", Size:");
            sbM4567n.append(this.f2429c);
            throw new IndexOutOfBoundsException(sbM4567n.toString());
        }
    }

    /* renamed from: c */
    public final y0 m1075c(int i10) {
        if (i10 >= this.f2429c) {
            return new y0(Arrays.copyOf(this.f2428b, i10), this.f2429c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m1074b(i10);
        return this.f2428b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0307b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m819a();
        m1074b(i10);
        Object[] objArr = this.f2428b;
        Object obj = objArr[i10];
        if (i10 < this.f2429c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f2429c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m819a();
        m1074b(i10);
        Object[] objArr = this.f2428b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2429c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m819a();
        if (i10 >= 0 && i10 <= (i11 = this.f2429c)) {
            Object[] objArr = this.f2428b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[AbstractC0030c.m112c(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f2428b, i10, objArr2, i10 + 1, this.f2429c - i10);
                this.f2428b = objArr2;
            }
            this.f2428b[i10] = obj;
            this.f2429c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index:", ", Size:");
        sbM4567n.append(this.f2429c);
        throw new IndexOutOfBoundsException(sbM4567n.toString());
    }
}
