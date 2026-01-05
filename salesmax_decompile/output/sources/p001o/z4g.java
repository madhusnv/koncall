package p001o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p001o.wb9;

/* loaded from: classes2.dex */
public final class z4g extends a5g implements Iterator, sb9 {

    /* renamed from: o.z4g$a */
    public static final class C18552a implements Map.Entry, wb9.InterfaceC17813a {

        /* renamed from: a */
        public final Object f56520a;

        /* renamed from: b */
        public Object f56521b;

        public C18552a() {
            Map.Entry entryM16443g = z4g.this.m16443g();
            sq8.m48646e(entryM16443g);
            this.f56520a = entryM16443g.getKey();
            Map.Entry entryM16443g2 = z4g.this.m16443g();
            sq8.m48646e(entryM16443g2);
            this.f56521b = entryM16443g2.getValue();
        }

        /* renamed from: a */
        public void m58688a(Object obj) {
            this.f56521b = obj;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f56520a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f56521b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            z4g z4gVar = z4g.this;
            if (z4gVar.m16444j().m52108e() != z4gVar.f14162c) {
                throw new ConcurrentModificationException();
            }
            Object value = getValue();
            z4gVar.m16444j().put(getKey(), obj);
            m58688a(obj);
            return value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4g(uxf uxfVar, Iterator it) {
        super(uxfVar, it);
        sq8.m48649h(uxfVar, "map");
        sq8.m48649h(it, "iterator");
    }

    @Override // java.util.Iterator
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        m16442f();
        if (m16443g() != null) {
            return new C18552a();
        }
        throw new IllegalStateException();
    }
}
