package p001o;

import java.util.Set;
import p001o.mxh;

/* loaded from: classes2.dex */
public class r4d extends k8 implements h5d {

    /* renamed from: d */
    public static final C16534a f42977d = new C16534a(null);

    /* renamed from: e */
    public static final r4d f42978e = new r4d(mxh.f36081e.m39811a(), 0);

    /* renamed from: b */
    public final mxh f42979b;

    /* renamed from: c */
    public final int f42980c;

    /* renamed from: o.r4d$a */
    public static final class C16534a {
        public C16534a() {
        }

        public /* synthetic */ C16534a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final r4d m46214a() {
            r4d r4dVar = r4d.f42978e;
            sq8.m48647f(r4dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return r4dVar;
        }
    }

    public r4d(mxh mxhVar, int i) {
        sq8.m48649h(mxhVar, "node");
        this.f42979b = mxhVar;
        this.f42980c = i;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f42979b.m39795k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p001o.k8
    /* renamed from: d */
    public final Set mo35140d() {
        return m46208r();
    }

    @Override // p001o.k8
    /* renamed from: f */
    public int mo35142f() {
        return this.f42980c;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f42979b.m39799o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p001o.h5d
    /* renamed from: o */
    public t4d mo40065o() {
        return new t4d(this);
    }

    /* renamed from: r */
    public final qf8 m46208r() {
        return new b5d(this);
    }

    @Override // p001o.k8
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public qf8 mo35141e() {
        return new d5d(this);
    }

    /* renamed from: t */
    public final mxh m46210t() {
        return this.f42979b;
    }

    @Override // p001o.k8
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public jf8 mo35143g() {
        return new f5d(this);
    }

    /* renamed from: v */
    public r4d m46212v(Object obj, Object obj2) {
        mxh.C15449b c15449bM39778P = this.f42979b.m39778P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return c15449bM39778P == null ? this : new r4d(c15449bM39778P.m39812a(), size() + c15449bM39778P.m39813b());
    }

    /* renamed from: w */
    public r4d m46213w(Object obj) {
        mxh mxhVarM39779Q = this.f42979b.m39779Q(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.f42979b == mxhVarM39779Q ? this : mxhVarM39779Q == null ? f42977d.m46214a() : new r4d(mxhVarM39779Q, size() - 1);
    }
}
