package rx;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import o2.AbstractC5268a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.e */
/* loaded from: classes3.dex */
public final class C6681e extends AbstractC5268a {

    /* renamed from: d */
    public final Object[] f31964d;

    /* renamed from: e */
    public final C6684h f31965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6681e(int i10, int i11, int i12, Object[] root, Object[] tail) {
        super(i10, i11, 1);
        AbstractC4154l.m8923f(root, "root");
        AbstractC4154l.m8923f(tail, "tail");
        this.f31964d = tail;
        int i13 = (i11 - 1) & (-32);
        this.f31965e = new C6684h(root, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C6684h c6684h = this.f31965e;
        if (c6684h.hasNext()) {
            this.f25900b++;
            return c6684h.next();
        }
        int i10 = this.f25900b;
        this.f25900b = i10 + 1;
        return this.f31964d[i10 - c6684h.f25901c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25900b;
        C6684h c6684h = this.f31965e;
        int i11 = c6684h.f25901c;
        if (i10 <= i11) {
            this.f25900b = i10 - 1;
            return c6684h.previous();
        }
        int i12 = i10 - 1;
        this.f25900b = i12;
        return this.f31964d[i12 - i11];
    }
}
