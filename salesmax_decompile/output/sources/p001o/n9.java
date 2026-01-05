package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class n9 extends q4i {

    /* renamed from: a */
    public Object f36576a;

    public n9(Object obj) {
        this.f36576a = obj;
    }

    /* renamed from: a */
    public abstract Object mo30506a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36576a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f36576a;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f36576a = mo30506a(obj);
        return obj;
    }
}
