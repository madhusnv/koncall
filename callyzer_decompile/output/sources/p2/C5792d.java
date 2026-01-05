package p2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import n2.InterfaceC4944c;
import r2.C6442a;
import r2.C6443b;
import rw.AbstractC6657g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.d */
/* loaded from: classes.dex */
public class C5792d extends AbstractC6657g implements InterfaceC4944c {

    /* renamed from: a */
    public C5790b f28382a;

    /* renamed from: b */
    public C6443b f28383b = new C6443b();

    /* renamed from: c */
    public C5799k f28384c;

    /* renamed from: d */
    public Object f28385d;

    /* renamed from: e */
    public int f28386e;

    /* renamed from: f */
    public int f28387f;

    public C5792d(C5790b c5790b) {
        this.f28382a = c5790b;
        this.f28384c = c5790b.f28377a;
        this.f28387f = c5790b.f28378b;
    }

    @Override // n2.InterfaceC4944c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5790b build() {
        C5799k c5799k = this.f28384c;
        C5790b c5790b = this.f28382a;
        if (c5799k != c5790b.f28377a) {
            this.f28383b = new C6443b();
            c5790b = new C5790b(this.f28384c, size());
        }
        this.f28382a = c5790b;
        return c5790b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f28384c = C5799k.f28398e;
        m11345d(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f28384c.m11352d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: d */
    public final void m11345d(int i10) {
        this.f28387f = i10;
        this.f28386e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f28384c.m11355g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // rw.AbstractC6657g
    public final Set getEntries() {
        return new C5794f(0, this);
    }

    @Override // rw.AbstractC6657g
    public final Set getKeys() {
        return new C5794f(1, this);
    }

    @Override // rw.AbstractC6657g
    public final int getSize() {
        return this.f28387f;
    }

    @Override // rw.AbstractC6657g
    public final Collection getValues() {
        return new C5796h(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f28385d = null;
        this.f28384c = this.f28384c.m11359l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f28385d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C5790b c5790bBuild = null;
        C5790b c5790b = map instanceof C5790b ? (C5790b) map : null;
        if (c5790b == null) {
            C5792d c5792d = map instanceof C5792d ? (C5792d) map : null;
            if (c5792d != null) {
                c5790bBuild = c5792d.build();
            }
        } else {
            c5790bBuild = c5790b;
        }
        if (c5790bBuild == null) {
            super.putAll(map);
            return;
        }
        C6442a c6442a = new C6442a();
        c6442a.f31097a = 0;
        int size = size();
        C5799k c5799k = this.f28384c;
        C5799k c5799k2 = c5790bBuild.f28377a;
        AbstractC4154l.m8921d(c5799k2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f28384c = c5799k.m11360m(c5799k2, 0, c6442a, this);
        int i10 = (c5790bBuild.f28378b + size) - c6442a.f31097a;
        if (size != i10) {
            m11345d(i10);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f28385d = null;
        C5799k c5799kM11361n = this.f28384c.m11361n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c5799kM11361n == null) {
            c5799kM11361n = C5799k.f28398e;
        }
        this.f28384c = c5799kM11361n;
        return this.f28385d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C5799k c5799kM11362o = this.f28384c.m11362o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c5799kM11362o == null) {
            c5799kM11362o = C5799k.f28398e;
        }
        this.f28384c = c5799kM11362o;
        return size != size();
    }
}
