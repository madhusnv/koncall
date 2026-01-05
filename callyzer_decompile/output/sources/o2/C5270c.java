package o2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.c */
/* loaded from: classes.dex */
public final class C5270c extends AbstractC5268a {

    /* renamed from: d */
    public final /* synthetic */ int f25902d = 1;

    /* renamed from: e */
    public final Object f25903e;

    public C5270c(Object[] objArr, int i10, int i11) {
        super(i10, i11, 0);
        this.f25903e = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f25902d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f25903e;
                int i10 = this.f25900b;
                this.f25900b = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f25900b++;
                return this.f25903e;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f25902d) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f25903e;
                int i10 = this.f25900b - 1;
                this.f25900b = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f25900b--;
                return this.f25903e;
        }
    }

    public C5270c(int i10, Object obj) {
        super(i10, 1, 0);
        this.f25903e = obj;
    }
}
