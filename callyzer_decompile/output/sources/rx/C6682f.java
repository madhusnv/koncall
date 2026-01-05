package rx;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import o2.AbstractC5268a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.f */
/* loaded from: classes3.dex */
public final class C6682f extends AbstractC5268a {

    /* renamed from: d */
    public final C6680d f31966d;

    /* renamed from: e */
    public int f31967e;

    /* renamed from: f */
    public C6684h f31968f;

    /* renamed from: g */
    public int f31969g;

    public C6682f(C6680d c6680d, int i10) {
        super(i10, c6680d.f31963f, 1);
        this.f31966d = c6680d;
        this.f31967e = c6680d.m12809r();
        this.f31969g = -1;
        m12820f();
    }

    @Override // o2.AbstractC5268a, java.util.ListIterator
    public final void add(Object obj) {
        m12818b();
        this.f31966d.add(this.f25900b, obj);
        this.f25900b++;
        m12819d();
    }

    /* renamed from: b */
    public final void m12818b() {
        if (this.f31967e != this.f31966d.m12809r()) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public final void m12819d() {
        C6680d c6680d = this.f31966d;
        this.f25901c = c6680d.mo10411b();
        this.f31967e = c6680d.m12809r();
        this.f31969g = -1;
        m12820f();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* renamed from: f */
    public final void m12820f() {
        C6680d c6680d = this.f31966d;
        Object[] objArr = c6680d.f31961d;
        if (objArr == null) {
            this.f31968f = null;
            return;
        }
        int i10 = (c6680d.f31963f - 1) & (-32);
        int i11 = this.f25900b;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (c6680d.f31958a / 5) + 1;
        C6684h c6684h = this.f31968f;
        if (c6684h == null) {
            this.f31968f = new C6684h(objArr, i11, i10, i12);
            return;
        }
        c6684h.f25900b = i11;
        c6684h.f25901c = i10;
        c6684h.f31972d = i12;
        if (c6684h.f31973e.length < i12) {
            c6684h.f31973e = new Object[i12];
        }
        c6684h.f31973e[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        c6684h.f31974f = r62;
        c6684h.m12822d(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m12818b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25900b;
        this.f31969g = i10;
        C6684h c6684h = this.f31968f;
        C6680d c6680d = this.f31966d;
        if (c6684h == null) {
            Object[] objArr = c6680d.f31962e;
            this.f25900b = i10 + 1;
            return objArr[i10];
        }
        if (c6684h.hasNext()) {
            this.f25900b++;
            return c6684h.next();
        }
        Object[] objArr2 = c6680d.f31962e;
        int i11 = this.f25900b;
        this.f25900b = i11 + 1;
        return objArr2[i11 - c6684h.f25901c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m12818b();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25900b;
        this.f31969g = i10 - 1;
        C6684h c6684h = this.f31968f;
        C6680d c6680d = this.f31966d;
        if (c6684h == null) {
            Object[] objArr = c6680d.f31962e;
            int i11 = i10 - 1;
            this.f25900b = i11;
            return objArr[i11];
        }
        int i12 = c6684h.f25901c;
        if (i10 <= i12) {
            this.f25900b = i10 - 1;
            return c6684h.previous();
        }
        Object[] objArr2 = c6680d.f31962e;
        int i13 = i10 - 1;
        this.f25900b = i13;
        return objArr2[i13 - i12];
    }

    @Override // o2.AbstractC5268a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m12818b();
        int i10 = this.f31969g;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        this.f31966d.mo10412h(i10);
        int i11 = this.f31969g;
        if (i11 < this.f25900b) {
            this.f25900b = i11;
        }
        m12819d();
    }

    @Override // o2.AbstractC5268a, java.util.ListIterator
    public final void set(Object obj) {
        m12818b();
        int i10 = this.f31969g;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        C6680d c6680d = this.f31966d;
        c6680d.set(i10, obj);
        this.f31967e = c6680d.m12809r();
        m12820f();
    }
}
