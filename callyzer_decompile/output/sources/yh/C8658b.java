package yh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import pg.s7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.b */
/* loaded from: classes.dex */
public final class C8658b extends o0 implements ListIterator {

    /* renamed from: b */
    public final int f41956b;

    /* renamed from: c */
    public int f41957c;

    /* renamed from: d */
    public final AbstractC8660d f41958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8658b(AbstractC8660d abstractC8660d, int i10) {
        super(4);
        int size = abstractC8660d.size();
        s7.m11860c(i10, size);
        this.f41956b = size;
        this.f41957c = i10;
        this.f41958d = abstractC8660d;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object m15998b(int i10) {
        return this.f41958d.get(i10);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41957c < this.f41956b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41957c > 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f41957c;
        this.f41957c = i10 + 1;
        return m15998b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41957c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f41957c - 1;
        this.f41957c = i10;
        return m15998b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41957c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
