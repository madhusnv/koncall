package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public final class r79 implements dc9 {

    /* renamed from: a */
    public static final r79 f43112a = new r79();

    /* renamed from: b */
    public static final uef f43113b = C16550a.f43114b;

    /* renamed from: o.r79$a */
    public static final class C16550a implements uef {

        /* renamed from: b */
        public static final C16550a f43114b = new C16550a();

        /* renamed from: c */
        public static final String f43115c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a */
        public final /* synthetic */ uef f43116a = sm1.m48512g(n89.f36559a).getDescriptor();

        @Override // p001o.uef
        /* renamed from: b */
        public boolean mo16760b() {
            return this.f43116a.mo16760b();
        }

        @Override // p001o.uef
        /* renamed from: c */
        public int mo16761c(String str) {
            sq8.m48649h(str, "name");
            return this.f43116a.mo16761c(str);
        }

        @Override // p001o.uef
        /* renamed from: d */
        public int mo16762d() {
            return this.f43116a.mo16762d();
        }

        @Override // p001o.uef
        /* renamed from: e */
        public String mo16763e(int i) {
            return this.f43116a.mo16763e(i);
        }

        @Override // p001o.uef
        /* renamed from: f */
        public List mo16764f(int i) {
            return this.f43116a.mo16764f(i);
        }

        @Override // p001o.uef
        /* renamed from: g */
        public uef mo16765g(int i) {
            return this.f43116a.mo16765g(i);
        }

        @Override // p001o.uef
        public List getAnnotations() {
            return this.f43116a.getAnnotations();
        }

        @Override // p001o.uef
        public bff getKind() {
            return this.f43116a.getKind();
        }

        @Override // p001o.uef
        /* renamed from: h */
        public String mo16766h() {
            return f43115c;
        }

        @Override // p001o.uef
        /* renamed from: i */
        public boolean mo16767i(int i) {
            return this.f43116a.mo16767i(i);
        }

        @Override // p001o.uef
        public boolean isInline() {
            return this.f43116a.isInline();
        }
    }

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q79 deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        o89.m41766g(w75Var);
        return new q79((List) sm1.m48512g(n89.f36559a).deserialize(w75Var));
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, q79 q79Var) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(q79Var, "value");
        o89.m41767h(h76Var);
        sm1.m48512g(n89.f36559a).serialize(h76Var, q79Var);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f43113b;
    }
}
