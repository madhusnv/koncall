package p001o;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class f0g {

    /* renamed from: o.f0g$a */
    public static final class C13306a extends dl8 {

        /* renamed from: a */
        public int f22502a;

        /* renamed from: b */
        public final /* synthetic */ d0g f22503b;

        public C13306a(d0g d0gVar) {
            this.f22503b = d0gVar;
        }

        @Override // p001o.dl8
        /* renamed from: a */
        public int mo23412a() {
            d0g d0gVar = this.f22503b;
            int i = this.f22502a;
            this.f22502a = i + 1;
            return d0gVar.m22189k(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22502a < this.f22503b.m22193p();
        }
    }

    /* renamed from: o.f0g$b */
    public static final class C13307b implements Iterator, sb9 {

        /* renamed from: a */
        public int f22504a;

        /* renamed from: b */
        public final /* synthetic */ d0g f22505b;

        public C13307b(d0g d0gVar) {
            this.f22505b = d0gVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22504a < this.f22505b.m22193p();
        }

        @Override // java.util.Iterator
        public Object next() {
            d0g d0gVar = this.f22505b;
            int i = this.f22504a;
            this.f22504a = i + 1;
            return d0gVar.m22194q(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public static final dl8 m25921a(d0g d0gVar) {
        sq8.m48649h(d0gVar, "<this>");
        return new C13306a(d0gVar);
    }

    /* renamed from: b */
    public static final Iterator m25922b(d0g d0gVar) {
        sq8.m48649h(d0gVar, "<this>");
        return new C13307b(d0gVar);
    }
}
