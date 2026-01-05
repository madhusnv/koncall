package p001o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class due extends e8 implements RandomAccess {

    /* renamed from: b */
    public final Object[] f20549b;

    /* renamed from: c */
    public final int f20550c;

    /* renamed from: d */
    public int f20551d;

    /* renamed from: e */
    public int f20552e;

    /* renamed from: o.due$a */
    public static final class C13038a extends z7 {

        /* renamed from: c */
        public int f20553c;

        /* renamed from: d */
        public int f20554d;

        public C13038a() {
            this.f20553c = due.this.size();
            this.f20554d = due.this.f20551d;
        }

        @Override // p001o.z7
        /* renamed from: a */
        public void mo23854a() {
            if (this.f20553c == 0) {
                m58856e();
                return;
            }
            m58857f(due.this.f20549b[this.f20554d]);
            this.f20554d = (this.f20554d + 1) % due.this.f20550c;
            this.f20553c--;
        }
    }

    public due(Object[] objArr, int i) {
        sq8.m48649h(objArr, "buffer");
        this.f20549b = objArr;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i <= objArr.length) {
            this.f20550c = objArr.length;
            this.f20552e = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    /* renamed from: A */
    public final void m23850A(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (!(i <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i2 = this.f20551d;
            int i3 = (i2 + i) % this.f20550c;
            if (i2 > i3) {
                fp0.m27270s(this.f20549b, null, i2, this.f20550c);
                fp0.m27270s(this.f20549b, null, 0, i3);
            } else {
                fp0.m27270s(this.f20549b, null, i2, i3);
            }
            this.f20551d = i3;
            this.f20552e = size() - i;
        }
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f20552e;
    }

    @Override // p001o.e8, java.util.List
    public Object get(int i) {
        e8.f21141a.m24504b(i, size());
        return this.f20549b[(this.f20551d + i) % this.f20550c];
    }

    @Override // p001o.e8, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C13038a();
    }

    /* renamed from: p */
    public final void m23851p(Object obj) {
        if (m23853y()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f20549b[(this.f20551d + size()) % this.f20550c] = obj;
        this.f20552e = size() + 1;
    }

    /* renamed from: r */
    public final due m23852r(int i) {
        Object[] array;
        int i2 = this.f20550c;
        int iM18604g = bce.m18604g(i2 + (i2 >> 1) + 1, i);
        if (this.f20551d == 0) {
            array = Arrays.copyOf(this.f20549b, iM18604g);
            sq8.m48648g(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iM18604g]);
        }
        return new due(array, size());
    }

    @Override // p001o.b7, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            sq8.m48648g(objArr, "copyOf(...)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.f20551d; i2 < size && i3 < this.f20550c; i3++) {
            objArr[i2] = this.f20549b[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.f20549b[i];
            i2++;
            i++;
        }
        return bh3.m18964f(size, objArr);
    }

    /* renamed from: y */
    public final boolean m23853y() {
        return size() == this.f20550c;
    }

    public due(int i) {
        this(new Object[i], 0);
    }

    @Override // p001o.b7, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
