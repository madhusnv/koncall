package og;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.y */
/* loaded from: classes.dex */
public final class C5384y extends com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0 implements ListIterator {

    /* renamed from: b */
    public final int f26952b;

    /* renamed from: c */
    public int f26953c;

    /* renamed from: d */
    public final a0 f26954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5384y(a0 a0Var, int i10) {
        super(2);
        int size = a0Var.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(qa.m10851f(i10, size, "index"));
        }
        this.f26952b = size;
        this.f26953c = i10;
        this.f26954d = a0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m11050b(int i10) {
        return this.f26954d.get(i10);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26953c < this.f26952b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26953c > 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26953c;
        this.f26953c = i10 + 1;
        return m11050b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26953c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26953c - 1;
        this.f26953c = i10;
        return m11050b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26953c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
