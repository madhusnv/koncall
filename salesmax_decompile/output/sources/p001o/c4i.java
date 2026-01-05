package p001o;

/* loaded from: classes6.dex */
public final class c4i implements dc9 {

    /* renamed from: b */
    public static final c4i f17278b = new c4i();

    /* renamed from: a */
    public final /* synthetic */ o6c f17279a = new o6c("kotlin.Unit", y3i.f54824a);

    /* renamed from: a */
    public void m20202a(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        this.f17279a.deserialize(w75Var);
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, y3i y3iVar) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(y3iVar, "value");
        this.f17279a.serialize(h76Var, y3iVar);
    }

    @Override // p001o.bn5
    public /* bridge */ /* synthetic */ Object deserialize(w75 w75Var) {
        m20202a(w75Var);
        return y3i.f54824a;
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return this.f17279a.getDescriptor();
    }
}
