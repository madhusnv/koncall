package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class po0 implements Iterator, sb9 {

    /* renamed from: a */
    public final Object[] f40318a;

    /* renamed from: b */
    public int f40319b;

    public po0(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        this.f40318a = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40319b < this.f40318a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f40318a;
            int i = this.f40319b;
            this.f40319b = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f40319b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
