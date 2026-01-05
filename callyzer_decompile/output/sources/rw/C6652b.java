package rw;

import e1.x0;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.b */
/* loaded from: classes3.dex */
public final class C6652b extends x0 implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ AbstractC6654d f31932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6652b(AbstractC6654d abstractC6654d, int i10) {
        super(7, abstractC6654d);
        this.f31932d = abstractC6654d;
        int iMo1628b = abstractC6654d.mo1628b();
        if (i10 < 0 || i10 > iMo1628b) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, iMo1628b, ", size: "));
        }
        this.f9082b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9082b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9082b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9082b - 1;
        this.f9082b = i10;
        return this.f31932d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9082b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
