package rx;

import java.util.NoSuchElementException;
import o2.AbstractC5268a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.b */
/* loaded from: classes3.dex */
public final class C6678b extends AbstractC5268a {

    /* renamed from: d */
    public final /* synthetic */ int f31952d = 1;

    /* renamed from: e */
    public final Object f31953e;

    public C6678b(Object[] objArr, int i10, int i11) {
        super(i10, i11, 1);
        this.f31953e = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f31952d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f31953e;
                int i10 = this.f25900b;
                this.f25900b = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f25900b++;
                return this.f31953e;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f31952d) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f31953e;
                int i10 = this.f25900b - 1;
                this.f25900b = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f25900b--;
                return this.f31953e;
        }
    }

    public C6678b(int i10, Object obj) {
        super(i10, 1, 1);
        this.f31953e = obj;
    }
}
