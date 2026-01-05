package p001o;

import p001o.udd;

/* loaded from: classes6.dex */
public final class n89 implements dc9 {

    /* renamed from: a */
    public static final n89 f36559a = new n89();

    /* renamed from: b */
    public static final uef f36560b = yef.m57705b("kotlinx.serialization.json.JsonElement", udd.C17355b.f48745a, new uef[0], C15529a.f36561a);

    /* renamed from: o.n89$a */
    public static final class C15529a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15529a f36561a = new C15529a();

        /* renamed from: o.n89$a$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: a */
            public static final a f36562a = new a();

            public a() {
                super(0);
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final uef invoke() {
                return ga9.f24833a.getDescriptor();
            }
        }

        /* renamed from: o.n89$a$b */
        public static final class b extends kf9 implements uk7 {

            /* renamed from: a */
            public static final b f36563a = new b();

            public b() {
                super(0);
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final uef invoke() {
                return y99.f55102a.getDescriptor();
            }
        }

        /* renamed from: o.n89$a$c */
        public static final class c extends kf9 implements uk7 {

            /* renamed from: a */
            public static final c f36564a = new c();

            public c() {
                super(0);
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final uef invoke() {
                return r99.f43237a.getDescriptor();
            }
        }

        /* renamed from: o.n89$a$d */
        public static final class d extends kf9 implements uk7 {

            /* renamed from: a */
            public static final d f36565a = new d();

            public d() {
                super(0);
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final uef invoke() {
                return aa9.f14377a.getDescriptor();
            }
        }

        /* renamed from: o.n89$a$e */
        public static final class e extends kf9 implements uk7 {

            /* renamed from: a */
            public static final e f36566a = new e();

            public e() {
                super(0);
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final uef invoke() {
                return r79.f43112a.getDescriptor();
            }
        }

        public C15529a() {
            super(1);
        }

        /* renamed from: a */
        public final void m40241a(ga3 ga3Var) {
            sq8.m48649h(ga3Var, "$this$buildSerialDescriptor");
            ga3.m28277b(ga3Var, "JsonPrimitive", o89.m41765f(a.f36562a), null, false, 12, null);
            ga3.m28277b(ga3Var, "JsonNull", o89.m41765f(b.f36563a), null, false, 12, null);
            ga3.m28277b(ga3Var, "JsonLiteral", o89.m41765f(c.f36564a), null, false, 12, null);
            ga3.m28277b(ga3Var, "JsonObject", o89.m41765f(d.f36565a), null, false, 12, null);
            ga3.m28277b(ga3Var, "JsonArray", o89.m41765f(e.f36566a), null, false, 12, null);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m40241a((ga3) obj);
            return y3i.f54824a;
        }
    }

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public k89 deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return o89.m41763d(w75Var).mo18279f();
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, k89 k89Var) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(k89Var, "value");
        o89.m41767h(h76Var);
        if (k89Var instanceof ea9) {
            h76Var.mo25649n(ga9.f24833a, k89Var);
        } else if (k89Var instanceof z99) {
            h76Var.mo25649n(aa9.f14377a, k89Var);
        } else if (k89Var instanceof q79) {
            h76Var.mo25649n(r79.f43112a, k89Var);
        }
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f36560b;
    }
}
