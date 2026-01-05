package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public abstract class y7 implements b69 {
    /* renamed from: b */
    public abstract Object mo18199b();

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return mo18199b();
        }
        throw new NoSuchElementException("next() on empty iterator");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(P0());
        sb.append("(");
        sb.append(isEmpty() ? "" : "?");
        sb.append(")");
        return sb.toString();
    }
}
