package p001o;

import p001o.alb;

/* loaded from: classes2.dex */
public final class qi3 implements alb {

    /* renamed from: b */
    public final alb f42023b;

    /* renamed from: c */
    public final alb f42024c;

    /* renamed from: o.qi3$a */
    public static final class C16410a extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C16410a f42025a = new C16410a();

        public C16410a() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, alb.InterfaceC12215b interfaceC12215b) {
            sq8.m48649h(str, "acc");
            sq8.m48649h(interfaceC12215b, "element");
            if (str.length() == 0) {
                return interfaceC12215b.toString();
            }
            return str + ", " + interfaceC12215b;
        }
    }

    public qi3(alb albVar, alb albVar2) {
        sq8.m48649h(albVar, "outer");
        sq8.m48649h(albVar2, "inner");
        this.f42023b = albVar;
        this.f42024c = albVar2;
    }

    @Override // p001o.alb
    /* renamed from: a */
    public boolean mo17349a(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "predicate");
        return this.f42023b.mo17349a(xk7Var) && this.f42024c.mo17349a(xk7Var);
    }

    @Override // p001o.alb
    /* renamed from: b */
    public Object mo17350b(Object obj, nl7 nl7Var) {
        sq8.m48649h(nl7Var, "operation");
        return this.f42024c.mo17350b(this.f42023b.mo17350b(obj, nl7Var), nl7Var);
    }

    /* renamed from: d */
    public final alb m45508d() {
        return this.f42024c;
    }

    /* renamed from: e */
    public final alb m45509e() {
        return this.f42023b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof qi3) {
            qi3 qi3Var = (qi3) obj;
            if (sq8.m48644c(this.f42023b, qi3Var.f42023b) && sq8.m48644c(this.f42024c, qi3Var.f42024c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f42023b.hashCode() + (this.f42024c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) mo17350b("", C16410a.f42025a)) + ']';
    }
}
