package p001o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kv7 implements Iterator, sb9 {

    /* renamed from: a */
    public final dwf f32740a;

    /* renamed from: b */
    public final int f32741b;

    /* renamed from: c */
    public int f32742c;

    /* renamed from: d */
    public final int f32743d;

    public kv7(dwf dwfVar, int i, int i2) {
        sq8.m48649h(dwfVar, "table");
        this.f32740a = dwfVar;
        this.f32741b = i2;
        this.f32742c = i;
        this.f32743d = dwfVar.m23914y();
        if (dwfVar.m23899A()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ep3 next() {
        m36252e();
        int i = this.f32742c;
        this.f32742c = fwf.m27614G(this.f32740a.m23910p(), i) + i;
        return new ewf(this.f32740a, i, this.f32743d);
    }

    /* renamed from: e */
    public final void m36252e() {
        if (this.f32740a.m23914y() != this.f32743d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32742c < this.f32741b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
