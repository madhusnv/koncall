package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public final class d64 implements uef {

    /* renamed from: a */
    public final uef f19137a;

    /* renamed from: b */
    public final ob9 f19138b;

    /* renamed from: c */
    public final String f19139c;

    public d64(uef uefVar, ob9 ob9Var) {
        sq8.m48649h(uefVar, "original");
        sq8.m48649h(ob9Var, "kClass");
        this.f19137a = uefVar;
        this.f19138b = ob9Var;
        this.f19139c = uefVar.mo16766h() + '<' + ob9Var.mo26337d() + '>';
    }

    @Override // p001o.uef
    /* renamed from: b */
    public boolean mo16760b() {
        return this.f19137a.mo16760b();
    }

    @Override // p001o.uef
    /* renamed from: c */
    public int mo16761c(String str) {
        sq8.m48649h(str, "name");
        return this.f19137a.mo16761c(str);
    }

    @Override // p001o.uef
    /* renamed from: d */
    public int mo16762d() {
        return this.f19137a.mo16762d();
    }

    @Override // p001o.uef
    /* renamed from: e */
    public String mo16763e(int i) {
        return this.f19137a.mo16763e(i);
    }

    public boolean equals(Object obj) {
        d64 d64Var = obj instanceof d64 ? (d64) obj : null;
        return d64Var != null && sq8.m48644c(this.f19137a, d64Var.f19137a) && sq8.m48644c(d64Var.f19138b, this.f19138b);
    }

    @Override // p001o.uef
    /* renamed from: f */
    public List mo16764f(int i) {
        return this.f19137a.mo16764f(i);
    }

    @Override // p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        return this.f19137a.mo16765g(i);
    }

    @Override // p001o.uef
    public List getAnnotations() {
        return this.f19137a.getAnnotations();
    }

    @Override // p001o.uef
    public bff getKind() {
        return this.f19137a.getKind();
    }

    @Override // p001o.uef
    /* renamed from: h */
    public String mo16766h() {
        return this.f19139c;
    }

    public int hashCode() {
        return (this.f19138b.hashCode() * 31) + mo16766h().hashCode();
    }

    @Override // p001o.uef
    /* renamed from: i */
    public boolean mo16767i(int i) {
        return this.f19137a.mo16767i(i);
    }

    @Override // p001o.uef
    public boolean isInline() {
        return this.f19137a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f19138b + ", original: " + this.f19137a + ')';
    }
}
