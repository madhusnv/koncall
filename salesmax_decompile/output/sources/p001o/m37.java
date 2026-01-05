package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class m37 implements dc9 {

    /* renamed from: a */
    public static final m37 f34693a = new m37();

    /* renamed from: b */
    public static final uef f34694b = new yhd("kotlin.Float", vhd.C17583e.f50346a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Float.valueOf(w75Var.mo17251t());
    }

    /* renamed from: b */
    public void m38232b(h76 h76Var, float f) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29883x(f);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f34694b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m38232b(h76Var, ((Number) obj).floatValue());
    }
}
