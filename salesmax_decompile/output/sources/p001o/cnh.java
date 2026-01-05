package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class cnh {

    /* renamed from: c */
    public static final C12715b f18414c = new C12715b(null);

    /* renamed from: d */
    public static final cnh f18415d = new cnh(new C12714a());

    /* renamed from: a */
    public final List f18416a;

    /* renamed from: b */
    public final enh f18417b;

    /* renamed from: o.cnh$a */
    public static final class C12714a {

        /* renamed from: a */
        public List f18418a = ch3.m21246k();

        /* renamed from: b */
        public enh f18419b;

        /* renamed from: a */
        public final List m21486a() {
            return this.f18418a;
        }

        /* renamed from: b */
        public final enh m21487b() {
            return this.f18419b;
        }
    }

    /* renamed from: o.cnh$b */
    public static final class C12715b {
        public C12715b() {
        }

        public /* synthetic */ C12715b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final cnh m21488a() {
            return cnh.f18415d;
        }
    }

    public cnh(C12714a c12714a) {
        sq8.m48649h(c12714a, "builder");
        this.f18416a = c12714a.m21486a();
        enh enhVarM21487b = c12714a.m21487b();
        this.f18417b = enhVarM21487b == null ? (enh) bj6.m19238g(cb3.f17670a.m20639b(), null, 1, null) : enhVarM21487b;
    }

    /* renamed from: b */
    public final List m21484b() {
        return this.f18416a;
    }

    /* renamed from: c */
    public final enh m21485c() {
        return this.f18417b;
    }
}
