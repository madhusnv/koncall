package p001o;

/* loaded from: classes6.dex */
public abstract class jpa extends z74 {
    @Override // p001o.z74
    public z74 l0(int i, String str) {
        jda.m33601a(i);
        return jda.m33602b(this, str);
    }

    public abstract jpa r0();

    public final String u0() {
        jpa jpaVarR0;
        jpa jpaVarM25612c = eu5.m25612c();
        if (this == jpaVarM25612c) {
            return "Dispatchers.Main";
        }
        try {
            jpaVarR0 = jpaVarM25612c.r0();
        } catch (UnsupportedOperationException unused) {
            jpaVarR0 = null;
        }
        if (this == jpaVarR0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
