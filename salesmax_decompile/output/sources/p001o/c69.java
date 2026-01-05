package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class c69 implements b69 {

    /* renamed from: a */
    public static final c69 f17406a = new c69();

    @Override // p001o.b69
    public String P0() {
        return "EmptyIterator";
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException(P0() + ".next()");
    }

    public String toString() {
        return P0() + "()";
    }
}
