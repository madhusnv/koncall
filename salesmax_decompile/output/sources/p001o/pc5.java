package p001o;

import java.io.IOException;
import p001o.te8;

/* loaded from: classes2.dex */
public final class pc5 implements rb3 {

    /* renamed from: a */
    public final String f39794a;

    /* renamed from: b */
    public final r9d f39795b;

    /* renamed from: c */
    public final String f39796c;

    /* renamed from: d */
    public final boolean f39797d;

    /* renamed from: e */
    public final t18 f39798e;

    /* renamed from: f */
    public final rc4 f39799f;

    /* renamed from: g */
    public final hs1 f39800g;

    /* renamed from: o.pc5$a */
    public /* synthetic */ class C16051a extends dm7 implements xk7 {
        public C16051a(Object obj) {
            super(1, obj, r9d.class, "getProperty", "getProperty(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            sq8.m48649h(str, "p0");
            return ((r9d) this.receiver).mo26796e(str);
        }
    }

    /* renamed from: o.pc5$b */
    public /* synthetic */ class C16052b extends dm7 implements xk7 {
        public C16052b(Object obj) {
            super(1, obj, r9d.class, "getenv", "getenv(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            sq8.m48649h(str, "p0");
            return ((r9d) this.receiver).mo26798i(str);
        }
    }

    public pc5(String str, r9d r9dVar, t18 t18Var, String str2) {
        sq8.m48649h(r9dVar, "platformProvider");
        this.f39794a = str;
        this.f39795b = r9dVar;
        this.f39796c = str2;
        this.f39797d = t18Var == null;
        t18Var = t18Var == null ? ne5.m40414b(null, 1, null) : t18Var;
        this.f39798e = t18Var;
        hb3 hb3Var = null;
        id5 id5Var = null;
        rc4 rc4Var = new rc4(new nig(new C16051a(r9dVar)), new pi6(new C16052b(r9dVar)), new sld(str, str2, r9dVar, t18Var), new jag(r9dVar, t18Var, str2), new x26(r9dVar, t18Var), new xe8(null, si9.m48360a(new uk7() { // from class: o.nc5
            @Override // p001o.uk7
            public final Object invoke() {
                return pc5.m43331d(this.f36685a);
            }
        }), r9dVar, hb3Var, 9, id5Var));
        this.f39799f = rc4Var;
        this.f39800g = new hs1(rc4Var, 0L, 0L, hb3Var, 14, id5Var);
    }

    /* renamed from: d */
    public static final te8 m43331d(final pc5 pc5Var) {
        return te8.f46926H.m49781a(new xk7() { // from class: o.oc5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return pc5.m43332f(this.f38114a, (te8.C17065a) obj);
            }
        });
    }

    /* renamed from: f */
    public static final y3i m43332f(pc5 pc5Var, te8.C17065a c17065a) {
        sq8.m48649h(c17065a, "$this$ImdsClient");
        c17065a.m49780i(pc5Var.f39795b);
        c17065a.m49779h(pc5Var.f39798e);
        return y3i.f54824a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39800g.close();
        if (this.f39797d) {
            ub3.m51325a(this.f39798e);
        }
    }

    @Override // p001o.qc4, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        return this.f39800g.resolve(qx0Var, n64Var);
    }

    public /* synthetic */ pc5(String str, r9d r9dVar, t18 t18Var, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? r9d.f43250a.m46382a() : r9dVar, (i & 4) != 0 ? null : t18Var, (i & 8) != 0 ? null : str2);
    }
}
