package p001o;

/* loaded from: classes2.dex */
public abstract class s81 {
    /* renamed from: a */
    public static final l8i m47962a(r81 r81Var, String str) {
        sq8.m48649h(r81Var, "<this>");
        sq8.m48649h(str, "serviceKey");
        l8i l8iVarM47963b = m47963b(r81Var, str);
        return l8iVarM47963b == null ? j81.m33400f(r81Var.m46332a()) : l8iVarM47963b;
    }

    /* renamed from: b */
    public static final l8i m47963b(r81 r81Var, String str) {
        String strM33408n = j81.m33408n(r81Var.m46332a());
        if (strM33408n == null) {
            return null;
        }
        vq3 vq3Var = (vq3) r81Var.m46334c().get(strM33408n);
        if (vq3Var != null) {
            return j81.m33410p(vq3Var, str, "endpoint_url");
        }
        throw new zq3("shared config points to nonexistent services section '" + strM33408n + '\'');
    }
}
