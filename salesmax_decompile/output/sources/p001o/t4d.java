package p001o;

import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p001o.h5d;

/* loaded from: classes2.dex */
public class t4d extends y8 implements h5d.InterfaceC13853a {

    /* renamed from: a */
    public r4d f46357a;

    /* renamed from: b */
    public sob f46358b;

    /* renamed from: c */
    public mxh f46359c;

    /* renamed from: d */
    public Object f46360d;

    /* renamed from: e */
    public int f46361e;

    /* renamed from: f */
    public int f46362f;

    public t4d(r4d r4dVar) {
        sq8.m48649h(r4dVar, "map");
        this.f46357a = r4dVar;
        this.f46358b = new sob();
        this.f46359c = this.f46357a.m46210t();
        this.f46362f = this.f46357a.size();
    }

    @Override // p001o.h5d.InterfaceC13853a
    /* renamed from: a */
    public r4d build() {
        r4d r4dVar;
        if (this.f46359c == this.f46357a.m46210t()) {
            r4dVar = this.f46357a;
        } else {
            this.f46358b = new sob();
            r4dVar = new r4d(this.f46359c, size());
        }
        this.f46357a = r4dVar;
        return r4dVar;
    }

    /* renamed from: c */
    public final int m49285c() {
        return this.f46361e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        mxh mxhVarM39811a = mxh.f36081e.m39811a();
        sq8.m48647f(mxhVarM39811a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f46359c = mxhVarM39811a;
        m49291k(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f46359c.m39795k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: d */
    public final mxh m49286d() {
        return this.f46359c;
    }

    /* renamed from: e */
    public final sob m49287e() {
        return this.f46358b;
    }

    /* renamed from: f */
    public final void m49288f(int i) {
        this.f46361e = i;
    }

    /* renamed from: g */
    public final void m49289g(Object obj) {
        this.f46360d = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f46359c.m39799o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p001o.y8
    public Set getEntries() {
        return new v4d(this);
    }

    @Override // p001o.y8
    public Set getKeys() {
        return new x4d(this);
    }

    @Override // p001o.y8
    public int getSize() {
        return this.f46362f;
    }

    @Override // p001o.y8
    public Collection getValues() {
        return new z4d(this);
    }

    /* renamed from: h */
    public final void m49290h(sob sobVar) {
        sq8.m48649h(sobVar, "<set-?>");
        this.f46358b = sobVar;
    }

    /* renamed from: k */
    public void m49291k(int i) {
        this.f46362f = i;
        this.f46361e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f46360d = null;
        this.f46359c = this.f46359c.m39766D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f46360d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
        r4d r4dVarBuild = map instanceof r4d ? (r4d) map : null;
        if (r4dVarBuild == null) {
            t4d t4dVar = map instanceof t4d ? (t4d) map : null;
            r4dVarBuild = t4dVar != null ? t4dVar.build() : null;
        }
        if (r4dVarBuild == null) {
            super.putAll(map);
            return;
        }
        yl5 yl5Var = new yl5(0, 1, null);
        int size = size();
        mxh mxhVar = this.f46359c;
        mxh mxhVarM46210t = r4dVarBuild.m46210t();
        sq8.m48647f(mxhVarM46210t, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f46359c = mxhVar.m39767E(mxhVarM46210t, 0, yl5Var, this);
        int size2 = (r4dVarBuild.size() + size) - yl5Var.m57984a();
        if (size != size2) {
            m49291k(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f46360d = null;
        mxh mxhVarM39769G = this.f46359c.m39769G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mxhVarM39769G == null) {
            mxhVarM39769G = mxh.f36081e.m39811a();
            sq8.m48647f(mxhVarM39769G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f46359c = mxhVarM39769G;
        return this.f46360d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        mxh mxhVarM39770H = this.f46359c.m39770H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mxhVarM39770H == null) {
            mxhVarM39770H = mxh.f36081e.m39811a();
            sq8.m48647f(mxhVarM39770H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f46359c = mxhVarM39770H;
        return size != size();
    }
}
