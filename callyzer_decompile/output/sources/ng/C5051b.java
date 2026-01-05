package ng;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import og.w1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.b */
/* loaded from: classes.dex */
public final class C5051b extends o0 implements ListIterator {

    /* renamed from: b */
    public final int f24825b;

    /* renamed from: c */
    public int f24826c;

    /* renamed from: d */
    public final AbstractC5053d f24827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5051b(AbstractC5053d abstractC5053d, int i10) {
        super(1);
        int size = abstractC5053d.size();
        w1.m11023c(i10, size);
        this.f24825b = size;
        this.f24826c = i10;
        this.f24827d = abstractC5053d;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m9991b(int i10) {
        return this.f24827d.get(i10);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24826c < this.f24825b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24826c > 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24826c;
        this.f24826c = i10 + 1;
        return m9991b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24826c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24826c - 1;
        this.f24826c = i10;
        return m9991b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24826c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
