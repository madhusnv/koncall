package p001o;

import p001o.bff;

/* loaded from: classes6.dex */
public final class y99 implements dc9 {

    /* renamed from: a */
    public static final y99 f55102a = new y99();

    /* renamed from: b */
    public static final uef f55103b = yef.m57706c("kotlinx.serialization.json.JsonNull", bff.C12373b.f16099a, new uef[0], null, 8, null);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public w99 deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        o89.m41766g(w75Var);
        if (w75Var.mo20417D()) {
            throw new d89("Expected 'null' literal");
        }
        w75Var.mo17241i();
        return w99.INSTANCE;
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, w99 w99Var) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(w99Var, "value");
        o89.m41767h(h76Var);
        h76Var.mo25650s();
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f55103b;
    }
}
