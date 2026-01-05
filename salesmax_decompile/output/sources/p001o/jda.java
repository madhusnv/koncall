package p001o;

/* loaded from: classes6.dex */
public abstract class jda {
    /* renamed from: a */
    public static final void m33601a(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }

    /* renamed from: b */
    public static final z74 m33602b(z74 z74Var, String str) {
        return str != null ? new krb(z74Var, str) : z74Var;
    }
}
