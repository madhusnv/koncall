package o2;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.h */
/* loaded from: classes.dex */
public final class C5275h extends AbstractC5268a {

    /* renamed from: d */
    public final C5273f f25920d;

    /* renamed from: e */
    public int f25921e;

    /* renamed from: f */
    public C5277j f25922f;

    /* renamed from: g */
    public int f25923g;

    public C5275h(C5273f c5273f, int i10) {
        super(i10, c5273f.f25917h, 0);
        this.f25920d = c5273f;
        this.f25921e = c5273f.m10414r();
        this.f25923g = -1;
        m10424d();
    }

    @Override // o2.AbstractC5268a, java.util.ListIterator
    public final void add(Object obj) {
        m10423b();
        int i10 = this.f25900b;
        C5273f c5273f = this.f25920d;
        c5273f.add(i10, obj);
        this.f25900b++;
        this.f25901c = c5273f.mo10411b();
        this.f25921e = c5273f.m10414r();
        this.f25923g = -1;
        m10424d();
    }

    /* renamed from: b */
    public final void m10423b() {
        if (this.f25921e != this.f25920d.m10414r()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* renamed from: d */
    public final void m10424d() {
        C5273f c5273f = this.f25920d;
        Object[] objArr = c5273f.f25915f;
        if (objArr == null) {
            this.f25922f = null;
            return;
        }
        int i10 = (c5273f.f25917h - 1) & (-32);
        int i11 = this.f25900b;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (c5273f.f25913d / 5) + 1;
        C5277j c5277j = this.f25922f;
        if (c5277j == null) {
            this.f25922f = new C5277j(objArr, i11, i10, i12);
            return;
        }
        c5277j.f25900b = i11;
        c5277j.f25901c = i10;
        c5277j.f25926d = i12;
        if (c5277j.f25927e.length < i12) {
            c5277j.f25927e = new Object[i12];
        }
        c5277j.f25927e[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        c5277j.f25928f = r62;
        c5277j.m10426d(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m10423b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25900b;
        this.f25923g = i10;
        C5277j c5277j = this.f25922f;
        C5273f c5273f = this.f25920d;
        if (c5277j == null) {
            Object[] objArr = c5273f.f25916g;
            this.f25900b = i10 + 1;
            return objArr[i10];
        }
        if (c5277j.hasNext()) {
            this.f25900b++;
            return c5277j.next();
        }
        Object[] objArr2 = c5273f.f25916g;
        int i11 = this.f25900b;
        this.f25900b = i11 + 1;
        return objArr2[i11 - c5277j.f25901c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m10423b();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25900b;
        this.f25923g = i10 - 1;
        C5277j c5277j = this.f25922f;
        C5273f c5273f = this.f25920d;
        if (c5277j == null) {
            Object[] objArr = c5273f.f25916g;
            int i11 = i10 - 1;
            this.f25900b = i11;
            return objArr[i11];
        }
        int i12 = c5277j.f25901c;
        if (i10 <= i12) {
            this.f25900b = i10 - 1;
            return c5277j.previous();
        }
        Object[] objArr2 = c5273f.f25916g;
        int i13 = i10 - 1;
        this.f25900b = i13;
        return objArr2[i13 - i12];
    }

    @Override // o2.AbstractC5268a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m10423b();
        int i10 = this.f25923g;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        C5273f c5273f = this.f25920d;
        c5273f.mo10412h(i10);
        int i11 = this.f25923g;
        if (i11 < this.f25900b) {
            this.f25900b = i11;
        }
        this.f25901c = c5273f.mo10411b();
        this.f25921e = c5273f.m10414r();
        this.f25923g = -1;
        m10424d();
    }

    @Override // o2.AbstractC5268a, java.util.ListIterator
    public final void set(Object obj) {
        m10423b();
        int i10 = this.f25923g;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        C5273f c5273f = this.f25920d;
        c5273f.set(i10, obj);
        this.f25921e = c5273f.m10414r();
        m10424d();
    }
}
