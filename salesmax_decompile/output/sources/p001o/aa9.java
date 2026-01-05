package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class aa9 implements dc9 {

    /* renamed from: a */
    public static final aa9 f14377a = new aa9();

    /* renamed from: b */
    public static final uef f14378b = C12121a.f14379b;

    /* renamed from: o.aa9$a */
    public static final class C12121a implements uef {

        /* renamed from: b */
        public static final C12121a f14379b = new C12121a();

        /* renamed from: c */
        public static final String f14380c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a */
        public final /* synthetic */ uef f14381a = sm1.m48514i(sm1.m48531z(h8g.f26398a), n89.f36559a).getDescriptor();

        @Override // p001o.uef
        /* renamed from: b */
        public boolean mo16760b() {
            return this.f14381a.mo16760b();
        }

        @Override // p001o.uef
        /* renamed from: c */
        public int mo16761c(String str) {
            sq8.m48649h(str, "name");
            return this.f14381a.mo16761c(str);
        }

        @Override // p001o.uef
        /* renamed from: d */
        public int mo16762d() {
            return this.f14381a.mo16762d();
        }

        @Override // p001o.uef
        /* renamed from: e */
        public String mo16763e(int i) {
            return this.f14381a.mo16763e(i);
        }

        @Override // p001o.uef
        /* renamed from: f */
        public List mo16764f(int i) {
            return this.f14381a.mo16764f(i);
        }

        @Override // p001o.uef
        /* renamed from: g */
        public uef mo16765g(int i) {
            return this.f14381a.mo16765g(i);
        }

        @Override // p001o.uef
        public List getAnnotations() {
            return this.f14381a.getAnnotations();
        }

        @Override // p001o.uef
        public bff getKind() {
            return this.f14381a.getKind();
        }

        @Override // p001o.uef
        /* renamed from: h */
        public String mo16766h() {
            return f14380c;
        }

        @Override // p001o.uef
        /* renamed from: i */
        public boolean mo16767i(int i) {
            return this.f14381a.mo16767i(i);
        }

        @Override // p001o.uef
        public boolean isInline() {
            return this.f14381a.isInline();
        }
    }

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public z99 deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        o89.m41766g(w75Var);
        return new z99((Map) sm1.m48514i(sm1.m48531z(h8g.f26398a), n89.f36559a).deserialize(w75Var));
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, z99 z99Var) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(z99Var, "value");
        o89.m41767h(h76Var);
        sm1.m48514i(sm1.m48531z(h8g.f26398a), n89.f36559a).serialize(h76Var, z99Var);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f14378b;
    }
}
