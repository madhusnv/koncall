package pg;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import og.tb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class pa extends com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0 implements ListIterator {

    /* renamed from: b */
    public final int f29026b;

    /* renamed from: c */
    public int f29027c;

    /* renamed from: d */
    public final ra f29028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(ra raVar, int i10) {
        super(3);
        int size = raVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(tb.m10931d(i10, size, "index"));
        }
        this.f29026b = size;
        this.f29027c = i10;
        this.f29028d = raVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m11826b(int i10) {
        return this.f29028d.get(i10);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f29027c < this.f29026b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29027c > 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f29027c;
        this.f29027c = i10 + 1;
        return m11826b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29027c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f29027c - 1;
        this.f29027c = i10;
        return m11826b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29027c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
