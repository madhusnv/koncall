package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jxh implements Iterator, sb9 {

    /* renamed from: a */
    public final xk7 f31233a;

    /* renamed from: b */
    public final List f31234b = new ArrayList();

    /* renamed from: c */
    public Iterator f31235c;

    public jxh(Iterator it, xk7 xk7Var) {
        this.f31233a = xk7Var;
        this.f31235c = it;
    }

    /* renamed from: a */
    public final void m34666a(Object obj) {
        Iterator it = (Iterator) this.f31233a.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f31234b.add(this.f31235c);
            this.f31235c = it;
        } else {
            while (!this.f31235c.hasNext() && (!this.f31234b.isEmpty())) {
                this.f31235c = (Iterator) kh3.r0(this.f31234b);
                hh3.m30449I(this.f31234b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f31235c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f31235c.next();
        m34666a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
