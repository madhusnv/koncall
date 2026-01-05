package p001o;

/* loaded from: classes2.dex */
public final class xob extends yc4 {
    public xob() {
        super(null, 1, null);
    }

    /* renamed from: q */
    public final void m56534q(jcd jcdVar) {
        sq8.m48649h(jcdVar, "f");
        m56535r(jcdVar, 0);
        m56535r(jcdVar, 2);
        m56535r(jcdVar, 4);
        m56535r(jcdVar, 6);
    }

    /* renamed from: r */
    public final void m56535r(jcd jcdVar, int i) {
        int i2 = i + 1;
        long jMo33533a = jcdVar.mo33533a(m57501j()[i], m57501j()[i2]);
        m57501j()[i] = Float.intBitsToFloat((int) (jMo33533a >> 32));
        m57501j()[i2] = Float.intBitsToFloat((int) (jMo33533a & 4294967295L));
    }
}
