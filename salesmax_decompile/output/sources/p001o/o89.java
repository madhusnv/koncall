package p001o;

import java.util.List;
import p001o.uef;

/* loaded from: classes6.dex */
public abstract class o89 {

    /* renamed from: o.o89$a */
    public static final class C15733a implements uef {

        /* renamed from: a */
        public final gi9 f37928a;

        public C15733a(uk7 uk7Var) {
            this.f37928a = si9.m48360a(uk7Var);
        }

        /* renamed from: a */
        public final uef m41768a() {
            return (uef) this.f37928a.getValue();
        }

        @Override // p001o.uef
        /* renamed from: b */
        public boolean mo16760b() {
            return uef.C17369a.m51455c(this);
        }

        @Override // p001o.uef
        /* renamed from: c */
        public int mo16761c(String str) {
            sq8.m48649h(str, "name");
            return m41768a().mo16761c(str);
        }

        @Override // p001o.uef
        /* renamed from: d */
        public int mo16762d() {
            return m41768a().mo16762d();
        }

        @Override // p001o.uef
        /* renamed from: e */
        public String mo16763e(int i) {
            return m41768a().mo16763e(i);
        }

        @Override // p001o.uef
        /* renamed from: f */
        public List mo16764f(int i) {
            return m41768a().mo16764f(i);
        }

        @Override // p001o.uef
        /* renamed from: g */
        public uef mo16765g(int i) {
            return m41768a().mo16765g(i);
        }

        @Override // p001o.uef
        public List getAnnotations() {
            return uef.C17369a.m51453a(this);
        }

        @Override // p001o.uef
        public bff getKind() {
            return m41768a().getKind();
        }

        @Override // p001o.uef
        /* renamed from: h */
        public String mo16766h() {
            return m41768a().mo16766h();
        }

        @Override // p001o.uef
        /* renamed from: i */
        public boolean mo16767i(int i) {
            return m41768a().mo16767i(i);
        }

        @Override // p001o.uef
        public boolean isInline() {
            return uef.C17369a.m51454b(this);
        }
    }

    /* renamed from: d */
    public static final b89 m41763d(w75 w75Var) {
        sq8.m48649h(w75Var, "<this>");
        b89 b89Var = w75Var instanceof b89 ? (b89) w75Var : null;
        if (b89Var != null) {
            return b89Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kge.m35689b(w75Var.getClass()));
    }

    /* renamed from: e */
    public static final q89 m41764e(h76 h76Var) {
        sq8.m48649h(h76Var, "<this>");
        q89 q89Var = h76Var instanceof q89 ? (q89) h76Var : null;
        if (q89Var != null) {
            return q89Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kge.m35689b(h76Var.getClass()));
    }

    /* renamed from: f */
    public static final uef m41765f(uk7 uk7Var) {
        return new C15733a(uk7Var);
    }

    /* renamed from: g */
    public static final void m41766g(w75 w75Var) {
        m41763d(w75Var);
    }

    /* renamed from: h */
    public static final void m41767h(h76 h76Var) {
        m41764e(h76Var);
    }
}
