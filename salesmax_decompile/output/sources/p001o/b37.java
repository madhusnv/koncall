package p001o;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class b37 extends g9 implements yn8.InterfaceC18442f, RandomAccess, whd {

    /* renamed from: d */
    public static final b37 f15503d;

    /* renamed from: b */
    public float[] f15504b;

    /* renamed from: c */
    public int f15505c;

    static {
        b37 b37Var = new b37(new float[0], 0);
        f15503d = b37Var;
        b37Var.mo28211f();
    }

    public b37() {
        this(new float[10], 0);
    }

    /* renamed from: l */
    public static b37 m18127l() {
        return f15503d;
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m28210b();
        yn8.m58012a(collection);
        if (!(collection instanceof b37)) {
            return super.addAll(collection);
        }
        b37 b37Var = (b37) collection;
        int i = b37Var.f15505c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15505c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f15504b;
        if (i3 > fArr.length) {
            this.f15504b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(b37Var.f15504b, 0, this.f15504b, this.f15505c, b37Var.f15505c);
        this.f15505c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        m18131j(i, f.floatValue());
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        m18130i(f.floatValue());
        return true;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b37)) {
            return super.equals(obj);
        }
        b37 b37Var = (b37) obj;
        if (this.f15505c != b37Var.f15505c) {
            return false;
        }
        float[] fArr = b37Var.f15504b;
        for (int i = 0; i < this.f15505c; i++) {
            if (Float.floatToIntBits(this.f15504b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f15505c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f15504b[i]);
        }
        return iFloatToIntBits;
    }

    /* renamed from: i */
    public void m18130i(float f) {
        m28210b();
        int i = this.f15505c;
        float[] fArr = this.f15504b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f15504b = fArr2;
        }
        float[] fArr3 = this.f15504b;
        int i2 = this.f15505c;
        this.f15505c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f15504b[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void m18131j(int i, float f) {
        int i2;
        m28210b();
        if (i < 0 || i > (i2 = this.f15505c)) {
            throw new IndexOutOfBoundsException(m18135p(i));
        }
        float[] fArr = this.f15504b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f15504b, i, fArr2, i + 1, this.f15505c - i);
            this.f15504b = fArr2;
        }
        this.f15504b[i] = f;
        this.f15505c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: m */
    public final void m18132m(int i) {
        if (i < 0 || i >= this.f15505c) {
            throw new IndexOutOfBoundsException(m18135p(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(m18134o(i));
    }

    /* renamed from: o */
    public float m18134o(int i) {
        m18132m(i);
        return this.f15504b[i];
    }

    /* renamed from: p */
    public final String m18135p(int i) {
        return "Index:" + i + ", Size:" + this.f15505c;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        m28210b();
        m18132m(i);
        float[] fArr = this.f15504b;
        float f = fArr[i];
        if (i < this.f15505c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f15505c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(m18138v(i, f.floatValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m28210b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f15504b;
        System.arraycopy(fArr, i2, fArr, i, this.f15505c - i2);
        this.f15505c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15505c;
    }

    /* renamed from: v */
    public float m18138v(int i, float f) {
        m28210b();
        m18132m(i);
        float[] fArr = this.f15504b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public b37(float[] fArr, int i) {
        this.f15504b = fArr;
        this.f15505c = i;
    }

    @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
    /* renamed from: a */
    public yn8.InterfaceC18442f mo17923a(int i) {
        if (i >= this.f15505c) {
            return new b37(Arrays.copyOf(this.f15504b, i), this.f15505c);
        }
        throw new IllegalArgumentException();
    }
}
