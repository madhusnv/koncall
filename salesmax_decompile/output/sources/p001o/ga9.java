package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class ga9 implements dc9 {

    /* renamed from: a */
    public static final ga9 f24833a = new ga9();

    /* renamed from: b */
    public static final uef f24834b = yef.m57706c("kotlinx.serialization.json.JsonPrimitive", vhd.C17587i.f50350a, new uef[0], null, 8, null);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ea9 deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        k89 k89VarMo18279f = o89.m41763d(w75Var).mo18279f();
        if (k89VarMo18279f instanceof ea9) {
            return (ea9) k89VarMo18279f;
        }
        throw w89.m54057e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kge.m35689b(k89VarMo18279f.getClass()), k89VarMo18279f.toString());
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, ea9 ea9Var) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(ea9Var, "value");
        o89.m41767h(h76Var);
        if (ea9Var instanceof w99) {
            h76Var.mo25649n(y99.f55102a, w99.INSTANCE);
        } else {
            h76Var.mo25649n(r99.f43237a, (q99) ea9Var);
        }
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f24834b;
    }
}
