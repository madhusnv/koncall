package p001o;

/* loaded from: classes3.dex */
public final class a28 {

    /* renamed from: a */
    public static final a28 f14057a = new a28();

    /* renamed from: b */
    public static final qx0 f14058b;

    /* renamed from: c */
    public static final qx0 f14059c;

    /* renamed from: d */
    public static final qx0 f14060d;

    /* renamed from: e */
    public static final qx0 f14061e;

    static {
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("state", "idle");
        f14058b = rx0Var.m47215a();
        rx0 rx0Var2 = new rx0();
        rx0Var2.m47216b("state", "acquired");
        f14059c = rx0Var2.m47215a();
        rx0 rx0Var3 = new rx0();
        rx0Var3.m47216b("state", "queued");
        f14060d = rx0Var3.m47215a();
        rx0 rx0Var4 = new rx0();
        rx0Var4.m47216b("state", "in-flight");
        f14061e = rx0Var4.m47215a();
    }

    /* renamed from: a */
    public final qx0 m16361a() {
        return f14059c;
    }

    /* renamed from: b */
    public final qx0 m16362b() {
        return f14058b;
    }

    /* renamed from: c */
    public final qx0 m16363c() {
        return f14061e;
    }

    /* renamed from: d */
    public final qx0 m16364d() {
        return f14060d;
    }
}
