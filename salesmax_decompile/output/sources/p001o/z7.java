package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public abstract class z7 implements Iterator, sb9 {

    /* renamed from: a */
    public int f56613a;

    /* renamed from: b */
    public Object f56614b;

    /* renamed from: a */
    public abstract void mo23854a();

    /* renamed from: e */
    public final void m58856e() {
        this.f56613a = 2;
    }

    /* renamed from: f */
    public final void m58857f(Object obj) {
        this.f56614b = obj;
        this.f56613a = 1;
    }

    /* renamed from: g */
    public final boolean m58858g() {
        this.f56613a = 3;
        mo23854a();
        return this.f56613a == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.f56613a;
        if (i == 0) {
            return m58858g();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f56613a;
        if (i == 1) {
            this.f56613a = 0;
            return this.f56614b;
        }
        if (i == 2 || !m58858g()) {
            throw new NoSuchElementException();
        }
        this.f56613a = 0;
        return this.f56614b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
