package p001o;

/* loaded from: classes6.dex */
public final class r1c implements dc9 {

    /* renamed from: a */
    public static final r1c f42746a = new r1c();

    /* renamed from: b */
    public static final uef f42747b = q1c.f41099a;

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        throw new gff("'kotlin.Nothing' does not have instances");
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, Void r3) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(r3, "value");
        throw new gff("'kotlin.Nothing' cannot be serialized");
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f42747b;
    }
}
