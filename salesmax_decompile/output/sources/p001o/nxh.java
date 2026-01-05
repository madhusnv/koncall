package p001o;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class nxh implements Iterator, sb9 {

    /* renamed from: a */
    public Object[] f37390a = mxh.f36081e.m39811a().m39800p();

    /* renamed from: b */
    public int f37391b;

    /* renamed from: c */
    public int f37392c;

    /* renamed from: a */
    public final Object m41204a() {
        vj3.m52874a(m41208j());
        return this.f37390a[this.f37392c];
    }

    /* renamed from: e */
    public final mxh m41205e() {
        vj3.m52874a(m41209k());
        Object obj = this.f37390a[this.f37392c];
        sq8.m48647f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (mxh) obj;
    }

    /* renamed from: f */
    public final Object[] m41206f() {
        return this.f37390a;
    }

    /* renamed from: g */
    public final int m41207g() {
        return this.f37392c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return m41208j();
    }

    /* renamed from: j */
    public final boolean m41208j() {
        return this.f37392c < this.f37391b;
    }

    /* renamed from: k */
    public final boolean m41209k() {
        vj3.m52874a(this.f37392c >= this.f37391b);
        return this.f37392c < this.f37390a.length;
    }

    /* renamed from: n */
    public final void m41210n() {
        vj3.m52874a(m41208j());
        this.f37392c += 2;
    }

    /* renamed from: o */
    public final void m41211o() {
        vj3.m52874a(m41209k());
        this.f37392c++;
    }

    /* renamed from: p */
    public final void m41212p(Object[] objArr, int i) {
        sq8.m48649h(objArr, "buffer");
        m41213r(objArr, i, 0);
    }

    /* renamed from: r */
    public final void m41213r(Object[] objArr, int i, int i2) {
        sq8.m48649h(objArr, "buffer");
        this.f37390a = objArr;
        this.f37391b = i;
        this.f37392c = i2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: s */
    public final void m41214s(int i) {
        this.f37392c = i;
    }
}
