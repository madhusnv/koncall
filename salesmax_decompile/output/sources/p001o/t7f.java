package p001o;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p001o.aff;

/* loaded from: classes3.dex */
public final class t7f extends h7f {

    /* renamed from: f */
    public static final C17017b f46589f = new C17017b(null);

    /* renamed from: e */
    public final List f46590e;

    /* renamed from: o.t7f$a */
    public static final class C17016a {

        /* renamed from: a */
        public final List f46591a = new ArrayList();

        /* renamed from: b */
        public final Set f46592b = new LinkedHashSet();

        /* renamed from: a */
        public final t7f m49538a() {
            return new t7f(this, null);
        }

        /* renamed from: b */
        public final void m49539b(h7f h7fVar) {
            sq8.m48649h(h7fVar, "field");
            h7fVar.m29949d(this.f46591a.size());
            this.f46591a.add(h7fVar);
        }

        /* renamed from: c */
        public final List m49540c() {
            return this.f46591a;
        }

        /* renamed from: d */
        public final Set m49541d() {
            return this.f46592b;
        }

        /* renamed from: e */
        public final void m49542e(hu6 hu6Var) {
            sq8.m48649h(hu6Var, "trait");
            this.f46592b.add(hu6Var);
        }
    }

    /* renamed from: o.t7f$b */
    public static final class C17017b {
        public C17017b() {
        }

        public /* synthetic */ C17017b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ t7f(C17016a c17016a, id5 id5Var) {
        this(c17016a);
    }

    /* renamed from: e */
    public final List m49537e() {
        return this.f46590e;
    }

    public t7f(C17016a c17016a) {
        super(aff.C12164k.f14623a, c17016a.m49541d());
        this.f46590e = c17016a.m49540c();
    }
}
