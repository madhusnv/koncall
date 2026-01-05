package p001o;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;
import p001o.uef;

/* loaded from: classes6.dex */
public final class yhd implements uef {

    /* renamed from: a */
    public final String f55542a;

    /* renamed from: b */
    public final vhd f55543b;

    public yhd(String str, vhd vhdVar) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(vhdVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        this.f55542a = str;
        this.f55543b = vhdVar;
    }

    /* renamed from: a */
    public final Void m57838a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
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
        m57838a();
        throw new qe9();
    }

    @Override // p001o.uef
    /* renamed from: d */
    public int mo16762d() {
        return 0;
    }

    @Override // p001o.uef
    /* renamed from: e */
    public String mo16763e(int i) {
        m57838a();
        throw new qe9();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhd)) {
            return false;
        }
        yhd yhdVar = (yhd) obj;
        return sq8.m48644c(mo16766h(), yhdVar.mo16766h()) && sq8.m48644c(getKind(), yhdVar.getKind());
    }

    @Override // p001o.uef
    /* renamed from: f */
    public List mo16764f(int i) {
        m57838a();
        throw new qe9();
    }

    @Override // p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        m57838a();
        throw new qe9();
    }

    @Override // p001o.uef
    public List getAnnotations() {
        return uef.C17369a.m51453a(this);
    }

    @Override // p001o.uef
    /* renamed from: h */
    public String mo16766h() {
        return this.f55542a;
    }

    public int hashCode() {
        return mo16766h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // p001o.uef
    /* renamed from: i */
    public boolean mo16767i(int i) {
        m57838a();
        throw new qe9();
    }

    @Override // p001o.uef
    public boolean isInline() {
        return uef.C17369a.m51454b(this);
    }

    @Override // p001o.uef
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public vhd getKind() {
        return this.f55543b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo16766h() + ')';
    }
}
