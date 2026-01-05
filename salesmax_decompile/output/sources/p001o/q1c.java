package p001o;

import java.util.List;
import p001o.p9g;
import p001o.uef;

/* loaded from: classes6.dex */
public final class q1c implements uef {

    /* renamed from: a */
    public static final q1c f41099a = new q1c();

    /* renamed from: b */
    public static final bff f41100b = p9g.C16040d.f39684a;

    /* renamed from: c */
    public static final String f41101c = "kotlin.Nothing";

    /* renamed from: a */
    public final Void m44703a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        m44703a();
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
        m44703a();
        throw new qe9();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p001o.uef
    /* renamed from: f */
    public List mo16764f(int i) {
        m44703a();
        throw new qe9();
    }

    @Override // p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        m44703a();
        throw new qe9();
    }

    @Override // p001o.uef
    public List getAnnotations() {
        return uef.C17369a.m51453a(this);
    }

    @Override // p001o.uef
    public bff getKind() {
        return f41100b;
    }

    @Override // p001o.uef
    /* renamed from: h */
    public String mo16766h() {
        return f41101c;
    }

    public int hashCode() {
        return mo16766h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // p001o.uef
    /* renamed from: i */
    public boolean mo16767i(int i) {
        m44703a();
        throw new qe9();
    }

    @Override // p001o.uef
    public boolean isInline() {
        return uef.C17369a.m51454b(this);
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
