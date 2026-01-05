package o2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.g */
/* loaded from: classes.dex */
public final class C5274g extends AbstractC5268a {

    /* renamed from: d */
    public final Object[] f25918d;

    /* renamed from: e */
    public final C5277j f25919e;

    public C5274g(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11, 0);
        this.f25918d = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f25919e = new C5277j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C5277j c5277j = this.f25919e;
        if (c5277j.hasNext()) {
            this.f25900b++;
            return c5277j.next();
        }
        int i10 = this.f25900b;
        this.f25900b = i10 + 1;
        return this.f25918d[i10 - c5277j.f25901c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25900b;
        C5277j c5277j = this.f25919e;
        int i11 = c5277j.f25901c;
        if (i10 <= i11) {
            this.f25900b = i10 - 1;
            return c5277j.previous();
        }
        int i12 = i10 - 1;
        this.f25900b = i12;
        return this.f25918d[i12 - i11];
    }
}
