package p001o;

/* loaded from: classes6.dex */
public final class z4c implements dc9 {

    /* renamed from: a */
    public final dc9 f56516a;

    /* renamed from: b */
    public final uef f56517b;

    public z4c(dc9 dc9Var) {
        sq8.m48649h(dc9Var, "serializer");
        this.f56516a = dc9Var;
        this.f56517b = new vef(dc9Var.getDescriptor());
    }

    @Override // p001o.bn5
    public Object deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return w75Var.mo20417D() ? w75Var.mo17216C(this.f56516a) : w75Var.mo17241i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z4c.class == obj.getClass() && sq8.m48644c(this.f56516a, ((z4c) obj).f56516a);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return this.f56517b;
    }

    public int hashCode() {
        return this.f56516a.hashCode();
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        if (obj == null) {
            h76Var.mo25650s();
        } else {
            h76Var.mo29872A();
            h76Var.mo25649n(this.f56516a, obj);
        }
    }
}
