package p001o;

import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class vef implements uef, js1 {

    /* renamed from: a */
    public final uef f50245a;

    /* renamed from: b */
    public final String f50246b;

    /* renamed from: c */
    public final Set f50247c;

    public vef(uef uefVar) {
        sq8.m48649h(uefVar, "original");
        this.f50245a = uefVar;
        this.f50246b = uefVar.mo16766h() + '?';
        this.f50247c = had.m30142a(uefVar);
    }

    @Override // p001o.js1
    /* renamed from: a */
    public Set mo34452a() {
        return this.f50247c;
    }

    @Override // p001o.uef
    /* renamed from: b */
    public boolean mo16760b() {
        return true;
    }

    @Override // p001o.uef
    /* renamed from: c */
    public int mo16761c(String str) {
        sq8.m48649h(str, "name");
        return this.f50245a.mo16761c(str);
    }

    @Override // p001o.uef
    /* renamed from: d */
    public int mo16762d() {
        return this.f50245a.mo16762d();
    }

    @Override // p001o.uef
    /* renamed from: e */
    public String mo16763e(int i) {
        return this.f50245a.mo16763e(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vef) && sq8.m48644c(this.f50245a, ((vef) obj).f50245a);
    }

    @Override // p001o.uef
    /* renamed from: f */
    public List mo16764f(int i) {
        return this.f50245a.mo16764f(i);
    }

    @Override // p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        return this.f50245a.mo16765g(i);
    }

    @Override // p001o.uef
    public List getAnnotations() {
        return this.f50245a.getAnnotations();
    }

    @Override // p001o.uef
    public bff getKind() {
        return this.f50245a.getKind();
    }

    @Override // p001o.uef
    /* renamed from: h */
    public String mo16766h() {
        return this.f50246b;
    }

    public int hashCode() {
        return this.f50245a.hashCode() * 31;
    }

    @Override // p001o.uef
    /* renamed from: i */
    public boolean mo16767i(int i) {
        return this.f50245a.mo16767i(i);
    }

    @Override // p001o.uef
    public boolean isInline() {
        return this.f50245a.isInline();
    }

    /* renamed from: j */
    public final uef m52676j() {
        return this.f50245a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f50245a);
        sb.append('?');
        return sb.toString();
    }
}
