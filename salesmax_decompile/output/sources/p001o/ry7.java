package p001o;

/* loaded from: classes3.dex */
public abstract class ry7 {
    /* renamed from: a */
    public static final void m47288a(qy7 qy7Var, long j, qx0 qx0Var, x54 x54Var) {
        sq8.m48649h(qy7Var, "$this$recordSeconds");
        sq8.m48649h(qx0Var, "attributes");
        qy7Var.mo45977a(Double.valueOf(k16.m34855A(j) / 1000000000), qx0Var, x54Var);
    }

    /* renamed from: b */
    public static /* synthetic */ void m47289b(qy7 qy7Var, long j, qx0 qx0Var, x54 x54Var, int i, Object obj) {
        if ((i & 2) != 0) {
            qx0Var = tx0.m50736a();
        }
        if ((i & 4) != 0) {
            x54Var = null;
        }
        m47288a(qy7Var, j, qx0Var, x54Var);
    }
}
