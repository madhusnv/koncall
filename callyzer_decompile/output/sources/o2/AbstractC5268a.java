package o2;

import fx.InterfaceC2395a;
import java.util.ListIterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.a */
/* loaded from: classes.dex */
public abstract class AbstractC5268a implements ListIterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f25899a;

    /* renamed from: b */
    public int f25900b;

    /* renamed from: c */
    public int f25901c;

    public /* synthetic */ AbstractC5268a(int i10, int i11, int i12) {
        this.f25899a = i12;
        this.f25900b = i10;
        this.f25901c = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.f25899a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25899a) {
            case 0:
                if (this.f25900b < this.f25901c) {
                }
                break;
            default:
                if (this.f25900b < this.f25901c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f25899a) {
            case 0:
                if (this.f25900b > 0) {
                }
                break;
            default:
                if (this.f25900b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f25899a) {
        }
        return this.f25900b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f25899a) {
            case 0:
                i10 = this.f25900b;
                break;
            default:
                i10 = this.f25900b;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.f25899a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.f25899a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
