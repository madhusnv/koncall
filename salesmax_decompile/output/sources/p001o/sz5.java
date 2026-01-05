package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class sz5 implements ief, wz5 {

    /* renamed from: a */
    public final ief f46149a;

    /* renamed from: b */
    public final int f46150b;

    /* renamed from: o.sz5$a */
    public static final class C16945a implements Iterator, sb9 {

        /* renamed from: a */
        public final Iterator f46151a;

        /* renamed from: b */
        public int f46152b;

        public C16945a(sz5 sz5Var) {
            this.f46151a = sz5Var.f46149a.iterator();
            this.f46152b = sz5Var.f46150b;
        }

        /* renamed from: a */
        public final void m49092a() {
            while (this.f46152b > 0 && this.f46151a.hasNext()) {
                this.f46151a.next();
                this.f46152b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m49092a();
            return this.f46151a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            m49092a();
            return this.f46151a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public sz5(ief iefVar, int i) {
        sq8.m48649h(iefVar, "sequence");
        this.f46149a = iefVar;
        this.f46150b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p001o.wz5
    /* renamed from: a */
    public ief mo46251a(int i) {
        int i2 = this.f46150b + i;
        return i2 < 0 ? new sz5(this, i) : new sz5(this.f46149a, i2);
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C16945a(this);
    }
}
