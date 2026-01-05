package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class lh2 implements dc9 {

    /* renamed from: a */
    public static final lh2 f33791a = new lh2();

    /* renamed from: b */
    public static final uef f33792b = new yhd("kotlin.Char", vhd.C17581c.f50344a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Character.valueOf(w75Var.mo17256y());
    }

    /* renamed from: b */
    public void m37191b(h76 h76Var, char c) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29884y(c);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f33792b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m37191b(h76Var, ((Character) obj).charValue());
    }
}
