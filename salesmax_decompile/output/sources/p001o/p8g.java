package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class p8g implements dc9 {

    /* renamed from: a */
    public static final p8g f39602a = new p8g();

    /* renamed from: b */
    public static final uef f39603b = new yhd("kotlin.String", vhd.C17587i.f50350a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return w75Var.mo17215B();
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, String str) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(str, "value");
        h76Var.mo29875F(str);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f39603b;
    }
}
